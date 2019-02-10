package Doctors;

import Admins.doctorManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class addDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public addDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dDateField = new javax.swing.JTextField();
        dIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        dPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dAddressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dRoomField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dGenderField = new javax.swing.JComboBox<>();
        dStatusField = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        addDctorbtn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        clearPbtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dBloodField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dEmailField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        dPassField = new javax.swing.JPasswordField();
        dDeptField = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Doctor");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1019, 680));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 583));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Joining Date");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(410, 70, 105, 23);

        dDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dDateFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dDateField);
        dDateField.setBounds(530, 70, 149, 22);

        dIdField.setText("sjb0HMSd");
        dIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dIdFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dIdField);
        dIdField.setBounds(530, 120, 149, 22);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(410, 120, 98, 23);

        dNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dNameField);
        dNameField.setBounds(530, 170, 149, 22);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(410, 170, 98, 23);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(410, 220, 98, 23);

        dAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAgeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAgeField);
        dAgeField.setBounds(530, 220, 149, 22);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(410, 270, 98, 23);

        Gender.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Department");
        jPanel2.add(Gender);
        Gender.setBounds(710, 70, 120, 22);

        dPhoneField.setText("+880");
        dPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPhoneFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dPhoneField);
        dPhoneField.setBounds(850, 120, 152, 22);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(700, 90, 130, 23);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Maritial Status");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(710, 220, 130, 23);

        dAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAddressFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAddressField);
        dAddressField.setBounds(850, 270, 149, 22);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(710, 270, 100, 23);

        dRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRoomFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dRoomField);
        dRoomField.setBounds(850, 320, 149, 22);

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ward/Room no");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(710, 320, 130, 23);

        dGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        dGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dGenderField);
        dGenderField.setBounds(530, 270, 149, 25);

        dStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        dStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dStatusField);
        dStatusField.setBounds(850, 220, 152, 25);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        addDctorbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addDctorbtn.setForeground(new java.awt.Color(255, 255, 255));
        addDctorbtn.setText("Add");
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addDctorbtn)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDctorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(680, 390, 110, 65);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 65));

        clearPbtn.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        clearPbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearPbtn.setText("Clear");
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(clearPbtn)
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearPbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(520, 390, 100, 65);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(410, 320, 110, 23);

        dBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBloodFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dBloodField);
        dBloodField.setBounds(530, 320, 149, 22);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(710, 170, 80, 23);

        dEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dEmailField);
        dEmailField.setBounds(850, 170, 152, 22);

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Password");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(170, 300, 79, 23);

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Username");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(170, 230, 110, 23);

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dUserField);
        dUserField.setBounds(170, 260, 149, 22);
        jPanel2.add(dPassField);
        dPassField.setBounds(170, 330, 149, 20);

        dDeptField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Medecine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Haematology", "Microbiology" }));
        jPanel2.add(dDeptField);
        dDeptField.setBounds(850, 70, 152, 22);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/15.jpg"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 0, 1020, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 180, 1020, 520);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/qmhw-logo.png"))); // NOI18N
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 0, 760, 180);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21);
        jLabel21.setBounds(890, 130, 48, 48);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20);
        jLabel20.setBounds(960, 130, 48, 48);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1020, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        doctorManagement dManagement = new doctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void dDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dDateFieldActionPerformed

    private void dIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dIdFieldActionPerformed

    private void dNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameFieldActionPerformed

    private void dAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAgeFieldActionPerformed

    private void dPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dPhoneFieldActionPerformed

    private void dAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAddressFieldActionPerformed

    private void dRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRoomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRoomFieldActionPerformed

    private void dGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderFieldActionPerformed

    }//GEN-LAST:event_dGenderFieldActionPerformed

    private void dStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dStatusFieldActionPerformed

    }//GEN-LAST:event_dStatusFieldActionPerformed

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
        connection = Connector.ConnectDb();
       
        if (connection != null) {
            String date = dDateField.getText();
            String id = dIdField.getText();
            String name = dNameField.getText();
            int age = Integer.parseInt(dAgeField.getText());
            String gender = (String) dGenderField.getSelectedItem();
            String blood = dBloodField.getText();
            String dept = (String) dDeptField.getSelectedItem();
            String phone = dPhoneField.getText();
            String email = dEmailField.getText();
            String status = (String) dStatusField.getSelectedItem();
            String address = dAddressField.getText();
            int room = Integer.parseInt(dRoomField.getText());
            String user = dUserField.getText();
            String pass = String.valueOf(dPassField.getPassword());
            String sql = "insert into doc(Jdate,Hid,Fname,age,gender,blood,dept,phone,email,status,address,room,UserName,Password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, blood);
                prp.setString(7, dept);
                prp.setString(8, phone);
                prp.setString(9, email);
                prp.setString(10, status);
                prp.setString(11, address);
                prp.setInt(12, room);
                prp.setString(13, user);
                prp.setString(14, pass);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        dDateField.setText("");
        dIdField.setText("sjb0HMSd");
        dNameField.setText("");
        dAgeField.setText("");
        dDeptField.setSelectedIndex(0);
        dPhoneField.setText("+880");
        dAddressField.setText("");
        dRoomField.setText("");
        dGenderField.setSelectedIndex(0);
        dStatusField.setSelectedIndex(0);
        dUserField.setText("");
        dPassField.setText("");
        dEmailField.setText("");
        dBloodField.setText("");
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void dBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBloodFieldActionPerformed

    private void dEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailFieldActionPerformed

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JTextField dAddressField;
    private javax.swing.JTextField dAgeField;
    private javax.swing.JTextField dBloodField;
    private javax.swing.JTextField dDateField;
    private javax.swing.JComboBox<String> dDeptField;
    private javax.swing.JTextField dEmailField;
    private javax.swing.JComboBox<String> dGenderField;
    private javax.swing.JTextField dIdField;
    private javax.swing.JTextField dNameField;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dPhoneField;
    private javax.swing.JTextField dRoomField;
    private javax.swing.JComboBox<String> dStatusField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
