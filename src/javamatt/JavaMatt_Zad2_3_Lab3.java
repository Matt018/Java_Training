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
class Lancuch{
    String lancuch;
    String koncowka;
    char pierwszaLitera;
    
    String getLancuch(){
        return lancuch;
    }
    
    String getKoncowka(){
        return koncowka;
    }
    char getPierwszLitera(){
        return pierwszaLitera;
    }
    
    Lancuch(){
        lancuch="abcdefghij";
        koncowka="hij";
        pierwszaLitera='a';
    }
    
    Lancuch(String lancuch){
        this.lancuch = lancuch;
        if(lancuch.length()<5){            
            byte lastL = (byte) lancuch.charAt(lancuch.length()-1);
            for(byte i=1;i<=5-lancuch.length();i++){
                if(lastL<122){
                    if(lastL+i<123)
                        this.lancuch+=(char)(lastL+i);
                    else
                        for(int j=1;j<=5-lancuch.length()-i;j++)
                        this.lancuch+=(char)(96+j);
                }
                else{
                    this.lancuch+=(char)(96+i);
                }
           }
        }
        koncowka = this.lancuch.substring(this.lancuch.length()-3);
        pierwszaLitera = this.lancuch.charAt(0);
    }
    void merge(Lancuch obiekt){
        String result="";
        if(lancuch.length()>=obiekt.lancuch.length()){
            for(int a =0;a<lancuch.length();a++){
                if(a<obiekt.lancuch.length()){
                    result+=lancuch.charAt(a);
                    result+=obiekt.lancuch.charAt(a);
                }
                else result+=lancuch.charAt(a);
            }
        }
        else if(lancuch.length()<obiekt.lancuch.length()){
            for(int a =0;a<obiekt.lancuch.length();a++){
                if(a<lancuch.length()){
                    result+=lancuch.charAt(a);
                    result+=obiekt.lancuch.charAt(a);
                }
                else result+=obiekt.lancuch.charAt(a);
            }
        }
        lancuch=result;
        koncowka = lancuch.substring(lancuch.length()-3);
        pierwszaLitera = lancuch.charAt(0);
    }
    int ileASCII(){
        int amount=0;
        for(int i=0;i<lancuch.length();i++){
            amount+=(byte)lancuch.charAt(i);
        }
        return amount;
    }
    }
    
public class JavaMatt_Zad2_3_Lab3{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Lancuch a = new Lancuch("oprqst");
        Lancuch b = new Lancuch("y");
        System.out.println("Łańcuch a:\n"+a.getLancuch()+"\n"+a.getKoncowka()+
                           "\n"+a.getPierwszLitera()+"\nŁańcuch b:\n"+b.getLancuch()+
                           "\n"+b.getKoncowka()+"\n"+b.getPierwszLitera());
        a.merge(b);
        System.out.println("Łańcuch a:\n"+a.getLancuch()+"\n"+a.getKoncowka()+
                           "\n"+a.getPierwszLitera()+"\nŁańcuch b:\n"+b.getLancuch()+
                           "\n"+b.getKoncowka()+"\n"+b.getPierwszLitera());
        Lancuch c = new Lancuch("xyz");
        System.out.println(c.ileASCII());
       
    } 
}