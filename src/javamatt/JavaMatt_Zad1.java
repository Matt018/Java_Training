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
public class JavaMatt_Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        char ch ='m';                        // litera podana przez użytkownika
        int count = 0;                      //licznik wystąpień podanej litery
        String [] texts = new String[]{
            "Ala ma papugę",                //zdania podane przez użytkownika
            "Marek ma psa",
            "Wojtek ma zebrę",
            "Antek ma rybki",
            "Monika ma chomika"};        
        String max = texts[0];           //zmienna-najdłuższe zdanie                                       
        for(int i=1;i<texts.length;i++)  //wyznaczenie najdłuższego zdania 
        {
            if(max.length()<texts[i].length())
            {
                max = texts[i];
            }
        }
        for(int j =0;j<max.length();j++)   //ilość wystąpień litery ch
        {
            if(Character.toLowerCase(max.charAt(j))==ch)
            {
                count++;
            }
        }
            System.out.printf("Najdłuższy tekst to:\n%s\nilość zanaków %d",max,max.length());
            System.out.println();
            System.out.printf("Ilość wystąpień litery %c : %d",ch,count);
            System.out.println();
    }
}
    

