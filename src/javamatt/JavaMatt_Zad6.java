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
public class JavaMatt_Zad6{

    /**
     * @param args the command line arguments
     */
    public static String [] split(String str, char[] chartab)
    {
        List <String> stringList = new ArrayList<String>(); //lista do zapisywania stringów
        String separator = new String(chartab);  // z tabeli char tworzymy stringa
        String addString = "";                   //string pomocniczy - dodawanie do listy
        for(int i=0;i<str.length();i++)
        {
            if(separator.indexOf(str.charAt(i))<0)  // tworzenie podstringa-brak separatora
                addString+=str.charAt(i);
            else
            {
                stringList.add(addString);        //gdy napotka separator dodaje do listy
                addString="";                     // wyczyszczenie stringa pomocniczego
            }
            
        }
        if (addString.length()>0){               //dodanie ostatniego niepustego podstringa
            stringList.add(addString);
        }
        String [] stringArray = new String [stringList.size()];
        stringList.toArray(stringArray);     //utworzenie tablicy string z listy
        return stringArray;
    }
    public static void main(String[] args) 
    {
        String str = "gjfhgj,fgkhgkf;kfjgkfgj.fgjkfg fgigjf.jfgkjfk?fkjgkj;"
                + "jgkfj fjgkjkf";
        char [] charArray = {';',',','.',' ','?'};
        String [] tab = split(str,charArray);
             for(String s:tab)
            System.out.println(s);
    }
}
    

