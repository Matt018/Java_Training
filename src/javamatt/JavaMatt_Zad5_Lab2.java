/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Matt
 */
public class JavaMatt_Zad5_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Random los = new Random();
        int ch;
        int summax = 0;
        System.out.println("Podpunkt a)");
        
        int [][] tabMult = new int [10][10];
        for(int i = 0; i<10; i++){
            for (int j = 0;j<10; j++){
                tabMult[i][j] = (i+1)*(j+1);
            }
        }
        for(int[] tabi :tabMult){
            for(int j:tabi){
                System.out.printf("%4d",j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Podpunkt b)");
        
        int [][] tabA = new int[10][6];
        for(int i = 0; i<tabA.length;i++){
            for(int j = 0; j<5;j++){
               tabA[i][j]= los.nextInt(19)+1;
               tabA[i][5]+=tabA[i][j];
            }
        }
        summax=tabA[0][5];
        for (int i =0;i<tabA.length; i++){
            if (tabA[i][5]>summax)
            summax=tabA[i][5];            
        }
        
        System.out.println();
        for(int i = 0; i<tabA.length;i++){
            for(int j=0;j<tabA[i].length;j++){
                if (j==5&tabA[i][j]==summax)
                System.out.printf("  Największa suma:%3d",tabA[i][j]);
                else if (j==5&tabA[i][j]!=summax)
                System.out.printf("  Suma:%3d",tabA[i][j]);
                else
                System.out.printf("%3d",tabA[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Podpunkt c)");
        
        double [][] tabB = new double [10][10];
        for(int i = 0;i<tabB.length;i++){
            for(int j=0;j<tabB[i].length;j++){
                tabB[i][j] = (los.nextInt(11)-5)/10.0;
            }
        }
        System.out.println();
        for(double [] itab:tabB){
            for(double j : itab){
                System.out.printf("%5.1f",j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Które cyfry wyzerować? Ujemne naciśnij[-]/dodatnie[+]");
        String str = scan.nextLine();
        for(int i = 0;i<tabB.length;i++){
            for(int j=0;j<tabB[i].length;j++){
                if(tabB[i][j]<0&str.equals("-"))
                    tabB[i][j]=0;
                else if(tabB[i][j]>0&str.equals("+"))
                    tabB[i][j]=0;
                }
            }   
        for(double [] itab:tabB){
            for(double j : itab){
                System.out.printf("%5.1f",j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Podpunkt d)");
        int [][] tabC = new int [5][5];
        int sum1=0;
        int sum2=0;
        for(int i = 0; i<tabC.length; i++){
            for (int j = 0;j<tabC[i].length; j++){
                tabC[i][j] = los.nextInt(10);
                if(j==i) sum2+=tabC[i][j];
                sum1+=tabC[i][j];
            }
        }
        System.out.println();
        for(int i = 0; i<tabC.length; i++){
            for (int j = 0;j<tabC[i].length; j++){
                System.out.print(tabC[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Średnia: "+sum1/Math.pow(tabC.length,2));
        System.out.println("Suma na głównej przekątnej: "+sum2);
    }
}
    

