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


public class Trening2{

    /**
     * @param args the command line arguments
     */
    static String indexOf(Object[][] tab, Object ob){
        int wiersz = 0;
        int kolumna = 0;
        for(int i =0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++)
                if(tab[i][j].equals(ob)){
                    wiersz=i+1;
                    kolumna=j+1;
                    break;
                }
        }
        return "wiersz: "+wiersz+"\nkolumna: "+kolumna;
    }
    public static void main(String[] args)
    {
        
        for(int i = 0;i<11;i++){
            for(int j =0;j<11;j++){
                if(i==j | j==(10-i)){
                    System.out.print(' ');                   
                }
                else if(i<10/2&j>i&j<10-i){
                    System.out.print('@');
                }
                else if(i>10/2&j<i&j>10-i){
                    System.out.print('@');
                }
                else System.out.print('#');
        }
            System.out.println();
        }
        Random los = new Random();
        double [][] tab = new double[los.nextInt(11)][los.nextInt(11)];
        System.out.println(tab.length);
        /*for(int n=0;n<tab.length;n++){
            tab[n]=new double[los.nextInt(11)];
        }*/
        for(int i = 0; i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j]=los.nextGaussian();
            }
        }
        for(double[]t :tab){
            for(double d:t){
                System.out.printf("%7.3f",d);
            }
            System.out.println();
        }
        System.out.println(tab.length);
        System.out.println(tab[0].length);
        Object[][] obtab = {{"trala",10,1.88},
        {45,4.89,"bum bum",'u'},
        {'g',"ttr",4,1.062}};
    
        System.out.println(Trening2.indexOf(obtab, 1.062));
        /*for(double[]t:tab)
            System.out.println(t.length);*/
 
    }    
}

