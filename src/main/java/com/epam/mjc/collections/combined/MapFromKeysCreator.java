package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        return sourceMap.keySet().stream()
                .collect(Collectors.toMap(String::length, s -> new HashSet<>(Set.of(s)), (o, o2) -> {
                    o.addAll(o2);
                    return o;
                }));
    }
}
