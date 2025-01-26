# Temperature Monitoring System

The **Temperature Monitoring System** is a Java-based application designed to track temperature data, convert between measurement units, and determine trends based on historical data. The application demonstrates concepts such as object-oriented programming, separation of concerns, and basic data handling.

---

## Introduction

This project aims to provide a modular way to handle temperature data by:
- Retrieving temperature values (e.g., from a service or an API).
- Converting temperatures between Fahrenheit and Celsius.
- Tracking temperature trends (warming, cooling, unchanged).
- Saving temperature records for future use.

The system is built with clean code principles and can be easily extended to integrate additional functionality, such as fetching live weather data from an API or storing records in a database.

---

## Project Structure

### 1. Main Program: `Main.java`
The entry point of the application. It coordinates the flow of the program:
- Fetches temperature data (mocked in this example).
- Converts the temperature using business logic.
- Updates the trend/status.
- Saves the record and displays the details in the console.

### 2. Business Logic: `TemperatureBusinessRules.java`
Handles the core logic for:
- Temperature conversions (Fahrenheit ↔ Celsius).
- Determining the temperature trend/status based on historical data.
- Tracking previous temperature records.

### 3. Data Model: `TemperatureRecord.java`
Defines a `TemperatureRecord` class that encapsulates:
- Temperature in Celsius and Fahrenheit.
- Activity status (`active` or `inactive`).
- Status reason (e.g., "First record", "Warming").

---

## Features

1. **Temperature Conversion**:
   - Converts Fahrenheit to Celsius and vice versa.
   - Uses formulas for accurate conversion.

2. **Status Tracking**:
   - Detects temperature trends (e.g., warming, cooling, or unchanged).
   - Provides descriptive status reasons.

3. **Record Management**:
   - Creates a structured record for each temperature reading.
   - Supports storing metadata like activity status and trend information.

4. **Modular Design**:
   - Separation of concerns between data fetching, business rules, and data storage.

---

Enjoy!
