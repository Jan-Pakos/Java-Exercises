package com.janpakos.exercises;

import java.util.HashMap;

public class HashMapTesting {

    HashMap<String, Integer> map = new HashMap<String, Integer>();

    public HashMapTesting() {
        map.put("hello", 2);
        map.put("helloo", 3);
        map.put("helllo", 4);
    }

    public void addAlreadyExistingEntryToMap(String key, Integer value) {
        map.put(key, value);
    }




}
