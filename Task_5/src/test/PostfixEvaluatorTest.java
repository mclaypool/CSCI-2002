package test;

import com.company.PostfixEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixEvaluatorTest {

    @Test
    void eval() {
        try {
            PostfixEvaluator pfe = new PostfixEvaluator();
            assertEquals(7, pfe.eval("1 2 3 * +"));
        }
        catch (Exception e) {
            fail();
        }

    }
}
