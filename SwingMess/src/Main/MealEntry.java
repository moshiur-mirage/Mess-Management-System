/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Double.parseDouble;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author mirage
 */
public class MealEntry extends javax.swing.JFrame {

    /**
     * Creates new form MealEntry
     */
    public MealEntry() {
        initComponents();

        setDefaultCloseOperation(MealEntry.DISPOSE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        dispCombo();
        tableDb();

        Summery rp = new Summery();
        rp.loadAll();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        depId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMeal1 = new javax.swing.JTextField();
        addDate = new com.toedter.calendar.JDateChooser();

        jLabel5.setText("jLabel5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField4.setText("jTextField4");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meal Entry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 576, 29));

        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 71, -1, -1));

        jLabel3.setText("Meal :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel4.setText("Date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 155, -1, -1));

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Meal", "Date"
            }
        ));
        jScrollPane2.setViewportView(tableDisplay);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 490, 109));

        btnInsert.setText("save");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 90, 50));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 90, 50));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------Add Name-------" }));
        getContentPane().add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 66, 210, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 90, 50));

        jLabel6.setText("Deposit Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 209, -1, -1));
        getContentPane().add(depId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 210, -1));

        jLabel7.setText("(for update only)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));
        getContentPane().add(txtMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 110, 210, -1));
        getContentPane().add(addDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        btnSave();

    }//GEN-LAST:event_btnInsertActionPerformed

    public void tableDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DBConnection.getDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id, name ,meal,date from nn");

            tableDisplay.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void dispCombo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DBConnection.getDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from members");
            while (rs.next()) {
                jComboBox.addItem(rs.getString("name"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Connect to Database", "Error Connection", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }

    private void updateBtn() {
        String cmbValue, deposit, meal, iid;
        iid = depId.getText();
        int iiid = Integer.parseInt(depId.getText().replaceAll(" ", ""));

        cmbValue = jComboBox.getSelectedItem().toString();

        meal = txtMeal1.getText();
        String da = new SimpleDateFormat("yyyy-MM-dd").format(addDate.getDate());

        Connection con = null;
        Statement stmt = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("update nn set name= '" + cmbValue + "' , meal= '" + meal + "' , date= '" + da + "'  where id = '" + iiid + "'");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Update successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Update failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        tableDb();
    }

        private void btnSave() {

        String name, meal;
        name = jComboBox.getSelectedItem().toString();
        

        meal = txtMeal1.getText();
        String da = new SimpleDateFormat("yyyy-MM-dd").format(addDate.getDate());

        Connection con = null;
        Statement stmt = null;
        try {
            //Register the driver class
            Class.forName("com.mysql.jdbc.Driver");

            con = DBConnection.getDBConnection();
            //Create the Statement object
            stmt = con.createStatement();
            int count = 0;
            //Execute the query
            count = stmt.executeUpdate("insert into nn(name,meal,date) values('" + name + "','" + meal + "','" + da + "')");
            if (count > 0) {

                JOptionPane.showMessageDialog(this, "Saved successfully");

            } else {

                JOptionPane.showMessageDialog(this, "Saving failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        tableDb();

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //clear method here

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateBtn();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MealEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MealEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MealEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MealEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MealEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser addDate;
    private javax.swing.JButton btnInsert;
    private javax.swing.JTextField depId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableDisplay;
    private javax.swing.JTextField txtMeal1;
    // End of variables declaration//GEN-END:variables
}

class Member {

    private int sno;
    private String name, meal, date;

    public Member(int sno, String name, String meal, String date) {
        this.sno = sno;
        this.name = name;
        this.meal = meal;
        this.date = date;

    }

    public int getsno() {
        return sno;
    }

    public String getname() {
        return name;
    }

    public String getmeal() {
        return meal;
    }

    public String getdate() {
        return date;
    }
}
