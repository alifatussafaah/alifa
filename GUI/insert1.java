/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class insert1 {
    
    Koneksi konek = new Koneksi();

    

    public void insert1(String NamaProduk, String DetailProduk, String Ingredient, String Terbit, String Distributor) {
        {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
              String sql = "insert into output "+" values('" + NamaProduk + "','" + DetailProduk + "','" + Ingredient + "','" + Terbit + "','" + Distributor + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
}
        }
    }
}
