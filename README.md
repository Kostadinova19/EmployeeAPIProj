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

** Responses **:

201 Created:

json
Copy code
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Developer",
  "salary": 60000,
  "hireDate": "2023-01-01"
}
400 Bad Request: Invalid input

2. Get All Employees
HTTP Method: GET

Endpoint: /employees

Description: Retrieve a list of all employees.

Request Headers:

Accept: application/json
Responses:

200 OK:

json
Copy code
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "jobRole": "Developer",
    "salary": 60000,
    "hireDate": "2023-01-01"
  },
  {
    "id": 2,
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "jobRole": "Manager",
    "salary": 80000,
    "hireDate": "2022-05-15"
  }
]
204 No Content: No employees found

3. Retrieve a Single Employee
HTTP Method: GET

Endpoint: /employees/{id}

Description: Retrieve details of a single employee by their ID.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the employee
Responses:

200 OK:

json
Copy code
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Developer",
  "salary": 60000,
  "hireDate": "2023-01-01"
}
404 Not Found: Employee not found

4. Update Employee
HTTP Method: PUT

Endpoint: /employees/{id}

Description: Update details of an existing employee.

Request Headers:

Content-Type: application/json
Path Parameters:

id (integer): ID of the employee
Request Body:

json
Copy code
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Senior Developer",
  "salary": 70000,
  "hireDate": "2023-01-01"
}
Responses:

200 OK:

json
Copy code
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "jobRole": "Senior Developer",
  "salary": 70000,
  "hireDate": "2023-01-01"
}
400 Bad Request: Invalid input

404 Not Found: Employee not found

5. Delete Employee
HTTP Method: DELETE

Endpoint: /employees/{id}

Description: Delete an existing employee.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the employee
Responses:

204 No Content: Successfully deleted

404 Not Found: Employee not found

Performance Review Endpoints
1. Create a New Performance Review
HTTP Method: POST

Endpoint: /reviews

Description: Create a new performance review for an employee.

Request Headers:

Content-Type: application/json
Request Body:

json
Copy code
{
  "employee": {
    "id": 1
  },
  "reviewDate": "2023-02-01",
  "review": "Excellent performance"
}
Responses:

201 Created:

json
Copy code
{
  "id": 1,
  "employee": {
    "id": 1
  },
  "reviewDate": "2023-02-01",
  "review": "Excellent performance"
}
400 Bad Request: Invalid input

2. Get All Performance Reviews
HTTP Method: GET

Endpoint: /reviews

Description: Retrieve a list of all performance reviews.

Request Headers:

Accept: application/json
Responses:

200 OK:

json
Copy code
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
204 No Content: No performance reviews found

3. Retrieve a Single Performance Review
HTTP Method: GET

Endpoint: /reviews/{id}

Description: Retrieve details of a single performance review by its ID.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the performance review
Responses:

200 OK:

json
Copy code
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
404 Not Found: Performance review not found

4. Update Performance Review
HTTP Method: PUT

Endpoint: /reviews/{id}

Description: Update details of an existing performance review.

Request Headers:

Content-Type: application/json
Path Parameters:

id (integer): ID of the performance review
Request Body:

json
Copy code
{
  "reviewDate": "2023-02-15",
  "review": "Outstanding performance"
}
Responses:

200 OK:

json
Copy code
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
  "reviewDate": "2023-02-15",
  "review": "Outstanding performance"
}
400 Bad Request: Invalid input

404 Not Found: Performance review not found

5. Delete Performance Review
HTTP Method: DELETE

Endpoint: /reviews/{id}

Description: Delete an existing performance review.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the performance review
Responses:

204 No Content: Successfully deleted

404 Not Found: Performance review not found

Application Configuration
application.properties
Create a file named application.properties in the src/main/resources directory:

properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2
