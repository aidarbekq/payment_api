package com.tz.payment_api.repository;

import com.tz.payment_api.enums.PaymentStatus;
import com.tz.payment_api.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findById(String Id);

    List<Payment> findByStatusIn(List<PaymentStatus> statusList);

    @Query("SELECT p FROM Payment p WHERE p.amount >= :minAmount AND p.amount <= :maxAmount")
    List<Payment> findPaymentsByAmountRange(double minAmount, double maxAmount);

}
