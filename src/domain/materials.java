package domain;

import java.io.Serializable;

public class materials implements Serializable{
    private String name, type, condition, brand, accesories;
    private boolean borrowedMaterials;
    
    //constructors
    public materials() {
        this.name = "";
        this.type = "";
        this.condition = "";
        this.brand = "";
        this.accesories = "";  
        this.borrowedMaterials =false;
    }

    public materials(String name, String type, String condition, String brand, String accesories,boolean borrowedMaterials) {
        this.name = name;
        this.type = type;
        this.condition = condition;
        this.brand = brand;
        this.accesories = accesories;
        this.borrowedMaterials = borrowedMaterials;
    }
    
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAccesories() {
        return accesories;
    }

    public void setAccesories(String accesories) {
        this.accesories = accesories;
    }

    public boolean isBorrowedMaterials() {
        return borrowedMaterials;
    }

    public void setBorrowedMaterials(boolean borrowedMaterials) {
        this.borrowedMaterials = borrowedMaterials;
    }
    
    //toString

    @Override
    public String toString() {
        return "materials{" + "name=" + name + ", type=" + type + ", condition=" + condition + 
                ", brand=" + brand + ", accesories=" + accesories + ", borrowedMaterials=" + borrowedMaterials + '}';
    }
   
    
}
