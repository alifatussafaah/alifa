/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author DELL
 */
public class mainmamalia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mamalia mama = new mamalia();
        monyet kera = new monyet();
        paus ikan = new paus();
        
        System.out.println("paus berjenis tulang = " + ikan.tulang);
        mama.tulang();
        
        System.out.println("monyet bernafas dengan = " + kera.nafas);
        mama.bernafas();
        
        kera.habitat();
        ikan.habitat();
    }
    
}
