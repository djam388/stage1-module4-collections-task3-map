package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> swapped = new HashMap<>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {

            System.out.println(e.getKey() + " "
                    + e.getValue());
            if (!swapped.containsKey(e.getValue())) {
                swapped.put(e.getValue(), e.getKey());
            }
            else {
                if (e.getKey() < swapped.get(e.getValue())) {
                    swapped.put(e.getValue(), e.getKey());
                }
            }
        }

        return swapped;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
