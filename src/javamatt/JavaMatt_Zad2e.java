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
public class JavaMatt_Zad2e {

    /**
     * @param args the command line arguments
     */
    public static String substring (String str, int index)
    {
        char [] chartab = new char[str.length()-index]; 
        for(int n=0;n<chartab.length;n++)
        {
            chartab[n]=str.charAt(index+n); // do tablicy kolejne char od wskazanego indeksu
        }
       return new String(chartab); //nowy string z tablicy char
    }
    public static void main(String[] args) 
    {
        int ind = 20;
        String str = "To jest przykładowe działanie metody substring";
        System.out.println(str.substring(ind));
        System.out.println(substring(str,ind));
    
        
    }
}
