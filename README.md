# Selenium Java Test Automation Framework

## Overview

This project is an enterprise-level UI automation framework developed using Selenium WebDriver with Java.

The framework follows the Page Object Model (POM) design pattern and is designed for scalable functional testing, regression testing, and maintainable automation execution.

The framework supports TestNG execution, Cucumber BDD integration, data-driven testing, screenshot capture, reporting, and CI/CD execution.

---

## Technology Stack

* Java
* Selenium WebDriver
* TestNG
* Cucumber BDD
* Maven
* Apache POI
* GitHub Actions

---

## Framework Features

* Page Object Model (POM) architecture
* Selenium WebDriver automation
* TestNG test execution
* Cucumber BDD support
* Feature file-based test scenarios
* Step definition implementation
* Data-driven testing using Excel
* Apache POI integration
* Screenshot capture on failures
* Cross-browser testing support
* Maven-based dependency management
* CI/CD integration

---

## Framework Architecture

```text
selenium-java-testng-framework

├── src/main/java
│
│   ├── base
│   │   └── BaseTest.java
│   │
│   ├── driver
│   │   └── DriverFactory.java
│   │
│   ├── pages
│   │   └── LoginPage.java
│   │
│   └── utils
│       ├── ScreenshotUtil.java
│       └── ExcelUtils.java
│
├── src/test/java
│
│   ├── tests
│   │   └── LoginTest.java
│   │
│   ├── stepdefinitions
│   │   └── LoginSteps.java
│   │
│   └── runners
│       └── TestRunner.java
│
├── src/test/resources
│   └── features
│       └── login.feature
│
├── pom.xml
└── testng.xml
```

---

## Design Pattern

### Page Object Model (POM)

The framework separates:

* Test execution logic
* Page locators
* Business actions
* Utility functions

Benefits:

* Better code maintainability
* Reduced duplication
* Easy UI change management
* Improved collaboration

---

## Framework Execution Flow

```text
TestNG Runner

      |

      |

Base Test Setup

      |

      |

Driver Factory

      |

      |

Page Objects

      |

      |

Selenium WebDriver

      |

      |

Application Validation
```

---

## Data-Driven Testing

The framework supports external test data management using Apache POI.

Example:

```text
TestData.xlsx

Username          Password

standard_user     secret_sauce
```

Benefits:

* Multiple test scenarios
* Reduced hard-coded values
* Easy test data maintenance

---

## Prerequisites

Install:

* Java JDK 11 or above
* Maven
* Git

Verify installation:

```bash
java -version

mvn -version
```

---

## Installation

Clone repository:

```bash
git clone <repository-url>
```

Navigate to project:

```bash
cd selenium-java-testng-framework
```

Install dependencies:

```bash
mvn clean install
```

---

## Test Execution

Execute all tests:

```bash
mvn clean test
```

Execute using TestNG suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## Reports

After execution, test results are generated based on TestNG execution.

Reports provide:

* Test execution status
* Passed/Failed scenarios
* Failure details
* Screenshots for failed tests

---

## CI/CD Integration

The framework is integrated with GitHub Actions.

Execution flow:

```text
Developer Commit

       |

GitHub Actions Trigger

       |

Setup Java Environment

       |

Install Maven Dependencies

       |

Execute Selenium Tests

       |

Generate Test Results
```

---

## Future Enhancements

Planned improvements:

* Selenium Grid integration
* Docker execution
* Allure reporting
* Parallel execution enhancement
* Cloud browser execution
* API and database integration

---

## Author

**Periyasamy Muthu**

Senior SDET | Automation Test Engineer

LinkedIn:

https://www.linkedin.com/in/periyasamymuthu
