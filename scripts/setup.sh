#!/bin/bash

echo "Starting DevOps setup..."

# Always move relative to script location
cd "$(dirname "$0")/../anaBalukha/anaBalukha" || exit

echo "Building project..."
cmd.exe /c mvn clean install

echo "Running application..."
cmd.exe /c mvn spring-boot:run