package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbbreviateTest {
    @Test
    public void testSimpleUsage() throws Exception {
        String result = Abbreviate.abbreviate("Some string", 0, 6);
        assertEquals(result, "Som...");
    }

    @Test
    public void testNullStr() throws Exception {
        String result = Abbreviate.abbreviate(null, 0, 6);
        assertEquals(result, null);
    }

    @Test
    public void testMaxLength() throws Exception {
        String input = "Some string";
        String result = Abbreviate.abbreviate(input, 0, input.length() + 1);
        assertEquals(result, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinAbbreviationWidthIs4() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 20, 1);
    }
}