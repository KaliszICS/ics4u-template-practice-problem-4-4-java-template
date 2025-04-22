import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

    private final CampbellClass campbellClass = new CampbellClass();
    private static final double DELTA = 0.001; // For comparing double values

    // Tests for convertString method
    @Test
    public void testConvertStringFromInt() {
        assertEquals("42", campbellClass.convertString(42));
    }

    @Test
    public void testConvertStringFromNegativeInt() {
        assertEquals("-17", campbellClass.convertString(-17));
    }

    @Test
    public void testConvertStringFromZero() {
        assertEquals("0", campbellClass.convertString(0));
    }

    @Test
    public void testConvertStringFromDouble() {
        assertEquals("3.14", campbellClass.convertString(3.14));
    }

    @Test
    public void testConvertStringFromNegativeDouble() {
        assertEquals("-2.718", campbellClass.convertString(-2.718));
    }

    @Test
    public void testConvertStringFromDoubleWithTrailingZeros() {
        assertEquals("5.0", campbellClass.convertString(5.0));
    }

    @Test
    public void testConvertStringFromChar() {
        assertEquals("A", campbellClass.convertString('A'));
    }

    @Test
    public void testConvertStringFromSpecialChar() {
        assertEquals("@", campbellClass.convertString('@'));
    }

    @Test
    public void testConvertStringFromSpaceChar() {
        assertEquals(" ", campbellClass.convertString(' '));
    }

    @Test
    public void testConvertStringFromBooleanTrue() {
        assertEquals("true", campbellClass.convertString(true));
    }

    @Test
    public void testConvertStringFromBooleanFalse() {
        assertEquals("false", campbellClass.convertString(false));
    }

    // Tests for convertInchesToCenti method
    @Test
    public void testConvertInchesToCentiFromInt() {
        assertEquals(25.4, campbellClass.convertInchesToCenti(10), DELTA);
    }

    @Test
    public void testConvertInchesToCentiFromZero() {
        assertEquals(0.0, campbellClass.convertInchesToCenti(0), DELTA);
    }

    @Test
    public void testConvertInchesToCentiFromNegativeInt() {
        assertEquals(-12.7, campbellClass.convertInchesToCenti(-5), DELTA);
    }

    @Test
    public void testConvertInchesToCentiFromDouble() {
        assertEquals(8.89, campbellClass.convertInchesToCenti(3.5), DELTA);
    }

    @Test
    public void testConvertInchesToCentiFromSmallDecimal() {
        assertEquals(0.635, campbellClass.convertInchesToCenti(0.25), DELTA);
    }

    @Test
    public void testConvertInchesToCentiFromNegativeDouble() {
        assertEquals(-6.985, campbellClass.convertInchesToCenti(-2.75), DELTA);
    }

    // Tests for removeNonAlpha method with single parameter
    @Test
    public void testRemoveNonAlphaBasic() {
        assertEquals("HelloWorld", campbellClass.removeNonAlpha("Hello123World!"));
    }

    @Test
    public void testRemoveNonAlphaOnlyLetters() {
        assertEquals("OnlyLetters", campbellClass.removeNonAlpha("OnlyLetters"));
    }

    @Test
    public void testRemoveNonAlphaNoLetters() {
        assertEquals("", campbellClass.removeNonAlpha("123!@#"));
    }

    @Test
    public void testRemoveNonAlphaEmptyString() {
        assertEquals("", campbellClass.removeNonAlpha(""));
    }

    @Test
    public void testRemoveNonAlphaWithSpaces() {
        assertEquals("HelloWorld", campbellClass.removeNonAlpha("Hello World 123"));
    }

    @Test
    public void testRemoveNonAlphaWithSpecialChars() {
        assertEquals("abc", campbellClass.removeNonAlpha("a1b2c3!@#$%^&*()"));
    }

    // Tests for removeNonAlpha method with boolean parameter
    @Test
    public void testRemoveNonAlphaUpperCase() {
        assertEquals("HELLOWORLD", campbellClass.removeNonAlpha("Hello123World!", true));
    }

    @Test
    public void testRemoveNonAlphaLowerCase() {
        assertEquals("helloworld", campbellClass.removeNonAlpha("Hello123World!", false));
    }

    @Test
    public void testRemoveNonAlphaOnlyLettersUpperCase() {
        assertEquals("ONLYLETTERS", campbellClass.removeNonAlpha("OnlyLetters", true));
    }

    @Test
    public void testRemoveNonAlphaOnlyLettersLowerCase() {
        assertEquals("onlyletters", campbellClass.removeNonAlpha("OnlyLetters", false));
    }

    @Test
    public void testRemoveNonAlphaNoLettersWithBoolean() {
        assertEquals("", campbellClass.removeNonAlpha("123!@#", true));
        assertEquals("", campbellClass.removeNonAlpha("123!@#", false));
    }

    @Test
    public void testRemoveNonAlphaEmptyStringWithBoolean() {
        assertEquals("", campbellClass.removeNonAlpha("", true));
        assertEquals("", campbellClass.removeNonAlpha("", false));
    }

    @Test
    public void testRemoveNonAlphaWithSpacesUpperCase() {
        assertEquals("HELLOWORLD", campbellClass.removeNonAlpha("Hello World 123", true));
    }

    @Test
    public void testRemoveNonAlphaWithSpacesLowerCase() {
        assertEquals("helloworld", campbellClass.removeNonAlpha("Hello World 123", false));
    }
}
