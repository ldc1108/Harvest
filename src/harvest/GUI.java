/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Renders GUI and Component listeners 
 * @author Ldc1108
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        propertiesPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        browse = new javax.swing.JButton();
        browseTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        propertiesGrid1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        densityJRadio = new javax.swing.JRadioButton();
        densityDependencyCombo = new javax.swing.JComboBox();
        temperatureJRadio = new javax.swing.JRadioButton();
        temperatureDependencyCombo = new javax.swing.JComboBox();
        frequencyJRadio = new javax.swing.JRadioButton();
        frequencyDependencyCombo = new javax.swing.JComboBox();
        propertiesGrid2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        densityConstantCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        temperatureConstantCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        frequencyConstantCombo = new javax.swing.JComboBox();
        graphPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Harvest 2.0"));
        propertiesPanel.setName("propertiesPanel");
        propertiesPanel.setLayout(new java.awt.GridLayout(4, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data File"));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        browse.setText("Browse");
        jPanel1.add(browse);

        browseTextArea.setText("...");
        browseTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseTextAreaActionPerformed(evt);
            }
        });
        jPanel1.add(browseTextArea);

        jLabel6.setText("Density Points:");
        jPanel1.add(jLabel6);

        jLabel11.setText(" -");
        jPanel1.add(jLabel11);

        jLabel9.setText("Temperature Points:");
        jPanel1.add(jLabel9);

        jLabel12.setText(" -");
        jPanel1.add(jLabel12);

        jLabel10.setText("Frequency Bounds:");
        jPanel1.add(jLabel10);

        jLabel13.setText(" -");
        jPanel1.add(jLabel13);

        propertiesPanel.add(jPanel1);

        propertiesGrid1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependency"));
        propertiesGrid1.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("X Variable");
        propertiesGrid1.add(jLabel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Units");
        propertiesGrid1.add(jLabel4);

        densityJRadio.setText("Density");
        densityJRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                densityJRadioActionPerformed(evt);
            }
        });
        propertiesGrid1.add(densityJRadio);

        densityDependencyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        densityDependencyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                densityDependencyComboActionPerformed(evt);
            }
        });
        propertiesGrid1.add(densityDependencyCombo);

        temperatureJRadio.setText("Temperature");
        temperatureJRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureJRadioActionPerformed(evt);
            }
        });
        propertiesGrid1.add(temperatureJRadio);

        temperatureDependencyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        propertiesGrid1.add(temperatureDependencyCombo);

        frequencyJRadio.setText("Frequency");
        propertiesGrid1.add(frequencyJRadio);

        frequencyDependencyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        propertiesGrid1.add(frequencyDependencyCombo);

        propertiesPanel.add(propertiesGrid1);

        propertiesGrid2.setBorder(javax.swing.BorderFactory.createTitledBorder("Constants"));
        propertiesGrid2.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Variable");
        propertiesGrid2.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Constant Value");
        propertiesGrid2.add(jLabel8);

        jLabel2.setText("Density");
        propertiesGrid2.add(jLabel2);

        densityConstantCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        propertiesGrid2.add(densityConstantCombo);

        jLabel3.setText("Temperature");
        propertiesGrid2.add(jLabel3);

        temperatureConstantCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        propertiesGrid2.add(temperatureConstantCombo);

        jLabel5.setText("Frequency");
        propertiesGrid2.add(jLabel5);

        frequencyConstantCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        propertiesGrid2.add(frequencyConstantCombo);

        propertiesPanel.add(propertiesGrid2);

        getContentPane().add(propertiesPanel, java.awt.BorderLayout.LINE_START);

        graphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Designed by Luke Coy"));
        graphPanel.setName("graphPanel");
        graphPanel.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Start", jPanel2);

        graphPanel.add(jTabbedPane1);

        getContentPane().add(graphPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void densityJRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_densityJRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_densityJRadioActionPerformed

    private void temperatureJRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureJRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureJRadioActionPerformed

    private void densityDependencyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_densityDependencyComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_densityDependencyComboActionPerformed

    private void browseTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseTextAreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private javax.swing.JTextField browseTextArea;
    private javax.swing.JComboBox densityConstantCombo;
    private javax.swing.JComboBox densityDependencyCombo;
    private javax.swing.JRadioButton densityJRadio;
    private javax.swing.JComboBox frequencyConstantCombo;
    private javax.swing.JComboBox frequencyDependencyCombo;
    private javax.swing.JRadioButton frequencyJRadio;
    private javax.swing.JPanel graphPanel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel propertiesGrid1;
    private javax.swing.JPanel propertiesGrid2;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JComboBox temperatureConstantCombo;
    private javax.swing.JComboBox temperatureDependencyCombo;
    private javax.swing.JRadioButton temperatureJRadio;
    // End of variables declaration//GEN-END:variables
}
