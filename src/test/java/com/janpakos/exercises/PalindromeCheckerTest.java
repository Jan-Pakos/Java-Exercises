package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void testIsPalindrome_SimplePalindrome() {
        assertTrue(checker.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindrome_NotPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_WithSpacesAndMixedCase() {
        assertTrue(checker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testIsPalindrome_SingleCharacter() {
        assertTrue(checker.isPalindrome("a"));
    }
}
