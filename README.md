# DevOps Practices Applied in a Spring Boot Web Application Project Overview:

In this project, I developed a Spring Boot backend application and gradually extended it by applying different 
DevOps practices such as version control, continuous integration, automation scripts, deployment simulation, 
and basic monitoring. The main focus of the project was not only to build a working web application but also to 
demonstrate how modern software development workflows can be organized using DevOps principles in a structured and 
repeatable way. The application itself is built using Java and Spring Boot framework. I followed a layered architecture 
approach where each part of the system has a clear responsibility. The controller layer is responsible for handling 
HTTP requests, the service layer contains the core business logic of the application, and the repository layer is 
responsible for interacting with the database. This structure helps to keep the project clean, organized, and 
easier to maintain.
During development, I also used Git as a version control system and maintained two separate branches: main and dev. 
The main branch represents the stable version of the application, while the dev branch was used for active development 
and testing new changes before merging them into the main branch.

# Technologies Used:
In this project, I used the following technologies and tools: Java 17 as the programming language, Spring Boot 
as the backend framework, Spring Data JPA for database communication, H2 in-memory database for testing and simplicity,
Maven for project build and dependency management, Git and GitHub for version control, GitHub Actions for continuous 
integration, Bash scripting for automation and deployment simulation and Swagger UI for API documentation and testing.
Each of these tools was chosen to demonstrate a different part of the software development lifecycle and 
DevOps workflow.

# Project Structure:

The project follows a layered architecture design:
   1. Controller Layer: Handles incoming HTTP requests and maps them to service methods. 
   2. Service Layer: Contains the business logic and processes data.
   3. Repository Layer: Communicates with the database and performs CRUD operations.
   4. Entity Layer: Represents database tables as Java objects.
   5. DTO Layer: Transfers data between client and server without exposing internal structure.
so that it separates responsibilities and ensures that the application remains scalable and easy to maintain.

# How to Run the Project Locally

the repository must first be cloned from GitHub: git clone https://github.com/anaBalukha/devopsM.git
                                                 cd devopsM

After cloning the repository, I open the project in IntelliJ IDEA and make sure Maven dependencies are loaded correctly.
as I mentioned before the project contains two Git branches:
             main branch → stable version of the application
             dev branch → development version

To switch to the development branch,use: git checkout dev
To run the application, execute: mvn spring-boot:run

After running the application successfully, it becomes available at: http://localhost:8080

Swagger API documentation can be accessed at: http://localhost:8080/swagger-ui/index.html

# Continuous Integration (GitHub Actions)

I implemented Continuous Integration using GitHub Actions. The main purpose of CI is to automatically build and 
test the application whenever changes are pushed to the repository. The pipeline is triggered automatically 
on every push or pull request to the main or dev branches. This ensures that the code is always in a working state 
and helps detect errors early during development.
The CI pipeline performs the following steps: 
             1. It checks out the repository code
             2. It sets up Java environment
             3. It builds the project using Maven
             4. It runs all unit tests to ensure correctness

![CI Pipeline Success](images/ci-success.png)