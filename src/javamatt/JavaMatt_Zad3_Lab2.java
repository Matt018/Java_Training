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
public class JavaMatt_Zad3_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        BigInteger fibboArray[] = new BigInteger[100]; 
        fibboArray[0] = BigInteger.ONE;
        fibboArray[1] = BigInteger.ONE;
       for(int i = 2; i<fibboArray.length;i++){
            fibboArray[i] = fibboArray[i-2].add(fibboArray[i-1]);
        }
        for(BigInteger j:fibboArray){
            System.out.println(j);
        }
        System.out.println();
    }
}
    

