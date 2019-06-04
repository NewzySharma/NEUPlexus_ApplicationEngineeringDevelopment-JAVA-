/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.carPool;

import business.dataoperations.DataStore;
import business.enterprise.Enterprise;
import business.role.Role;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author newzysharma
 */
public class CarPoolWorkArea extends javax.swing.JPanel {
private JPanel panelRight;
private DataStore datastore;
    /**
     * Creates new form CarPoolWorkArea
     */
    public CarPoolWorkArea(JPanel panelRight,Enterprise enterprise,DataStore datastore) {
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

        jbtnListaCar = new javax.swing.JButton();
        jbtnBookacar = new javax.swing.JButton();
        jbtnViewbookings = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jbtnListaCar.setBackground(new java.awt.Color(153, 0, 0));
        jbtnListaCar.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnListaCar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnListaCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imageedit_1_2774063214.png"))); // NOI18N
        jbtnListaCar.setText("Offer a ride");
        jbtnListaCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListaCarActionPerformed(evt);
            }
        });

        jbtnBookacar.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBookacar.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnBookacar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBookacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jbtnBookacar.setText("Find a ride");
        jbtnBookacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBookacarActionPerformed(evt);
            }
        });

        jbtnViewbookings.setBackground(new java.awt.Color(153, 0, 0));
        jbtnViewbookings.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnViewbookings.setForeground(new java.awt.Color(255, 255, 255));
        jbtnViewbookings.setText("View Bookings");
        jbtnViewbookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewbookingsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAR POOL WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(712, 712, 712)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnBookacar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnViewbookings)
                            .addComponent(jbtnListaCar))))
                .addContainerGap(1345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jbtnListaCar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jbtnBookacar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jbtnViewbookings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnListaCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListaCarActionPerformed
        // TODO add your handling code here:
        CardLayout layout= (CardLayout)panelRight.getLayout();
        panelRight.add("listYourCar", new ListCarWorkArea(panelRight,datastore));
        layout.next(panelRight);
    }//GEN-LAST:event_jbtnListaCarActionPerformed

    private void jbtnBookacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBookacarActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add("bookCarWorkArea",new BookCarWorkArea( panelRight,datastore));
        layout.next(panelRight);
    }//GEN-LAST:event_jbtnBookacarActionPerformed

    private void jbtnViewbookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewbookingsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add("viewbookings",new ViewBookings( panelRight,datastore));
        layout.next(panelRight);
    }//GEN-LAST:event_jbtnViewbookingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnBookacar;
    private javax.swing.JButton jbtnListaCar;
    private javax.swing.JButton jbtnViewbookings;
    // End of variables declaration//GEN-END:variables
}
