package com.janpakos;

import com.janpakos.exercises.Movie;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap<Integer, Movie> map = new HashMap<Integer, Movie>();

        map.put(1, new Movie("Hello"));
        map.put(2, new Movie("World"));

        map.put(1, new Movie("Hello"));

        System.out.println(map.toString());
    }
}
