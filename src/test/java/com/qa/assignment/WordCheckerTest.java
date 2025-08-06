package com.qa.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordCheckerTest {

    @Test
    void testIsPalindrome() {
        assertTrue(WordChecker.checkPalindrome("Madam"));
        assertFalse(WordChecker.checkPalindrome("Hello"));
    }

    @Test
    void testAreAnagrams() {
        assertTrue(WordChecker.checkAnagrams("listen", "silent"));
        assertFalse(WordChecker.checkAnagrams("hello", "world"));
    }

    @Test
    void testIsEnglishWord() {
        assertTrue(WordChecker.checkEnglishWord("apple"));
        assertFalse(WordChecker.checkEnglishWord("asdfghjkl"));
    }
}
