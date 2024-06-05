# To Do List with Spring

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies_Used](#technologies-used)
- [Prerequisites](#prerequisites)

## Introduction

The Todo List Application is a simple RESTful web service built with Spring Boot. It allows users to add, retrieve, and update tasks. The project demonstrates basic CRUD operations and includes API documentation using OpenAPI/Swagger.

## Features

- Add new tasks
- Retrieve all tasks
- Retrieve a task by ID
- Update existing tasks

## Technologies Used

- Java
- Spring Boot
- Spring JPA
- Hibernate
- H2 Database (in-memory)
- OpenAPI/Swagger for API documentation

## Prerequisites

Java 8 or higher
Maven

## Installation

1. Clone the repository

```
git clone https://github.com/yourusername/todolist.git
cd todolist

```

2. Build the project using Maven

```
mvn clean install

```
## Running the application

1. Run the spring boot application

```
mvn spring-boot:run

```

2. Access the API documentation
    - Open your web browser and navigate to http://localhost:8080/swagger-ui.html to access the Swagger UI.

## API Documentation

The API is documented using OpenAPI/Swagger. You can view the documentation by accessing the following URL after running the application:

- [Swagger_UI](http://localhost:8080/swagger-ui.html)

**Example End Points**
- Get all tasks
```
GET /tasks/all

```
- Get a task by ID
```
GET /tasks/{id}
```
- Add a new task
```
POST /tasks
```
```
{
    "id": 1,
    "task": "Simple task",
    "description": "Simple task description"
}
```




 
