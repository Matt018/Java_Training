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
public class JavaMatt_Zad4_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Random los = new Random();
        int n = 11;
        double avar;
        double med;
        double total=0;
        double [] dArray = new double[n]; 
        int p = 0;
        int countp = 0;
       for(int i = 0; i<dArray.length;i++){
            dArray[i] = (los.nextInt(101)-50)/10.0;
        }
       Arrays.sort(dArray);
        for(double j:dArray){
            System.out.println(j);
            total+=j;
        }
        avar = total/n;
        if (n%2!=0){
            med = dArray[n/2];
        }
        else{
            med = (dArray[n/2-1]+dArray[n/2])/2;
        }
        total=0;
        for(double j:dArray){
            if(j!=0&j%2==0){
                total+=j;
                countp++;
            }
            
        }
        double avarp = total/countp;
          
        
        System.out.println("Srednia: "+avar);
        System.out.println("Mediana: "+med);
        System.out.println("Wartość minimalna: "+dArray[0]);
        System.out.println("Wartość maksymalna: "+dArray[n-1]);
        System.out.println("Średnia dla parzystych: :"+avarp);
        
    }
}
    

