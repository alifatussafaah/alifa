/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author DELL
 */
public class runMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alifa", 19);
        mahasiswa1.tampilkanInfo();
        
        //menggunakan getter untuk mengakses nama
        System.out.println("Nama Mahasiswa: " + mahasiswa1.getNama());
        
        //menggunakan setter untuk mengubah usia 
        mahasiswa1.setUsia(20);
        mahasiswa1.tampilkanInfo();
        
        //mencoba mengubah usia menjadi nilai negatif (akan menampilkan pesan kesalahan)
        mahasiswa1.setUsia(-1);
    }
}
