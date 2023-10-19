/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author DELL
 */
public class player {
    String name = "fia";
    int speed = 50;
    int healthpoint = 100;
    
    public void Run(){
        System.out.println(name +" is running");
        System.out.println("speed: " + speed);
    }
    public void isdead(){
        System.out.println(name +"dead");
    }  
    boolean Isdead(){
        if(healthpoint <= 0) return true;
        return false;
    }
    public static void main(String[] args){
    }
}
