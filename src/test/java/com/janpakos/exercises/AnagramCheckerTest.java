package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    private final AnagramChecker checker = new AnagramChecker();

    @Test
    public void testIsAnagram_ValidAnagram() {
        assertTrue(checker.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagram_NotAnagram() {
        assertFalse(checker.isAnagram("hello", "world"));
    }

    @Test
    public void testIsAnagram_DifferentLengths() {
        assertFalse(checker.isAnagram("a", "ab"));
    }

    @Test
    public void testIsAnagram_CaseInsensitive() {
        assertTrue(checker.isAnagram("Triangle", "Integral"));
    }

    @Test
    public void testIsAnagram_WithSpaces() {
        assertTrue(checker.isAnagram("Dormitory", "Dirty room"));
    }
}
