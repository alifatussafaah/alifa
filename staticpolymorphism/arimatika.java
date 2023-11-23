/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticpolymorphism;

/**
 *
 * @author DELL
 */
public class arimatika {
    void penjumlahan (int a){
        System.out.println("a : " + a);
    }
    
    void penjumlahan (int a, int b){
        System.out.println("a : " + a + "," + b);
    }
    
    double penjumlahan (double a){
        return a+a;
    }
    public static void main(String[] args) {
        double hasil;
        arimatika objl = new arimatika();
        
        objl.penjumlahan(5);
        objl.penjumlahan(5.7);
        hasil = objl.penjumlahan(4.5d);
        System.out.println("nilai hasil : " + hasil);
}
}
