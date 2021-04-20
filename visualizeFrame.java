/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Kevin
 */
public class visualizeFrame extends javax.swing.JFrame {
    static ArrayList<Patient> patientList;

    /**
     * Creates new form visualizeFrame
     */
    public visualizeFrame(ArrayList<Patient> patientList) {
        initComponents();

        visualizeFrame.patientList = patientList;

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        aboutButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        graphicsButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        barButton = new javax.swing.JButton();
        pieButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load Data");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add Data");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save Data");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        graphicsButton.setText("Visualize Data");

        barButton.setText("Bar Graph");
        barButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barButtonActionPerformed(evt);
            }
        });

        pieButton.setText("Pie Chart");
        pieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(barButton)
                .addGap(105, 105, 105)
                .addComponent(pieButton)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barButton)
                    .addComponent(pieButton))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(graphicsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(aboutButton)
                        .addGap(64, 64, 64)
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graphicsButton)
                        .addGap(0, 281, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        JOptionPane.showMessageDialog(this, "----Team 1----\n\nRoman Smith\n\nKevin Mendoza Ramirez\n\nLuis Zermeno\n\nNicole Gutierrez\n\n------------------");
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        new loadFrame(patientList).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loadButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new addFrame(patientList).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new saveData(patientList);
    }

    private void barButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barButtonActionPerformed
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        ArrayList<String> vaccineTypes = new ArrayList<String>();
        for(Patient patient : patientList) {
            boolean hasVaccine = false;
            for(String vaccine : vaccineTypes) {
                if(patient.getType().equals(vaccine)) {
                    hasVaccine = true;
                }
            }
            if(!hasVaccine) {
                vaccineTypes.add(patient.getType());
            }  
        }

        for(String vaccine : vaccineTypes) {
            int count = 0;
            for(Patient patient : patientList) {
                if(patient.getType().equals(vaccine)) {
                    count++;
                }
            }
            data.setValue(count, vaccine, vaccine);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Vaccination Data", "Vaccine Name", "Vaccinations", data, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrame = new ChartFrame("Vaccination Data",chart,true);
        chartFrame.setVisible(true);
        chartFrame.setLocationRelativeTo(infoPanel);
        chartFrame.setSize(800,600);
    }//GEN-LAST:event_barButtonActionPerformed

    private void pieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieButtonActionPerformed
        DefaultPieDataset data = new DefaultPieDataset();

        ArrayList<String> countries = new ArrayList<String>();
        for(Patient patient : patientList) {
            boolean hasCountry = false;
            for(String country : countries) {
                if(patient.getCountry().equals(country)) {
                    hasCountry = true;
                }
            }
            if(!hasCountry) {
                countries.add(patient.getCountry());
            }  
        }

        for(String country : countries) {
            int count = 0;
            for(Patient patient : patientList) {
                if(patient.getCountry().equals(country)) {
                    count++;
                }
            }
            data.setValue(country, count);
        }
        
        JFreeChart chart = ChartFactory.createPieChart("Vaccination Data", data, true, true, false);
        
        PiePlot piePlot = (PiePlot) chart.getPlot();
        ChartFrame chartFrame = new ChartFrame("Vaccination Data",chart);
        chartFrame.setVisible(true);
        chartFrame.setLocationRelativeTo(infoPanel);
        chartFrame.setSize(500,400);
    }//GEN-LAST:event_pieButtonActionPerformed

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
            java.util.logging.Logger.getLogger(visualizeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visualizeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visualizeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizeFrame(patientList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton barButton;
    private javax.swing.JButton graphicsButton;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton pieButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
