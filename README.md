# Employee Management System API 
## Introduction
This API allows for the management of employees and their performance reviews. It provides endpoints to create, retrieve, update, and delete employee records as well as performance reviews, enabling efficient management and tracking of employee performance.
### Base URL
http://localhost:8080/api/employees
#### 
## Endpoints

### Employee Endpoints

#### 1. Create a New Employee
**HTTP Method**: `POST`

**Endpoint**: `/employees`

**Description**: Create a new employee record.

**Request Headers**:
- `Content-Type: application/json`

**Request Body**:
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Developer",
  "salary": 60000,
  "hireDate": "2023-01-01"
}
```
**Responses:**

- **201 Created:**
  ```json
  {
    "id": 1,
    "type": "Pothole",
    "description": "Large pothole on Main St.",
    "location": {
      "latitude": 40.712776,
      "longitude": -74.005974
    },
    "photos": ["photo1.jpg", "photo2.jpg"],
    "status": "Reported",
    "createdAt": "2024-05-19T12:00:00Z"
  }
  ```
- **400 Bad Request:** Invalid input

---

### 2. View Current Status of Reported Issues

**HTTP Method:** `GET`

**Endpoint:** `/employees`

**Description:** Retrieve a list of all employees.

**Request Headers:**
- `Accept: application/json`

**Responses:**
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
---

### 3. Retrieve a Single Employee

**HTTP Method:** `GET`

**Endpoint:** `/employees/{id}`

**Description:** Retrieve details of a single issue report by their ID.

**Request Headers:**
- `Accept: application/json`

**Path Parameters:**
- `id` (integer): ID of the employee

**Responses:**

- **200 OK:**
  ```json
  {
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Developer",
  "salary": 60000,
  "hireDate": "2023-01-01"
}

  ```
- **404 Not Found:** Issue not found

---

### 4. Update Employee

**HTTP Method:** `PUT`

**Endpoint:** `/employees/{id}`

**Description:** Update details of an existing employee.

**Request Headers:**
- `Content-Type: application/json`

**Path Parameters:**
- `id` (integer): ID of the employee

**Request Body:**
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Senior Developer",
  "salary": 70000,
  "hireDate": "2023-01-01"
}
**
```

**Responses:**

- **200 OK:**
  ```json
  {
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Senior Developer",
  "salary": 70000,
  "hireDate": "2023-01-01"
}

  ```
- **400 Bad Request:** Invalid input
- **404 Not Found:** Employee not found

---

### 5. Delete Employee

**HTTP Method:** `DELETE`

**Endpoint:** `/employee/{id}`

**Description:** Delete an existing employee.

**Request Headers:**
- `Accept: application/json`

**Path Parameters:**
- `id` (integer): ID of the employee
```

**Responses:**

- **204 No Content:** Successfully closed
- **404 Not Found:** Issue not found

---

# Performance Review Endpoints

### 1. Create a New Performance Review

**HTTP Method**: `POST`

**Endpoint**: `/reviews`

**Description**: Create a new performance review for an employee.

**Request Headers**:
- `Content-Type: application/json`

**Request Body**:
```json
{
  "employee": {
    "id": 1
  },
  "reviewDate": "2023-02-01",
  "review": "Excellent performance"
}
```
**Responses:**

- **201 Created:**
{
  "id": 1,
  "employee": {
    "id": 1
  },
  "reviewDate": "2023-02-01",
  "review": "Excellent performance"
}

- **400 Bad Request: ** Invalid input
---
