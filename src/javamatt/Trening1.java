/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.io.*;
import java.util.*;

/**
 *
 * @author Matt
 */
class A{
    protected String stra;
    A(String s){
        stra = s;
    }
    StringBuilder getString(){
        StringBuilder out = new StringBuilder();
        out.append(stra);
        return out;
    }
    protected void jakasMetoda(){
        System.out.println("poprostu metoda");
    }
            
}
class B extends A{
    String strb;
    B(String s, String s1){
        super(s);
        strb=s1;
    }
    StringBuilder getString(){
        StringBuilder out = new StringBuilder();
        out.append(super.getString());
        out.append(",");
        out.append(strb);
        return out;
    }
}
class C extends B{
    String strc;
    C(String s, String s1, String s2){
        super(s, s1);
        strc=s2;
    }
    StringBuilder getString(){
        StringBuilder out = new StringBuilder();
        out.append(stra);
        out.append(";");
        out.append(strb);
        out.append(";");
        out.append(strc);
        return out;
    }
}
public class Trening1{

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args)
    {
     A [] tablica = new A[]{
         new A("to string A"),
         new B("to string A", "a to string B"),
         new C("to string A", "to string B", "a to string C")
     };
     for(A obj:tablica)
         System.out.println(obj.getString());
     C obj = new C("jeden", "dwa", "trzy");
     System.out.println(obj.stra);
     obj.jakasMetoda();
     A obj2 = new B("tekst1", "tekst2");
     System.out.print(obj2.getString());
    }    
}

