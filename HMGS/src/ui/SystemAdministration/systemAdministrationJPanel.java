/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdministration;

import Business.Model.SystemAdmin;

/**
 *
 * @author Tanmay Paawar
 */
public class systemAdministrationJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;
    /**
     * Creates new form systemAdministrationJPanel
     */
    public systemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
         initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
       // setBackground(new java.awt.Color(255, 204, 204));

        
        btnManageNetworks.setOpaque(true);
        
        btnManageCustomers.setOpaque(true);
        
        btnManageManagers.setOpaque(true);
        
        btnManageEnterprises.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        btnManageNetworks = new javax.swing.JButton();
        btnManageEnterprises = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnManageManagers = new javax.swing.JButton();

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblsysadmin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnManageNetworks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageNetworks.setText("MANAGE NETWORKS");
        btnManageNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworksActionPerformed(evt);
            }
        });

        btnManageEnterprises.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageEnterprises.setText("MANAGE ENTERPRISES");
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });

        btnManageCustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageCustomers.setText("MANAGE PATIENT");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageManagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageManagers.setText("ADMIN ");
        btnManageManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageManagersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnManageNetworks, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addComponent(btnManageEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnManageManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 143, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnManageNetworks, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnManageEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(142, 142, 142)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnManageManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 143, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworksActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnManageNetworksActionPerformed

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_btnManageEnterprisesActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageManagersActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnManageManagersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JButton btnManageManagers;
    private javax.swing.JButton btnManageNetworks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}