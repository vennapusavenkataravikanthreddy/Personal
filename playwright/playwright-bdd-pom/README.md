# Playwright BDD POM Project

This project implements a Playwright testing framework using the Page Object Model (POM) and Behavior Driven Development (BDD) with Cucumber. It is designed to facilitate automated testing of web applications with a focus on maintainability and scalability.

## Project Structure

- **features/**: Contains feature files written in Gherkin syntax that describe the behavior of the application.
- **step-definitions/**: Contains step definitions that map Gherkin steps to Playwright code.
- **support/**: Contains hooks and custom world objects for managing test state and lifecycle.
- **pages/**: Contains page object classes that encapsulate interactions with the web application.
- **tests/**: Contains Playwright test cases that utilize page objects and step definitions.
- **locators/**: Contains JSON files for element selectors used in tests.
- **testdata/**: Contains Excel files with test data for various test cases.
- **utils/**: Contains utility functions for reading Excel data and writing reports.
- **config/**: Contains configuration files for Cucumber and Playwright.
- **reports/**: Contains directories for Allure, HTML, and trace reports generated during test execution.
- **output/**: Contains a summary JSON file with test execution results.

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd playwright-bdd-pom
   ```

2. **Install dependencies**:
   ```
   npm install
   ```

3. **Run tests**:
   You can run the tests using the following command:
   ```
   npx cucumber-js
   ```

4. **Generate reports**:
   After running the tests, reports will be generated in the `reports/` directory. You can view the Allure report by running:
   ```
   allure serve reports/allure-results
   ```

## Features

- Supports running tests on Chromium, Firefox, and WebKit browsers.
- Headless mode support for running tests without a UI.
- Parallel execution of tests to speed up the testing process.
- Test data is read from Excel files, allowing for easy updates and management.
- Locators are defined in JSON files for better maintainability.
- Comprehensive reporting with Allure, HTML, and trace reports.

## Contribution

Feel free to contribute to this project by submitting issues or pull requests. Your feedback and contributions are welcome!

## License

This project is licensed under the MIT License. See the LICENSE file for more details.