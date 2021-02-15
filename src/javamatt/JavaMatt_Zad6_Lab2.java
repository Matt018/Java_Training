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
public class JavaMatt_Zad6_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        int [][] arrayA = {
            {-1,4,5,9},
            {7,20,-50},
            {19,-77,14,5},
            {3,0,88,100},
            {-33,79,1},
            {1,-9},
            {8,99,3},
            {55,120,-61,6,-44,400},
            {67,597,52,-600,-28,49,-50}
        };
        
        int [] arrayB = new int[arrayA.length];
        for(int i =0;i<arrayA.length;i++){
            if (i%2==0){
                arrayB[i]=arrayA[i][0];
                for(int j=1;j<arrayA[i].length;j++){
                    if(arrayB[i]<arrayA[i][j]){
                        arrayB[i]=arrayA[i][j];
                    }
                }
            }
            else{
               arrayB[i]=arrayA[i][0];
                 for(int j=1;j<arrayA[i].length;j++){
                    if(arrayB[i]>arrayA[i][j]){
                        arrayB[i]=arrayA[i][j];
                    }
                }
            }
        }
        for(int[] tab : arrayA){
            System.out.print("|");
            for(int element:tab){
                System.out.printf("%4d|",element);
            }
            System.out.println();
        }
        System.out.println();
        for(int element:arrayB){
            System.out.print(element+" | ");
        }
        System.out.println();
        
    }
}
    

