package test;

import com.company.InfixToPostfix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {

    @Test
    void convert() {
        try {
            InfixToPostfix itp = new InfixToPostfix();
            assertEquals("A B + ", itp.convert("A + B"));
        }
        catch (Exception e) {
            fail();
        }
    }
}
