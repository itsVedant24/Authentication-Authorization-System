🔐 Authentication & Authorization System

A full-stack Authentication & Authorization System built using Java, Spring Boot, Spring Security, JWT, PostgreSQL, HTML, CSS, and JavaScript. This project provides secure user registration and login functionality with JWT-based authentication and encrypted password storage.

🚀 Live Demo
🌐 Frontend: Coming Soon
⚙️ Backend API: Authentication Backend API

✨ Features
User Registration & Login
JWT Token-Based Authentication
Secure Password Encryption using BCrypt
RESTful API Architecture
Spring Security Integration
PostgreSQL Database Integration
Role-Based User System
Frontend Integration with Fetch API
Cloud Deployment using Render & Netlify
Environment Variable Configuration

🛠️ Tech Stack
Backend
Java
Spring Boot
Spring Security
Spring Data JPA
JWT Authentication
PostgreSQL
Maven
Frontend
HTML
CSS
JavaScript
Deployment
Render (Backend)
Netlify (Frontend)
Neon PostgreSQL Database

📁 Project Structure
src/
│
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── config/
├── jwt/
└── exception/

🔑 API Endpoints
Register User
POST /api/auth/register
Request Body
{
  "name":"Vedant",
  "email":"vedant@gmail.com",
  "password":"123456"
}
Login User
POST /api/auth/login
Request Body
{
  "email":"vedant@gmail.com",
  "password":"123456"
}
⚙️ Environment Variables

Create environment variables for deployment:

DB_URL=
DB_USERNAME=
DB_PASSWORD=
JWT_SECRET=

🚀 Run Locally
Clone Repository
git clone https://github.com/itsVedant24/Authentication-Authorization-System.git
Navigate to Project
cd Authentication-Authorization-System
Run Application
mvn spring-boot:run

📌 Future Improvements
JWT Authentication Filter
Refresh Tokens
Email Verification
Forgot Password Functionality
Swagger API Documentation
Docker Compose Support
Role-Based Access Control
User Dashboard

👨‍💻 Author
Vedant Ganesh Chaudhari
GitHub Profile
LinkedIn Profile
