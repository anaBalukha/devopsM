#!/bin/bash

URL="http://localhost:8080"
LOG_FILE="monitoring.log"

echo "Starting health check monitoring..." >> $LOG_FILE

while true
do
  STATUS=$(curl -s -o /dev/null -w "%{http_code}" $URL)

  if [ $STATUS -eq 200 ]; then
    echo "$(date) - Application is UP (HTTP $STATUS)" >> $LOG_FILE
  else
    echo "$(date) - Application is DOWN (HTTP $STATUS)" >> $LOG_FILE
  fi

  sleep 10
done
