import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testTraslate() {
        int number = 3;
        String expected = "Fizz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        fizzBuzzTranslate.setNumber(number);
        String result = fizzBuzzTranslate.traslate();
        assertEquals(expected, result);
    }

    @Test
    void testTraslate1() {
        int number = 5;
        String expected = "Buzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        fizzBuzzTranslate.setNumber(number);
        String result = fizzBuzzTranslate.traslate();
        assertEquals(expected, result);
    }

    @Test
    void testTraslate2() {
        int number = 15;
        String expected = "FizzBuzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        fizzBuzzTranslate.setNumber(number);
        String result = fizzBuzzTranslate.traslate();
        assertEquals(expected, result);
    }

    @Test
    void testTraslate3() {
        int number = 14;
        String expected = "FizzBuzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        fizzBuzzTranslate.setNumber(number);
        String result = fizzBuzzTranslate.traslate();
        assertEquals(expected, result);
    }
}