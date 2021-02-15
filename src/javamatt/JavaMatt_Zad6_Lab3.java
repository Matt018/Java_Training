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

public class JavaMatt_Zad6_Lab3{

    /**
     * @param args the command line arguments
     */
    long tworzPlik(int[]arr, String path)
    {
        long result=0;
        RandomAccessFile raf = null;
        try{
            raf = new RandomAccessFile(path,"rw");
            for(int i:arr)
                raf.writeInt(i);
            result=raf.length();
            raf.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
            result=-1;
        }
        return result;
    }
    void zmienPlik(String path){
        RandomAccessFile raf = null;
        int liczba;
        try{
            raf = new RandomAccessFile(path,"rw");
            for(int j=0;j<raf.length();j+=4){
                liczba=raf.readInt();
                liczba++;
                raf.seek(j);
                raf.writeInt(liczba);
            }
            raf.close();
        }
        catch(EOFException ex){
            System.out.println("Koniec pliku");
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    void pokazPlik(String path){
        RandomAccessFile raf = null;
        int liczba;
        try{
            raf = new RandomAccessFile(path,"rw");
            while((liczba=raf.readInt())!=-1){
                System.out.print(liczba+", ");
            }
        }
        catch(EOFException ex){
            System.out.println("Koniec pliku");
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    

    public static void main(String[] args) throws Exception
    {
        Random los = new Random();
        int [] arrayint = new int[30];
        for (int i =0;i<arrayint.length;i++){
            arrayint[i]=los.nextInt(101)+50;
        }
        String plik = "zad6.dat";
        JavaMatt_Zad6_Lab3 exe = new JavaMatt_Zad6_Lab3();
        System.out.println(exe.tworzPlik(arrayint,plik));
        exe.pokazPlik(plik);
        exe.zmienPlik(plik);
        exe.pokazPlik(plik);
     
    } 
}