package tntu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class main_test {

    @Test
    public void testAdd() {
        assertEquals(5, main_fun.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, main_fun.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, main_fun.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, main_fun.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            main_fun.divide(1, 0);
        });
        assertEquals("Divider cannot be zero", exception.getMessage());
    }
}
