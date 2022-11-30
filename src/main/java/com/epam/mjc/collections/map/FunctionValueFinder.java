package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedFunctionMap = new HashMap<>();
        for (Integer val : sourceList) {
            calculatedFunctionMap.put(val, val * 5 + 2);
        }
        return calculatedFunctionMap;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
