# Employee Management System API

## Introduction
This API allows organizations to manage employee data efficiently, including personal details, job roles, hire date, performance reviews and salary information.

## Base URL
http://localhost:8080/api

## Endpoints

#### 1. Create a New Employee
- **HTTP Method:** POST
- **Endpoint:** `/employees`
- **Description:** Add a new employee profile.
- **Request Headers:** `Content-Type: application/json`
- **Request Body:**
    ```json
    {
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "jobRole": "Developer",
        "salary": 60000,
        "hireDate": "2023-01-15"
    }
    ```
- **Responses:**
  - **201 Created:**
    ```json
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "jobRole": "Developer",
        "salary": 60000,
        "hireDate": "2023-01-15"
    }
    ```
  - **400 Bad Request:** Invalid input

#### 2. View All Employees
- **HTTP Method:** GET
- **Endpoint:** `/employees`
- **Description:** Retrieve all employee profiles.
- **Request Headers:** `Accept: application/json`
- **Responses:**
  - **200 OK:**
    ```json
    [
        {
            "id": 1,
            "firstName": "John",
            "lastName": "Doe",
            "email": "john.doe@example.com",
            "jobRole": "Developer",
            "salary": 60000,
            "hireDate": "2023-01-15"
        }
    ]
    ```
  - **204 No Content:** No employees found

#### 3. Retrieve a Single Employee
- **HTTP Method:** GET
- **Endpoint:** `/employees/{id}`
- **Description:** Retrieve details of a single employee by their ID.
- **Request Headers:** `Accept: application/json`
- **Path Parameters:** `id` (integer): ID of the employee
- **Responses:**
  - **200 OK:**
    ```json
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "jobRole": "Developer",
        "salary": 60000,
        "hireDate": "2023-01-15"
    }
    ```
  - **404 Not Found:** Employee not found

#### 4. Update Employee Information
- **HTTP Method:** PUT
- **Endpoint:** `/employees/{id}`
- **Description:** Update employee information.
- **Request Headers:** `Content-Type: application/json`
- **Path Parameters:** `id` (integer): ID of the employee
- **Request Body:**
    ```json
    {
        "firstName": "John",
        "lastName": "Doe",
        "email": "jone.doe@example.com",
        "jobRole": "Senior Developer",
        "salary": 80000,
        "hireDate": "2023-01-15"
    }
    ```
- **Responses:**
  - **200 OK:**
    ```json
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "jane.doe@example.com",
        "jobRole": "Senior Developer",
        "salary": 80000,
        "hireDate": "2023-01-15"
    }
    ```
  - **400 Bad Request:** Invalid input
  - **404 Not Found:** Employee not found

#### 5. Delete Employee
- **HTTP Method:** DELETE
- **Endpoint:** `/employees/{id}`
- **Description:** Remove an employee from the system.
- **Request Headers:** `Accept: application/json`
- **Path Parameters:** `id` (integer): ID of the employee
- **Responses:**
  - **204 No Content:** Successfully deleted
  - **404 Not Found:** Employee not found
  
# Performance Review Endpoints

## 1. Create a New Performance Review
- **HTTP Method:** POST
- **Endpoint:** `/reviews`
- **Description:** Create a new performance review for an employee.
- **Request Headers:**
  - `Content-Type: application/json`
- **Request Body:**
  ```json
  {
    "employee": {
      "id": 1
    },
    "reviewDate": "2023-02-01",
    "review": "Excellent performance"
  }

-**Responses:**
  - **201 Created:**
    ```json
    {
      "id": 1,
      "employee": {
        "id": 1
      },
      "reviewDate": "2023-02-01",
      "review": "Excellent performance"
    }
    ```
  - **400 Bad Request:** Invalid input
## 2.Get All Performance Reviews
- **HTTP Method:** GET
- **Endpoint:** `/reviews`
- **Description:** Retrieve a list of all performance reviews.
- **Request Headers:**
  - `Accept: application/json`
- **Responses:**
  - **200 OK:**
    ```json
    [
      {
        "id": 1,
        "employee": {
          "id": 1,
          "firstName": "John",
          "lastName": "Doe",
          "email": "john.doe@example.com",
          "jobRole": "Developer",
          "salary": 60000,
          "hireDate": "2023-01-01"
        },
        "reviewDate": "2023-02-01",
        "review": "Excellent performance"
      },
      {
        "id": 2,
        "employee": {
          "id": 2,
          "firstName": "Jane",
          "lastName": "Smith",
          "email": "jane.smith@example.com",
          "jobRole": "Manager",
          "salary": 80000,
          "hireDate": "2022-05-15"
        },
        "reviewDate": "2023-03-01",
        "review": "Great leadership"
      }
    ]
    ```
  - **204 No Content:** No performance reviews found
## 3.Retrieve a Single Performance Review
- **HTTP Method:** GET
- **Endpoint:** `/reviews/{id}`
- **Description:** Retrieve details of a single performance review by its ID.
- **Request Headers:**
  - `Accept: application/json`
- **Path Parameters:**
  - `id` (integer): ID of the performance review
- **Responses:**
  - **200 OK:**
    ```json
    {
      "id": 1,
      "employee": {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "jobRole": "Developer",
        "salary": 60000,
        "hireDate": "2023-01-01"
      },
      "reviewDate": "2023-02-01",
      "review": "Excellent performance"
    }
    ```
  - **404 Not Found:** Performance review not found
