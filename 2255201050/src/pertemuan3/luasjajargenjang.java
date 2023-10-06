/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author DELL
 */
public class luasjajargenjang {

        int alas = 20;
        int tinggi = 40;
        
    void hitungluasjajargenjang() {
        int luas = alas * tinggi;
        System.out.println("a = " + alas );
        System.out.println("t = " + tinggi);
        System.out.println("luasjajargenjang = " + luas);
    }
    public static void main(String[] args){
        luasjajargenjang P = new luasjajargenjang();
        P.hitungluasjajargenjang();
    }
    
}
