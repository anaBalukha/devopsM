#!/bin/bash

echo "Starting DevOps setup..."

# Go to correct project directory
cd "$(dirname "$0")/../anaBalukha" || exit

echo "Building project..."
./mvnw clean install

echo "Running application..."
./mvnw spring-boot:run