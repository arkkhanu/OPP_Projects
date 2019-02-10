package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import Receptionists.ReceptionistActivity;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Receptionist extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Receptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dUser = new javax.swing.JLabel();
        rUserField = new javax.swing.JTextField();
        rPassField = new javax.swing.JPasswordField();
        plbl = new javax.swing.JLabel();
        rExitBtn = new javax.swing.JButton();
        rLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(771, 459));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/qmhw-logo.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 180);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 770, 180);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        dUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dUser.setText("Username:");
        jPanel1.add(dUser);
        dUser.setBounds(20, 20, 116, 29);

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rUserField);
        rUserField.setBounds(80, 50, 190, 29);

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rPassField);
        rPassField.setBounds(80, 130, 190, 29);

        plbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plbl.setText("Password:");
        jPanel1.add(plbl);
        plbl.setBounds(20, 100, 109, 29);

        rExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        rExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        rExitBtn.setText("Home");
        rExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rExitBtn);
        rExitBtn.setBounds(100, 200, 91, 35);

        rLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        rLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        rLoginBtn.setText("Login");
        rLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rLoginBtn);
        rLoginBtn.setBounds(220, 200, 91, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/11 4.PNG"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 770, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void rExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_rExitBtnActionPerformed

    private void rLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLoginBtnActionPerformed
        try{
            Connector db = new Connector();
            String user = rUserField.getText();
            String mypass = String.valueOf(rPassField.getPassword());
            if(db.matchPasswordforREcep(rUserField.getText(), mypass)){
                ReceptionistActivity rActivity = new ReceptionistActivity();
                rActivity.setVisible(true);
                username = user;
                ReceptionistActivity.username = username;
                JOptionPane.showMessageDialog(null, "Successfully...\nThank You");
                dispose();
                db.CloseConnection();
//                conn.close();
                dispose();
            }else{
             //   System.out.println("Not matched..\nTry again");
            JOptionPane.showMessageDialog(null, "Not matched..\nTry again");
            }   
        }catch(HeadlessException e){
            
        }   
    }//GEN-LAST:event_rLoginBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel plbl;
    private javax.swing.JButton rExitBtn;
    private javax.swing.JButton rLoginBtn;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
