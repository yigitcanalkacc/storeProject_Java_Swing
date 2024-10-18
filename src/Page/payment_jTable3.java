package Page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class payment_jTable3 {

    private JTable jTable;

    public payment_jTable3(JTable jTable) {
        this.jTable = jTable;
    }

    public void loadData() {
        ConnectionDatabase connect1 = new ConnectionDatabase();

        try (Connection connects = connect1.connect()) {
            if (connects == null) {
                JOptionPane.showMessageDialog(null, "Veritabanı bağlantısı sağlanamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);
            String sql = "SELECT * FROM gidenode";

            try (PreparedStatement pstmt = connects.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("odesirket"),
                        rs.getString("odeyap"),
                        rs.getInt("tutar"),
                        rs.getString("tarih")
                    });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veri yüklenirken hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bağlantı sırasında hata: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
