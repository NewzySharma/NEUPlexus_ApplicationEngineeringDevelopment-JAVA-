/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.accomodation;

import business.accomodation.Accomodation;
import business.carpool.BookingDetails;
import business.dataoperations.DataStore;
import business.management.AccomodationListRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import userInterface.homeSceen.NeuPlexusHome;
import utils.EmailClient;

/**
 *
 * @author newzysharma
 */
public class SearchApartmentViewDetails extends javax.swing.JPanel {
    
    private JPanel panelRight;
    private DataStore datastore;
    private Accomodation acc;
    final static Logger logger = Logger.getLogger(SearchApartmentViewDetails.class.getName());
    /**
     * Creates new form SearchApartmentViewDetails
     */
    public SearchApartmentViewDetails() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtaptype = new javax.swing.JTextField();
        jtxtaline1 = new javax.swing.JTextField();
        jtxtaline2 = new javax.swing.JTextField();
        jtxtzipcode = new javax.swing.JTextField();
        jtxtstate = new javax.swing.JTextField();
        jtxtcity = new javax.swing.JTextField();
        jtxtpentpermonth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtavfdate = new javax.swing.JTextField();
        jtxtavtdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtnBook = new javax.swing.JButton();
        jtxtdisfuniv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtFacilities = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apartment Type");

        jLabel2.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address Line 1");

        jLabel3.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address Line 2");

        jLabel4.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ZIP Code");

        jLabel5.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");

        jLabel6.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rent per Month");

        jLabel8.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONFIRM BOOKING");

        jtxtaptype.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtaptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtaptypeActionPerformed(evt);
            }
        });

        jtxtaline1.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtaline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtaline1ActionPerformed(evt);
            }
        });

        jtxtaline2.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jtxtzipcode.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jtxtstate.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jtxtcity.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jtxtpentpermonth.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Available From Date");

        jLabel10.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Available Till Date");

        jtxtavfdate.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtavfdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtavfdateActionPerformed(evt);
            }
        });

        jtxtavtdate.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Facilities");

        jLabel12.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Distance From University");

        jbtnBook.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBook.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jbtnBook.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        jbtnBook.setText("BOOK");
        jbtnBook.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBookActionPerformed(evt);
            }
        });

        jtxtdisfuniv.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtdisfuniv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisfunivActionPerformed(evt);
            }
        });

        jtxtFacilities.setColumns(20);
        jtxtFacilities.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jtxtFacilities.setRows(5);
        jScrollPane1.setViewportView(jtxtFacilities);

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

        jLabel13.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mile(s)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(543, 543, 543)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(541, 541, 541)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtaline2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtpentpermonth, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtaline1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtaptype, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jtxtdisfuniv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel13))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtavfdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(72, 72, 72)
                                        .addComponent(jtxtavtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jbtnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtaptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtaline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtaline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jtxtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtpentpermonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtavfdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtavtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtdisfuniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBook)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(956, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public SearchApartmentViewDetails(JPanel panelRight,Accomodation listRequest,DataStore datastore){
          initComponents();
          this.panelRight=panelRight;
          this.datastore =datastore;
          this.acc = listRequest;
          displayDetails();
    }
    
    private void displayDetails(){
        jtxtaptype.setText(acc.getTypeOfAccomodation());
        jtxtaline1.setText(acc.getAddressOfApartment().getLine1());
        jtxtaline2.setText(acc.getAddressOfApartment().getLine2());
        jtxtcity.setText(acc.getAddressOfApartment().getCity());
        jtxtstate.setText(acc.getAddressOfApartment().getState());
        jtxtzipcode.setText(acc.getAddressOfApartment().getZipCode());
        jtxtdisfuniv.setText(String.valueOf(acc.getDistanceFromUni()));
        jtxtpentpermonth.setText(String.valueOf(acc.getRent()));
        jtxtavfdate.setText(String.valueOf(acc.getAvlFromDate()));
        jtxtavtdate.setText(String.valueOf(acc.getAvlToDate()));
        jtxtFacilities.setText(acc.getFacilities());
    }
    
    private void jtxtaptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtaptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtaptypeActionPerformed

    private void jtxtaline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtaline1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtaline1ActionPerformed

    private void jtxtavfdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtavfdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtavfdateActionPerformed

    private void jbtnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBookActionPerformed
        try{
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	String date = dateFormat.format(new Date());
        dateFormat =  new SimpleDateFormat("HH:mm"); 
        String time = dateFormat.format(new Date());
        BookingDetails detail = new BookingDetails(NeuPlexusHome.useraccount.getUserName(), date, time);
        detail.setBookingId();
        if(acc.getBookingUserNames()!=null){
            JOptionPane.showMessageDialog(null, "You have already booked this accommodation!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        acc.setBookingUserNames(detail);
        //send email to booking user that ur acc booked
        for(Accomodation a: datastore.approvedaccdir.getAccList()){
            if(a.equals(acc)){
               a.setBooked(true);
               EmailClient.sendEmail(NeuPlexusHome.useraccount.getUserName(), "Accommodation booked successfully!", "Dear user, Your accommodation booking is done successfully with user "+a.getOwnerUserName());
               EmailClient.sendEmail(a.getOwnerUserName(), "Accommodation booked successfully!", "Dear user, Your accommodation listing is booked by user "+NeuPlexusHome.useraccount.getUserName());
               logger.info("Accommodation  booked by user"+NeuPlexusHome.useraccount.getUserName());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Booking confirmed! Details are sent to your registered email id!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add("confirmBookApartmentDetails",new BookingConfirmation(panelRight));
        layout.next(panelRight);
        }catch(Exception e){
            logger.error("Exception while booking  accommodation "+e.getStackTrace());
        }
    }//GEN-LAST:event_jbtnBookActionPerformed

    private void jtxtdisfunivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisfunivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisfunivActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelRight.remove(this);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBook;
    private javax.swing.JTextArea jtxtFacilities;
    private javax.swing.JTextField jtxtaline1;
    private javax.swing.JTextField jtxtaline2;
    private javax.swing.JTextField jtxtaptype;
    private javax.swing.JTextField jtxtavfdate;
    private javax.swing.JTextField jtxtavtdate;
    private javax.swing.JTextField jtxtcity;
    private javax.swing.JTextField jtxtdisfuniv;
    private javax.swing.JTextField jtxtpentpermonth;
    private javax.swing.JTextField jtxtstate;
    private javax.swing.JTextField jtxtzipcode;
    // End of variables declaration//GEN-END:variables
}
