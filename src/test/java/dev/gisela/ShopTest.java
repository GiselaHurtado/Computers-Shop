package dev.gisela;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ShopTest {

    @Test
    void testAddComputer() {
        Shop shop = new Shop("Tech Store", "Alice", 123456);
        shop.addComputer("Mac", 16, "Apple M1", "macOS", 2000.00);
        
        List<Computer> inventory = shop.getInventory();
        assertEquals(1, inventory.size());
        assertEquals("Mac", inventory.get(0).getBrand());
    }

    @Test
    void testRemoveComputer() {
        Shop shop = new Shop("Tech Store", "Alice", 123456);
        shop.addComputer("Mac", 16, "Apple M1", "macOS", 2000.00);
        shop.addComputer("Asus", 8, "Intel i5", "Windows 10", 800.00);
        
        shop.removeComputer("Mac");
        
        List<Computer> inventory = shop.getInventory();
        assertEquals(1, inventory.size());
        assertEquals("Asus", inventory.get(0).getBrand());
    }

    @Test
    void testSearchComputer() {
        Shop shop = new Shop("Tech Store", "Alice", 123456);
        shop.addComputer("Mac", 16, "Apple M1", "macOS", 2000.00);
        shop.addComputer("Asus", 8, "Intel i5", "Windows 10", 800.00);
        
        List<Computer> result = shop.searchComputer("Mac");
        assertEquals(1, result.size());
        assertEquals("Mac", result.get(0).getBrand());
    }

    @Test
    void testListComputers() {
        Shop shop = new Shop("Tech Store", "Alice", 123456);
        shop.addComputer("Mac", 16, "Apple M1", "macOS", 2000.00);
        shop.addComputer("Asus", 8, "Intel i5", "Windows 10", 800.00);
        
        List<Computer> inventory = shop.listComputers();
        assertEquals(2, inventory.size());
    }
}
