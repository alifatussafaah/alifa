/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5.");
        } else {
            System.out.println("Angka tidak lebih besar dari 5.");
        }

        input.close();
    }
}