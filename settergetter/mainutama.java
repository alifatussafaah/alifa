/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package settergetter;

/**
 *
 * @author DELL
 */
public class mainutama {
    public static void main(String[] args) {
        user User = new user();
        
        User.setusername("alifa");
        User.setpassword("rahasia");
        
        System.out.println("usernamenya = " + User.getusername());
        System.out.println("passwordnya = " + User.getpassword());
    }
}
