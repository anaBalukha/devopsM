#!/bin/bash

echo "Rolling back deployment..."

cd "$(dirname "$0")/../anaBalukha/anaBalukha" || exit

echo "Restoring previous version..."

cmd.exe /c mvn clean install
