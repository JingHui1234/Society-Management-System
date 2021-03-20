package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import adt.ArrayList;
import adt.ListInterface;
import entity.Venue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ang Chia Ling
 */
public class VenueManagement extends javax.swing.JFrame {

    private static ListInterface<Venue> venueList = new ArrayList<>();
    VenueFile venuefile = new VenueFile();

    public VenueManagement() {
        initComponents();
        jTableVenueList.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelVenue = new javax.swing.JLabel();
        jButtonAddVenue = new javax.swing.JButton();
        jButtonEditVenue = new javax.swing.JButton();
        jButtonRemoveVenue = new javax.swing.JButton();
        jButtonGoBack = new javax.swing.JButton();
        jButtonViewAllVenues = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVenueList = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelVenue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVenue.setText("Venue Management");

        jButtonAddVenue.setText("Add Venue");
        jButtonAddVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVenueActionPerformed(evt);
            }
        });

        jButtonEditVenue.setText("Edit Venue");
        jButtonEditVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditVenueActionPerformed(evt);
            }
        });

        jButtonRemoveVenue.setText("Remove Venue");
        jButtonRemoveVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveVenueActionPerformed(evt);
            }
        });

        jButtonGoBack.setText("Back to Main Menu");
        jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoBackActionPerformed(evt);
            }
        });

        jButtonViewAllVenues.setText("View All Venues");
        jButtonViewAllVenues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllVenuesActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jTableVenueList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue Name", "Type", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableVenueList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRemoveVenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditVenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddVenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewAllVenues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabelVenue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddVenue)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditVenue)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveVenue)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonViewAllVenues)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGoBack))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVenueActionPerformed
        // TODO add your handling code here:
        // go to another interface if user choose to add venue
        new AddNewVenue().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAddVenueActionPerformed

    private void jButtonEditVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditVenueActionPerformed
        // TODO add your handling code here:
        // read file and store into arraylist(venueList)
        String name;
        boolean found = false;
        venueList = venuefile.reader("VenueFile.txt");

        // enter venue name that wished to edit
        try {
            name = JOptionPane.showInputDialog(null,"Please enter the VENUE NAME that you want to edit : ");
            name = name.toUpperCase();
            for (int i = 1; i <= venueList.length(); i++) {
                if (name.equals(venueList.getEntry(i).getVenueName())) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "Venue not found!!!");
            } else {
                new EditVenue(name).setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        
    }//GEN-LAST:event_jButtonEditVenueActionPerformed

    private void jButtonViewAllVenuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllVenuesActionPerformed
        DefaultTableModel venueTable = (DefaultTableModel)jTableVenueList.getModel();
        // refresh the table before read and display
        while(venueTable.getRowCount() > 0){
            venueTable.removeRow(0);
        }
        
        // read file and store into arraylist(venueList)
        venueList = venuefile.reader("VenueFile.txt");
        String name = "";
        String type = "";
        String capacity = "";
       
        for (int i = 1; i <= venueList.length(); i++) {
           name = venueList.getEntry(i).getVenueName();
           type = venueList.getEntry(i).getType();
           capacity = Integer.toString(venueList.getEntry(i).getCapacity());
           String[] data = {name,type,capacity};
           venueTable.addRow(data);
        }
    }//GEN-LAST:event_jButtonViewAllVenuesActionPerformed

    private void jButtonRemoveVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveVenueActionPerformed
        // TODO add your handling code here:   
        // read file and store into arraylist(venueList)
        String name;
        boolean successful = false;
        venueList = venuefile.reader("VenueFile.txt");
        name = JOptionPane.showInputDialog(null,"Please enter the VENUE NAME that you want to remove : ");
        name = name.toUpperCase();

        // enter venue name that wished to remove
        try {
            for (int i = 1; i <= venueList.length(); i++) {
                if (name.equals(venueList.getEntry(i).getVenueName())) {
                    venueList.remove(i);
                    successful = true;
                    venuefile.rewrite((ArrayList<Venue>) venueList, "VenueFile.txt");
                    break;
                } else {
                    successful = false;
                }
            }
            if (successful) {
                JOptionPane.showMessageDialog(null, "Removed Successfully");

            } else {
                JOptionPane.showMessageDialog(null, "Venue not found!!!");
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_jButtonRemoveVenueActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        // same concept with view all
        DefaultTableModel venueTable = (DefaultTableModel)jTableVenueList.getModel();
        while(venueTable.getRowCount() > 0){
            venueTable.removeRow(0);
        }
        
        venueList = venuefile.reader("VenueFile.txt");
        String name = "";
        String type = "";
        String capacity = "";
       
        for (int i = 1; i <= venueList.length(); i++) {
           name = venueList.getEntry(i).getVenueName();
           type = venueList.getEntry(i).getType();
           capacity = Integer.toString(venueList.getEntry(i).getCapacity());
           String[] data = {name,type,capacity};
           venueTable.addRow(data);
        }
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
       new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButtonGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenueManagement().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddVenue;
    private javax.swing.JButton jButtonEditVenue;
    private javax.swing.JButton jButtonGoBack;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemoveVenue;
    private javax.swing.JButton jButtonViewAllVenues;
    private javax.swing.JLabel jLabelVenue;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVenueList;
    // End of variables declaration//GEN-END:variables
}
