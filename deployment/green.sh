#!/bin/bash

echo "Starting GREEN deployment..."

cd "$(dirname "$0")/../anaBalukha/anaBalukha" || exit

echo "Running GREEN version..."

cmd.exe /c mvn clean install
cmd.exe /c mvn spring-boot:run
