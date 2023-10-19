/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args){
        //objek bangun datar
        bangundatar Bangundatar = new bangundatar();
        
        persegi Persegi = new persegi();
        Persegi.sisi = 5;
        
        lingkaran Lingkaran = new lingkaran();
        Lingkaran.r = 22;
        
        persegipanjang Persegipanjang = new persegipanjang();
        Persegipanjang.lebar = 4;
        Persegipanjang.panjang = 8;
        
        segitiga Segitiga = new segitiga();
        Segitiga.alas = 12;
        Segitiga.tinggi = 8; 
        
        //menunjukkan inheritance
        Bangundatar.luas();
        Bangundatar.keliling();
        
        Persegi.luas();
        Persegi.keliling();
        
        Lingkaran.luas();
        Lingkaran.keliling();
        
        Persegipanjang.luas();
        Persegipanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
        
    }
}
