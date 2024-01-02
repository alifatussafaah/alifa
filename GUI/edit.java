/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class edit {
     Koneksi konek = new Koneksi();

    public void edit(String NamaProduk, String DetailProduk, String Ingredient, String Terbit, String Distributor) throws SQLException {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_DetailProduk = "update output set DetailProduk ='" + DetailProduk + "'where NamaProduk ='" + NamaProduk + "'";
            String sql_Ingredient = "update output set Ingredient ='" + Ingredient + "'where NamaProduk ='" + NamaProduk + "'";
            String sql_Terbit = "update output set Terbit ='" + Terbit + "'where NamaProduk ='" + NamaProduk + "'";
            String sql_Distributor = "update output set Distributor='" + Distributor + "'where NamaProduk ='" + NamaProduk + "'";

            statement.executeUpdate(sql_DetailProduk);
            statement.executeUpdate(sql_Ingredient);
            statement.executeUpdate(sql_Terbit);
            statement.executeUpdate(sql_Distributor);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
