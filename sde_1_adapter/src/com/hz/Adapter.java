package com.hz;

public class Adapter {
    public static String Checker(String input) {
        String[] words = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

        for (String word : words) {
           if (input.equals(word));
            return "Yep";
        }
        return "No";
    }
}
