/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author DELL
 */
public class kasir extends minimarket {
    // Constructor untuk Kasir
    public kasir(String idKasir) {
        super(idKasir);
    }

    // Method untuk login kasir
    public boolean loginKasir(String idKasir) {
        return getIdKasir().equals(idKasir);
    }
    
}
