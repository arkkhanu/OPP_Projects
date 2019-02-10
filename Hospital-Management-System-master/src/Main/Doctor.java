package Main;

import Admins.AdminActivity;
import Doctors.doctorActivity;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String userName;

    public Doctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dPassField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        aUserLabel = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        dExitBtn = new javax.swing.JButton();
        dLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello Doctor !");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(771, 459));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1004, 0, 13, 0);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/qmhw-logo.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 180);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 770, 180);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);
        jPanel2.add(dPassField);
        dPassField.setBounds(80, 130, 200, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 100, 109, 29);

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setText("Username:");
        jPanel2.add(aUserLabel);
        aUserLabel.setBounds(20, 20, 116, 29);

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dUserField);
        dUserField.setBounds(80, 50, 200, 29);

        dExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        dExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(dExitBtn);
        dExitBtn.setBounds(120, 220, 91, 35);

        dLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        dLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        dLoginBtn.setText("Login");
        dLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dLoginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(dLoginBtn);
        dLoginBtn.setBounds(240, 220, 91, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/11 4.PNG"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 290);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 170, 770, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void dLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dLoginBtnActionPerformed
        connection = Connector.ConnectDb();
         try{
            Connector db = new Connector();
            String user = dUserField.getText();
            String mypass = String.valueOf(dPassField.getPassword());
            if(db.matchPasswordforDoctor(dUserField.getText(), mypass)){
                userName=user;
                doctorActivity dActivity = new doctorActivity(userName);
                dActivity.setVisible(true);
                JOptionPane.showMessageDialog(null,"Successfully...\nThank You");
                dispose();
                db.CloseConnection();
                dispose();
            }else{
             //   System.out.println("Not matched..\nTry again");
            JOptionPane.showMessageDialog(null, "Not matched..\nTry again");
            }   
        }catch(HeadlessException e){
            
        }
    }//GEN-LAST:event_dLoginBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Doctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JButton dLoginBtn;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
