package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        projects.forEach((project, developers) -> {
            if (developers.contains(developer)) {
                list.add(project);
            }
        });

        Comparator<String> stringComparator = (s1, s2) -> {
            if(s1.length() == s2.length()){
                return s2.compareTo(s1);
            }
            return Integer.compare(s2.length(), s1.length());
        };

        list.sort(stringComparator);

        return list;
    }
}
