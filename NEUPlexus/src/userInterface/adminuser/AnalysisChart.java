/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.adminuser;

import business.accomodation.Accomodation;
import business.accomodation.AccomodationDirectory;
import business.carpool.CarDirectory;
import business.carpool.CarInfo;
import business.dataoperations.DataStore;
import business.enterprise.Enterprise;
import business.qnaPortal.Question;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import userInterface.QnAPortal.QnAMainWorkArea;
import userInterface.accomodation.AccomodationMainWorkArea;
import userInterface.carPool.CarPoolWorkArea;

/**
 *
 * @author Shardul Pathak
 */
public class AnalysisChart extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;

    /**
     * Creates new form AnalysisChart
     */
//    public AnalysisChart() {
//        initComponents();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analysisPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        analysisPanel.setLayout(new java.awt.BorderLayout());

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(analysisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btnBack)))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(analysisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    Map<String, Integer> DataMap = new HashMap<String, Integer>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analysisPanel;
    private javax.swing.JButton btnBack;
    // End of variables declaration//GEN-END:variables
public AnalysisChart(JPanel userProcessContainer, Enterprise enterprise) {
       initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        createMap();

        String chartTitle = "Data Analysis";
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        chartPanel.setVisible(true);
        analysisPanel.add(chartPanel);
    }

    private void createMap() {
         DataStore ds = enterprise.getDatastore();
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.QnAPortal)) {
           int noOfQ = ds.getQuesdir().getQuestionList().size();
            int answered = 0, unanswered = 0;
            for (Question q : ds.getQuesdir().getQuestionList()) {
                if (q.getAnswers().getAnswerList().size() == 0) {
                    unanswered++;
                } else {
                    answered++;
                }
            }
            DataMap.put("Answered Questions", answered);
            DataMap.put("Unanswered Questions", unanswered);
        } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.AccomodationPortal)) {
            AccomodationDirectory accdir = ds.getApprovedaccdir();
            int accomodations = accdir.getAccList().size();
            int totalBookings=0;
            for(Accomodation acc:accdir.getAccList()){
               if(acc.getBookingUserNames()!=null){
                   totalBookings+=1;
               }
            }
            DataMap.put("Total listed accomodations", accomodations);
            DataMap.put("No. of bookings", totalBookings);
        } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.CarPool)) {
            CarDirectory cardir = ds.getCardir();
            int cars = cardir.getCarList().size();
            int totalOccs=0,totalBookings=0;
            for(CarInfo car:cardir.getCarList()){
               if(car.getBookingUserNames().size()!=0){
                   totalBookings+=car.getBookingUserNames().size();
               }
               totalOccs+=car.getOccupancy();
            }
            DataMap.put("Total listed cars", cars);
            DataMap.put("Occupancies available", totalOccs);
            DataMap.put("No. of bookings", totalBookings);
        }
    }

    private PieDataset createDataset() {
       DefaultPieDataset result = new DefaultPieDataset();
        for (Entry<String, Integer> en : DataMap.entrySet()) {
            result.setValue(en.getKey(), en.getValue());
        }
       return result;

     
    }

    private JFreeChart createChart(PieDataset dataset, String title) {
      JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false); 

        Plot plot = (Plot) chart.getPlot();
        plot.setForegroundAlpha(1.0f);
        return chart;
    }
}