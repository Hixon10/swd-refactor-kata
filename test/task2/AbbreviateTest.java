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
    public void testConstOffset() throws Exception {
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 0, 20), "Some sting with w...");
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 1, 20), "Some sting with w...");
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 2, 20), "Some sting with w...");
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 3, 20), "Some sting with w...");
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 4, 20), "Some sting with w...");
        assertEquals(Abbreviate.abbreviate("Some sting with words and words2", 5, 20), "...sting with wor...");
    }

    @Test
    public void testMaxLength() throws Exception {
        String input = "Some string";
        String result = Abbreviate.abbreviate(input, 0, input.length() + 1);
        assertEquals(result, input);
    }

    @Test
    public void testMaxLength2() throws Exception {
        String input = "London is a capital of Great Britain";
        String result = Abbreviate.abbreviate(input, input.length() + 1, 7);
        assertEquals(result, "...tain");
    }

    @Test
    public void testTwoSidesDots() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 20, 9);
        assertEquals(result, "...of ...");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinAbbreviationWidthIs4() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 20, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinAbbreviationWidthWithOffsetIs7() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 8, 5);
    }
}