package Main;

import Admins.AdminActivity;
import java.awt.HeadlessException;
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
public class Admin extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Admin() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        aLoginBtn = new javax.swing.JButton();
        dExitBtn = new javax.swing.JButton();
        aUserLabel = new javax.swing.JLabel();
        aUserField = new javax.swing.JTextField();
        aPassField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Admin !");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 550));
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

        aLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        aLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        aLoginBtn.setText("Login");
        aLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(aLoginBtn);
        aLoginBtn.setBounds(230, 220, 91, 35);

        dExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        dExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dExitBtn);
        dExitBtn.setBounds(110, 220, 91, 35);

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setText("Username:");
        jPanel1.add(aUserLabel);
        aUserLabel.setBounds(20, 20, 116, 29);

        aUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aUserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(aUserField);
        aUserField.setBounds(80, 50, 210, 30);
        jPanel1.add(aPassField);
        aPassField.setBounds(80, 130, 210, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 109, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/11 4.PNG"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 770, 290);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void aLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginBtnActionPerformed
             
        try{
            Connector db = new Connector();
            String user = aUserField.getText();
            String mypass = String.valueOf(aPassField.getPassword());
            if(db.matchPasswordforAdmin(aUserField.getText(), mypass)){
                AdminActivity adminActivity = new AdminActivity();
                adminActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Successfully...\nThank You");
                dispose();
                username = user;
                adminActivity.User(username);
                db.CloseConnection();
//                conn.close();
                dispose();
            }else{
             //   System.out.println("Not matched..\nTry again");
            JOptionPane.showMessageDialog(null, "Not matched..\nTry again");
            }   
        }catch(HeadlessException e){
            
        }        
    }//GEN-LAST:event_aLoginBtnActionPerformed

    private void aUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aUserFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aLoginBtn;
    private javax.swing.JPasswordField aPassField;
    private javax.swing.JTextField aUserField;
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
