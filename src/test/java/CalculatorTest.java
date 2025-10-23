import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        // Étape 0 : Initialiser avant chaque test
        calc = new Calculator();
        // Attendu : calc non-null
    }

    @Test
    @DisplayName("Addition of two position numbers")
    public  void testAddPositive() {
        // Étape 1 : Arrange (préparer)
        int a = 10;
        int b = 5;

        // Etape 2 : Act (agir)

        int result = calc.add(a, b);

        // Etape 3: Assert (Vérifier)
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Addition with negative numbers")
    public void testAddNegative() {
        // Étape 1 : Negative + Positive
        int result = calc.add(-5, 10);
        assertEquals(5, result);
        // Attendu : -5 + 10 = 5
        // Étape 2 : Negative + Negative
        int result2 = calc.add(-5, -3);
        assertEquals(-8, result2);
        // Attendu : -5 + (-3) = -8
    }

    @Test
    @DisplayName("Subtraction")
    public void testSubtract() {
        int result = calc.subtract(10, 3);
        assertEquals(7, result);
        // Attendu : 10 - 3 = 7
    }
    @Test
    @DisplayName("Multiplication")
    public void testMultiply() {
        int result = calc.multiply(3, 4);
        assertEquals(12, result);
        // Attendu : 3 * 4 = 12
    }
    @Test
    @DisplayName("Multiplication by zero")
    public void testMultiplyByZero() {
        int result = calc.multiply(5, 0);
        assertEquals(0, result);
        // Attendu : any * 0 = 0
    }

    @Test
    @DisplayName("Division throws exception")
    public void testDivideByZero() {
        // Étape 1 : Vérifier que l'exception est levée
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        // Attendu : IllegalArgumentException levée

        // Étape 2 : Vérifier le message d'erreur
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
        // Attendu : message correct
    }

    @Test
    @DisplayName("Power function")
    public void testPower() {
        assertEquals(8, calc.power(2, 3));  // 2^3 = 8
        assertEquals(1, calc.power(5, 0));  // 5^0 = 1
        assertEquals(16, calc.power(2, 4)); // 2^4 = 16
        // Attendu : tous les tests passent
    }

    @Test
    @DisplayName("Power with negative exponent throws exception")
    public void testPowerNegativeExponent() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(2, -1));
        // Attendu : exception levée
    }

    @Test
    @DisplayName("Multiple assertions in one test")
    public void testMultipleAssertions() {
        // Étape 1 : Utiliser assertAll pour tous les assertions
        assertAll(
                () -> assertEquals(15, calc.add(10, 5)),
                () -> assertEquals(5, calc.subtract(10, 5)),
                () -> assertEquals(50, calc.multiply(10, 5)),
                () -> assertEquals(2.0, calc.divide(10, 5))
        );
        // Attendu : tous les assertions passent
    }
    @Test
    @DisplayName("Test with assertTrue and assertFalse")
    public void testBooleanAssertions() {
        int result = calc.add(2, 3);
        assertTrue(result > 4);    // Vrai
        assertFalse(result < 4);   // Faux
        assertFalse(result == 6);  // 2 + 3 != 6
        // Attendu : tous les tests passent
    }
}
