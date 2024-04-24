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
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
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
