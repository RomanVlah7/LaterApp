# Welcome to "Later"

# EN
Wlcome to "Later", a pet-project with microservicies, Kafka, PostgeSQL, Eureka.

This is my pet-project, an app called "Later" (an Pastebin app). In this app users can store a url or simple text. At
curent stage it consits of five microservicies: 


1. discovery-microsevice - the main microservice, checks if other microservicies are online
2. api-gateway-micreservice - redirects all requests from users the corresponding microservice
3. notification-microservice - recieves a message about new user or new item from 'items-micreservice' or 'users-microservice' to send notification via email
4. items-micreservice - process the requests connected with 'item'(user's post)
5. users-microservice - process the requests connected with users

![Flowchart](https://github.com/user-attachments/assets/f0626e0d-2943-42bc-9182-0ad97a31c85e)

# How to start on your device

Make shure you installed Kafka on your device(kafka should run in kraft mode)

(additional) you can install PostgreSQL on your device

### 1)Clone the repository on your device

### 2)Setup Database(PostgeSQL / H2)
You can find all necessary SQL scripts below
```
CREATE TABLE users (
user_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR (20),
email VARCHAR(20) NOT NULL,
user_state VARCHAR(20),
user_password VARCHAR(20) NOT NULL,
user_login VARCHAR(20) NOT NULL
);
```
```
CREATE TABLE items (
item_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
url VARCHAR(2048) NOT NULL,
user_id BIGINT NOT NULL,
FOREIGN KEY (user_id) REFERENCES users(user_id)
);
```

### 3)Start application
Please run the microservices in this sequence:
Discovery microsrvice, 
Api-Gateway Microsevice, 
Items Microservice, 
Users Microservice, 
Notification Microservice

### 4)Send a request
Now you can send a request to Later App using Postman( you can use prepared postman requests from file 'Later APP Tests.postman_collection.json' in the main directory)

