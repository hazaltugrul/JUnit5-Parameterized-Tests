# JUnit5-Parameterized-Tests

This repository contains a sample project demonstrating how to create parameterized tests using JUnit 5.

## Purpose

The purpose of this project is to demonstrate how to use parameterized tests with JUnit 5. Parameterized tests allow you to call the same test method multiple times with different input sets, which helps to make the code cleaner and less repetitive.

## Usage

To run this project, open it in a Java IDE and run the `CalculatorTest` class. The tests in this class verify the division operations in the `Calculator` class.

 ![image](https://github.com/hazaltugrul/JUnit5-Parameterized-Tests/assets/93864451/2c0c98eb-b1f9-4b43-9bdd-bcd007b5a868)
The screenshot above shows the successful execution of the tests, confirming that the division operations in the `Calculator` class are working as expected.

## Old and New Versions

The project contains two versions:

- **Old Version:** In the old version, separate test methods are used for each division operation.
  ```java
  @Test
  void testDivision1() {
      assertEquals(5, Calculator.divide(10, 2));
  }

  @Test
  void testDivision2() {
      assertEquals(2.5, Calculator.divide(10, 4));
  }

  @Test
  void testDivision3() {
      assertEquals(5, Calculator.divide(12.5f, 2.5f));
  }
  @Test
  void testDivision4() {
      assertEquals(4, Calculator.divide(10, 2.5f));
  }

  @Test
  void testDivision5() {
       assertEquals(2.5f, Calculator.divide(12.5f, 5));
  }

  ```
- **New Version:** In the new version, parameterized tests are used to perform tests with different input sets on the same test method.
  ``` java
   @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5"
        })
    void testDivision(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }
  ```
  
