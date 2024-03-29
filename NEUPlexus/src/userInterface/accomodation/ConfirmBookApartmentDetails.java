/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.accomodation;

import business.accomodation.Accomodation;
import business.dataoperations.DataStore;
import business.management.AccomodationListRequest;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author newzysharma
 */
public class ConfirmBookApartmentDetails extends javax.swing.JPanel {
    
    private JPanel panelRight;
    private DataStore datastore;
    private AccomodationListRequest listRequest;
    private Accomodation accomodation;
    final static Logger logger = Logger.getLogger(ConfirmBookApartmentDetails.class.getName());
  
    /**
     * Creates new form ConfirmBookApartmentDetails
     */

    
    public ConfirmBookApartmentDetails() {
        initComponents();
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
        jtxtupload = new javax.swing.JTextField();
        jbtnBrowse = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jbtnConfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        docType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Upload Your Documents");

        jtxtupload.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jbtnBrowse.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBrowse.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Browse.png"))); // NOI18N
        jbtnBrowse.setText("BROWSE");
        jbtnBrowse.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnBrowse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
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

        jbtnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        jbtnConfirm.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        jbtnConfirm.setText("CONFIRM");
        jbtnConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnConfirm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOCUMENTS REQUIRED FOR VERIFICATION");

        docType.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        docType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driving License", "Passport" }));

        jLabel3.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Document Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(648, 648, 648)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnConfirm)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtupload, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jbtnBrowse))
                            .addComponent(docType, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jbtnBrowse, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jtxtupload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConfirm)
                    .addComponent(jbtnBack))
                .addContainerGap(732, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public ConfirmBookApartmentDetails(JPanel panelRight,DataStore datastore,Accomodation accomodation){
          initComponents();
          this.panelRight=panelRight;
          this.datastore =datastore;
          this.accomodation = accomodation;
          this.listRequest = new AccomodationListRequest();
    }
    
    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:
        panelRight.remove(this);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmActionPerformed
      try{
       if(listRequest.getDocumentPath()==""){
           JOptionPane.showMessageDialog(null, "Please select a file to upload","ERROR",JOptionPane.ERROR);
           return;
       }
       listRequest.setDocumentType(docType.getSelectedItem().toString());
       listRequest.setStatus("Pending");
       listRequest.setAccinfo(accomodation);
       listRequest.setRequestNumber();
       datastore.getAccmngmntrqstqueue().getRequests().add(listRequest);
       JOptionPane.showMessageDialog(null, "Request sent for admin approval!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
       logger.info("Accommodation Request sent for admin approval "+listRequest.getRequestNumber());
      }catch(Exception e){
          logger.error("Exception while listing accommodation "+e.getStackTrace());
      }
    }//GEN-LAST:event_jbtnConfirmActionPerformed

    private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(null);
        File file = filechooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        jtxtupload.setText(filename);
        listRequest.setDocumentPath(filename);
    }//GEN-LAST:event_jbtnBrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox docType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnConfirm;
    private javax.swing.JTextField jtxtupload;
    // End of variables declaration//GEN-END:variables
}
