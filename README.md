# Spring Boot Constructor Injection

## 📌 About the Project

This project demonstrates Constructor-Based Dependency Injection in Spring Boot.

The application uses a `CustomerController` to handle customer requests and injects the `CustomerService` dependency through its constructor. Customer details are saved to a database using Spring Data JPA.

The project also demonstrates how Spring selects a service implementation when multiple implementations of the same interface exist.

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
* Entity mapping using `@Entity` and `@Id`
* Spring bean selection

## 💉 Constructor Injection

The `CustomerController` receives its dependency through its constructor:

```java
public CustomerController(CustomerService customerServiceImpl) {
    this.cs = customerServiceImpl;
}
```

Spring automatically injects a suitable `CustomerService` bean when creating the controller.

When multiple beans implement the same interface, Spring can select the required bean using mechanisms such as:

* `@Primary`
* `@Qualifier`
* Matching the injection point's name with a bean name when applicable

In this project, the constructor parameter is named `customerServiceImpl`. If the corresponding bean exists and no other resolution rule takes precedence, Spring can use that name to resolve the dependency.

## 👤 Customer Entity

The `Customer` entity contains the following fields:

| Field   | Data Type |
| ------- | --------- |
| id      | int       |
| name    | String    |
| email   | String    |
| address | String    |
| type    | String    |

## ⚙️ Service Layer

### CustomerService

Defines the `addCustomer()` method.

### CustomerServiceImpl

Implements `CustomerService` and saves customer details through `CustomerRepo`.

### PremiumCustomerServiceImpl

Provides another implementation of `CustomerService` for premium customers.

Both implementations use the repository to persist customer records.

## 🌐 API Endpoint

| HTTP Method | Endpoint    | Description     |
| ----------- | ----------- | --------------- |
| POST        | `/customer` | Adds a customer |

## 📥 Sample Request

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@example.com",
  "address": "Pune",
  "type": "Regular"
}
```

## 📤 Expected Response

```text
Customer Added
```

## ▶️ How to Run

1. Clone this repository.
2. Import the project into Spring Tool Suite (STS) as an existing Maven project.
3. Configure the database connection in `application.properties`.
4. Ensure the database is running.
5. Run the Spring Boot application.
6. Send a POST request to `/customer` using Postman.

## 🎯 Learning Objective

The main objective is to understand Constructor-Based Dependency Injection in Spring Boot and how the Spring IoC container supplies dependencies to a class through its constructor.
