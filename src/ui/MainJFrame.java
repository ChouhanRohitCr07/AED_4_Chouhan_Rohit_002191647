/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.ClinicSystem;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalSignHistory;

/**
 *
 * @author jarvis
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    ClinicSystem clinicSystem;
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    VitalSignHistory vitalSignHistory;
    
    
    
    
    
    public MainJFrame() {
        initComponents();
        clinicSystem = new ClinicSystem();
        personDirectory = clinicSystem.getPersonDirectory();
        patientDirectory = clinicSystem.getPatientDirectory();
        vitalSignHistory = clinicSystem.getVitalSignHistory();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        jControlPane = new javax.swing.JPanel();
        jBtnCreatePerson = new javax.swing.JButton();
        btnViewPersonDirectory = new javax.swing.JButton();
        btnViewPatientDirectory = new javax.swing.JButton();
        jBtnAddPatient = new javax.swing.JButton();
        jWorkAreaPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnCreatePerson.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jBtnCreatePerson.setText("Create Person");
        jBtnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreatePersonActionPerformed(evt);
            }
        });

        btnViewPersonDirectory.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnViewPersonDirectory.setText("View Person Directory");
        btnViewPersonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonDirectoryActionPerformed(evt);
            }
        });

        btnViewPatientDirectory.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnViewPatientDirectory.setText("View Patient Directory");
        btnViewPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDirectoryActionPerformed(evt);
            }
        });

        jBtnAddPatient.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jBtnAddPatient.setText("Add Patient");
        jBtnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jControlPaneLayout = new javax.swing.GroupLayout(jControlPane);
        jControlPane.setLayout(jControlPaneLayout);
        jControlPaneLayout.setHorizontalGroup(
            jControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControlPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jControlPaneLayout.createSequentialGroup()
                        .addComponent(jBtnCreatePerson)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jControlPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jControlPaneLayout.createSequentialGroup()
                                .addComponent(btnViewPersonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(btnViewPatientDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAddPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jControlPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewPatientDirectory, btnViewPersonDirectory, jBtnAddPatient, jBtnCreatePerson});

        jControlPaneLayout.setVerticalGroup(
            jControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControlPaneLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jBtnCreatePerson)
                .addGap(18, 18, 18)
                .addComponent(btnViewPersonDirectory)
                .addGap(18, 18, 18)
                .addComponent(jBtnAddPatient)
                .addGap(19, 19, 19)
                .addComponent(btnViewPatientDirectory)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jControlPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnViewPersonDirectory, jBtnCreatePerson});

        jSplitPane.setLeftComponent(jControlPane);

        javax.swing.GroupLayout jWorkAreaPaneLayout = new javax.swing.GroupLayout(jWorkAreaPane);
        jWorkAreaPane.setLayout(jWorkAreaPaneLayout);
        jWorkAreaPaneLayout.setHorizontalGroup(
            jWorkAreaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        jWorkAreaPaneLayout.setVerticalGroup(
            jWorkAreaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jWorkAreaPane);

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreatePersonActionPerformed
        // TODO add your handling code here:
        
//        CreatePersonJPanel createPersonJPanel = new CreatePersonJPanel(jWorkAreaPane, personDirectory);
//        jWorkAreaPane.add("CreatePersonJPanel", createPersonJPanel);
//        CardLayout layout = (CardLayout)jWorkAreaPane.getLayout();
//        layout.next(jWorkAreaPane);
        CreatePersonJPanel createPersonJPanel= new CreatePersonJPanel(personDirectory);
        jSplitPane.setRightComponent(createPersonJPanel);
        
    }//GEN-LAST:event_jBtnCreatePersonActionPerformed

    private void btnViewPersonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonDirectoryActionPerformed
        // TODO add your handling code here:
        ViewPersonDirectoryJPanel viewPersonDirectoryJPanel= new ViewPersonDirectoryJPanel(personDirectory);
        jSplitPane.setRightComponent(viewPersonDirectoryJPanel);
        

    }//GEN-LAST:event_btnViewPersonDirectoryActionPerformed

    private void btnViewPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDirectoryActionPerformed
        // TODO add your handling code here:
        ViewPatientDirectoryJPanel viewPatientDirectoryJPanel = new ViewPatientDirectoryJPanel(vitalSignHistory);
        jSplitPane.setRightComponent(viewPatientDirectoryJPanel);
        
    }//GEN-LAST:event_btnViewPatientDirectoryActionPerformed

    private void jBtnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddPatientActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel addPatientJPanel= new AddPatientJPanel(vitalSignHistory,personDirectory);
        jSplitPane.setRightComponent(addPatientJPanel);
        
    }//GEN-LAST:event_jBtnAddPatientActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewPatientDirectory;
    private javax.swing.JButton btnViewPersonDirectory;
    private javax.swing.JButton jBtnAddPatient;
    private javax.swing.JButton jBtnCreatePerson;
    private javax.swing.JPanel jControlPane;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel jWorkAreaPane;
    // End of variables declaration//GEN-END:variables
}
