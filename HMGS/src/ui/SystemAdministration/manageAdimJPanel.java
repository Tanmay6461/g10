/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdministration;

import Business.Model.Canteen;
import Business.Model.EnterpriseDirectory;
import Business.Model.HealthClub;
import Business.Model.Lab;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.Pharmacy;
import Business.Model.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.main.Validator;

/**
 *
 * @author Tanmay Paawar
 */
public class manageAdimJPanel extends javax.swing.JPanel {
 private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public manageAdimJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Network network : systemAdmin.getListOfNetwork()) {
            cmbNetwork.addItem(network.getName());
        }
        populateTable();
      
        btnDelete.setOpaque(true);
       
        btnAdd.setOpaque(true);
        
        btnUpdate.setOpaque(true);
       
        btnBack.setOpaque(true);
    }

    public boolean validateName() {
        if (txtManagerName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (txtPassword.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageEnterpriseManagers = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtManagerName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cmbEnterpriseType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbEnterpriseName = new javax.swing.JComboBox<>();

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE ENTERPRISE MANAGERS");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115)
                    .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblsysadmin)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblManageEnterpriseManagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblManageEnterpriseManagers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE TYPE", "ENTERPRISE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageEnterpriseManagers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageEnterpriseManagersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageEnterpriseManagers);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtManagerName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtManagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagerNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("ENTERPRISE");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");

        cmbNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a network" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("MANAGER NAME");

        txtUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");

        txtPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        cmbEnterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a enterprise", "Lab", "Hotel", "Canteen", "Health Club" }));
        cmbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseTypeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("ENTERPRISE NAME");

        cmbEnterpriseName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbEnterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte name of enterprise" }));

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(140, 140, 140)
                                            .addComponent(cmbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(cmbEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(176, 176, 176)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(570, 570, 570)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 560, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblManageEnterpriseManagers.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Lab")) {
            for (Lab event : enterpriseDirec.getListOfEvents()) {
                for (Manager man : event.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        event.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Pharmacy")) {
            for (Pharmacy res : enterpriseDirec.getListOfRestaurants()) {
                for (Manager man : res.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        res.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Hotel")) {
            for (Canteen hotel : enterpriseDirec.getListOfHotel()) {
                for (Manager man : hotel.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        hotel.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblManageEnterpriseManagersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageEnterpriseManagersMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        if (tblManageEnterpriseManagers.getSelectedRowCount() != 1) {
            return;
        }

        String networkName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 0).toString();

        String eType = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 1).toString();
        String eName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 2).toString();

        String managerName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 3).toString();
        String managerUserName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 5).toString();

        txtManagerName.setText(managerName);
        txtUsername.setText(managerUserName);
        txtPassword.setText(managerPassword);

        cmbNetwork.setSelectedItem(networkName);
        cmbEnterpriseName.setSelectedItem(eName);
        cmbEnterpriseType.setSelectedItem(eType);
    }//GEN-LAST:event_tblManageEnterpriseManagersMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        Object row[] = new Object[10];
        String name = txtManagerName.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        String networkName = cmbNetwork.getSelectedItem().toString();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = cmbEnterpriseName.getSelectedItem().toString();
        String managerName = txtManagerName.getText();

        if (managerName == null) {
            JOptionPane.showMessageDialog(this, "Enter a Manager Name.");
            return;
        }

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, userName)
            || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!systemAdmin.userExistsInSystem(userName)) {
            Network network = systemAdmin.findNetwork(networkName);  //finiding network
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
                HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
                healthclubName1.addManager(name, userName, password);
                systemAdmin.getUserNamePasswordMap();
                systemAdmin.addUser(userName, password, "Health Club");
                row[0] = networkName;
                row[1] = "Health Club";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Lab") && enterpriseDirec != null) {
                Lab event1 = enterpriseDirec.findEvent(enterpriseName1);
                event1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Lab");
                row[0] = networkName;
                row[1] = "Lab";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Pharmacy") && enterpriseDirec != null) {
                Pharmacy res1 = enterpriseDirec.findRestaurant(enterpriseName1);
                res1.addManager(userName, userName, password);
                systemAdmin.addUser(userName, password, "Pharmacy");

                row[0] = networkName;
                row[1] = "Pharmacy";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
                Canteen hotel1 = enterpriseDirec.findHotel(enterpriseName1);
                hotel1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Hotel");
                row[0] = networkName;
                row[1] = "Hotel";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, String.format("This username '%s' already exists", userName));
        }
        JOptionPane.showMessageDialog(this, "Manager added successfully");
        txtManagerName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        cmbEnterpriseName.setSelectedIndex(0);
        cmbEnterpriseType.setSelectedIndex(0);
        cmbNetwork.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagerNameActionPerformed

    }//GEN-LAST:event_txtManagerNameActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblManageEnterpriseManagers.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        String networkName = cmbNetwork.getSelectedItem().toString();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();
        String enterpriseName1 = cmbEnterpriseName.getSelectedItem().toString();
        String managerUserName = txtUsername.getText();

        String password = txtPassword.getText();
        String name = txtManagerName.getText();

        Network network = systemAdmin.findNetwork(networkName);  //finiding network
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();

        if (enterpriseType1.equals("Health Club")) {
            HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
            for (Manager man : healthclubName1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Lab")) {
            Lab event1 = enterpriseDirec.findEvent(enterpriseName1);
            for (Manager man : event1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Hotel")) {
            Canteen hotel = enterpriseDirec.findHotel(enterpriseName1);
            for (Manager man : hotel.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Pharmacy")) {
            Pharmacy res = enterpriseDirec.findRestaurant(enterpriseName1);
            for (Manager man : res.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {
                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);

                    populateTable();
                    JOptionPane.showMessageDialog(this, "Updated successfully ");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid enterprise [" + enterpriseType1 + "]");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseTypeActionPerformed
        cmbEnterpriseName.removeAllItems();
        String networkName = cmbNetwork.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();
        if (enterpriseType1.equals("Health Club")) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                cmbEnterpriseName.addItem(club.getName());
            }
        } else if (enterpriseType1.equals("Lab")) {
            for (Lab event : enterpriseDirec.getListOfEvents()) {
                cmbEnterpriseName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Pharmacy")) {
            for (Pharmacy res : enterpriseDirec.getListOfRestaurants()) {
                cmbEnterpriseName.addItem(res.getName());
            }
        } else if (enterpriseType1.equals("Hotel")) {
            for (Canteen hotel : enterpriseDirec.getListOfHotel()) {
                cmbEnterpriseName.addItem(hotel.getName());
            }
        } else {
            return;
        }
    }//GEN-LAST:event_cmbEnterpriseTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbEnterpriseName;
    private javax.swing.JComboBox<String> cmbEnterpriseType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblManageEnterpriseManagers;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Network network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();  //populate enterpirse name
            for (Lab event : enterpriseDirec.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Lab";
                row[2] = event.getName();
                for (Manager manager : event.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Lab";
                    row[2] = event.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Pharmacy res : enterpriseDirec.getListOfRestaurants()) {   //poplulate restauarant enterprise
                row[1] = "Pharmacy";
                row[2] = res.getName();
                for (Manager manager : res.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Pharmacy";
                    row[2] = res.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Canteen hotel : enterpriseDirec.getListOfHotel()) {   //poplulate hotel enterprise
                row[1] = "Hotel";
                row[2] = hotel.getName();
                for (Manager manager : hotel.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Hotel";
                    row[2] = hotel.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {   //poplulate hotel enterprise
                row[1] = "Health Club";
                row[2] = health.getName();
                for (Manager manager : health.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Health Club";
                    row[2] = health.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}
