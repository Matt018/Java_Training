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
public class JavaMatt_Zad2d  {

    /**
     * @param args the command line arguments
     */
    public static String replace (String str, char oldchr, char newchr)
    {
        char [] chartab = str.toCharArray(); //zamiana str na tablice char
        for(int n=0;n<chartab.length;n++)
            if(chartab[n]==oldchr) // czy występuje znak oldchr
                chartab[n]=newchr; // stary znak na nowy
       return new String(chartab); // utworzenie nowego string ze zmienionej tablicy char
    }
    public static void main(String[] args) 
    {
        char oldchr = 'x';
        char newchr = '!';
        String str = "isjixoijoxijxoijlkjxwxe";
        System.out.println(str.replace(oldchr,newchr));  //wbudowana
        System.out.println(replace(str,oldchr,newchr));  //własna
    
        
    }
}
