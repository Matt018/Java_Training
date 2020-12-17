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
public class JavaMatt_Split {

    /**
     * @param args the command line arguments
     */
    public static String [] split(String str, char[] chartab)
    {
        List <String> stringList = new ArrayList();
        String separator = new String(chartab);
        String addString = "";
        for(int i=0;i<str.length();i++)
        {
            if(separator.indexOf(str.charAt(i))==-1)
                addString+=str.charAt(i);
            else
            {
                stringList.add(addString);
                addString="";
            }
            
        }
        String [] stringArray = new String [stringList.size()];
        stringArray = stringList.toArray(stringArray);
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
    

