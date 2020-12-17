/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matt
 */
public class JavaMatt_flagaCzech{

    /**
     * @param args the command line arguments
     */
    
    public static int length(String string){
        int count = 0;
        char [] tab = string.toCharArray();
        for(char ch:tab){
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        int n = 20;                       //wielkość rysunku
        for(int i=0; i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0|j==0|i==n|j==n){
                System.out.print("@  ");
                }
                else if(j==i&i<n/2){
                    System.out.print("@  ");
                }
                else if(j==n-i&i>n/2){
                    System.out.print("@  ");
                }
                else if(i==n/2&j>=n/2){
                    System.out.print("@  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
            
        System.out.println();
        
        String str = "lssjlfnvln,sfjl;sk";
        String [] tabTest = str.split("s");
        
        for(String s:tabTest)
            System.out.println(s);
        
        System.out.println(length(str));
    }
}
    

