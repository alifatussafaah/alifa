/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class runminimarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isRunning = true;

        // Membuat objek kasir
        kasir kasir = new kasir("alifa1004");

        while (isRunning) {
            // Proses login
            System.out.print("Masukkan ID Kasir: ");
            String inputIdKasir = input.nextLine();

            if (kasir.loginKasir(inputIdKasir)) {
                System.out.println("Login berhasil!");

                // Input nama pembeli
                System.out.println("============ALIFA MART============");
                System.out.println("----------------------------------");
                System.out.print("Masukkan nama pembeli: ");
                String namaPembeli = input.nextLine();

                // Input jumlah barang yang dibeli
                System.out.print("Masukkan jumlah barang yang dibeli: ");
                int jumlahBarang = input.nextInt();

                input.nextLine();

                // Membuat objek Produk dengan harga pasti
                produk[] keranjangBelanja = new produk[jumlahBarang];
                for (int i = 0; i < jumlahBarang; i++) {
                    // Input nama produk
                    System.out.print("Masukkan nama produk ke-" + (i + 1) + ": ");
                    String namaProduk = input.nextLine();

                    // Harga produk pasti
                    int hargaProduk = 10000;

                    // Menambahkan produk ke keranjang belanja
                    keranjangBelanja[i] = new produk(inputIdKasir, namaProduk, hargaProduk);
                }

                System.out.print("Masukkan nominal pembayaran: ");
                int nominalPembayaran = input.nextInt();

                // Membuat objek Transaksi
                transaksi transaksi = new transaksi(inputIdKasir, namaPembeli, keranjangBelanja);
                transaksi.inputNominalPembayaran(nominalPembayaran);

                // Menampilkan detail transaksi
                System.out.println("==================================");
                System.out.println("\nDetail Transaksi:");
                transaksi.tampilkanDetailTransaksi();
                System.out.println("==================================");

                // Pilihan setelah transaksi selesai
                System.out.println("\n1. Lakukan Transaksi Lagi");
                System.out.println("2. Tutup Program");
                System.out.print("Pilih opsi: ");
                int pilihan = input.nextInt();

                if (pilihan == 2) {
                    isRunning = false; // Menutup program jika pilihan kedua dipilih
                }
            } else {
                System.out.println("Login gagal! ID Kasir tidak valid.");
            }
        }

        input.close();
        System.out.println("Program ditutup. Terima kasih!");
    }

}
