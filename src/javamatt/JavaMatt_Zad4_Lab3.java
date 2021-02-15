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
class Pracownik{
   private String imie;
   private String nazwisko;
   private String stanowisko;
   private int stazPracy;
   private double pensja;
   
   Pracownik(){
       imie = "Jan";
       nazwisko = "Kowalski";
       stanowisko = "asystent";
       stazPracy = 0;
       pensja = 3600+150*stazPracy;
   }
   Pracownik(String i, String n, String s, int sP){
       imie=i;
       nazwisko=n;
       stanowisko=s;
       stazPracy=sP;
       setPensja();
   }
   String getImie(){
       return imie;
   }
   void setImie(String i){
       imie=i;
   }
   String getNazwisko(){
       return nazwisko;
   }
   void setNazwisko(String n){
       nazwisko=n;
   }
   String getStanowisko(){
       return stanowisko;
   }
   void setStanowisko(String s){
       stanowisko=s;
   }
   int getStazPracy(){
       return stazPracy;
   }
   void setStazPracy(int sP){
       stazPracy=sP;
   }
   double getPensja(){
       return pensja;
   }
   void setPensja(){
       pensja = 3600+150*stazPracy;
       if(stanowisko.equalsIgnoreCase("manager")) pensja+=500;
       else if(stanowisko.equalsIgnoreCase("kierownik")) pensja+=1000;
   }
   boolean zwiekszPensja(double x){
       if((pensja+pensja*x)>10000) return false;
       else{
           pensja+=pensja*x;
           return true;
       }
   }
   void zwiekszStaz(){
       stazPracy++;
       setPensja();
   }
}
    
public class JavaMatt_Zad4_Lab3{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Pracownik[] pracownicy = new Pracownik[]{
        new Pracownik(),
        new Pracownik("Adam","Nowak","manager",3),
        new Pracownik("Patrycja","Maciejewska","księgowa",5),
        new Pracownik("Wojciech","Polak","Kierownik",2),
        new Pracownik("Marek","Kwiatkowski","kierownik",20)
        };
        for(Pracownik p:pracownicy)
            System.out.println(p.getImie()+" "+p.getNazwisko()+" "+p.getStanowisko()+
                               " "+p.getStazPracy()+" "+p.getPensja());
        System.out.println(pracownicy[3].zwiekszPensja(0.20));
        System.out.println(pracownicy[4].zwiekszPensja(0.35));
        pracownicy[2].zwiekszStaz();
        for(Pracownik p:pracownicy)
            System.out.println(p.getImie()+" "+p.getNazwisko()+" "+p.getStanowisko()+
                               " "+p.getStazPracy()+" "+p.getPensja());        
    } 
}