package Page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class jTable2_LoadDatabase {

    private JTable jTable2;

    public jTable2_LoadDatabase(JTable table) {
        this.jTable2 = table;
    }

    public void loadTable() {
        ConnectionDatabase connectionDB = new ConnectionDatabase();
        try (Connection connection = connectionDB.connect()) {
            if (connection == null) {
                JOptionPane.showMessageDialog(null, "Veritabanı bağlantısı sağlanamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Tabloyu temizle
            String sql = "SELECT * FROM Urunler";

            try (PreparedStatement pstmt = connection.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("urun"),
                        rs.getString("marka"),
                        rs.getInt("fiyat"),
                        rs.getString("kullanici"),
                        rs.getInt("stok")
                    });
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Veri yüklenirken hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Veritabanı bağlantısında hata: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Burada bir JTable örneği oluşturarak loadTable() metodunu çağırabilirsiniz.
    }
}
