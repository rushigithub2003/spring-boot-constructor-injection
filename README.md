# Spring Boot Constructor Injection

## 📌 About the Project

This project demonstrates Constructor-Based Dependency Injection in Spring Boot using a Customer Management example.

The application uses a `CustomerController` to handle REST API requests and injects the `CustomerService` dependency through its constructor. Customer details are stored and retrieved using Spring Data JPA.

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

## 📂 Project Structure

```text
com.example.constructor
├── controller
│   └── CustomerController.java
├── entity
│   └── Customer.java
├── repository
│   └── CustomerRepo.java
└── service
    ├── CustomerService.java
    ├── CustomerServiceImpl.java
    └── PremiumCustomerServiceImpl.java
```

## 🧩 Concepts Covered

* Dependency Injection (DI)
* Inversion of Control (IoC)
* Constructor-Based Dependency Injection
* Interface-based programming
* Multiple service implementations
* Spring Data JPA
* Hibernate ORM
* REST API development
* CRUD operations

## 💉 Constructor Injection

The controller receives its service dependency through its constructor:

```java
public CustomerController(CustomerService customerServiceImpl) {
    this.cs = customerServiceImpl;
}
```

Spring automatically injects a suitable `CustomerService` bean when creating the controller.

When multiple implementations exist, Spring can resolve the dependency using mechanisms such as `@Primary`, `@Qualifier`, or matching the injection-point name with a bean name when applicable.

## 👤 Customer Entity

| Field   | Data Type |
| ------- | --------- |
| id      | int       |
| name    | String    |
| email   | String    |
| address | String    |
| type    | String    |

## 🌐 API Endpoints

| HTTP Method | Endpoint         | Description                |
| ----------- | ---------------- | -------------------------- |
| POST        | `/customer`      | Adds a new customer        |
| GET         | `/customer/{id}` | Retrieves a customer by ID |
| DELETE      | `/customer/{id}` | Deletes a customer by ID   |

## 📥 Sample POST Request

**Endpoint:** `/customer`

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@example.com",
  "address": "Pune",
  "type": "Regular"
}
```

**Expected Response:**

```text
Customer Added
```

## 📤 Sample GET Request

**Endpoint:** `/customer/1`

Returns the customer details associated with ID `1`.

Example response:

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@example.com",
  "address": "Pune",
  "type": "Regular"
}
```

## 🗑️ Sample DELETE Request

**Endpoint:** `/customer/1`

Deletes the customer associated with ID `1`.

**Expected Response:**

```text
Customer Deleted
```

## ▶️ How to Run

1. Clone this repository.
2. Import the project into Spring Tool Suite (STS) as an existing Maven project.
3. Configure the database connection in `application.properties`.
4. Ensure the database is running.
5. Run the Spring Boot application.
6. Test the API endpoints using Postman.

## 🎯 Learning Objective

The objective is to understand Constructor-Based Dependency Injection in Spring Boot and apply it to a REST API that supports creating, retrieving, and deleting customer records.

## 🚀 Future Improvements

* Retrieve all customers.
* Update customer details.
* Add exception handling.
* Implement request validation.
* Improve service selection for regular and premium customers.
