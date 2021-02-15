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
public class JavaMatt_Zad2_Lab2{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Random los = new Random();
        int count = 0;
        
        int tabInt[] = new int [100];
        for (int i = 0; i<tabInt.length;i++)
            tabInt[i] = los.nextInt(101)-50;
        for (int j:tabInt){
            System.out.println(j+" ");
        }
        System.out.println();
        System.out.println("Podaj liczbę od -50 do 50 którą chcesz sprawdzić");
        int number = scan.nextInt();
        
        for (int j:tabInt){
            if (j==number)
                count++;
        }
        System.out.printf("Ilość wystąpień cyfry %d to \n%d",number, count);
        System.out.println();
                
        
    }
}
    

