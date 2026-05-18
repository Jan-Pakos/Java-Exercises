package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    private final ValidParentheses validator = new ValidParentheses();

    @Test
    public void testIsValid_SimpleValid() {
        assertTrue(validator.isValid("()"));
    }

    @Test
    public void testIsValid_MultipleValid() {
        assertTrue(validator.isValid("()[]{}"));
    }

    @Test
    public void testIsValid_NestedValid() {
        assertTrue(validator.isValid("{[()]}"));
    }

    @Test
    public void testIsValid_InvalidOrder() {
        assertFalse(validator.isValid("([)]"));
    }

    @Test
    public void testIsValid_Mismatched() {
        assertFalse(validator.isValid("(]"));
    }

    @Test
    public void testIsValid_Unclosed() {
        assertFalse(validator.isValid("["));
    }

    @Test
    public void testIsValid_OnlyClosed() {
        assertFalse(validator.isValid("]"));
    }
}
