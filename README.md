# Selenium Test Automation Project

This project is a test automation framework built using Selenium WebDriver and Java, implementing the Page Object Model design pattern to test two demo websites: DemoQA and OrangeHRM.

## Test Websites

### DemoQA (https://demoqa.com/)
DemoQA provides various UI elements and interactions for testing:
- Form submissions
- Button interactions
- Dynamic elements
- Alerts and modals
- Drag and drop functionality
- Tables and data grids

### OrangeHRM Demo (https://opensource-demo.orangehrmlive.com/)
OrangeHRM is a Human Resource Management system featuring:
- Login authentication
- Employee management
- Dashboard interactions
- Form validations
- Data management
- User role permissions

## Project Overview

The framework consists of several key components:

1. Basic Selenium Test Setup
   - Initial project configuration
   - WebDriver setup and management
   - Base test configuration for both websites

2. Page Object Model (POM)
   - Separate page classes for DemoQA and OrangeHRM
   - Element locators for each page
   - Page-specific methods
   - Reusable components

3. Web Elements Interaction
   - Element identification strategies
   - Form handling (login, data entry)
   - Dynamic element handling
   - Alert management
   - Table interactions

4. Advanced Selenium Features
   - Custom interfaces
   - Special methods for unique testing scenarios
   - Exception handling
   - Utility functions

## Prerequisites

- Java JDK 8 or higher
- Maven
- IntelliJ IDEA (recommended)
- WebDriver browsers:
  - ChromeDriver
  - GeckoDriver (Firefox)
  - EdgeDriver (optional)

## Project Setup

1. Clone the repository:
```bash
git clone [your-repository-url]
```

2. Install dependencies:
```bash
mvn clean install
```

3. Update `config.properties` with your environment-specific settings


### OrangeHRM Demo Site:
- Username: `Admin`
- Password: `admin123`

## Running Tests


## Key Features

- Page Object Model implementation for both websites
- Reusable web element interactions
- Custom interfaces for special scenarios
- Utility methods for common operations
- Configuration management
- Test data handling
- Cross-browser testing capabilities

## Implemented Test Scenarios

### DemoQA Tests
- Form submissions and validations
- Element interactions
- Alert handling
- Dynamic element manipulation
- Table data verification

### OrangeHRM Tests
- Login authentication
- Employee data management
- Dashboard navigation
- Form validations
- User role verification

## Best Practices Implemented

- Separation of concerns using Page Object Model
- Centralized WebDriver management
- Reusable component design
- Clear naming conventions
- Proper exception handling
- Efficient element location strategies
