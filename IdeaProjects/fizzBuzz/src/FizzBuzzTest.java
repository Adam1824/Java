import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void isMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.isMultipleOf3(3), true);
    }

    @org.junit.jupiter.api.Test
    void isMultipleOf5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.isMultipleOf5(5), true);
    }

    @org.junit.jupiter.api.Test
    void isMultipleOf3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.isMultipleOf3And5(15), true);
    }

    @org.junit.jupiter.api.Test
    void main() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.main(), true);
    }
}