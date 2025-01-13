package cws.staff;

import java.sql.*;
import cws.DBC.DBConnection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sudhir Kushwaha
 */
public class Staff extends javax.swing.JFrame {

    public Staff() {
        initComponents();
        displayAllPatientRecords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientRecordTable = new javax.swing.JTable();
        btnaddpatient = new javax.swing.JButton();
        btneditpatient = new javax.swing.JButton();
        btneditappointment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(204, 0, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Profile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        patientRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(patientRecordTable);

        btnaddpatient.setBackground(new java.awt.Color(204, 0, 51));
        btnaddpatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnaddpatient.setForeground(new java.awt.Color(240, 240, 240));
        btnaddpatient.setText("Add Patient Records");
        btnaddpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddpatientActionPerformed(evt);
            }
        });

        btneditpatient.setBackground(new java.awt.Color(204, 0, 51));
        btneditpatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btneditpatient.setForeground(new java.awt.Color(240, 240, 240));
        btneditpatient.setText("Edit Patient Records");
        btneditpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditpatientActionPerformed(evt);
            }
        });

        btneditappointment.setBackground(new java.awt.Color(204, 0, 51));
        btneditappointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btneditappointment.setForeground(new java.awt.Color(240, 240, 240));
        btneditappointment.setText("Edit  Appointments");
        btneditappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditappointmentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search Patient Records");

        txtsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnaddpatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneditpatient)
                .addGap(96, 96, 96)
                .addComponent(btneditappointment)
                .addGap(92, 92, 92))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        new cws.Login().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnaddpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddpatientActionPerformed
        new AddPatient().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnaddpatientActionPerformed

    private void btneditpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditpatientActionPerformed
        new EditPatient().setVisible(true);
        dispose();

    }//GEN-LAST:event_btneditpatientActionPerformed

    private void btneditappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditappointmentActionPerformed
        new ChangeAppointment().setVisible(true);
        dispose();

    }//GEN-LAST:event_btneditappointmentActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped

        // Get the search query from the text field
        String searchQuery = txtsearch.getText().trim();
        // Create a RowFilter to filter the rows based on the search query
        RowFilter<DefaultTableModel, Object> rowFilter = null;
        // If the search query is not empty, apply the filter
        if (!searchQuery.isEmpty()) {
            rowFilter = RowFilter.regexFilter("(?i)" + searchQuery);  // (?i) makes the search case-insensitive
        }
        // Get the table's row sorter
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) patientRecordTable.getRowSorter();
        // Apply the row filter to the row sorter
        sorter.setRowFilter(rowFilter);


    }//GEN-LAST:event_txtsearchKeyTyped

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddpatient;
    private javax.swing.JButton btneditappointment;
    private javax.swing.JButton btneditpatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientRecordTable;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void displayAllPatientRecords() {
        // Define the query to retrieve all patient records
        String query = "SELECT ID, NAME, ADDRESS, EMAIL,P_ID, ID_NUMBER, MOBILE, APPOINTMENT_DATE FROM PATIENT";

        // Create a table model to hold the data
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the table model
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Email");
        model.addColumn("Document Name");
        model.addColumn("ID Number");
        model.addColumn("Mobile");
        model.addColumn("Appointment Date");

        // Establish database connection
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Get database connection
            connection = DBConnection.getDBConnection();
            statement = connection.createStatement();

            // Execute the query to get the patient records
            resultSet = statement.executeQuery(query);

            // Iterate through the result set and add rows to the model
            while (resultSet.next()) {
                // Retrieve data from the result set
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                String address = resultSet.getString("ADDRESS");
                String email = resultSet.getString("EMAIL");
                String idName = resultSet.getString("P_ID");
                String idNumber = resultSet.getString("ID_NUMBER");
                String mobile = resultSet.getString("MOBILE");
                Date appointmentDate = resultSet.getDate("APPOINTMENT_DATE");

                // Convert the appointment date to a string (optional formatting)
                String appointmentDateStr = (appointmentDate != null) ? appointmentDate.toString() : "";

                // Add the data to the table model
                model.addRow(new Object[]{id, name, address, email, idName, idNumber, mobile, appointmentDateStr});
            }

            // Set the model to the JTable to display the data
            patientRecordTable.setModel(model);

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            patientRecordTable.setRowSorter(sorter);

        } catch (SQLException e) {
            // Handle any SQL exceptions
            JOptionPane.showMessageDialog(null, "Error fetching patient records: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing database resources", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
