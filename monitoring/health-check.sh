#!/bin/bash

URL="http://localhost:8080/v3/api-docs"
LOG_FILE="monitoring.log"

echo "Starting health check monitoring..." > $LOG_FILE

while true
do
  STATUS=$(curl.exe -s -o /dev/null -w "%{http_code}" $URL)

  if [ "$STATUS" -eq 200 ]; then
    echo "$(date) - Application is UP (HTTP $STATUS)" | tee -a $LOG_FILE
  else
    echo "$(date) - Application is DOWN (HTTP $STATUS)" | tee -a $LOG_FILE
  fi

  sleep 10
done
