# payment_api
Installation
Clone the repository: `git clone https://github.com/aidarbekq/payment_api.git`  

Navigate to the project directory: `cd payment_api`  

Install dependencies: `mvn clean install`


**Configure the application.properties file with the correct database settings**


**Usage**

Start the application: `mvn spring-boot:run`



The API will be available at `http://localhost:8083/api/v1`  


**API Endpoints:**  
**PAYMENT ENDPOINTS**  


_POST /create_  
`http://localhost:8083/api/v1/payments/create`  


Example of request to create:  

`{
"senderAccount": "test_sender_acc",
"uslugaId": 1,
"amount": 200
}`  
  




_GET  /payments/{id}_  
`http://localhost:8083/api/v1/payments/{id}`  



_POST  /{id}/confirm_  
`http://localhost:8083/api/v1/payments/{id}/confirm`  



_POST {id}/cancel_  
`http://localhost:8083/api/v1/payments/{id}/cancel`  

**USLUGA ENDPOINTS**  

_GET  /uslugi_  
`http://localhost:8083/api/v1/uslugi`  

_GET  /uslugi/{id}_  
`http://localhost:8083/api/v1/uslugi/{id}`  
  

_GET  /uslugi/{categoryId}_  
`http://localhost:8083/api/v1/uslugi/{categoryId}`  

**CATEGORY ENDPOINTS**  

_GET  /categories_  
`http://localhost:8083/api/v1/categories`  

_GET  /categories/{id}_  
`http://localhost:8083/api/v1/categories/{id}`  








