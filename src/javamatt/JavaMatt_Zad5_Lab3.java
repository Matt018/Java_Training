/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.io.*;

/**
 *
 * @author Matt
 */
class Film implements Serializable {
    String tytul;
    String rezyser;
    int rokProdukcji;
    String[] aktorzy;
    
    Film (){}
    
    Film(String tyt, String rez, int rok, String[] akt){
        tytul = tyt;
        rezyser = rez;
        rokProdukcji = rok;
        aktorzy = akt.clone();
    }
    Film (Film film){
        tytul = film.tytul;
        rezyser = film.rezyser;
        rokProdukcji = film.rokProdukcji;
        aktorzy = film.aktorzy.clone();
    }
    void PrzedstawSie(){
        StringBuffer info = new StringBuffer();
        info.append("Tytuł filmu: "+tytul);
        info.append("\n");
        info.append("Reżyser: "+rezyser);
        info.append("\n");
        info.append("Rok produkcji: "+rokProdukcji);
        info.append("\n");
        info.append("Aktorzy: ");
        info.append("\n");
        for(String str:aktorzy){
            info.append(str);
            info.append("\n");
        }
        System.out.print(info);
    }    
}
class Ksiazka implements Serializable {
    String tytul;
    String autor;
    int rokWydania;
    int liczbaStron;
    String gatunek;
    
    Ksiazka (){}
    
    Ksiazka(String tyt, String aut, int rok, int licz, String gat){
        tytul = tyt;
        autor = aut;
        rokWydania = rok;
        liczbaStron = licz;
        gatunek = gat;
    }
    Ksiazka (Ksiazka ksiazka){
        tytul = ksiazka.tytul;
        autor = ksiazka.autor;
        rokWydania = ksiazka.rokWydania;
        liczbaStron = ksiazka.liczbaStron;
        gatunek = ksiazka.gatunek;
    }
    void PrzedstawSie(){
        StringBuilder info = new StringBuilder();
        info.append("Tytuł Ksiazki: "+tytul+"\n");
        info.append("Autor: "+autor+"\n");
        info.append("Rok Wydania: "+rokWydania+"\n");
        info.append("Liczba stron: "+liczbaStron+"\n");
        info.append("Gatunek: "+gatunek+"\n");
        
        System.out.print(info);
    }    
}
public class JavaMatt_Zad5_Lab3{

    /**
     * @param args the command line arguments
     */
    public int zapiszFilm(Film film){
        int wynik=1;
        try(ObjectOutputStream strumien = new ObjectOutputStream(new FileOutputStream("film.obj"))){
            strumien.writeObject(film);
        }
        catch(Exception exc){
                exc.printStackTrace();
                wynik=-1;
                }
        return wynik;
    }
    public int zapiszObjTab(Object[]objtab){
        int wynik=1;
        try(ObjectOutputStream strumien = new ObjectOutputStream(new FileOutputStream("Objects.obj"))){
            for(Object obj:objtab){
            strumien.writeObject(obj);
            }
        }
        catch(Exception exc){
                exc.printStackTrace();
                wynik=-1;
                }
        return wynik;
    }
    public void czytajPlik(String plik){
        try(ObjectInputStream strumien = new ObjectInputStream(new FileInputStream(plik))){
            Object obj = null;
            while((obj=strumien.readObject())!=null){
                if(obj instanceof Ksiazka){
                    ((Ksiazka) obj).PrzedstawSie();
                    System.out.println();
                }
                else if (obj instanceof Film){
                    System.out.println(((Film) obj).rezyser+": "+((Film) obj).tytul+"\n");
                }
                else{
                    System.out.println("obiektnieznany\n");
                }
            }
        }
        catch(EOFException exc){
            System.out.println("Koniec pliku");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    } 
    public static void main(String[] args) throws Exception
    {
     Film f1 = new Film("Forest Gump","Robert Zemeckis",1994,new String[]{"Tom Hanks",
     "Robin Wright Penn","Gary Sinise","Sally Field"});
     
     Ksiazka k1 = new Ksiazka("Mężczyźni, którzy nienawidzą kobiet","Larsson Stieg",2008,634,
                              "powieść kryminalna");
     
     f1.PrzedstawSie();
     
     Object[] objtab = new Object[]{
         new Ksiazka("Hobbit, czyli tam i z powrotem","John Ronald Reuel Tolkien",2012,280,"powieść fantasy"),
         new Film("Interstellar","Christopher Nolan",2014,new String[]{"Matthew McConaughey","Anne Hathaway",
                                                                        "Jessica Chastain","Bill Irwin",
                                                                        "Ellen Burstyn","Michael Caine"}),
         new Ksiazka("Potop","Henryk Sienkiewicz",2020,948,"powieść historyczna"),
         new Film("The Revenant","Alejandro González Iñárritu",2015,new String[]{"Leonardo DiCaprio","Tom Hardy",
                                                                                 "Domhnall Gleeson","Will Poulter"}),
         new Film(f1),
         new Ksiazka(k1)
     };
     System.out.println();
     System.out.println("Zapsywanie do pliku:\n");
     System.out.println(new JavaMatt_Zad5_Lab3().zapiszObjTab(objtab));
     System.out.println("Odczytywanie z pliku:\n");
     new JavaMatt_Zad5_Lab3().czytajPlik("Objects.obj");
    } 
}