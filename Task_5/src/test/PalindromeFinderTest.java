package test;

import com.company.PalindromeFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeFinderTest {

    @Test
    void isPalindromeTrue() {
        PalindromeFinder pali = new PalindromeFinder("rotor");
        assertTrue(pali.isPalindrome());
    }

    @Test
    void isPalindromeFalse() {
        PalindromeFinder pali = new PalindromeFinder("It's Not...");
        assertFalse(pali.isPalindrome());
    }
}
