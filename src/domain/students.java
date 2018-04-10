
package domain;

public class students {
    //atributos
    private String career, carnet, dateReturnLoan;
    private int year;
    
    //constructores
    public students() {
        this.career = "";
        this.year = 0;
        this.carnet = "";
        this.dateReturnLoan = "";
    }

    public students(String career, int year, String carnet,String dateReturnLoan) {
        this.career = career;
        this.year = year;
        this.carnet = carnet;
        this.dateReturnLoan = dateReturnLoan;
    }
    
    //getter and setters
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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDateReturnLoan() {
        return dateReturnLoan;
    }

    public void setDateReturnLoan(String dateReturnLoan) {
        this.dateReturnLoan = dateReturnLoan;
    }
    
    
    //toString method
    
    @Override
    public String toString() {
        return "students{" + "career=" + career + ", carnet=" + carnet +
                ", dateReturnLoan=" + dateReturnLoan + ", year=" + year + '}';
    }

    /*
     * Cuando vamos a utilizar una clase de RAF necesitamos crear un
    m'etodo que sea capaz de responder el tamanno de las variables
    que tiene la clase
     */
    public int sizeInBytes() {
        //int: necesita 4 bytes
        //String: necesita 2 bytes de espacio.
        return this.getCareer().length() * 2 + 8;
    }
}
