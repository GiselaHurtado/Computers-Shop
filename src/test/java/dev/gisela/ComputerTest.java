package dev.gisela;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void testComputerCreation() {
        Computer computer = new Computer("Mac", 16, "Apple M1", "macOS", 2000.00);
        assertEquals("Mac", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Apple M1", computer.getProcessor());
        assertEquals("macOS", computer.getOperatingSystem());
        assertEquals(2000.00, computer.getPrice());
    }

    @Test
    void testComputerToString() {
        Computer computer = new Computer("Mac", 16, "Apple M1", "macOS", 2000.00);
        String expected = "ID: 2, Brand: Mac, Memory: 16GB, Processor: Apple M1, OS: macOS, Price: $2000.0";
        assertEquals(expected, computer.toString());
    }
}
