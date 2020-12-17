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
public class JavaMatt_Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String stringIn = "babcaabbbcccaabcaccbbcbabb";
        String stringOut = ""; // pusty string
        stringOut+=stringIn.charAt(0); 
        for (int i = 1; i<stringIn.length();i++) // rozpoczęcie od drugiej litery
            if(stringIn.charAt(i)!=stringIn.charAt(i-1)){   //sprawdzenie czy poprzednia taka sama
                stringOut+=stringIn.charAt(i);    //gdy różne dopisujem do nowego stringa
            }
        System.out.println(stringOut);
    
        
    }
}
    

