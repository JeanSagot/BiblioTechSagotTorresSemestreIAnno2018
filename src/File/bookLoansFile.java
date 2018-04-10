/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import domain.Books;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author jeanp
 */
public class bookLoansFile {
    public void insertLoanBooks(Books insertBooks){
        FileOutputStream fos = null;
        ObjectOutputStream writeStream = null;
        
        try{
            fos = new FileOutputStream("bookLoans.dat", true);
            writeStream = new ObjectOutputStream(fos);
            
        }catch(FileNotFoundException fnfe){
        }catch(IOException ioe){
            
        }finally{
            try{
                if(fos!=null)
                    fos.close();
                if (writeStream!=null)
                    writeStream.close();     
            }catch(IOException ioe){
            }//fin catch io2
        }//fin finally
        
    }//fin metodo
}//fin clase
