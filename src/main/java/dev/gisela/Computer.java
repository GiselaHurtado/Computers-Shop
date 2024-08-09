package dev.gisela;

public class Computer {
    private static long idCounter = 0;
    private Long Id;
    private String brand;
    private int memory; // GB
    private String processor;
    private String operatingSystem;
    private Double price;

    public Computer(String brand, int memory, String processor, String operatingSystem, Double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.Id = ++idCounter;
    }

    public String getBrand() {
        return brand;
    }

    public Long getId() {
        return Id;
    }

    public int getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + Id + ", Brand: " + brand + ", Memory: " + memory + "GB, Processor: " + processor + 
               ", OS: " + operatingSystem + ", Price: $" + price;
    }
}
