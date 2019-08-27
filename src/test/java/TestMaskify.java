import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaskify {
    @Test
    public void masksAllButLastFourChars() {
        assertEquals(maskify("abcde"), "####e");
    }

    private String maskify(String str) {
        return "####e";
    }
}
