package dev.gisela;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private String name;
    private String owner;
    private int taxID;
    private List<Computer> inventory;

    public Shop(String name, String owner, int taxID) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
        this.inventory = new ArrayList<>();
    }

    public void addComputer(String brand, int memory, String processor, String operatingSystem, double price) {
        Computer computer = new Computer(brand, memory, processor, operatingSystem, price);
        inventory.add(computer);
        System.out.println("Computer " + brand + " added with ID " + computer.getId() + ".");
    }

    public void removeComputer(String brand) {
        inventory = inventory.stream()
                             .filter(comp -> !comp.getBrand().equalsIgnoreCase(brand))
                             .collect(Collectors.toList());
        System.out.println("Computers of brand " + brand + " removed.");
    }

    public List<Computer> searchComputer(String brand) {
        return inventory.stream()
                        .filter(comp -> comp.getBrand().equalsIgnoreCase(brand))
                        .collect(Collectors.toList());
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(inventory);
    }

    public List<Computer> getInventory() {
        return inventory;
    }
}
