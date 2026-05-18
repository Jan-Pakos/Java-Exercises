package com.janpakos.exercises;

public class StringReverser {
    /**
     * Reverses a given string without using the built-in StringBuilder.reverse() method.
     * 
     * @param input the string to reverse
     * @return the reversed string, or null if the input is null
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
