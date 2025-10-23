import org.example.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private StringUtils strU;

    @BeforeEach
    void setUp(){
        strU = new StringUtils();
    }

    @Test
    @DisplayName("Inverse une chaîne")
    void testReverseNormalCase() {
        String input = "Hello";
        String result = StringUtils.reverse(input);
        assertEquals("olleH", result);
    }

    @Test
    @DisplayName("Inverse une chaîne throw exception")
    void testReverseEmptyStringExponent() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.reverse(""));
    }

    @Test
    @DisplayName("Inverse une chaîne throw execption with msg")
    void testReverseEmptyStringExponentWithMsg() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.reverse(""));
        assertEquals("String is null", exception.getMessage());
    }

    @Test
    @DisplayName("test is palindrome with spaces and cases ")
    void testIsPalindromeWithSpacesAndCases() {
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
    }
    @Test
    @DisplayName("test is palindrome false")
    void testIsPalindromeFalse(){
        assertFalse(StringUtils.isPalindrome("Hello" ));
    }

    @Test
    @DisplayName("test is palindrome throw exception")
    void testIsPalindromeExponent() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPalindrome(""));
    }
    @Test
    @DisplayName("test is palindrome throw exception with Msg")
    void testIsPalindromeMsgExponent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.isPalindrome(""));
        assertEquals("String is null", exception.getMessage());
    }

    @Test
    @DisplayName("Test count words normal sentence")
    void testCountWordsNormalSentence() {
        assertEquals(3, StringUtils.countWords(" Hello world test"));
    }

    @Test
    @DisplayName("test count words normal sentence throw exception")
    void testCountWordsNormalSentenceExponent() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.countWords(""));
    }
    @Test
    @DisplayName("test count words normal sentence throw exception with Msg")
    void testCountWordsNormalSentenceMsgExponent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.countWords(""));
        assertEquals("String is null", exception.getMessage());
    }

    @Test
    @DisplayName("Test capitalize normal")
    void testCapitalizeNormal() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    @DisplayName("est capitalize norma sentence throw exception")
    void testCapitalizeNormaleExponent() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.capitalize(""));
    }
    @Test
    @DisplayName("est capitalize norma sentence throw exception with Msg")
    void testCapitalizeNormalSentenceMsgExponent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.capitalize(""));
        assertEquals("String is null", exception.getMessage());
    }


}
