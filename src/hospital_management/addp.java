/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;
import java.sql.*;
/**
 *
 * @author AAYUSH_RANA
 */



public class addp extends javax.swing.JFrame {

    Connection con =null;
    public addp() {
        initComponents();
        
        con = dbcon.getCon();  
        System.out.println("Add drivers registerd!!!");
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addp_add = new javax.swing.JButton();
        l_name = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        l_age = new javax.swing.JLabel();
        cb_age = new javax.swing.JComboBox();
        l_mobile = new javax.swing.JLabel();
        tf_mobile = new javax.swing.JTextField();
        l_city = new javax.swing.JLabel();
        cb_city = new javax.swing.JComboBox();
        l_disease = new javax.swing.JLabel();
        cb_disease = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        l_msg = new javax.swing.JLabel();
        addp_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addp_add.setText("Save");
        addp_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addp_addActionPerformed(evt);
            }
        });

        l_name.setText("Name");

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        l_age.setText("Age");

        cb_age.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        l_mobile.setText("Mobile");

        tf_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mobileActionPerformed(evt);
            }
        });

        l_city.setText("City");

        cb_city.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select City-", "Dhampur", "Delhi", "Mumbai", "Ghaziabad", "Moradabad", "Meerut", "Bijnor", "Ahmadabad", "Bhubaneshwar", "Kota", "Jhansi", "Bareilly", "Aligarh", "Bhiwandi", "Jammu", "Mangalore", "Dehra Dun" }));

        l_disease.setText("Disease");

        cb_disease.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Disease-", "Cold", "Fever", "Thyphoid", "Nausea", "Headache", "Dijestive Disorder" }));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("New Patient Registration");

        addp_search.setText("Search");
        addp_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addp_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_age)
                            .addComponent(l_mobile)
                            .addComponent(l_city)
                            .addComponent(l_disease))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cb_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb_disease, javax.swing.GroupLayout.Alignment.LEADING, 0, 163, Short.MAX_VALUE)
                                .addComponent(tf_mobile, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel1))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(addp_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addp_search)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_age)
                    .addComponent(cb_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_mobile)
                    .addComponent(tf_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_city)
                    .addComponent(cb_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_disease)
                    .addComponent(cb_disease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addp_add)
                    .addComponent(addp_search))
                .addGap(18, 18, 18)
                .addComponent(l_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addp_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addp_addActionPerformed
        
        String Name = tf_name.getText();
        String Age = cb_age.getSelectedItem().toString();
        String Mobile = tf_mobile.getText();
        String City = cb_city.getSelectedItem().toString();
        String Disease = cb_disease.getSelectedItem().toString();
        try{
        Statement s=con.createStatement();
        String q="INSERT INTO `patient`(Name,Age,Mobile,City,Disease) VALUES('"+Name+"',"+Age+",'"+Mobile+"','"+City+"','"+Disease+"')";             
	//System.out.println(q);
	s.executeUpdate(q);
        
        l_msg.setText("-: Record Successfully Added!!! :-");
        }
        catch(Exception e)
        {
            l_msg.setText(e.toString());
        }
        //updatep u=new updatep("hello");
        //u.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_addp_addActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mobileActionPerformed

    private void addp_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addp_searchActionPerformed
        // TODO add your handling code here:
        searchp se = new searchp();
        se.setVisible(true);
    }//GEN-LAST:event_addp_searchActionPerformed

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
            java.util.logging.Logger.getLogger(addp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addp_add;
    private javax.swing.JButton addp_search;
    private javax.swing.JComboBox cb_age;
    private javax.swing.JComboBox cb_city;
    private javax.swing.JComboBox cb_disease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_age;
    private javax.swing.JLabel l_city;
    private javax.swing.JLabel l_disease;
    private javax.swing.JLabel l_mobile;
    private javax.swing.JLabel l_msg;
    private javax.swing.JLabel l_name;
    private javax.swing.JTextField tf_mobile;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
