
import Page.ConnectionDatabase;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

   
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    
    
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 146, 124));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Merhaba, Hoşgeldiniz.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 51, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html> Giriş yapabilmek için kullanıcı adı ve şifrenizi giriniz.  <br> \t\t\t Giriş yapmakta zorlanıyorsanız.<br> \t\t\t Lütfen sistem yöneticisi ile iletişime geçiniz.<br> </html>");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 93, -1, 112));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 383, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("storeProject v1 @author ygtcnn");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 310, 383));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 146, 124));
        jLabel3.setText("Giriş Yap");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 53, 113, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 146, 124)));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 133, 192, -1));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 146, 124)));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 196, 192, -1));

        jButton2.setBackground(new java.awt.Color(0, 146, 124));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GİRİS");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 275, 151, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Şifremi Unuttum?");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 225, 109, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 146, 124));
        jLabel5.setText("Kullanıcı Adı");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 105, 92, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 146, 124));
        jLabel6.setText("Şifre");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 168, 92, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 383));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
            });
    }
    
    
    
    
    
    
    
    


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String userID = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        
        
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        
        boolean isValid = connectionDatabase.checkConnection(userID, password);
        
        if (isValid) {
                    
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Giriş Başarılı, Hoşgeldiniz." , "PaymentSys Demo", JOptionPane.INFORMATION_MESSAGE);
                    
        
        } else {
                    JOptionPane.showMessageDialog(null, "Giriş Başarısız, Yanlış kullanıcı adı veya şifre.", "PaymentSys Demo",JOptionPane.ERROR_MESSAGE);
                }
        
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
