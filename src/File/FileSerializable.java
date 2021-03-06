package File;

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
    //Constructor
    public FileSerializable(String path) {
        super();
        //ruta del archivo
        this.path = path;
        myFile = new File(path);
    }
    /*Metodo de guardado por Serializable
    * @param object: Object
    * @throws IOException
    * @throws ClassNotFoundException
    */
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
    }//Fin del Metodo
    /*Metodo de lectura de Datos en memoria
    * @return ArrayList de tipo Object; lista guardada de Objetos
    * @throws IOException
    * @throws ClassNotFoundException
    */
    public ArrayList<Object> readSerializeBooks() throws IOException, ClassNotFoundException{ 
        input = new   ObjectInputStream(new FileInputStream(myFile));
        ArrayList<Object> arraysListBooks = (ArrayList<Object>)input.readObject();
        input.close();
        return arraysListBooks;
           }//fin del metodo 
    
    public void fileDelete (String path){
        myFile.delete();
    }
}//Fin de la clase