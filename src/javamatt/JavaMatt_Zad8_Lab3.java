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
class Domy{
    String nazwDom;
    int iKondygn;
    double cena;
    Domy(String naz, int iKon, double cena){
        nazwDom = naz;
        iKondygn = iKon;
        this.cena=cena;
    }
}
public class JavaMatt_Zad8_Lab3{

    /**
     * @param args the command line arguments
     */
    void tworzPlik(){
        Domy [] domy = new Domy[] {new Domy("Jednorodz",2,1256485.45),
                                   new Domy("Wielorodz",3,1850520.89),
                                   new Domy("Parterowy",1,856000.00),
                                   new Domy("Kamienica",5,5580000.00),
                                   new Domy("Parterowy",1,785000.00),
                                   new Domy("Biurowiec",8,9980000.01),
                                   new Domy("Parterowy",1,698000.00)};
        RandomAccessFile plik = null;
        try{
        plik = new RandomAccessFile("domy.dat","rw");
        for (int i =0;i<domy.length;i++){
            plik.writeChars((domy[i].nazwDom));
            plik.writeInt((domy[i].iKondygn));
            plik.writeDouble((domy[i].cena));
        }
        plik.close();
        }
        catch(Exception ex){
        ex.printStackTrace();
        }
    }
    String zmienPlik(String file){
        int obj = 0;
        long licznik = 18;
        int maxkondyg = 0;
        long poz=0;
        String str = "";
        RandomAccessFile plik = null;
        try{
        plik = new RandomAccessFile(file,"rw");
        do{
            plik.seek(licznik);
            obj=plik.readInt();
            if(obj==1){
                double nowacena = plik.readDouble();
                nowacena-= nowacena*0.1;
                plik.seek(plik.getFilePointer()-8);
                plik.writeDouble(nowacena);
            }
            else if(obj>maxkondyg){
                maxkondyg=obj;
                poz=plik.getFilePointer()-22;
            }
            licznik+=30;
        }while(obj!=-1);
        }
        catch(EOFException e){
            System.out.println("Koniec pliku\n");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            plik.seek(poz);
            int licz=0;
            do{
                str+=plik.readChar();
                licz++;
            }while(licz<10);
            plik.close();
        }
        catch(EOFException e){
            System.out.println("Koniec pliku\n");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return str;
     }
    void czytajPlik(){
        RandomAccessFile plik = null;
        String nazwa="";
        int kondyg;
        double cena;
        try{
        plik = new RandomAccessFile("domy.dat","rw");
        do{
            for(int i=0;i<9;i++)
                nazwa+=plik.readChar();
            kondyg=plik.readInt();
            cena = plik.readDouble();
            System.out.print(nazwa+", "+kondyg+", "+cena+"\n");
            nazwa="";
            plik.seek(plik.getFilePointer()-1);
        }while(plik.read()!=-1);
        
        plik.close();
        }
        catch(EOFException e){
            System.out.println("Koniec pliku\n");
        }
        catch(Exception ex){
        ex.printStackTrace();
        }
    }   
    public static void main(String[] args)
    {
        JavaMatt_Zad8_Lab3 exe = new JavaMatt_Zad8_Lab3();
        exe.tworzPlik();
        System.out.println("plik przed zmianą");
        exe.czytajPlik();
        System.out.println("zmiana pliku");
        System.out.println(exe.zmienPlik("domy.dat"));
        System.out.println();
        System.out.println("plik po zmianie");
        exe.czytajPlik();
    }    
}
