package com.qa.assignment;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.Arrays;

public class WordChecker {
    private static final OkHttpClient client = new OkHttpClient();

    public static boolean checkEnglishWord(String word) {
        try {
            String url = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word.toLowerCase();
            Request request = new Request.Builder().url(url).build();
            Response response = client.newCall(request).execute();
            return response.code() == 200;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static boolean checkAnagrams(String word1, String word2) {
        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
