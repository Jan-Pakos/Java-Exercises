package com.janpakos.exercises;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    /**
     * Returns a list of strings representing the numbers from 1 to n.
     * But for multiples of three it should output "Fizz" instead of the number
     * and for the multiples of five output "Buzz".
     * For numbers which are multiples of both three and five output "FizzBuzz".
     *
     * @param n the upper bound (inclusive)
     * @return a list of strings based on the FizzBuzz rules
     */
    public List<String> generate(int n) {
        // TODO: Implement the FizzBuzz logic
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
