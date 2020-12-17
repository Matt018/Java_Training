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
public class JavaMatt_Zad7_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Random los = new Random();
        //podpunkt A
        int min1=-20;                     //zakresy podawane przez użytkownika
        int max1=51;                      //pomijam funkcję pobierania danych od użytkownika z konsoli
        int min2=10;
        int max2=81;
        int [][] arrayA = new int [4][4];
        int [][] arrayB = new int [4][4];
        int [][] arrayC = new int [4][4];
        System.out.println("Podpunkt a)");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arrayA[i][j]= los.nextInt(max1-min1)+min1;  //sprowadzenie losowanych liczb do zakresu użytkownika 
                arrayB[i][j]= los.nextInt(max2-min2)+min2;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arrayC[i][j]= arrayA[i][j]+arrayB[i][j]; //suma macierzowa - sumowanie liczb na odpowiednich pozycjach
            }
        }
        for(int[] tabi : arrayA){
            for(int j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] tabi : arrayB){
            for(int j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] tabi : arrayC){
            for(int j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        //podpunkt B
        int n = 8;                        //wielkość tabeli podaje użytkownik
        char [][] arrayChar = new char[n][n];
        String check = "a,e,i,o,u,y";     // łańcuch do sprawdzania samogłosek
        String vowels = "";              // tu będą wklejane samogłoski
        String conson ="";               // tu pozostałe
        System.out.println();
        System.out.println("Podpunkt b)");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arrayChar[i][j]= (char) (los.nextInt(26)+97); //wylosowanie tylko małych liter
            }
        }
        System.out.println();
        for(char [] tabi : arrayChar){
            for(char j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check.indexOf(arrayChar[i][j])>=0)
                    vowels+=arrayChar[i][j];
                else
                    conson += arrayChar[i][j];
            }
        }
        System.out.println("Samogłoski: "+vowels);
        System.out.println("Spółgłoski: "+conson);
        System.out.println();
        //podpunkt C
        System.out.println("Podpunkt c)");
        System.out.println();
        String text = "To jest string do zadania siódmego podpunkt C)";
        int x = (text.length()/10)+1;
        char [][] tabChar = new char[x][10];
        
        for(int i=0;i<x;i++){
            for(int j=0;j<10;j++){
                if (i*10+j<text.length())
                    tabChar[i][j]=text.charAt(i*10+j);
                else
                    tabChar[i][j]='0';
            }
        }
        for(char[] tabi : tabChar){
            for(char j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println();
        //podpunkt D
        System.out.println("Podpunkt d)");
        double a = -2.55;        //zakładamy że użytkownik podaje jeden zakres dla dwóch tablic
        double b = 10.05;         // pomijamy funkcję odczytania danych od użytkownika z konsoli
        double[][] array1= new double[4][4];
        double[][] array2= new double[4][4];
        double[][] array3= new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                array1[i][j]=los.nextDouble()*(b-a)+a; // next double losuje liczby z przedziału <0,1)
                array2[i][j]=los.nextDouble()*(b-a)+a;            
            }
        }
        try{                                          //gdyby wystąpiło dzielenie przez 0
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               array3[i][j]=array1[i][j]/array2[i][j];
            }
        }
        }
        catch (ArithmeticException e){
            System.out.print("Dzielenie przez 0!!");
        }
            for(double [] tabi : array1){
            for(double j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println();
        for(double [] tabi : array2){
            for(double j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println();
        for(double [] tabi : array3){
            for(double j :tabi){
            System.out.print(j+", ");
            }
            System.out.println();
        }
        
       System.out.println();
        
        
    }
}
    

