import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramDetectorTest {


    @Test
    @DisplayName("Anagram Detector Test")
    public void AnagramWordsTest() {
        // Test case 1: Anagram words
        String word1 = "listen";
        String word2 = "silent";
        Assertions.assertTrue(AnagramDetector.checkAnagramaWord(word1, word2));

        // Test case 2: Non-anagram words
        word1 = "hello";
        word2 = "world";
        Assertions.assertFalse(AnagramDetector.checkAnagramaWord(word1, word2));

        // Test case 3: Anagram words with different letter cases
        word1 = "Eleven plus two";
        word2 = "Twelve plus one";
        Assertions.assertTrue(AnagramDetector.checkAnagramaWord(word1, word2));

        // Test case 4: Anagram words with spaces and special characters
        word1 = "dormitory";
        word2 = "dirty room";
        Assertions.assertFalse(AnagramDetector.checkAnagramaWord(word1, word2));

    }
}