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
    @DisplayName("start number with [ (exclude)")
    public void startNumberWithInclude(){
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.startNumberWithInclude();
        assertEquals(1, result);
    }
}
