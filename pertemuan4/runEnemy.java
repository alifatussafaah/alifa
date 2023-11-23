/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author DELL
 */
public class runEnemy {
    public static void main(String[] args) {
        enemy P = new enemy();
        P.name();
        P.hp();
        P.attackpoint();
        P.attack();
        
        zombie R = new zombie();
        R.name();
        R.hp();
        R.attackpoint();
        R.attack();
        
        pocong G = new pocong();
        G.name();
        G.hp();
        G.attackpoint();
        G.jump();
        
        burung B = new burung();
        B.name();
        B.hp();
        B.attackpoint();
        B.walk();
        B.jump();
        B.fly();
        
        
    }
}
