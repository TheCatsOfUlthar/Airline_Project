package softwareTesting;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/** The type Main. */
public class Main extends javax.swing.JFrame {

  /** Creates new form Main */
  public Main() {
    initComponents();
  }

  public JMenu jMenu1;
  public JMenu jMenu2;
  public JMenu jMenu3;
  public JMenu jMenu4;
  public JMenuBar jMenuBar1;
  public JMenuItem jMenuItem1;
  public JMenuItem jMenuItem2;
  public JMenuItem jMenuItem3;
  public JMenuItem jMenuItem4;
  public JMenuItem jMenuItem5;
  public JMenuItem jMenuItem6;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  public void initComponents() {

    jDesktopPane1 = new javax.swing.JDesktopPane();
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenu1 = new JMenu();
    JMenuItem jMenuItem1 = new JMenuItem();
    JMenuItem jMenuItem2 = new JMenuItem();
    JMenu jMenu2 = new JMenu();
    JMenuItem jMenuItem3 = new JMenuItem();
    JMenuItem jMenuItem6 = new JMenuItem();
    JMenu jMenu3 = new JMenu();
    JMenuItem jMenuItem4 = new JMenuItem();
    JMenu jMenu4 = new JMenu();
    JMenuItem jMenuItem5 = new JMenuItem();

    jMenu1.setName("Customer");
    jMenu2.setName("Tickets");
    jMenu3.setName("Flight");
    jMenu4.setName("User");
    jMenuItem1.setName("Add Customer");
    jMenuItem2.setName("Search Customer");
    jMenuItem3.setName("Book Ticket");
    jMenuItem4.setName("Add Flight");
    jMenuItem5.setName("User Creation");
    jMenuItem6.setName("Ticket Report");


    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1366, 768));

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE));
    jDesktopPane1Layout.setVerticalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE));

    jMenu1.setText("Customer");
    jMenu1.setName("Customer");

    jMenuItem1.setText("Add Customer");
    jMenuItem1.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
          }
        });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setText("Search Customer");
    jMenuItem2.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
          }
        });
    jMenu1.add(jMenuItem2);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Tickets");

    jMenuItem3.setText("Book Ticket");
    jMenuItem3.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
          }
        });
    jMenu2.add(jMenuItem3);

    jMenuItem6.setText("Ticket Report");
    jMenuItem6.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
          }
        });
    jMenu2.add(jMenuItem6);

    jMenuBar1.add(jMenu2);

    jMenu3.setText("Flight");

    jMenuItem4.setText("Add Flight");
    jMenuItem4.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
          }
        });
    jMenu3.add(jMenuItem4);

    jMenuBar1.add(jMenu3);

    jMenu4.setText("User");

    jMenuItem5.setText("UserCreation");
    jMenuItem5.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
          }
        });
    jMenu4.add(jMenuItem5);

    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1));


    pack();
  } // </editor-fold>//GEN-END:initComponents

  public void jMenuItem1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem1ActionPerformed
    // TODO add your handling code here:

    addCustomer cus = new addCustomer();
    jDesktopPane1.add(cus);
    cus.setVisible(true);
  } // GEN-LAST:event_jMenuItem1ActionPerformed

  public void jMenuItem2ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem2ActionPerformed
    // TODO add your handling code here:

    searchCustomer scus = new searchCustomer();
    jDesktopPane1.add(scus);
    scus.setVisible(true);
  } // GEN-LAST:event_jMenuItem2ActionPerformed


  public void jMenuItem4ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem4ActionPerformed
    // TODO add your handling code here:
    addflight f = new addflight();
    jDesktopPane1.add(f);
    f.setVisible(true);
  } // GEN-LAST:event_jMenuItem4ActionPerformed

  public void jMenuItem3ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem3ActionPerformed
    // TODO add your handling code here:
    ticket t = new ticket();
    jDesktopPane1.add(t);
    t.setVisible(true);
  } // GEN-LAST:event_jMenuItem3ActionPerformed

  public void jMenuItem6ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem6ActionPerformed
    // TODO add your handling code here:

    ticketreport ti = new ticketreport();
    jDesktopPane1.add(ti);
    ti.setVisible(true);
  } // GEN-LAST:event_jMenuItem6ActionPerformed

  public void jMenuItem5ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem5ActionPerformed
    // TODO add your handling code here:

    userCreation u = new userCreation();
    jDesktopPane1.add(u);
    u.setVisible(true);
  } // GEN-LAST:event_jMenuItem5ActionPerformed

  /**
   * The entry point of application.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
/*    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }*/
    // </editor-fold>

    javax.swing.UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new Main().setVisible(true);
          }
        });
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JDesktopPane jDesktopPane1;
  // End of variables declaration//GEN-END:variables
}
