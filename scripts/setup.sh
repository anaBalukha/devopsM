#!/bin/bash

echo "Starting DevOps setup..."

cd ../anaBalukha/anaBalukha

echo "Building project..."
mvn clean install

echo "Running application..."
mvn spring-boot:run
