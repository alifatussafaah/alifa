/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class delete {
    Koneksi konek = new Koneksi();
   

    public void delete(String NamaProduk ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from output where NamaProduk ='" + NamaProduk + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
