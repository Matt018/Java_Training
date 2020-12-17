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
public class JavaMatt_Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String palindrom = "Co mi dał duch cud ład i moc";
        //String palindrom = "Pull up";
        palindrom = palindrom.toLowerCase();       //ujednolicenie liter-wszystkie małe
        palindrom=palindrom.replaceAll(" ", "");   // usunięcie spacji
        boolean czyPalindrom = true;
        for(int i = 0; i<palindrom.length()/2;i++){  
            if(palindrom.charAt(i)!=palindrom.charAt(palindrom.length()-1-i)){   // badaby czy łańcuch ma "lustrzane odbicie"
                czyPalindrom = false;
                break;
            }
        }
        if(czyPalindrom){
            System.out.println("Zdanie jest palindromem");
        }
        else{
            System.out.println("Zdanie nie jest palindromem");
        }
        
    }
}
    

