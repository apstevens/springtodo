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
## Project Structure

```
├── SpringToDo
│   ├── .vscode
│   │   └── settings.json
│   ├── springtodo
│   │   ├── .gitattributes
│   │   └── README.md
│   └── todolist
│       ├── .mvn
│       │   └── wrapper
│       │       └── maven-wrapper.properties
│       ├── .vscode
│       │   └── NEWLY_CREATED_BY_SPRING_INITIALIZR
│       ├── src
│       │   ├── main
│       │   │   ├── java
│       │   │   │   └── com
│       │   │   │       └── shaylesolutions
│       │   │   │           └── todolist
│       │   │   │               ├── Controller
│       │   │   │               │   └── TaskController.java
│       │   │   │               ├── Model
│       │   │   │               │   └── Task.java
│       │   │   │               ├── Repository
│       │   │   │               │   └── TaskRepository.java
│       │   │   │               ├── Service
│       │   │   │               │   ├── TaskService.java
│       │   │   │               │   └── TaskServiceImpl.java
│       │   │   │               └── TodolistApplication.java
│       │   │   └── resources
│       │   │       └── application.properties
│       │   └── test
│       │       └── java
│       │           └── com
│       │               └── shaylesolutions
│       │                   └── todolist
│       │                       └── TodolistApplicationTests.java
│       ├── target
│       │   ├── classes
│       │   │   ├── com
│       │   │   │   └── shaylesolutions
│       │   │   │       └── todolist
│       │   │   │           ├── Controller
│       │   │   │           │   └── TaskController.class
│       │   │   │           ├── Model
│       │   │   │           │   └── Task.class
│       │   │   │           ├── Repository
│       │   │   │           │   └── TaskRepository.class
│       │   │   │           ├── Service
│       │   │   │           │   ├── TaskService.class
│       │   │   │           │   └── TaskServiceImpl.class
│       │   │   │           └── TodolistApplication.class
│       │   │   └── application.properties
│       │   └── test-classes
│       │       └── com
│       │           └── shaylesolutions
│       │               └── todolist
│       │                   └── TodolistApplicationTests.class
│       ├── .gitignore
│       ├── HELP.md
│       ├── mvnw
│       ├── mvnw.cmd
│       └── pom.xml
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements, bug fixes, or new features.

1. **Fork the repository**
2. **Create your feature branch**
```
git checkout -b feature/YourFeature
```
3. **Commit your changes**
```
git commit -m 'Add some feature'
```
4. **Push to the branch**
```
git push origin feature/YourFeature
```
5. **Open a pull request**

## Contact

- **Andy Stevens** - apstevens@shayledesignsolutions.co.uk
- https://github.com/apstevens/springtodo
 
