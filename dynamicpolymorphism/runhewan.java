/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dynamicpolymorphism;

/**
 *
 * @author DELL
 */
public class runhewan {
     public static void main(String[] args) {
         
        hewan Hewan = new hewan(); 
        anjing anj = new anjing();
        kucing Kucing = new kucing();
        sapi Sapi = new sapi();
        kambing Kambing = new kambing();
        
        Hewan.suara();
        anj.suara();
        Kucing.suara();
        Kucing.suara();
        Sapi.suara();
        Kambing.suara();
     }       
}
