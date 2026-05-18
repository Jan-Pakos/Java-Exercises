package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    private final StringReverser reverser = new StringReverser();

    @Test
    void testReverseNormalString() {
        assertEquals("olleh", reverser.reverse("hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    void testReverseNullString() {
        assertNull(reverser.reverse(null));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", reverser.reverse("a"));
    }
}
