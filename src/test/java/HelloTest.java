import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    @DisplayName("test Hello name")
    public void caseHelloTest(){
        Hello hello = new Hello();
        String name = "Nice";
        String actualResult = hello.sawadee(name);
        assertEquals("Hello Nice", actualResult);
    }
}