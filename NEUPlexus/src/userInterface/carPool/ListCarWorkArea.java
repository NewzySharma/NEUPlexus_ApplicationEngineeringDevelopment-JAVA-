/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.carPool;

import business.carpool.CarInfo;
import business.dataoperations.DataStore;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.java2d.pipe.SpanShapeRenderer;
import userInterface.authentication.UserLogin;
import userInterface.homeSceen.NeuPlexusHome;

/**
 *
 * @author newzysharma
 */
public class ListCarWorkArea extends javax.swing.JPanel {
private JPanel panelRight;
private DataStore datastore;
    /**
     * Creates new form ListCarWorkArea
     */
    public ListCarWorkArea(JPanel panelRight,DataStore datastore) {
        initComponents();
          this.panelRight=panelRight;
          this.datastore =datastore;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtcname = new javax.swing.JTextField();
        jtxtccolor = new javax.swing.JTextField();
        jtxtctype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtstartpt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtdropoffpt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtoccupancy = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtflexdistance = new javax.swing.JTextField();
        jbtnBack = new javax.swing.JButton();
        jbtnProceed = new javax.swing.JButton();
        jtxtcmodel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtfdate = new org.jdesktop.swingx.JXDatePicker();
        jtxttdate = new org.jdesktop.swingx.JXDatePicker();
        jtxtftime = new javax.swing.JComboBox<>();
        jtxtttime = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Name");

        jLabel2.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Color");

        jLabel3.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Type");

        jLabel4.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From Date");

        jLabel5.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To Date");

        jLabel6.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("From Time");

        jLabel7.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("To Time");

        jtxtcname.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcnameActionPerformed(evt);
            }
        });

        jtxtccolor.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtccolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtccolorActionPerformed(evt);
            }
        });

        jtxtctype.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIST YOUR CAR");

        jLabel9.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Starting Point");

        jtxtstartpt.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtstartpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstartptActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Drop Off Point");

        jtxtdropoffpt.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Occupancy");

        jtxtoccupancy.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtoccupancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtoccupancyActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pick up Distance");

        jtxtflexdistance.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtflexdistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtflexdistanceActionPerformed(evt);
            }
        });

        jbtnBack.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBack.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        jbtnBack.setText("BACK");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jbtnProceed.setBackground(new java.awt.Color(0, 0, 0));
        jbtnProceed.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnProceed.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        jbtnProceed.setText("SUBMIT");
        jbtnProceed.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProceedActionPerformed(evt);
            }
        });

        jtxtcmodel.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("People");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mile(s)");

        jLabel16.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Car Model");

        jtxtfdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfdateActionPerformed(evt);
            }
        });

        jtxttdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttdateActionPerformed(evt);
            }
        });

        jtxtftime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "06:00 PM", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM" }));

        jtxtttime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "06:00 PM", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtccolor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtstartpt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtxtflexdistance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                                .addComponent(jtxtoccupancy, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(jtxtctype, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxtftime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtfdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtdropoffpt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtcmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtxtttime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtxttdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(607, 607, 607)
                        .addComponent(jbtnBack)
                        .addGap(92, 92, 92)
                        .addComponent(jbtnProceed)))
                .addContainerGap(839, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel8)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4))
                    .addComponent(jtxtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtccolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jtxtfdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxttdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jtxtftime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtstartpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtdropoffpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtoccupancy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtflexdistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBack)
                    .addComponent(jbtnProceed))
                .addContainerGap(636, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcnameActionPerformed

    private void jtxtccolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtccolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtccolorActionPerformed

    private void jtxtstartptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstartptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstartptActionPerformed

    private void jtxtoccupancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtoccupancyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtoccupancyActionPerformed

    private void jtxtflexdistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtflexdistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtflexdistanceActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:
        panelRight.remove(this);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProceedActionPerformed
        // TODO add your handling code here:
        CarInfo info = carInfo();
       
        CardLayout layout= (CardLayout)panelRight.getLayout();
        panelRight.add("confirmCarListDetails", new ConfirmCarListDetails(panelRight,datastore,info));
        layout.next(panelRight);
        
        
    }//GEN-LAST:event_jbtnProceedActionPerformed

    private void jtxtfdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfdateActionPerformed

    private void jtxttdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnProceed;
    private javax.swing.JTextField jtxtccolor;
    private javax.swing.JTextField jtxtcmodel;
    private javax.swing.JTextField jtxtcname;
    private javax.swing.JTextField jtxtctype;
    private javax.swing.JTextField jtxtdropoffpt;
    private org.jdesktop.swingx.JXDatePicker jtxtfdate;
    private javax.swing.JTextField jtxtflexdistance;
    private javax.swing.JComboBox<String> jtxtftime;
    private javax.swing.JTextField jtxtoccupancy;
    private javax.swing.JTextField jtxtstartpt;
    private org.jdesktop.swingx.JXDatePicker jtxttdate;
    private javax.swing.JComboBox<String> jtxtttime;
    // End of variables declaration//GEN-END:variables

   private boolean validateNumber(String str){
       if(str.length() ==1 && str.matches("[1-7]*")){
           return true;
       }
       return false;
   }
    
   
   
   
   
private CarInfo carInfo() {
     CarInfo info = new CarInfo();

    try {
        if(!jtxtcname.getText().equals("") && !jtxtccolor.getText().equals("") && !jtxtcmodel.getText().equals("") 
                && !jtxtctype.getText().equals("") && !jtxtstartpt.getText().equals("") && !jtxtdropoffpt.getText().equals("") &&
               !jtxtoccupancy.getText().equals(""))
                
        {
   
    info.setCarName(jtxtcname.getText());
    info.setCarColor(jtxtccolor.getText());
    info.setCarModel(jtxtcmodel.getText());
    info.setCarType(jtxtctype.getText());
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    info.setFromDate(jtxtfdate.getDate());
    info.setToDate(jtxttdate.getDate());
    
    DateFormat timeFormat = new SimpleDateFormat("HH:mm");
    info.setFromTime(jtxtftime.getSelectedItem().toString());
    info.setToTime(jtxtttime.getSelectedItem().toString());
    info.setListingNo(0);
    info.setStartPoint(jtxtstartpt.getText());
    info.setDropOffPoint(jtxtdropoffpt.getText());
    info.setOccupancy(Integer.parseInt(jtxtoccupancy.getText()));
    info.setPostingUserName(NeuPlexusHome.useraccount.getUserName());
    
     JOptionPane.showMessageDialog(null, "Car Detail Saved Successfully!", "Warning", JOptionPane.INFORMATION_MESSAGE);
    jtxtcname.setText("");
            jtxtccolor.setText("");
            jtxtcmodel.setText("");
                    jtxtctype.setText("");
                   // jtxtfdate.setText("");
                          //  jtxttdate.setText("");
                           // jtxtftime.setText("");
                                  //  jtxtttime.setText("");
                                    jtxtstartpt.setText("");
                                            jtxtdropoffpt.setText("");
                                            jtxtoccupancy.setText("");
                                            jtxtflexdistance.setText("");
                    
    }
        else 
            {
               JOptionPane.showMessageDialog(null, "One or more fields is empty"); 
            }
    }
    catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(null, "Please enter valid values");}
        catch (Exception e ){System.out.println(e.getMessage());
            
            }
    
    
    
    return info;
}








}