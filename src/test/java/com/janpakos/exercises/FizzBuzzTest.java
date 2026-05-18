package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzBuzzUpTo15() {
        List<String> expected = Arrays.asList(
            "1", "2", "Fizz", "4", "Buzz",
            "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz"
        );
        assertEquals(expected, fizzBuzz.generate(15));
    }

    @Test
    void testFizzBuzzUpTo1() {
        assertEquals(List.of("1"), fizzBuzz.generate(1));
    }

    @Test
    void testFizzBuzzZero() {
        assertTrue(fizzBuzz.generate(0).isEmpty());
    }
}
