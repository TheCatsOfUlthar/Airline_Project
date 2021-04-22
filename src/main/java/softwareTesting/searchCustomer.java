package softwareTesting;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The type Search customer.
 */
public class searchCustomer extends javax.swing.JInternalFrame {

  /** Creates new form addCustomer */
  public searchCustomer() {
    initComponents();
  }

  private Connection connection;
  private PreparedStatement preparedStatement;
  private Customer customer;
  private final Database database = new Database();

  private byte[] userImage = null;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */

  // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    JPanel jPanel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    txtLastName = new javax.swing.JTextField();
    txtFirstName = new javax.swing.JTextField();
    txtNIC = new javax.swing.JTextField();
    txtPassport = new javax.swing.JTextField();
    JScrollPane jScrollPane1 = new JScrollPane();
    txtAddress = new javax.swing.JTextArea();
    JLabel jLabel6 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    r1 = new javax.swing.JRadioButton();
    r2 = new javax.swing.JRadioButton();
    txtContact = new javax.swing.JTextField();
    txtPhoto = new javax.swing.JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    txtCustomerID = new javax.swing.JTextField();
    JButton jButton4 = new JButton();
    txtDOB = new com.toedter.calendar.JDateChooser();

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

    jLabel1.setName("First Name");
    jLabel2.setName("Last Name");
    jLabel3.setName("Nic No");
    jLabel4.setName("Passport ID");
    jLabel5.setName("Address");

    txtFirstName.setName("First Name");
    txtLastName.setName("Last Name");
    txtNIC.setName("Nic No");
    txtPassport.setName("Passport ID");

    txtAddress.setName("Address");

    txtCustomerID.setName("Customer ID");

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
    r1.setName("Male");

    r2.setText("Female");
    r2.setName("Female");

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

    jButton2.setText("Update");
    jButton2.addActionListener(this::jButton2ActionPerformed);

    jButton3.setText("Cancel");
    jButton3.addActionListener(this::jButton3ActionPerformed);

    jButton4.setText("Find");
    jButton4.addActionListener(this::jButton4ActionPerformed);

    jButton4.setName("Find");

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
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel6)
                                    .addGap(29, 29, 29)
                                    .addComponent(
                                        txtCustomerID,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        147,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(
                                        jPanel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jPanel2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        txtPhoto,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        250,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(337, 337, 337)
                                                    .addComponent(
                                                        jButton1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        87,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(
                                        jButton4,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        81,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(24, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(
                                txtCustomerID,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                    .addGap(38, 38, 38)
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

  private void txtLastNameActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_textLastNameActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_textLastNameActionPerformed

  private void txtPassportActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_textPassportActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_textPassportActionPerformed

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    getUserImage();
  } // GEN-LAST:event_jButton1ActionPerformed

  public void getUserImage() {
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
  }

  public void jButton2ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:

    String date = getDate();
    String gender;

    if (getR1ButtonSelected()) {
      gender = "Male";
    } else {
      gender = "Female";
    }

    customer = new Customer(txtFirstName.getText(), txtLastName.getText(), txtCustomerID.getText(),
            txtNIC.getText(), txtPassport.getText(), txtAddress.getText(), date, gender, txtContact.getText());

    updateCustomer(customer);

  } // GEN-LAST:event_jButton2ActionPerformed

  public boolean getR1ButtonSelected() {
    return r1.isSelected();
  }

  public String getDate() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(txtDOB.getDate());
  }

  public void updateCustomer(Customer customer) {
    try {

      boolean isWorkingDatabase = database.initializeDatabase();

      preparedStatement = database.setSQLQuery("UPDATE CUSTOMER SET firstName = ?, lastName = ?, NIC = ?, passport = ?, address= ?, DOB = ?, gender = ?, contact = ? WHERE ID = ?");

      preparedStatement.setString(1, customer.getFirstName());
      preparedStatement.setString(2, customer.getLastName());
      preparedStatement.setString(3, customer.getNIC());
      preparedStatement.setString(4, customer.getPassport());
      preparedStatement.setString(5, customer.getAddress());
      preparedStatement.setString(6, customer.getDob());
      preparedStatement.setString(7, customer.getGender());
      preparedStatement.setString(8, customer.getContact());
      preparedStatement.setString(9, customer.getID());
      int validID = database.executePreparedStatementUpdate(preparedStatement);

      if (validID == 0 || !isWorkingDatabase) {
        JOptionPane.showMessageDialog(null, "Enter a Valid Customer ID.");
      } else {
        JOptionPane.showMessageDialog(null, "Registration Updated");
      }

    } catch (SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void jButton3ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:

    this.hide();
  } // GEN-LAST:event_jButton3ActionPerformed

  private void jButton4ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:

    String ID = txtCustomerID.getText();
    searchCustomerInformation(ID, txtPhoto);

  } // GEN-LAST:event_jButton4ActionPerformed



  public void searchCustomerInformation(String ID, JLabel txtPhoto) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
              DriverManager.getConnection(
                      "jdbc:mysql://localhost/airline", "root", "Softwaretesting1!");
      preparedStatement = connection.prepareStatement("SELECT * FROM CUSTOMER WHERE ID = ?");
      preparedStatement.setString(1, ID);
      ResultSet resultSet = preparedStatement.executeQuery();

      if (!resultSet.next()) {
        JOptionPane.showMessageDialog(this, "Record not found");
      } else {
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        String NIC = resultSet.getString("NIC");
        String passport = resultSet.getString("passport");
        String address = resultSet.getString("address");
        String DOB = resultSet.getString("dob");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(DOB);
        String gender = resultSet.getString("gender");
        System.out.println(gender);

        Blob blob = resultSet.getBlob("photo");
        byte[] imageBytes = blob.getBytes(1, (int) blob.length());
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        Image image = imageIcon.getImage();
        Image myImage =
                image.getScaledInstance(txtPhoto.getWidth(), txtPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImage);

        if (gender.equals("Female")) {
          r1.setSelected(false);
          r2.setSelected(true);

        } else {
          r1.setSelected(true);
          r2.setSelected(false);
        }
        String contact = resultSet.getString("contact");

        txtFirstName.setText(firstName.trim());
        txtLastName.setText(lastName.trim());
        txtNIC.setText(NIC.trim());
        txtPassport.setText(passport.trim());
        txtAddress.setText(address.trim());
        txtContact.setText(contact.trim());
        txtDOB.setDate(date);
        txtPhoto.setIcon(newImage);
      }

    } catch (ClassNotFoundException | SQLException | ParseException ex) {
      Logger.getLogger(searchCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private javax.swing.JRadioButton r1;
  private javax.swing.JRadioButton r2;
  private javax.swing.JTextArea txtAddress;
  private javax.swing.JTextField txtContact;
  private javax.swing.JTextField txtCustomerID;
  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextField txtLastName;
  private javax.swing.JTextField txtNIC;
  private javax.swing.JTextField txtPassport;
  private javax.swing.JLabel txtPhoto;
  private com.toedter.calendar.JDateChooser txtDOB;
  // End of variables declaration//GEN-END:variables
}
