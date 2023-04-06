package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Test", "Hello", "HardWork" , "Hello" , "World","Test"};

        System.out.println(wordCount(arr));

        System.out.println("Hello world!");
    }

    public static int wordCount(String[] arr) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : arr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        int count = 0;

        for (String word : wordCount.keySet()) {
            count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
        return count;
    }

}