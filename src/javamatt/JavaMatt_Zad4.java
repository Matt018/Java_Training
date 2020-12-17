/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

/**
 *
 * @author Matt
 */
public class JavaMatt_Zad4 {

    /**
     * @param args the command line arguments
     */
    public static String toLowerCase(String stringIn){
        byte [] byteArray = stringIn.getBytes();        // zamiana strinag na tablice byte
        for (int i = 0;i<byteArray.length; i++)
            if(byteArray[i]>=65 & byteArray[i]<=90){  
                byteArray[i]+=32;                       // przesunięcie z dużych na małe
            }
        return new String(byteArray);                   // nowy string z tablicy byte
        
    }
    public static String toUpperCase(String stringIn){
        byte [] byteArray = stringIn.getBytes();        // zamiana strinag na tablice byte
        for (int i = 0;i<byteArray.length; i++)
            if(byteArray[i]>=97 & byteArray[i]<=122){   
                byteArray[i]-=32;                       // przesunięcie z małych na duże
            }
        return new String(byteArray);                   // nowy string z tablicy byte
    }
    public static void main(String[] args) 
    {
        String stringIn = "To jest metoda toLowerCase/toUpperCase"
                + " w Javie: kLjhGjLkGGGllll";
        String stringOutL = toLowerCase(stringIn);
        String stringOutU = toUpperCase(stringIn);
        System.out.println(stringOutL);
        System.out.println(stringOutU);
    
        
    }
}
    

