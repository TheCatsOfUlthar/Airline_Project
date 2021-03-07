import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class addCustomer extends javax.swing.JInternalFrame {

  /** Creates new form addCustomer */
  addCustomer() {
    initComponents();
    autoID();
  }

  private Connection connection;

  private byte[] userImage = null;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */

  // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    javax.swing.JTextArea txtAddress = new javax.swing.JTextArea();
    javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
    javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    r1 = new javax.swing.JRadioButton();
    javax.swing.JRadioButton r2 = new javax.swing.JRadioButton();
    javax.swing.JButton jButton1 = new javax.swing.JButton();
    javax.swing.JButton jButton2 = new javax.swing.JButton();
    javax.swing.JButton jButton3 = new javax.swing.JButton();

    jPanel1.setBackground(new java.awt.Color(51, 0, 255));

    jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("First Name");

    jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Last Name");

    jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Nic No");

    jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Passport ID");

    jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Address");

    txtLastName.addActionListener(this::txtLastNameActionPerformed);

    txtPassport.addActionListener(this::txtPassportActionPerformed);

    txtAddress.setColumns(20);
    txtAddress.setRows(5);
    jScrollPane1.setViewportView(txtAddress);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(47, 47, 47)
                                                    .addComponent(txtFirstName))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel4)
                                                            .addComponent(jLabel3))
                                                    .addGap(38, 38, 38)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                false)
                                                            .addComponent(jScrollPane1)
                                                            .addComponent(txtPassport)
                                                            .addComponent(txtNIC))))
                                    .addContainerGap(
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(48, 48, 48)
                                    .addComponent(
                                        txtLastName,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(
                                txtFirstName,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                txtLastName,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                txtNIC,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(
                                txtPassport,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(
                                jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                62,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)));

    jLabel6.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
    jLabel6.setText("Customer ID");

    txtID.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20)); // NOI18N
    txtID.setForeground(new java.awt.Color(255, 0, 0));
    txtID.setText("jLabel7");

    jPanel2.setBackground(new java.awt.Color(51, 0, 255));

    jLabel8.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Date of Birth");

    jLabel9.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Gender");

    jLabel10.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("Contact");

    r1.setText("Male");

    r2.setText("Female");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                    .addGap(43, 43, 43)
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(
                                                jPanel2Layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                    .addComponent(
                                                        txtDOB,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        174,
                                                        Short.MAX_VALUE))
                                            .addGroup(
                                                jPanel2Layout
                                                    .createSequentialGroup()
                                                    .addComponent(r1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(r2))
                                            .addComponent(txtContact))))
                    .addContainerGap(41, Short.MAX_VALUE)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(
                                txtDOB,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(r1)
                            .addComponent(r2))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(
                                txtContact,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(108, Short.MAX_VALUE)));

    txtPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jButton1.setText("Browse");
    jButton1.addActionListener(this::jButton1ActionPerformed);

    jButton2.setText("Add");
    jButton2.addActionListener(this::jButton2ActionPerformed);

    jButton3.setText("Cancel");
    jButton3.addActionListener(this::jButton3ActionPerformed);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel6)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtID))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(
                                        jPanel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        jPanel2,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(
                                                                        txtPhoto,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        250,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(337, 337, 337)
                                                                    .addComponent(
                                                                        jButton1,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        87,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addComponent(
                                                        jButton2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        jButton3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(24, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtID))
                    .addGap(41, 41, 41)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(
                                jPanel1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(
                                                txtPhoto,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                250,
                                                Short.MAX_VALUE)
                                            .addComponent(
                                                jPanel2,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        jButton1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(
                                                jButton2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                38,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jButton3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                38,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(49, 49, 49)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void autoID() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost/airline", "root", "Softwaretesting1!");
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT MAX(ID) from CUSTOMER");
      resultSet.next();
      resultSet.getString("MAX(id)");
      if (resultSet.getString("MAX(id)") == null) {
        txtID.setText("CS001");
      } else {
        long ID = Long.parseLong(resultSet.getString("MAX(id)").substring(2));
        ID++;
        txtID.setText("CS" + String.format("%03d", ID));
      }

    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void txtLastNameActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_textLastNameActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_textLastNameActionPerformed

  private void txtPassportActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_textPassportActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_textPassportActionPerformed

  public void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    try {
      JFileChooser pictureChooser = new JFileChooser();
      pictureChooser.showOpenDialog(null);
      File picture = pictureChooser.getSelectedFile();
      FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "png", "jpg");
      pictureChooser.addChoosableFileFilter(filter);
      String path = picture.getAbsolutePath();
      BufferedImage bufferedImage;
      bufferedImage = ImageIO.read(pictureChooser.getSelectedFile());
      ImageIcon imageIcon =
          new ImageIcon(
              new ImageIcon(bufferedImage)
                  .getImage()
                  .getScaledInstance(250, 250, Image.SCALE_DEFAULT));
      txtPhoto.setIcon(imageIcon);

      File image = new File(path);
      FileInputStream fileInputStream = new FileInputStream(image);
      ByteArrayOutputStream stream = new ByteArrayOutputStream();
      byte[] buffer = new byte[1024];
      for (int readNumber; (readNumber = fileInputStream.read(buffer)) != -1; ) {
        stream.write(buffer, 0, readNumber);
      }
      userImage = stream.toByteArray();

    } catch (IOException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  } // GEN-LAST:event_jButton1ActionPerformed

  protected void jButton2ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:

    String ID = txtID.getText();
    String firstName = txtFirstName.getText();
    String lastName = txtLastName.getText();
    String NIC = txtNIC.getText();
    String passport = txtPassport.getText();
    String address = txtAddress.getText();

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String date = dateFormat.format(txtDOB.getDate());
    String gender;

    if (r1.isSelected()) {
      gender = "Male";
    } else {
      gender = "FeMale";
    }

    String contact = txtContact.getText();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost/airline", "root", "Softwaretesting1!");
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "INSERT INTO CUSTOMER(ID, firstName, lastName, NIC, passport, address, DOB, gender, contact, photo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

      preparedStatement.setString(1, ID);
      preparedStatement.setString(2, firstName);
      preparedStatement.setString(3, lastName);
      preparedStatement.setString(4, NIC);
      preparedStatement.setString(5, passport);
      preparedStatement.setString(6, address);
      preparedStatement.setString(7, date);
      preparedStatement.setString(8, gender);
      preparedStatement.setString(9, contact);
      preparedStatement.setBytes(10, userImage);
      preparedStatement.executeUpdate();

      JOptionPane.showMessageDialog(null, "Registration Created.........");

    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  } // GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:

    this.hide();
  } // GEN-LAST:event_jButton3ActionPerformed

  private javax.swing.JRadioButton r1;
  private final com.toedter.calendar.JDateChooser txtDOB = new com.toedter.calendar.JDateChooser();
  private final javax.swing.JTextField txtLastName = new javax.swing.JTextField();
  private final javax.swing.JTextField txtFirstName = new javax.swing.JTextField();
  private final javax.swing.JTextField txtNIC = new javax.swing.JTextField();
  private final javax.swing.JTextField txtPassport = new javax.swing.JTextField();
  private final javax.swing.JTextField txtContact = new javax.swing.JTextField();
  private final javax.swing.JLabel txtPhoto = new javax.swing.JLabel();
  private final javax.swing.JLabel txtID = new javax.swing.JLabel();
  private final javax.swing.JTextArea txtAddress = new javax.swing.JTextArea();
  // End of variables declaration//GEN-END:variables
}
