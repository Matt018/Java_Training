/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

/**
 *
 * @author Matt
 */
public class JavaMatt_Zad2b {

    /**
     * @param args the command line arguments
     */
    public static boolean endsWith(String s1, String s2)
    {
       boolean result = true;
        int m = s1.length()-s2.length(); //od której pozycji sprawdzamy w str1
        for(int n=0; n<s2.length(); n++) //sprawdzenie czy łańcuchy są takie same  
        {
            if(s1.charAt(m+n)!=s2.charAt(n))
            {
                result = false;       //łańcuchy różne
                break;
            }            
        }
        return result;
    }
    public static void main(String[] args) 
    {
        String str1 = "tralalabumbum";
        String str2 = "umbum";
        System.out.println(str1.endsWith(str2)); // wbudowana
        System.out.println(endsWith(str1,str2)); // własna
    
        
    }
}
    

