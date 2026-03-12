package com.devops.lab;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
@Test
void testAdd() {
    // 5 + 5 is NOT 100, so this will fail
    assertEquals(100, calculator.add(5,5));
}
}