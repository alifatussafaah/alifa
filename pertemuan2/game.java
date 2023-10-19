/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author DELL
 */
public class game {
    
static player petanikode = new player();
    
    public static void main(String[] args){
        
        System.out.println("ini adalah petani");
        System.out.println("name \t \t " + petanikode.name);
        System.out.println("speed \t \t " + petanikode.speed);
        System.out.println("healthpoint \t " + petanikode.healthpoint);
        
        petanikode.Run();
        petanikode.Isdead();
    }
}
