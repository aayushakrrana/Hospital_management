/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.sql.*;
import java.util.Vector;

/**
 *
 * @author AAYUSH_RANA
 */
public class updatep extends javax.swing.JFrame {

    
    static String s="";
    int id;
    Connection con =null;
    public updatep(String s) {
        initComponents();
        con = dbcon.getCon();  
        //tf_name.setText(s);
         id = Integer.parseInt(s);
         try{
        Statement st=con.createStatement();
        String q="SELECT * FROM `patient`WHERE Id= "+id+"";             
	//System.out.println(q);
	st.executeQuery(q);
        ResultSet rs = st.getResultSet();
        Vector list_ = new Vector();
        while (rs.next()) {
            //id_= rs.getString(1);
            tf_name.setText(rs.getString(2));
            
            //cb_age.set
            l_pre_age.setText(rs.getString(3));
            tf_mobile.setText(rs.getString(4));
            l_pre_city.setText(rs.getString(5));
            l_pre_disease.setText(rs.getString(6));
                       
        }
       
        l_msg.setText("-: Record Successfully Imported!!! :-");
        }
        catch(Exception e)
        {
            l_msg.setText(e.toString());
            //System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_name = new javax.swing.JLabel();
        addp_add = new javax.swing.JButton();
        cb_city = new javax.swing.JComboBox();
        l_mobile = new javax.swing.JLabel();
        cb_age = new javax.swing.JComboBox();
        l_age = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        l_city = new javax.swing.JLabel();
        tf_mobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        l_msg = new javax.swing.JLabel();
        l_disease = new javax.swing.JLabel();
        cb_disease = new javax.swing.JComboBox();
        l_pre_disease = new javax.swing.JLabel();
        l_pre_city = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l_pre_age = new javax.swing.JLabel();
        updatep_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        l_name.setText("Name");

        addp_add.setText("Save");
        addp_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addp_addActionPerformed(evt);
            }
        });

        cb_city.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select City-", "Dhampur", "Delhi", "Mumbai", "Ghaziabad", "Moradabad", "Meerut", "Bijnor", "Ahmadabad", "Bhubaneshwar", "Kota", "Jhansi", "Bareilly", "Aligarh", "Bhiwandi", "Jammu", "Mangalore", "Dehra Dun" }));

        l_mobile.setText("Mobile");

        cb_age.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        l_age.setText("Age");

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        l_city.setText("City");

        tf_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mobileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("Update Registration");

        l_disease.setText("Disease");

        cb_disease.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Disease-", "Cold", "Fever", "Thyphoid", "Nausea", "Headache", "Dijestive Disorder" }));

        l_pre_age.setText("  ");

        updatep_search.setText("Search");
        updatep_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatep_searchActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cb_disease, 0, 163, Short.MAX_VALUE)
                            .addComponent(tf_mobile)
                            .addComponent(cb_city, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_pre_disease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_pre_city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_pre_age, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addComponent(updatep_search))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(addp_add)))
                .addContainerGap(26, Short.MAX_VALUE))
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_pre_age))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_mobile)
                    .addComponent(tf_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_city)
                    .addComponent(l_pre_city, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_disease)
                    .addComponent(l_pre_disease, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_disease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addp_add)
                    .addComponent(updatep_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
            Statement st=con.createStatement();
            String q="UPDATE `patient`SET Name ='"+Name+"',Age="+Age+",Mobile='"+Mobile+"',City='"+City+"',Disease='"+Disease+"' WHERE Id="+id+" ";
            //System.out.println(q);
            st.executeUpdate(q);

            l_msg.setText("-: Record Successfully Updated!!! :-");
        }
        catch(Exception e)
        {
            l_msg.setText(e.toString());
        }
        
    }//GEN-LAST:event_addp_addActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mobileActionPerformed

    private void updatep_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatep_searchActionPerformed
        searchp se = new searchp();
        se.setVisible(true);
    }//GEN-LAST:event_updatep_searchActionPerformed

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
            java.util.logging.Logger.getLogger(updatep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatep(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addp_add;
    private javax.swing.JComboBox cb_age;
    private javax.swing.JComboBox cb_city;
    private javax.swing.JComboBox cb_disease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l_age;
    private javax.swing.JLabel l_city;
    private javax.swing.JLabel l_disease;
    private javax.swing.JLabel l_mobile;
    private javax.swing.JLabel l_msg;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_pre_age;
    private javax.swing.JLabel l_pre_city;
    private javax.swing.JLabel l_pre_disease;
    private javax.swing.JTextField tf_mobile;
    private javax.swing.JTextField tf_name;
    private javax.swing.JButton updatep_search;
    // End of variables declaration//GEN-END:variables
}
