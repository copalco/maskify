import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import maskify.Maskifier;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestMaskify {

    @Parameters({
        "#bcde, abcde",
        "#bbbb, bbbbb",
        "##cdef, abcdef",
    })
    @Test
    public void masksAllButLastFourChars(String expected, String input) {
        assertEquals(expected, maskify(input));
    }

    @Test
    public void doesNotMaskIfConsistsOfFourChars() {
        assertEquals("abcd", maskify("abcd"));
    }

    @Test
    public void doesNotMaskIfShorterThanFourChars() {
        assertEquals("abc", maskify("abc"));
    }

    private String maskify(String str) {
        Maskifier maskifier = new Maskifier();
        return maskifier.maskify(str);
    }
}
