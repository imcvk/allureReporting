
# Allure Reporting with Selenium and Cucumber

This project integrates **Allure Reports** with Selenium WebDriver and Cucumber (BDD) to generate detailed, interactive test reports for automation testing.

## Features
- **Allure Reporting**: Provides in-depth test reports with graphical representations and detailed step logs.
- **Selenium WebDriver**: Automates browser interaction for web application testing.
- **Cucumber**: Uses the BDD approach with feature files written in Gherkin syntax.
- **TestNG**: Manages test execution and reporting.

## Prerequisites
- Java 8+
- Maven
- Allure Commandline
- IDE (IntelliJ/ Eclipse)

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/imcvk/allureReporting.git
   
**Navigate to the project directory:**

`cd allureReporting`

**Install dependencies:**

`mvn clean install`

**Run the tests:**

`mvn test`

**Generate Allure Report: After running the tests, generate the report with:**

`allure serve target/allure-results`

**Folder Structure**

* src/main/java: Contains the source code (Page Object Models, Test Base).
* src/test/java: Contains test cases and step definitions.
* src/test/resources/features: Cucumber feature files written in Gherkin syntax.
* target/allure-results: Stores test execution results for Allure reporting.

**Reporting**

After running the tests, use the Allure command-line tool to generate an HTML report that includes:

**Test case summary**

Pass/fail statuses
Screenshots (if any)

**Step-by-step execution details**

**Customization**

Feel free to extend or modify the framework by adding additional features or reports as per your testing needs.

**Contributions**

Feel free to fork the repository, create new branches, and submit pull requests. Suggestions and improvements are welcome!
