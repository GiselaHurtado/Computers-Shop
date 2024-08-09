package dev.gisela;

public class Computers {
    private Long Id;
    private String brand;
    private int memory; //memory in GB
    private String operatingSystem;
    private Double price;

    public Computers(Long Id, String brand, int memory, String operatingSystem, Double price) {
        this.brand = brand;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.Id = Id;
    }

    
    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public int getMemory() {
        return memory;
    }



    public void setMemory(int memory) {
        this.memory = memory;
    }



    public String getOperatingSystem() {
        return operatingSystem;
    }



    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }



    public Double getPrice() {
        return price;
    }



    public void setPrice(Double price) {
        this.price = price;
    }



    public Long getId() {
        return Id;
    }



    public void setId(Long id) {
        this.Id = id;
    }



  
}
