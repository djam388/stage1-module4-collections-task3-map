package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> createdWordRepetitionsMap = new HashMap<>();

        if (sentence.isEmpty()) {
            return createdWordRepetitionsMap;
        }
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("\\p{Punct}", "");

        String[] wordsArray = sentence.split( " ");
        for (String s : wordsArray) {
            if (createdWordRepetitionsMap.containsKey(s)) {
                int val = createdWordRepetitionsMap.get(s);
                createdWordRepetitionsMap.put(s, val + 1);
            }
            else {
                createdWordRepetitionsMap.put(s, 1);
            }
        }
        return createdWordRepetitionsMap;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
