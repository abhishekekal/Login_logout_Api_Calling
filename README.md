# Login_logout_Api_Calling

# Auth API

## Overview

This project provides a basic authentication API using Spring Boot. It includes functionalities for user registration, login, and logout.

---

## Features

1. **User Registration**  
   Endpoint to register new users in the system.

2. **User Login**  
   Endpoint to authenticate users with their credentials.

3. **User Logout**  
   Endpoint to handle user logout by invalidating sessions or tokens.

---

## Technologies Used

- **Java**
- **Spring Boot**
- **Spring MVC**
- **REST API**

---

## API Endpoints

### 1. Register a User
**Endpoint:**  
`POST /api/auth/register`

**Request Body (JSON):**
```json
{
  "username": "your_username",
  "password": "your_password",
 
}

