/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticpolymorphism;

/**
 *
 * @author DELL
 */
public class lingkaran {
    //menghitung luas menggunakan jari2
    float luas(float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
    }
    
    double luas (double diameter){
        return (double)(Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
        
        lingkaran L = new lingkaran();
        float jari2 = 10;
        double d = 100;
        
        System.out.println("luas lingkaran dengan jari-jari = " + L.luas(jari2));
        System.out.println("luas lingkarang dengan diameter = " + L.luas(d));
    }
}
