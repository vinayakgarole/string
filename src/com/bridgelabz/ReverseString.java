package com.bridgelabz;

public class ReverseString {
    public static void main(String[] args) {

        String string = "Dream Big";
        String reversedStr = " ";

        for (int i=string.length()-1; i>=0; i--) {
            reversedStr = reversedStr + string.charAt(i);
        }
        System.out.println("Original string: " +string);
        System.out.println("Reversed of given string: " +reversedStr);
    }
}
