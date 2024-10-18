package Page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class payment_jTable4 {

    private JTable jTable;

    public payment_jTable4(JTable jTable) {
        this.jTable = jTable;
    }

    public void loadData() throws SQLException {
        ConnectionDatabase connect1 = new ConnectionDatabase();
        try (Connection connection = connect1.connect()) {
            if (connection == null) {
                JOptionPane.showMessageDialog(null, "Veritabanı bağlantısı sağlanamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);
            String sql = "SELECT * FROM gelenodeme";

            PreparedStatement pstmt = null;
            ResultSet rs = null;
            try {
                pstmt = connection.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("kisi"),
                        rs.getInt("tutar"),
                        rs.getString("tarih")
                    });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veri yükleme hatası: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        }
    }
}
