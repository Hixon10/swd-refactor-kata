package task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfAnyTest {
    @Test
    public void testFindExistingSubstring() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "string".toCharArray());
        assertEquals(index, 5);
    }

    @Test
    public void testFindLastExistingSubstring() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "g".toCharArray());
        assertEquals(index, 10);
    }

    @Test
    public void testFindLastExistingSubstring2() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "ga".toCharArray());
        assertEquals(index, 10);
    }

    @Test
    public void testExistingSymbol() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "Noneistent string".toCharArray());
        assertEquals(index, 4);
    }

    @Test
    public void testExistingSymbolPlusNonExistingSymbol() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "sa".toCharArray());
        assertEquals(index, -1);
    }

    @Test
    public void testNonExistingSymbol() throws Exception {
        int index = IndexOfAny.indexOfAny("Some string", "abc".toCharArray());
        assertEquals(index, -1);
    }

    @Test
    public void testEmptyString() throws Exception {
        int index = IndexOfAny.indexOfAny("", "abc".toCharArray());
        assertEquals(index, -1);
    }

    @Test
    public void testEmptyString2() throws Exception {
        int index = IndexOfAny.indexOfAny(new String(), "abc".toCharArray());
        assertEquals(index, -1);
    }
}