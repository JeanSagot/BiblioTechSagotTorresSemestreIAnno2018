package File;

import domain.Books;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSerializable {
    
    private String path;
    FileOutputStream fos;
    ObjectOutputStream output;
    FileInputStream fis;
    ObjectInputStream input;
    ArrayList<Books>arrayListBooks = new ArrayList<Books>();
    File myFile;
    public FileSerializable(String path) {
        super();
        //ruta del archivo
        this.path = path;
        myFile = new File(path);
    }
    
    public void serialize(Books book) throws IOException, ClassNotFoundException{
        
        if(myFile.exists()){
      //  ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
        ArrayList<Books> arrayListBooks = (ArrayList<Books>) objectInput.readObject();
        this.arrayListBooks = arrayListBooks;
        objectInput.close();  
        }
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        arrayListBooks.add(book);
        output.writeUnshared(arrayListBooks);
        output.close();   
    }
    
      public ArrayList<Books> readSerialize() throws IOException, ClassNotFoundException{
         
        input = new   ObjectInputStream(new FileInputStream(myFile));
        ArrayList<Books> arraysListBooks = (ArrayList<Books>)input.readObject();
        input.close();
        return arraysListBooks;
           }
       
      
}