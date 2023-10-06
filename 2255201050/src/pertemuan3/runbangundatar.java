/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author DELL
 */
public class runbangundatar {

    public static void main(String[] args) {
        
        masterbangundatar F = new masterbangundatar ();
        System.out.println(" hasil method prosedur");
        F.hitungLJ(20, 20);
        
        System.out.println(" hasil method fungsi = "+ F.hitungLJ3(4, 6));
        System.out.println(" hasil method static prosedur");
        masterbangundatar.hitungLJ2(30, 30);
        
        System.out.println(" hasil method static fungsi");
        System.out.println("luas jajagenjang = " + masterbangundatar.hitungLJ4(40, 40));
        
    }
    
}
