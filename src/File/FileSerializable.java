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
    ArrayList<Object>arrayListObject = new ArrayList<Object>();
    File myFile ;
    
    public FileSerializable(String path) {
        super();
        //ruta del archivo
        this.path = path;
        myFile = new File(path);
    }
    
    public void serialize(Object object) throws IOException, ClassNotFoundException{
        
        if(myFile.exists()){
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
        ArrayList<Object> arrayListObject = (ArrayList<Object>) objectInput.readObject();
        this.arrayListObject = arrayListObject;
        objectInput.close();  
        }
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        arrayListObject.add(object);
        output.writeUnshared(arrayListObject);
        output.close();   
    }
    
    public ArrayList<Object> readSerializeBooks() throws IOException, ClassNotFoundException{
         
        input = new   ObjectInputStream(new FileInputStream(myFile));
        ArrayList<Object> arraysListBooks = (ArrayList<Object>)input.readObject();
        input.close();
        return arraysListBooks;
           }
       
       
      
}