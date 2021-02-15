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
public class JavaMatt_Zad2a {

    /**
     * @param args the command line arguments
     */
    public static int compareTo(String s1, String s2)
    {
       int result;
       int i = 0;    //zmienna sterująca pętlami
       if(s1.length()<=s2.length()) // gdy pierwsze łańcuch jest krótszy
       {
           do
           {
               result=(byte) s1.charAt(i)- (byte) s2.charAt(i);
               i++;
           }while(i<s1.length()&result==0);
        }
       else            // gdy drugi łańcuch jest krótszy
       {
           do
           {
               result=(byte) s1.charAt(i)- (byte) s2.charAt(i);
               i++;
           }while(i<s2.length()&result==0);
       }
       if(result==0) // łańcuchy różnią się tylko długością(początkek ten sam)
       {
           result = s1.length()-s2.length();
       }
       return result;
    }
    public static void main(String[] args) 
    {
        String str1 = "abaalkj";
        String str2 = "abaalkjk";
        System.out.println(str1.compareTo(str2)); //metoda wbudowana
        System.out.println(compareTo(str1,str2)); //własna metoda
        System.out.println(str1.equals(str2));
    }
}
    

