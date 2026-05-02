## DevOps Spring Boot Project — CI/CD + IaC + Monitoring:
# Project Overview: 

This project is a Spring Boot REST API application that I developed as part of a DevOps assignment. The main goal of this project was to demonstrate how different DevOps practices can be applied in a real software project including version control, continuous integration, infrastructure automation, deployment simulation, and monitoring.

The application is built using Java and Spring Boot and follows a layered architecture. I structured the project in a way where each layer has a clear responsibility, for example controllers handle HTTP requests, services contain business logic, repositories handle database communication, and DTOs are used to transfer data between layers.

During development, I used Git for version control and created two main branches called main and dev. The main branch contains stable and tested code, while the dev branch was used for active development and testing new features before merging.

A continuous integration pipeline was implemented using GitHub Actions. This pipeline automatically builds the project every time I push changes to the repository or create a pull request. The purpose of this is to ensure that the application always builds correctly and to detect errors early.

In addition, I created automation scripts using Bash to demonstrate Infrastructure as Code (IaC). These scripts help prepare the environment and simulate deployment processes using simple commands.

The project also includes a basic monitoring system using a health check script. This script continuously checks whether the application is running and logs the results into a file for analysis.

Finally, Swagger was integrated into the project to provide API documentation and allow easy testing of all endpoints through a web interface.


# Technologies Used:

The project was developed using Java 17 and Spring Boot framework. Spring Data JPA with Hibernate was used for database management, and H2 in-memory database was used for simplicity. Maven was used as the build tool for dependency management.

Git and GitHub were used for version control, while GitHub Actions was used for continuous integration. Bash scripting was used for automation and infrastructure setup. Swagger UI was used for API documentation and testing.

# Project Structure:

The project follows a layered architecture. The controller layer is responsible for handling HTTP requests. The service layer contains the business logic. The repository layer handles database operations. The entity layer defines database models. DTOs are used to transfer data between client and server without exposing internal entities.

This structure helps to keep the project clean, maintainable, and scalable.

# How to Run the Project Locally:

To run this project locally, the repository must first be cloned from GitHub.

git clone https://github.com/anaBalukha/devopsM.git
cd devopsM

After cloning the repository, I open the project in IntelliJ IDEA.

The project uses two Git branches. The main branch contains stable code, while the dev branch is used for development. To switch to the dev branch, I use:

git checkout dev

Then I run the Spring Boot application using Maven:

mvn spring-boot:run

After starting the application, it runs on:

http://localhost:8080

Swagger documentation is available at:

http://localhost:8080/swagger-ui/index.html


# Continuous Integration (GitHub Actions)

I implemented CI using GitHub Actions. The pipeline automatically runs whenever I push code to main or dev branches.

The pipeline builds the project using Maven and checks if the code compiles correctly.

![CI Pipeline Success](images/photo1.png)

# Infrastructure as Code (IaC)

I created automation scripts using Bash to simulate infrastructure setup. These scripts automate environment preparation and deployment simulation.

The scripts are located in the deployment folder.

#### screenshottt


# Continuous Deployment (Blue-Green Deployment)

I implemented a simple Blue-Green deployment simulation using two environments: blue and green.

The idea is that one environment runs the application while the other is ready for update, and switching between them simulates deployment without downtime.

A rollback script is also included to restore the previous version if needed.

### photooo of running blue.sh or green.sh in terminal


# Monitoring & Health Check

I created a monitoring script that continuously checks the application status.

The script sends requests to the application every few seconds and logs whether the application is UP or DOWN.

The results are saved in a log file for later analysis.

### photo of running : bash monitoring/health-check.sh and log file output

# API Testing (Swagger)

Swagger UI was integrated to allow testing of all REST endpoints in a visual interface.

All endpoints can be tested without using external tools like Postman.

### runn the spring code and then screenshot of http://localhost:8080/swagger-ui/index.html


