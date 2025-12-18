package org.example.interview_questions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceofCharacters {
    public static void main(String[] args) {

        String s = "java";
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
