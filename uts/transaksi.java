/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author DELL
 */
public class transaksi extends minimarket {
    private String namaPembeli;
    private produk[] keranjangBelanja;
    private int totalHarga;
    private int nominalPembayaran;

    // Constructor untuk Transaksi
    public transaksi(String idKasir, String namaPembeli, produk[] keranjangBelanja) {
        super(idKasir);
        this.namaPembeli = namaPembeli;
        this.keranjangBelanja = keranjangBelanja;
        this.totalHarga = hitungTotalHarga();
    }

    // Method berparameter: Menghitung total harga dari produk yang dibeli
    public int hitungTotalHarga() {
        int totalHarga = 0;
        for (produk Produk : keranjangBelanja) {
            totalHarga += Produk.getHargaProduk();
        }
        return totalHarga;  
    }
    
    public void inputNominalPembayaran(int nominalPembayaran) {
        this.nominalPembayaran = nominalPembayaran;
    }
    public int hitungKembalian() {
        return nominalPembayaran - totalHarga;
    }
    
    // Method berparameter: Menampilkan detail transaksi
    public void tampilkanDetailTransaksi() {
        System.out.println("ID Kasir: " + getIdKasir());
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Total Harga: Rp." + hitungTotalHarga());
        System.out.println("Nominal Pembayaran: Rp." + nominalPembayaran);

        int kembalian = hitungKembalian();
        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp." + kembalian);
        } else {
            System.out.println("Maaf, uang yang Anda bayarkan kurang.");
        }
    }
    
}
