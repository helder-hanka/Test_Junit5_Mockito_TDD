package org.example;

public class StringUtils {

    public  static String reverse(String str){
        if (str == null  || str.trim().isEmpty()) throw new IllegalArgumentException("String is null");
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        if (str == null  || str.trim().isEmpty()) throw new IllegalArgumentException("String is null");
        String clean = str.replaceAll("\\s+","").toLowerCase();
        return clean.contentEquals(new StringBuilder(clean).reverse());
    }

    public  static int countWords(String str){
        if (str == null || str.trim().isEmpty())throw new IllegalArgumentException("String is null");
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public  static String capitalize(String str){
        if (str == null || str.trim().isEmpty()) throw new IllegalArgumentException("String is null");
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
