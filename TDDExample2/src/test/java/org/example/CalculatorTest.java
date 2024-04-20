/*
* Student No: B201202048
* Name & Surname : HAZAL TUGRUL
* Course Name:SWE202 SOFTWARE VERIFICATION AND VALIDATION
* Assignment1
* GitHub Repository Address:https://github.com/hazaltugrul/JUnit5-Parameterized-Tests
*/

package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("divisionTestCases")
    void testDivision(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }

    private static Object[][] divisionTestCases() {
        return new Object[][] {
                {10f, 2f, 5f},
                {10f, 4f, 2.5f},
                {12.5f, 2.5f, 5f},
                {10f, 2.5f, 4f},
                {12.5f, 5f, 2.5f}
        };
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}
