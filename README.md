## Project Overview: 

This project is a Spring Boot REST API application that was developed as part of a DevOps assignment. The goal of the project is to demonstrate the implementation of modern DevOps practices including continuous integration, infrastructure automation, version control, and API documentation. The application follows a layered architecture and is built using Spring Boot with Java.
The system was designed to separate responsibilities between different layers such as controllers, services, repositories, and data transfer objects. This structure ensures that the application is maintainable and follows best practices for backend development.
During development, Git was used for version control with two main branches: a main branch for stable code and a dev branch for active development. This allows safe testing and changes without affecting the production-ready version.
A continuous integration pipeline was implemented using GitHub Actions. This pipeline automatically builds the project using Maven whenever code is pushed or updated in the repository. The purpose of this is to ensure that the code is always in a working state and that errors are detected early.
In addition to CI, an infrastructure automation script was created using Bash. This script is responsible for preparing and running the application with a single command. It demonstrates the concept of Infrastructure as Code by automating environment setup and application execution.
The project also includes API documentation using Swagger. Swagger provides a user-friendly interface for testing and viewing all available REST endpoints without the need for external tools.
Basic monitoring was also considered by including a health-check approach using application endpoints. This allows checking whether the application is running correctly.

## Technologies Used: 

The project was developed using Java 17 and Spring Boot as the main framework. 
Spring Data JPA with Hibernate was used for database communication, and an H2 in-memory database was used for 
simplicity and easy testing. Maven was used as the build tool. Git and GitHub were used for version control and 
repository management. GitHub Actions was used for continuous integration. A Bash script was used to automate 
environment setup. Swagger was used for API documentation and testing.


## How the Project Was Structured:

The project was organized in a layered architecture. The controller layer is responsible for handling HTTP 
requests and responses. The service layer contains the main business logic of the application. 
The repository layer is responsible for database operations and communicates directly with JPA. The entity 
layer defines the database models. Data Transfer Objects are used to transfer data between the client and 
server without exposing internal entity structures. This separation improves maintainability and follows 
standard Spring Boot architecture principles.

## How to Run the Project Locally:

To run the project locally, the repository must first be cloned from GitHub to a local machine. 
After cloning, the project directory is opened in an IDE such as IntelliJ IDEA.
The development workflow uses two Git branches. The main branch contains stable code, 
while the dev branch is used for ongoing development and testing. To switch to the development branch, 
Git commands are used inside the terminal.
After switching to the correct branch, the Spring Boot application is started using Maven. 
Maven downloads all required dependencies and runs the application on a local server.
Once the application is running, it can be accessed through a browser using localhost. 
The Swagger interface is also available, which allows testing all API endpoints in a visual way.

