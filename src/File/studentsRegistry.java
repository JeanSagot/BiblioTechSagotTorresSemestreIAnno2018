/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import domain.students;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;

/**
 *
 * @author jeanp
 */
public class studentsRegistry {
    //attributes
    //atributos
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros en el archivo
    private int regSize;//tamanno del registro
    private String myFilePath;//ruta
    
     //constructor
    public studentsRegistry(File file) throws IOException{
        //almaceno la ruta
        myFilePath = file.getPath();
        
        //indico el tamanno maximo
        this.regSize = 140;
        
        //una validacion sencilla
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() + " is an invalid file");
        }else{
            //crear la nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");
            
            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int)Math.ceil((double)randomAccessFile.length() / 
                                (double)regSize);
        }//fin else
    }//end of constructor
    
    //MUY IMPORTANTE cerrar nuestros archivos
    public void close() throws IOException{
        randomAccessFile.close();    
    }
    
     //indicar la cantidad de registros de nuestro archivo
    public int fileSize(){
        return this.regsQuantity;
    }
    
    //insertar un nuevo registro en una posici'on espec'ifica
    public boolean insertRegistry(int position, students student) throws IOException{
        //primero: verificar que sea v'alida la inserci'on
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1001 - Record position is out of bounds");
            return false;
        }else{
            if(student.sizeInBytes() > this.regSize){
                System.err.println("1002 - Record size is out of bounds");
                return false;
            }else{
                //BINGO
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(student.getName());
                randomAccessFile.writeUTF(student.getCareer());
                randomAccessFile.writeLong(student.getCarnet());
                randomAccessFile.writeInt(student.getYear());
                return true;
            }//fin else2
        }//fin else
    }//end method
    
    //metodo para verificar si el carnet tiene menos de 5 digitos
    public boolean verifyCarnet(long carnet){
        String valueCarnet;
        boolean verifyStatus;
        
        valueCarnet = carnet+"";
        if(valueCarnet.length() <= 5)
           return verifyStatus = true;
        return false;
    }//fin metodo
    
    //extrae el numero del año(ultimo)
    public int extractNumber(long carnet){
        int lastDigit;
        
        lastDigit = (int)(carnet%10);
        
        return lastDigit;
    }//fin metodo
    
    //extrae el primer caracter de la carrera
    public char extractCareer(String career){
        char firstChar;
        
       return firstChar = career.charAt(0);
    }//fin metodo
    
    public int getConsecutive(){
        return regsQuantity;
    }
    
    static public String consecFormat(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      return output;
   }
}//fin de la clase
