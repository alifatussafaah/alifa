/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author DELL
 */
public class Mahasiswa {
    private String nama;
    private int usia;
    
    public Mahasiswa(String nama, int usia){
       this.nama = nama;
       this.usia = usia;
    }
    
    //metode getter untuk mengakses nilai nama
    public String getNama(){
        return nama;
    }
    
    //metode setter untuk mengubah nilai usia 
    public void setUsia(int usia){
        if (usia > 0){
            this.usia = usia;
        }else{
            System.out.println("usia harus lebih besar dari 0");
        }
    }
    
    //metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
