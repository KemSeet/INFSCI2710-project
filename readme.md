# Fitness Center Management System
The Gym Management System is a Spring Boot application designed to manage a gym's customer, employee, and service data. It includes features to manage memberships, transactions, schedules, and more. The application provides a RESTful API to interact with the underlying database, allowing for easy integration with various clients.

## Features
* Store and manage customer, employee, service, schedule, transaction, payment, membership, invoice, and payment method data
* Perform CRUD operations on the database tables
* Expose a RESTful API for data retrieval and manipulation
* Provide JSON-formatted output for API endpoints

## Prerequisites
* Java 8
* MySQL
* Intellij IDEA

## Getting Started
* Clone the repository
  - git clone https://github.com/KemSeet/INFSCI2710-project.git
* Run FitnessApplication.java
* The application should now be running at http://localhost:8080.

## Application Layout & Functions
* Show customers

  ![Alt text](./image/customers.png)

* Show positions

  ![Alt text](./image/positions.png)
  
* Show employees

  ![Alt text](./image/employees.png)
  
* Search/Add/Delete/Update
  - **Search**: search for certain name, phone number, email or position
  - **Add**: add a customer, position or employee
  - **Delete**: delete a customer, position or employee
  - **Update**: update a customer, position or employee
