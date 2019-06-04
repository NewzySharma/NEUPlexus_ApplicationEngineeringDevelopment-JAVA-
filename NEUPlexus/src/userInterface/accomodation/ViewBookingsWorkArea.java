/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.accomodation;

import business.accomodation.Accomodation;
import business.accomodation.AccomodationDirectory;
import business.carpool.BookingDetails;
import business.carpool.CarDirectory;
import business.carpool.CarInfo;
import business.dataoperations.DataStore;
import business.management.AccomodationListRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.homeSceen.NeuPlexusHome;
import utils.EmailClient;
import org.apache.log4j.Logger;

/**
 *
 * @author newzysharma
 */
public class ViewBookingsWorkArea extends javax.swing.JPanel {
    
    private JPanel panelRight;
    private DataStore datastore;
    final static Logger logger = Logger.getLogger(ViewBookingsWorkArea.class.getName());
    /**
     * Creates new form ViewBookingsWorkArea
     */
    public ViewBookingsWorkArea(JPanel panelRight, DataStore datastore) {
        initComponents();
        this.panelRight = panelRight;
        this.datastore = datastore;
        printBookingListTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jBookingTable = new javax.swing.JTable();
        jbtnViewDetails = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW BOOOKING WORK AREA");

        jBookingTable.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ref No", "Accomodation List No.", "Booking Username", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jBookingTable);

        jbtnViewDetails.setBackground(new java.awt.Color(0, 0, 0));
        jbtnViewDetails.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        jbtnViewDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jbtnViewDetails.setText("CANCEL BOOKING");
        jbtnViewDetails.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewDetailsActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(667, 667, 667)
                        .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnViewDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBack)
                    .addComponent(jbtnViewDetails))
                .addContainerGap(579, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    
  
    
    private void jbtnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewDetailsActionPerformed
        try{
        int selected = jBookingTable.getSelectedRow();
        if(selected>=0){
            Accomodation a= (Accomodation)jBookingTable.getValueAt(selected, 1);
            AccomodationDirectory adir = datastore.getApprovedaccdir();
                 for(Accomodation acc:adir.getAccList()){ 
                     if(acc.getAccListNo()==a.getAccListNo()){
             
                         if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                               acc.setBooked(false);
                               acc.setBookingUserNames(null);
      JOptionPane.showMessageDialog(null, "Booking canceled successfully!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                          //send email to booking user nd owner
                          if(NeuPlexusHome.useraccount.getUserName().equalsIgnoreCase(a.getBookingUserNames().getUserID())){
                          EmailClient.sendEmail(NeuPlexusHome.useraccount.getUserName(), "Accomodation booking canceled!", "You have canceled your accomodation booking with user "+acc.getOwnerUserName());
                          EmailClient.sendEmail(acc.getOwnerUserName(), "Accomodation booking canceled!", "User "+acc.getBookingUserNames().getUserID()+" canceled accomodation booking with you");
                          }
                          //email to owner and booking user 
                          if(NeuPlexusHome.useraccount.getUserName().equalsIgnoreCase(acc.getOwnerUserName())){ //then send email to booking user
                          EmailClient.sendEmail(acc.getOwnerUserName(), "Accomodation booking canceled!", "You have canceled your accomodation booking with user "+acc.getBookingUserNames().getUserID());
                          EmailClient.sendEmail(acc.getBookingUserNames().getUserID(), "Accomodation booking canceled!", "User "+acc.getOwnerUserName()+" canceled your accomodation booking");
                          }
                          printBookingListTable();
                          break;
                     }
                  else {
   
}
                        
                 }
                 }
        }
        }catch(Exception e){
            logger.error("Exception while deleting accommodation "+e.getStackTrace());
        }
        
    }//GEN-LAST:event_jbtnViewDetailsActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
 panelRight.remove(this);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_jbtnBackActionPerformed
 private void printBookingListTable() {
       
     AccomodationDirectory adir = datastore.getApprovedaccdir();
       
        DefaultTableModel m = (DefaultTableModel) jBookingTable.getModel();
          m.setRowCount(0);
        for(Accomodation a:adir.getAccList()){
            if(a.getBookingUserNames()!=null){
                if(a.getOwnerUserName().equalsIgnoreCase(NeuPlexusHome.useraccount.getUserName()) || a.getBookingUserNames().getUserID().equalsIgnoreCase(NeuPlexusHome.useraccount.getUserName())){
                   BookingDetails b = a.getBookingUserNames();
                    m.addRow(new Object[]{b.getBookingId(),a,b,b.getDate(),b.getTime()});
                }
            }
        }
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jBookingTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnViewDetails;
    // End of variables declaration//GEN-END:variables
}