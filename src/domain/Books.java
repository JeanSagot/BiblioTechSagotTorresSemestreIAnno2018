
package domain;

import java.io.Serializable;

public class Books implements Serializable{
    
    private String name, subject, condition, type;
    private int year, ISBN;
    private boolean borrowedBooks;

    //constructors
    public Books() {
        this.name = "";
        this.subject = "";
        this.condition = "";
        this.year=0;
        this.ISBN=0;
        this.type = "";
        this.borrowedBooks = false;
    }

    public Books(String name, String subject, String condition, String type, int year, int ISBN,boolean borrowedBooks) {
        this.name = name;
        this.subject = subject;
        this.condition = condition;
        this.type = type;
        this.year = year;
        this.ISBN = ISBN;
        this.borrowedBooks = borrowedBooks;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public boolean isBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(boolean borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //toString

    @Override
    public String toString() {
        return "Books{" + "name=" + name + ", subject=" + subject + ", condition=" + condition + 
                ", type=" + type + ", year=" + year + ", ISBN=" + ISBN + ", borrowedBooks=" + borrowedBooks + '}';
    }
   
    
    
}//end of class
