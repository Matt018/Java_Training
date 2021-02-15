/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.io.*;
import java.util.*;

/**
 *
 * @author Matt
 */

public class JavaMatt_Zad7_Lab3{

    /**
     * @param args the command line arguments
     */
    static String zmienLiczby(String in, String out)
    {
        String result = "Operacja zakończona sukcesem";
        
        BufferedReader br_czytaj = null;
        BufferedWriter br_zapisz = null;
        int in_out;        
        try{
            br_czytaj = new BufferedReader(new FileReader(in));
            br_zapisz = new BufferedWriter(new FileWriter(out));
            while((in_out = br_czytaj.read())!=-1){
                if((char)in_out=='.')
                    in_out=(int) ',';
                else if ((char)in_out==':')
                    in_out=(int)' ';
                br_zapisz.write(in_out);
            }
            
            br_czytaj.close();
            br_zapisz.close();
        }
        catch(Exception e){
            e.printStackTrace();
            result = "BŁĄD!!";
        }
        
        return result;        
    }
    
    public static void main(String[] args)
    {
        System.out.println(JavaMatt_Zad7_Lab3.zmienLiczby("In.txt", "Out.txt"));
    
    } 
}