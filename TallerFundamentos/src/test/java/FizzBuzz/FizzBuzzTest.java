package FizzBuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testaDomainRanges() {
        // Arrange
        FizzBuzz fizzBuzz  = new FizzBuzz();
        int minValue = -1;
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(minValue));
    }

    @Test
    void testaMaximunRanges() {
        // Arrange
        FizzBuzz fizzBuzz  = new FizzBuzz();
        int maxValue = 101; // Pequeño detalle: le cambié el nombre a maxValue para que tenga más sentido
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(maxValue));
    }

    @Test
    void testBuzz() { // Nota: en Java por convención los métodos empiezan en minúscula (camelCase)
        // Arrange
        FizzBuzz fizzBuzz  = new FizzBuzz();
        int value = 10;
        String expected = "Buzz";
        // Act
        String result = fizzBuzz.calculate(value);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizz() {
        // Arrange
        FizzBuzz fizzBuzz  = new FizzBuzz();
        int value = 9; // Un múltiplo de 3
        String expected = "Fizz";
        // Act
        String result = fizzBuzz.calculate(value);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 15; // Múltiplo de 3 y de 5
        String expected = "FizzBuzz";
        // Act
        String result = fizzBuzz.calculate(value);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testNotFizzBuzz() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 7; // Un número que no es múltiplo de ninguno
        String expected = "7"; // Esperamos el número como texto
        // Act
        String result = fizzBuzz.calculate(value);
        // Assert
        assertEquals(expected, result);
    }
}