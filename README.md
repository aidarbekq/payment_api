# payment_api
Installation
Clone the repository: `git clone https://github.com/aidarbekq/payment_api.git`  

Navigate to the project directory: `cd payment_api`  

Install dependencies: `mvn clean install`


**Configure the application.properties file with the correct database settings**


**Usage**

Start the application: `mvn spring-boot:run`



The API will be available at `http://localhost:8083/api/payments`  


**API Endpoints:**  
**PAYMENT ENDPOINTS**  


_POST /create_  
`http://localhost:8083/api/payments/create`  


Example of request to create:  

`{
"senderAccount": "test_sender_acc",
"uslugaId": 1,
"amount": 2000
}`  
  




_GET  /payments/{id}_  
`http://localhost:8083/api/payments/{id}`  



_POST  /{id}/confirm_  
`http://localhost:8083/api/payments/{id}/confirm`  



_POST {id}/cancel_  
`http://localhost:8083/api/payments/{id}/cancel`  

**USLUGA ENDPOINTS**  

_GET  /uslugi_  
`http://localhost:8083/api/uslugi`  

_GET  /uslugi/{id}_  
`http://localhost:8083/api/uslugi/{id}`  
  

_GET  /uslugi/{categoryId}_  
`http://localhost:8083/api/uslugi/{categoryId}`  

**CATEGORY ENDPOINTS**  

_GET  /categories_  
`http://localhost:8083/api/categories`  

_GET  /categories/{id}_  
`http://localhost:8083/api/categories/{id}`  








