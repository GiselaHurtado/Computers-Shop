package dev.gisela;

public class Shop {
    private String name;
    private String owner;
    private int taxID;


    public Shop(String name, String owner, int taxID) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOwner() {
        return owner;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }


    public int getTaxID() {
        return taxID;
    }


    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

}
