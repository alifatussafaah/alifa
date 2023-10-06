/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author DELL
 */
public class luasjajargenjar2 {
    
       int alas = 50;
       int tinggi = 50;
    int hitungluasjajargenjang() {
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas );
        System.out.println("Tinggi = " + tinggi);
        return luas;
    }
public static void main(String[] args) {
    luasjajargenjar2 A = new luasjajargenjar2();
      System.out.println("luas jajargenjang = " + A.hitungluasjajargenjang());
} 
    
}