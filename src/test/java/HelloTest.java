import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    @DisplayName("test Hello name")
    public void caseHelloTest(){
        // Arrange
        Hello hello = new Hello();
        String name = "Nice";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello Nice", actualResult);
    }
}