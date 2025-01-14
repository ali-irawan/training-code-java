# Java Training Project

## Overview
This project is designed to demonstrate the integration of AI in Java development. The training will cover various aspects of using AI tools to analyze, refactor, document, and test Java code.

## Goals
- Demonstrate how to ask AI to analyze code and identify problems.
- Show how to request AI for code refactoring or handling specific use cases.
- Utilize AI to generate comments and documentation for the code.
- Explain code functionality using AI assistance.
- Generate test cases with the help of AI.
- Use SonarCloud to analyze the code quality.

## Project Structure
```
java-training-project
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── Main.java
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── MainTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd java-training-project
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```

## Running the Application
To run the application, execute the following command:
```
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## Running Tests
To run the unit tests, use the following command:
```
mvn test
```

## Verify with Sonar
mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=ali-irawan_training-code-java

## Conclusion
This project serves as a practical guide to leveraging AI in Java development, focusing on code analysis, refactoring, documentation, and testing.