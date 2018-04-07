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
    
    //obtener un estudiante
    public students getStudents(int position) throws IOException{
        //validar la posici'on
        if(position >= 0 && position <= this.regsQuantity){
            //colocamos el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            
            //llevamos a cabo la lectura
            students studTemp = new students();
            studTemp.setCareer(randomAccessFile.readUTF());
            studTemp.setYear(randomAccessFile.readInt());
            studTemp.setCarnet(randomAccessFile.readUTF());
            
            if(studTemp.getCarnet().equalsIgnoreCase("deleted")){
                return null;
            }else{
                return studTemp;
            }
        }else{
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }//end method
    
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
                randomAccessFile.writeUTF(student.getCareer());
                randomAccessFile.writeInt(student.getYear());
                randomAccessFile.writeUTF(student.getCarnet());
                
                return true;
            }//fin else2
        }//fin else
    }//end method
    
     //insertar al final del archivo
    public boolean addEndRecord(students studs) throws IOException{
        boolean success = putValue(this.regsQuantity, studs);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
    
    //insertar un nuevo registro en una posición específica
    public boolean putValue(int position, students studs) throws IOException{
        //primero: verificar que sea válida la inserción
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1001 - Record position is out of bounds");
            return false;
        }else{
            if(studs.sizeInBytes() > this.regSize){
                System.err.println("1002 - Record size is out of bounds");
                return false;
            }else{
                //BINGO
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(studs.getCareer());
                randomAccessFile.writeInt(studs.getYear());
                randomAccessFile.writeUTF(studs.getCarnet());
                return true;
            }
        }
    }//end method
    
    //encontrar en el archivo si el carnet ya existe
     public boolean findCarnet(String carnet) throws IOException{
        students studs = null;
        
        for(int i=0; i<this.regsQuantity; i++){
            studs = this.getStudents(i);    
            if(studs.getCarnet().equalsIgnoreCase(carnet))
                return true;
        }//fin for
        return false;
        }//fin findCarnet
     
     
}//fin de la clase
