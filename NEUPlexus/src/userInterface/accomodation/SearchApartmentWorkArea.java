/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.accomodation;

import business.accomodation.Accomodation;
import business.accomodation.AccomodationDirectory;
import business.carpool.CarInfo;
import business.dataoperations.DataStore;
import business.management.AccomodationListRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import userInterface.homeSceen.NeuPlexusHome;
import utils.EmailClient;

/**
 *
 * @author newzysharma
 */
public class SearchApartmentWorkArea extends javax.swing.JPanel {
    
    private JPanel panelRight;
    private DataStore datastore;
    private List<Accomodation> aptList;
                final static Logger logger = Logger.getLogger(SearchApartmentWorkArea.class.getName());

    /**
     * Creates new form SearchApartmentWorkArea
     */
    public SearchApartmentWorkArea() {
        initComponents();
        aptList = new ArrayList<Accomodation>();
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
        jLabel2 = new javax.swing.JLabel();
        jbtnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jbtnViewDetails = new javax.swing.JButton();
        jtxtdisfuniv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH ACCOMODATION");

        jLabel2.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Distance From University");

        jbtnSearch.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSearch.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jbtnSearch.setText("SEARCH");
        jbtnSearch.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jbtnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Listing No.", "Apartment Type", "Distance From University", "Area", "Rent"
            }
        ));
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        jbtnViewDetails.setBackground(new java.awt.Color(0, 0, 0));
        jbtnViewDetails.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        jbtnViewDetails.setText("VIEW DETAILS");
        jbtnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewDetailsActionPerformed(evt);
            }
        });

        jtxtdisfuniv.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(483, 483, 483)
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)
                                .addComponent(jtxtdisfuniv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(648, 648, 648)
                                .addComponent(jLabel1)))
                        .addGap(32, 32, 32)
                        .addComponent(jbtnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jbtnViewDetails)
                        .addGap(75, 75, 75)
                        .addComponent(btnDelete)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtdisfuniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnViewDetails)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(955, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public SearchApartmentWorkArea(JPanel panelRight,DataStore datastore){
        initComponents();
        this.panelRight = panelRight;
        this.datastore = datastore;
         aptList = new ArrayList<Accomodation>();
    }
    
    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // TODO add your handling code here:
        searchAcc();
        printAptList();
    }//GEN-LAST:event_jbtnSearchActionPerformed
    
    private void printAptList(){
        int i = 1;
        btnDelete.setVisible(false);
        DefaultTableModel m = (DefaultTableModel) searchTable.getModel();
        m.setRowCount(0);
        for (Accomodation acc : aptList) {
            
            m.addRow(new Object[]{acc,acc.getTypeOfAccomodation(),acc.getDistanceFromUni(),acc.getAddressOfApartment().getLine1(),acc.getRent()});
        }
    }
    
    private void jbtnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewDetailsActionPerformed
        try{
        int selected = searchTable.getSelectedRow();
        if(selected>=0){
            Accomodation acc = (Accomodation)searchTable.getValueAt(selected, 0);
            panelRight.add("bookApt",new SearchApartmentViewDetails(panelRight,acc,datastore));
            CardLayout layout = (CardLayout)panelRight.getLayout();
            layout.next(panelRight);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select any row to display","Error",JOptionPane.ERROR_MESSAGE);
        } 
        }catch(Exception e){
            logger.error("Exception while View details accommodation "+e.getStackTrace());
        }
    }//GEN-LAST:event_jbtnViewDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelRight.remove(this);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
        int selected = searchTable.getSelectedRow();
        if(selected>=0){
            Accomodation q= (Accomodation)searchTable.getValueAt(selected, 0);
            AccomodationDirectory qdir = datastore.getApprovedaccdir();
            qdir.getAccList().remove(q);
            JOptionPane.showMessageDialog(null, "Accomodation Listing deleted successfully!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            EmailClient.sendEmail(q.getOwnerUserName(), "Accomodation listing deleted", "You have successfullly deleted accomodation listing from portal.");
            logger.info("Accommodation deleted successfully");

            if(q.getBooked()){
                EmailClient.sendEmail(q.getBookingUserNames().getUserID(), "Accomodation listing removed", "User "+q.getOwnerUserName()+" removed accomodation listing from portal. Your booking is automatically canceled with the user.");
            }
            searchAcc();
            printAptList();
        }
        }catch(Exception e){
            logger.error("Exception while deleting accommodation "+e.getStackTrace());

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        int selected = searchTable.getSelectedRow();
        if(selected>=0){
            Accomodation q= (Accomodation)searchTable.getValueAt(selected, 0);
            if(q.getOwnerUserName().equalsIgnoreCase(NeuPlexusHome.useraccount.getUserName())){
                btnDelete.setEnabled(true);
            }else{
                btnDelete.setEnabled(false);
            }
        }
    }//GEN-LAST:event_searchTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnViewDetails;
    private javax.swing.JTextField jtxtdisfuniv;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables

    private void searchAcc() {
        if(aptList!=null)
        aptList.clear();
         float distance = Float.parseFloat(jtxtdisfuniv.getText());
        for(Accomodation acc : datastore.getApprovedaccdir().getAccList()){
            if(acc.getDistanceFromUni() <= distance){
                if(!acc.getBooked())
                aptList.add(acc);
            }
        }
        if(aptList.size()==0){
             JOptionPane.showMessageDialog(null, "Accomodations not found!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
