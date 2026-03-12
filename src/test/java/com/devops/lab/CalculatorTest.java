package com.devops.lab;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5,5));
    }
}