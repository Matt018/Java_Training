/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.util.*;

/**
 *
 * @author Matt
 */
public class JavaMatt_Zad1_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static String stringGenerator(int _length){
        Random los = new Random();
        byte tabByte[] = new byte[_length];
        for(int i=0;i<tabByte.length;i++){
            tabByte[i]=(byte) (los.nextInt(94)+32);
        }
        
        return new String(tabByte);
    }
        
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int _length = 0;
        System.out.println("Podaj dugość łańcucha");
        _length = scan.nextInt();
        
        System.out.println(stringGenerator(_length));
    }
}
    

