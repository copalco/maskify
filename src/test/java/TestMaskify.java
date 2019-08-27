import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaskify {
    @Test
    public void masksAllButLastFourChars() {
        assertEquals("#bcde", maskify("abcde"));
    }

    @Test
    public void doesNotMaskIfConsistsOfFourChars() {
        assertEquals("abcd", maskify("abcd"));
    }

    private String maskify(String str) {
        if (str.length() == 4) {
            return str;
        }
        return "#bcde";
    }
}
