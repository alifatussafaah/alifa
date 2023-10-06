/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author DELL
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //mendeklarasikan dan menginisialisasi sebuah array integer
        int[] angka = new int[5];
        
        //mengisi array dengan nilai
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;
        
        //mengakses dan mencetak nilai dari array
        System.out.println("nilai angka[0]:" + angka[0]); 
        System.out.println("nilai angka[1]:" + angka[1]);
        System.out.println("nilai angka[2]:" + angka[2]); 
        System.out.println("nilai angka[3]:" + angka[3]);
        System.out.println("nilai angka[4]:" + angka[4]); 
        
    }
}