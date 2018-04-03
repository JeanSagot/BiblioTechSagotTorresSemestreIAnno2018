/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jeanp
 */
public class students {
    //atributos
    private String name, career;
    private int year;
    private long carnet;
    
    //constructores
    public students() {
        this.name = "";
        this.career = "";
        this.year = 0;
        this.carnet = 0;
    }

    public students(String name, String career, int year, long carnet) {
        this.name = name;
        this.career = career;
        this.year = year;
        this.carnet = carnet;
    }
    
    //getter and setters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }
    
    //toString method
    @Override
    public String toString() {
        return "students{" + "name=" + name + ", career=" + career + 
                ", year=" + year + ", carnet=" + carnet + '}';
    }

    /*
     * Cuando vamos a utilizar una clase de RAF necesitamos crear un
    m'etodo que sea capaz de responder el tamanno de las variables
    que tiene la clase
     */
    public int sizeInBytes() {
        //long: necesita dos bytes
        //String: necesita 2 bytes de espacio.
        return this.getName().length() * 2 +
                this.getCareer().length() * 2 +
                8;
    }
}
