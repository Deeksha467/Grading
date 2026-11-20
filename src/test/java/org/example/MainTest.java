package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void testfor35mark(){
        int result=Main.testgrade(35);
        assertEquals(0,result);
    }
    @Test
    void testfor50mark(){
        int result=Main.testgrade(50);
        assertEquals(1,result);
    }
    @Test
    void testfor75mark(){
        int result=Main.testgrade(75);
        assertEquals(1,result);
    }
    @Test
    void testfor100mark(){
        int result=Main.testgrade(100);
        assertEquals(1,result);
    }
}
