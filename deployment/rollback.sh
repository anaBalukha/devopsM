#!/bin/bash

echo "ROLLBACK TRIGGERED..."

cd ../anaBalukha/anaBalukha

echo "Reverting to previous stable version..."
mvn spring-boot:run
