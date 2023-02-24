# payment_api
Installation
Clone the repository: `git clone https://github.com/aidarbekq/payment_api.git`  

Navigate to the project directory: `cd payment_api`  

Install dependencies: `mvn clean install`


**Configure the application.properties file with the correct database settings**

    Set up a PostgreSQL database
    Configure the application.properties file with the correct database settings


**Usage**

Start the application: `mvn spring-boot:run`



The API will be available at `http://localhost:8083`  


**API Endpoints:**  

_POST /create_  

Example of request to create:  

`{
"senderAccount": "test_sender_acc",
"recipientAccount": "test_recep_acc",
"amount": 2000
}`  
  




_GET  /payments/{id}_  
  

_POST  /{id}/confirm_  

_POST {id}/cancel_  






