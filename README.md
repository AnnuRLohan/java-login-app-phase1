# Java Login App – Phase 1 (Web Layer)

## Overview
This project is **Phase 1** of a larger DevOps learning project where a Java application will be deployed using a **3-tier architecture**.

In Phase 1, the focus is only on building and validating the **web layer** of the application.  
The database layer is intentionally excluded at this stage.

---

## Phase 1 Objective
The goal of Phase 1 is to ensure that:

- The application can start successfully
- Spring Boot and Tomcat are working correctly
- A basic health check endpoint is available
- The application can be built and run locally without a database dependency

---

## Technologies Used
- Java 11
- Spring Boot
- Apache Maven
- Embedded Tomcat
- Git & GitHub

---

## Application Functionality
Currently, the application exposes a single endpoint:
GET /health
This endpoint is used to verify that the application is running successfully.

---

## How to Build and Run Locally

### Prerequisites
- Java 11 installed
- Maven installed

### Build the application
```bash
mvn clean package

### Run the application
mvn spring-boot:run

### Once the application is running, open a browser and visit:
http://localhost:8080/health

### Expected response:
Application is running
