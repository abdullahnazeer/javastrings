package com.sparta;

public class Main {
    public static void main(String[] args) {

//        // String literal - stored in the string pool
//        String name1 = "Yash";
//
//        // String object - stored in the heap
//        String name2 = new String("Cameron");
//
//        String name3 = "Yash";
//
//        String name4 = new String("Cameron");
//
//        String anotherString = name1.toUpperCase();
//
//        System.out.println("This person's name is: " + name1.toUpperCase());
//
//        System.out.println(name3 == name1); // true
//
//        System.out.println(name2 == name4); // false
//
//        System.out.println(name1.equals(name3)); // true
//
//        System.out.println(name2.equals(name4)); // true

        Customer c1 = new Customer("Abdullah", "Nazeer");
        Customer c2 = new Customer("Abdullah", "Nazeer");
        Customer c3 = new Customer("Ben", "Swenson");

        if (c1.equals(c2)) {
            System.out.println("These are the same customers!");
        }

        String[] words = {"The", "cat", "in", "the", "hat"};

        System.out.println("Result of countWords is: " + countWords(words, 't'));

        System.out.println("Result of countWordsInString is: " + countWordsInString("The cat in the hat", 't'));

    }

    public static int countWords(String[] words, char character) {

        int result = 0;

        for (String word : words) {
            if (word.charAt(0) == Character.toUpperCase(character) || word.charAt(0) == Character.toLowerCase(character)) {
                result += 1;
            }
        }

        return result;
    }

    public static int countWordsInString(String phrase, char character) {

        int result = 0;

        String[] words = phrase.split(" ");

        return result = countWords(words, character);

    }
}