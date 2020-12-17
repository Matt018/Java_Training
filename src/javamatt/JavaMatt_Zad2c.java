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
public class JavaMatt_Zad2c {
/**
     * @param args the command line arguments
     */
    public static int indexOf(String s1, String s2)
    {
       int result= -1;  //wstępnie ciąg nie występuje
       int i=0;      // zmienna sterująca do while
       do              //sprawdzenie kolejnych liter s1 i pierwszej s2
       {
           if (s1.charAt(i)==s2.charAt(0))
           {
               result = i;                       //wstępne przypisanie wyniku
               for(int j =1;j<s2.length();j++)   //weryfikacja czy s2 jest częscią s1
               {
                   if(s1.charAt(i+j)!=s2.charAt(j))
                   {
                       result = -1;
                       break;
                   }
               }
           }
           i++;
       }
       while(i<s1.length()& result==-1); 
       return result;
    }
    public static void main(String[] args) 
    {
        String str1 = "obliczanie zmiennej loswej";
        String str2 = "los";
        System.out.println(str1.indexOf(str2)); //wbudowana
        System.out.println(indexOf(str1,str2)); //własna
    
        
    }
}
