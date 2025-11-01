package com.nicoselomin.day_3;

public class StringAnalyzer {

    public static void main(String[] args) {

        String text = "Hello Java World";


        System.out.println("=== String Analyzer ===");
        // Display the original text
        System.out.println("Original text: " + text);

        // Get the length of the string
        System.out.println("Length: " + text.length());

        // Get the first and last characters
        System.out.println("Frist character: " + text.charAt(0));
        System.out.println("Last character: " + text.charAt(text.length() - 1));

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Check if it contains "Java"
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // Check if it starts with "Hello"
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));

        // Check if it ends with "World"
        System.out.println("Ends with 'World': " + text.endsWith("World"));
    }
}