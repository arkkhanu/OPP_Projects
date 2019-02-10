package Doctors;

import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class doctorActivity extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection connection = null;
    public String sendName;
    public String findName;
    public String ss;

    public doctorActivity(String pName) {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        //findName = pName;
        ss = pName;
    }

    doctorActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lllll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Doctor Pannel !");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 590));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/qmhw-logo.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 760, 180);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 780, 180);

        jPanel1.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(710, 10, 48, 48);

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Appointments");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/appointment.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(370, 100, 150, 100);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 90, 73, 23);

        lllll.setText("jButton2");
        lllll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lllllActionPerformed(evt);
            }
        });
        jPanel1.add(lllll);
        lllll.setBounds(600, 170, 73, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Capture1.PNG"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 180, 780, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        connection = Connector.ConnectDb();
        //String sql = "SELECT pName FROM appointment WHERE dName = '" + findName + "'";
        String sql = "select pName from appointment where dName =" + ss;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
          //  rs.first();
            String getPname = rs.getString("pName");
            sendName = getPname;
            Appointment appointment = new Appointment(sendName);
            appointment.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ss+"Appointment list is Empty");
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        connection = Connector.ConnectDb();
        String sql = "select pName from appointment where dName ="+ss;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
           // rs.first();
            String getPname = rs.getString("pName");
            sendName = getPname;
            Appointment appointment = new Appointment(sendName);
            appointment.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,ss+ "Appointment list is Empty");
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connection = Connector.ConnectDb();
        String sq = "select pName from appointment where dName ="+ss;
        try{
            ps=connection.prepareStatement(sq);
            rs=ps.executeQuery();
          //  String getPname = rs.getString("pName");
            sendName = "ar123";
            Appointment ap = new Appointment(sendName);
            ap.setVisible(true);
            dispose();
        }catch(SQLException e){
            System.out.println(sendName+"exception");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lllllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lllllActionPerformed
        // TODO add your handling code here:
        connection = Connector.ConnectDb();
         String ar="";
        String sq = "select pName from appointment where dName ="+ss;
        try{
            ps= connection.prepareStatement(sq);
            rs = ps.executeQuery();
            while(rs.next()){
                String array = rs.getString("pName");
                Appointment ap = new Appointment(array);
                ap.setVisible(true);
                System.out.println(array);
                break;
            }
            dispose();
        }catch(SQLException e){
            System.out.println(ar+"nothing");
        }
            
        
    }//GEN-LAST:event_lllllActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(doctorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new doctorActivity().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton lllll;
    // End of variables declaration//GEN-END:variables
}
