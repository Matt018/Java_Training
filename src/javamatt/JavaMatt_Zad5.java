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
public class JavaMatt_Zad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String stringIn = "Dy tocd cjipbygkxso Mojkb";
        int key = 10;                                // o ile znaków przesunąć
        if(key>26)                                  // przesunięcie o całą długość alfabetu
            key%=26;
        byte [] byteArray = stringIn.getBytes();
        for (int i = 0;i<byteArray.length; i++){
            if(byteArray[i]>64&byteArray[i]<91){    // gdy występują duże litery
                byteArray[i]-=key;
                if(byteArray[i]<65)                 // gdy wyjdzie poza zakres alfabetu 
                byteArray[i]+=26;                   // liczymy od A
            }
            else if(byteArray[i]>96&byteArray[i]<123){  // gdy małe
               byteArray[i]-=key;
                if(byteArray[i]<97)
                    byteArray[i]+=26;               // gdy wyjdzie poza zakres alfabetu
                else if (byteArray[i]<0)
                    byteArray[i]+=230;    //gdy wyjdzie poza zakres byte
            }
            else if(byteArray[i]!=32)
                System.out.println("zły znak");     // jeżeli inny znak niż litera lub spacja
        }
        String stringOut = new String(byteArray);
        System.out.println(stringOut);
        
    
        
    }
}
    

