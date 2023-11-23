/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author DELL
 */
public class produk extends minimarket{
    private String namaProduk;
    private int hargaProduk;

    // Constructor untuk inisialisasi Produk dengan harga pasti
    public produk(String idKasir, String namaProduk, int hargaProduk) {
        super(idKasir);
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }
}
