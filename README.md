### Description
This repository automates the SignUp functionality of the Telerik demo website SHAFT Engine with Java. The project ensures efficient and reliable test execution.

---

### Features
- Built on the SHAFT Engine for enhanced test automation capabilities.
- Written in Java for compatibility and reliability.
- Easy integration with CI/CD pipelines.

---

### Prerequisites
1. **Java** (version 21 or later).
2. **Maven** installed.
3. **SHAFT_Engine** Set-Up   
---

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Ensure the SHAFT Engine is properly configured.

---

### Project Structure
- **src/main/java/**: Application and utility classes.
- **src/test/java/**: Test cases and test data.
- **pom.xml**: Maven configuration file.
- **github/workflows**: workflow files with custom tests runner.
---

### How to Run
1. Execute tests:
   ```bash
   mvn test
   ```
---

### Customization
- Modify test cases in `src/test/java/` for additional scenarios.

---
