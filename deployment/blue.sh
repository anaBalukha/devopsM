#!/bin/bash

echo "Starting BLUE deployment..."

cd "$(dirname "$0")/../anaBalukha/anaBalukha" || exit

echo "Running BLUE version..."

cmd.exe /c mvn clean install
cmd.exe /c mvn spring-boot:run
