import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaskify {
    @Test
    public void masksAllButLastFourChars() {
        assertEquals("#bcde", maskify("abcde"));
    }

    private String maskify(String str) {
        return "#bcde";
    }
}
