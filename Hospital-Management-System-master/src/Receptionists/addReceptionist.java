package Receptionists;

import Admins.ReceptionistManagement;
import Main.Hospital;
import Main.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class addReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public addReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rGenderField = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rAgeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rNameField = new javax.swing.JTextField();
        rIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rDateField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rBloodField = new javax.swing.JTextField();
        blood = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rPhoneField = new javax.swing.JTextField();
        rEmailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rAddressField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rStatusField = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        rUserField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        clearPbtn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addDctorbtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Receptionist !");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 680));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        rGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        rGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGenderFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rGenderField);
        rGenderField.setBounds(510, 310, 120, 25);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENDER");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(420, 310, 80, 23);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGE");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(420, 260, 50, 23);

        rAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAgeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rAgeField);
        rAgeField.setBounds(510, 260, 120, 22);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(420, 210, 60, 23);

        rNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rNameField);
        rNameField.setBounds(510, 210, 120, 22);

        rIdField.setText("sjb0HMSr");
        rIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rIdFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rIdField);
        rIdField.setBounds(510, 160, 120, 22);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 160, 50, 23);

        rDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDateFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rDateField);
        rDateField.setBounds(510, 110, 120, 22);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(420, 110, 60, 23);

        rBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBloodFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rBloodField);
        rBloodField.setBounds(850, 110, 120, 22);

        blood.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        blood.setForeground(new java.awt.Color(255, 255, 255));
        blood.setText("BLOOD GROUP");
        jPanel2.add(blood);
        blood.setBounds(660, 110, 150, 23);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PHONE NO");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(660, 160, 120, 22);

        rPhoneField.setText("+880");
        rPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPhoneFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rPhoneField);
        rPhoneField.setBounds(850, 160, 120, 22);

        rEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rEmailField);
        rEmailField.setBounds(850, 210, 120, 22);

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EMAIL");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(660, 210, 90, 23);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADDRESS");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(660, 260, 110, 23);

        rAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAddressFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rAddressField);
        rAddressField.setBounds(850, 260, 120, 22);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MARITIAL STATUS");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(660, 310, 180, 23);

        rStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        rStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rStatusField);
        rStatusField.setBounds(850, 310, 120, 25);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("UserName");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(210, 230, 140, 22);

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rUserField);
        rUserField.setBounds(210, 260, 149, 22);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Password");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(210, 300, 117, 22);

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });
        jPanel2.add(rPassField);
        rPassField.setBounds(210, 330, 150, 20);

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(null);

        clearPbtn.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        clearPbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearPbtn.setText("Clear");
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });
        jPanel7.add(clearPbtn);
        clearPbtn.setBounds(25, 11, 55, 43);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(540, 400, 100, 65);

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        addDctorbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addDctorbtn.setForeground(new java.awt.Color(255, 255, 255));
        addDctorbtn.setText("Add");
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addDctorbtn)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDctorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(680, 400, 107, 65);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/15.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 180, 1000, 510);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/qmhw-logo.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 760, 180);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18);
        jLabel18.setBounds(940, 130, 48, 48);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel19);
        jLabel19.setBounds(870, 130, 48, 48);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1000, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked

    }//GEN-LAST:event_jPanel6MouseClicked

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
        connection = Connector.ConnectDb();
        if (connection != null) {
            String date = rDateField.getText();
            String id = rIdField.getText();
            String name = rNameField.getText();
            int age = Integer.parseInt(rAgeField.getText());
            String gender = (String) rGenderField.getSelectedItem();
            String rblood = rBloodField.getText();
            String email = rEmailField.getText();
            String phone = rPhoneField.getText();
            String address = rAddressField.getText();
            String status = (String) rStatusField.getSelectedItem();
            String user = rUserField.getText();
            String pass = String.valueOf(rPassField.getPassword());
            String sql = "insert into receptionist(joining,Hid,Fname,age,gender,blood,email,phone,address,status,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, rblood);
                prp.setString(7, email);
                prp.setString(8, phone);
                prp.setString(9, address);
                prp.setString(10, status);
                prp.setString(11, user);
                prp.setString(12, pass);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        rDateField.setText("");
        rNameField.setText("");
        rIdField.setText("sjb0HMSr");
        rAgeField.setText("");
        rGenderField.setSelectedIndex(0);
        rBloodField.setText("");
        rPhoneField.setText("+880");
        rEmailField.setText("");
        rAddressField.setText("");
        rStatusField.setSelectedIndex(0);
        rUserField.setText("");
        rPassField.setText("");
    }//GEN-LAST:event_jPanel7MouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        rDateField.setText("");
        rNameField.setText("");
        rIdField.setText("sjb0HMSr");
        rAgeField.setText("");
        rGenderField.setSelectedIndex(0);
        rBloodField.setText("");
        rPhoneField.setText("+880");
        rEmailField.setText("");
        rAddressField.setText("");
        rStatusField.setSelectedIndex(0);
        rUserField.setText("");
        rPassField.setText("");
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        ReceptionistManagement rm = new ReceptionistManagement();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void rStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rStatusFieldActionPerformed

    }//GEN-LAST:event_rStatusFieldActionPerformed

    private void rAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAddressFieldActionPerformed

    private void rEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailFieldActionPerformed

    private void rPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPhoneFieldActionPerformed

    private void rBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBloodFieldActionPerformed

    private void rDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDateFieldActionPerformed

    private void rIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rIdFieldActionPerformed

    private void rNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rNameFieldActionPerformed

    private void rAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAgeFieldActionPerformed

    private void rGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGenderFieldActionPerformed

    }//GEN-LAST:event_rGenderFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel blood;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField rAddressField;
    private javax.swing.JTextField rAgeField;
    private javax.swing.JTextField rBloodField;
    private javax.swing.JTextField rDateField;
    private javax.swing.JTextField rEmailField;
    private javax.swing.JComboBox<String> rGenderField;
    private javax.swing.JTextField rIdField;
    private javax.swing.JTextField rNameField;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rPhoneField;
    private javax.swing.JComboBox<String> rStatusField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
