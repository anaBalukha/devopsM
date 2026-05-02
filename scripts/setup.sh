#!/bin/bash

echo "Starting DevOps setup..."

# Go to correct Spring Boot project folder
cd "$(dirname "$0")/../anaBalukha/anaBalukha" || exit

echo "Building project..."
./mvnw clean install

echo "Running application..."
./mvnw spring-boot:run