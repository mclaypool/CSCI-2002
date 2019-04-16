package test;

import com.company.ParenChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParenCheckerTest {

    @Test
    void isBalancedTrue() {
        assertTrue(ParenChecker.isBalanced("()()()()"));
    }

    @Test
    void isBalancedFalse() {
        assertFalse(ParenChecker.isBalanced(")))(("));
    }
}
