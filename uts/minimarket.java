/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author DELL
 */
public class minimarket {
    private String idKasir;

    // Constructor untuk mengatur ID Kasir saat objek dibuat
    public minimarket(String idKasir) {
        this.idKasir = idKasir;
    }

    // Getter untuk mendapatkan ID Kasir (Digunakan untuk login)
    public String getIdKasir() {
        return idKasir;
    }
}
