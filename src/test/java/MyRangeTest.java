import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {
    @Test
    @DisplayName("first string is [ (include) is true")
    public void startWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("first string is ( (exclude) is false")
    public void startWithExclude(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("last string is ] (include) is true")
    public void stopWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStopWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("last string is ) (exclude) is false")
    public void stopWithExclude(){
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isStopWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("start number with [ (include)")
    public void startNumberWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStartNumber();
        assertEquals(1, result);
    }
    @Test
    @DisplayName("start number with ] (include)")
    public void endNumberWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEndNumber();
        assertEquals(5, result);
    }

    @Test
    @DisplayName("start number with ( (exclude)")
    public void startNumberWithExclude(){
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStartNumber();
        assertEquals(2, result);
    }
    @Test
    @DisplayName("start number with ) (exclude)")
    public void endNumberWithExclude(){
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.getEndNumber();
        assertEquals(4, result);
    }

    @Test
    @DisplayName("get result with []")
    public void resultWithStartInStopIn(){
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("12345", result);
    }
    @Test
    @DisplayName("get result with [)")
    public void resultWithStartInStopEx(){
        MyRange myRange = new MyRange("[1,5)");
        String result = myRange.getResult();
        assertEquals("1234", result);
    }
    @Test
    @DisplayName("get result with ()")
    public void resultWithStartExStopEx(){
        MyRange myRange = new MyRange("(1,5)");
        String result = myRange.getResult();
        assertEquals("234", result);
    }
    @Test
    @DisplayName("get result with (]")
    public void resultWithStartExStopIn(){
        MyRange myRange = new MyRange("(1,5]");
        String result = myRange.getResult();
        assertEquals("2345", result);
    }
}
