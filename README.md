# Temperature Monitoring System

This project is a simple temperature monitoring system that retrieves, converts, and records temperature data, along with status updates based on changes in temperature. It consists of three key components:

1. **Main Program** (`Main.java`)
2. **Business Logic** (`TemperatureBusinessRules.java`)
3. **Data Model** (`TemperatureRecord.java`)

---

## Files Overview

### `Main.java`
This is the entry point of the program. It orchestrates the following steps:
- Fetches the temperature in Fahrenheit using a `TemperatureService`.
- Converts the fetched temperature to Celsius using the business rules.
- Updates the status based on temperature trends.
- Saves the temperature record using a `DataverseRepository`.
- Prints the latest record details to the console.

### `TemperatureBusinessRules.java`
Defines the business logic for temperature processing:
- **Conversion Functions**: Convert between Celsius and Fahrenheit.
- **Status Reason Updates**: Determines the status of the temperature data based on trends:
  - `"First record"`: When no previous data exists.
  - `"Weather Unchanged"`: When the temperature remains constant.
  - `"Warming"`: When the temperature rises.
  - `"Cooling"`: When the temperature drops.
- Tracks previous temperature data for trend analysis.

### `TemperatureRecord.java`
A data model for storing temperature records. It includes:
- Temperature in Celsius and Fahrenheit.
- Activity status (`active`).
- A status reason describing the temperature trend.

---
