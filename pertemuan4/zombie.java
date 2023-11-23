/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author DELL
 */
public class zombie extends enemy {
    
    @Override
    void name(){
        System.out.println("nama : zombie");
}
    void walk(){
        System.out.println("zombie jalan");
    }
    void attack(){
        System.out.println("gigit");
    }     
}