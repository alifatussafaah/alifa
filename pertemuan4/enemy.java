/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author DELL
 */
public class enemy {
    String name = "lawan";
    int hp = 100;
    int attackpoint = 120;
    
    void name(){
        System.out.println("nama : " + name);
    }
    void hp(){
        System.out.println("health point : " + hp + "%");
    }
    void attackpoint(){
        System.out.println("attack point : " + attackpoint + "++");
    }
    void attack(){
        System.out.println("serang!!");
    }
}
