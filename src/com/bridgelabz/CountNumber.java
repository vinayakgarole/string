package com.bridgelabz;

public class CountNumber {
    public static void main(String[] args) {

        String string = "The best of both words";
        int count = 0;

        for (int i=0; i<string.length(); i++) {

            if (string.charAt(i) != ' ') {
                count++;
            }
            System.out.println("Total numbers of character in a string: " +count);
        }
    }
}
