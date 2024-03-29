import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import maskify.Maskifier;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestMaskify {

    private final Maskifier maskifier = new Maskifier();

    @Parameters({
        "#bcde, abcde",
        "#bbbb, bbbbb",
        "##cdef, abcdef",
    })
    @Test
    public void masksAllButLastFourChars(String expected, String input) {
        assertEquals(expected, maskifier.maskify(input));
    }

    @Test
    public void doesNotMaskIfConsistsOfFourChars() {
        assertEquals("abcd", maskifier.maskify("abcd"));
    }

    @Test
    public void doesNotMaskIfShorterThanFourChars() {
        assertEquals("abc", maskifier.maskify("abc"));
    }

}
