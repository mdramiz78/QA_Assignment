package com.qa.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st  word");
        String word1 = sc.nextLine().trim();

        System.out.print("Enter 2nd word");
        String word2 = sc.nextLine().trim();

        System.out.println("First Word is valid: " + WordChecker.checkEnglishWord(word1));
        System.out.println("Is Palindrome: " + WordChecker.checkPalindrome(word1));
        System.out.println("Second word is valid: " + WordChecker.checkEnglishWord(word2));
        System.out.println("Anagrams: " + WordChecker.checkAnagrams(word1, word2));

        sc.close();
    }
}
