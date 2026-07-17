# Selenium Java Test Automation Framework

## Overview

Enterprise-level UI automation framework developed using Selenium WebDriver with Java.

The framework follows Page Object Model (POM) design pattern and supports TestNG execution, data-driven testing, reporting, and CI/CD integration.

## Technology Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Cucumber BDD
- GitHub Actions
- Jenkins

## Framework Features

- Page Object Model architecture
- Reusable page components
- TestNG test execution
- Data-driven testing
- Cross-browser testing
- Screenshot capture
- Maven build management
- CI/CD pipeline integration

## Application Under Test

Demo application:

https://www.saucedemo.com/

## Data Driven Testing

Framework supports external test data execution using Apache POI.

Features:

- Excel based test data management
- Reusable Excel utility methods
- Separation of test data and automation scripts
- Easy maintenance of test scenarios

## CI/CD Integration

This framework is integrated with GitHub Actions.

Pipeline execution:

1. Checkout source code
2. Setup Java environment
3. Install Maven dependencies
4. Execute Selenium automation tests
5. Generate test reports
6. Upload execution artifacts


## Execution Commands

Run Selenium tests:

mvn clean test


Run Cucumber tests:

mvn test

## Author

Periyasamy Muthu

Senior SDET | Automation Test Engineer
