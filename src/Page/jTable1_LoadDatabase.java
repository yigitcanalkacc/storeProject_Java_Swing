package Page;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jTable1_LoadDatabase {

    
    private final JTable jTable1;
    
    public jTable1_LoadDatabase(JTable table) {
        this.jTable1 = table; 
    }
    

   public void loadTableData() {
        ConnectionDatabase dbCon = new ConnectionDatabase();
        try (Connection conn = dbCon.connect()) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            String sql = "SELECT * FROM User";

            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("ID"),
                        rs.getString("Kullanıcı"),
                        rs.getString("Email"),
                        rs.getString("Yetkili")
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
}
