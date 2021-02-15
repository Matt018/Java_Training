/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatt;

import java.util.*;

/**
 *
 * @author Matt
 */
class Punkt3D
{
    private double x;
    private double y;
    private double z;
    
    Punkt3D(){}
    
    Punkt3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;        
    }
    
    void setX(double val){
        x=val;
    }
    
    double getX(){
        return x;
    }
    
    void setY(double val){
        y=val;
    }
    
    double getY(){
        return y;
    }
    
    void setZ(double val){
        z=val;
    }
    
    double getZ(){
        return z;
    }
    
    double distEuc(){
        double pow_sum = Math.pow((0-x), 2)+Math.pow((0-y),2)+Math.pow((0-z),2);
        return Math.sqrt(pow_sum);
    }
    
    double distManh(){
       return Math.abs(x)+Math.abs(y)+Math.abs(z);
   }
}
public class JavaMatt_Zad1_Lab3{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Punkt3D punktA = new Punkt3D(4.5,6.7,10.2);
        System.out.println(punktA.getX()+"\n"+punktA.getY()+"\n"+punktA.getZ()+"\n");
        punktA.setX(7.8);
        punktA.setY(6.3);
        punktA.setZ(12.5);
        System.out.println(punktA.getX()+"\n"+punktA.getY()+"\n"+punktA.getZ());
        System.out.println("Metryka Euklidesowa odleglość= "+punktA.distEuc()+
        "\nMetryka Manhattan odległość= "+punktA.distManh());
        Punkt3D punktB = new Punkt3D(4.5,8,-9.7);
        System.out.println(punktB.getX()+"\n"+punktB.getY()+"\n"+punktB.getZ());
        System.out.println("Metryka Euklidesowa odleglość= "+punktB.distEuc()+
        "\nMetryka Manhattan odległość= "+punktB.distManh());
    }
}