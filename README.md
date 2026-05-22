# Spring Boot CRUD REST API

A simple CRUD REST API built using Spring Boot, Spring Data JPA, Hibernate, and H2 Database.

This project demonstrates backend development concepts such as REST APIs, layered architecture, dependency injection, JPA repositories, and database integration.

---

# Features

- Create Todo
- Get All Todos
- Get Todo By ID
- Update Todo
- Delete Todo

---

# Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Postman

---

# Project Architecture

Controller → Service → Repository → Database

---

# REST API Endpoints

## Create Todo

POST `/api/create`

### Request Body

```json
{
  "title":"Learn Spring Boot",
  "description":"Practice CRUD APIs",
  "completed":true
}
