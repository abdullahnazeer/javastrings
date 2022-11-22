package com.sparta;

public class ConcatExample {

    public static void concatExample() {
//        String name = "Tommy";
//        System.out.println("The trainer's name is: " + name);

        String[] names = {"Yash", "Liam", "Iman", "Rob"};

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i <= names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
