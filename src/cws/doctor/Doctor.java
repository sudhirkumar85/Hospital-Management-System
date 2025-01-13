package cws.doctor;

import cws.DBC.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sudhir Kushwaha
 */
public class Doctor extends javax.swing.JFrame {

    private DefaultTableModel model;

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPatientRecordView = new javax.swing.JButton();
        btnAppointmentView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientRecordTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(820, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        btnPatientRecordView.setBackground(new java.awt.Color(204, 0, 51));
        btnPatientRecordView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPatientRecordView.setForeground(new java.awt.Color(240, 240, 240));
        btnPatientRecordView.setText("View Patients ");
        btnPatientRecordView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientRecordViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatientRecordView, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 210, 40));

        btnAppointmentView.setBackground(new java.awt.Color(204, 0, 51));
        btnAppointmentView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAppointmentView.setForeground(new java.awt.Color(240, 240, 240));
        btnAppointmentView.setText("View Appointments ");
        btnAppointmentView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnAppointmentView, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, 43));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search Patient Records");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 205, 33));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 280, 40));

        patientRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        patientRecordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientRecordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientRecordTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 890, 370));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doctorbg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 910, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        new cws.Login().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnPatientRecordViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientRecordViewActionPerformed
        displayAllPatientRecords();
    }//GEN-LAST:event_btnPatientRecordViewActionPerformed

    private void btnAppointmentViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentViewActionPerformed
        displayAllAppointment();
    }//GEN-LAST:event_btnAppointmentViewActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        var rowSorter = new TableRowSorter(patientRecordTable.getModel());
        rowSorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
        patientRecordTable.setRowSorter(rowSorter);


    }//GEN-LAST:event_txtSearchKeyReleased

    private void patientRecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientRecordTableMouseClicked

        if (2 == evt.getClickCount()) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this record", "Delete", JOptionPane.DEFAULT_OPTION);
            if (option == 0) {
                model.removeRow(patientRecordTable.getSelectedRow());
            }

        }

    }//GEN-LAST:event_patientRecordTableMouseClicked

    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointmentView;
    private javax.swing.JButton btnPatientRecordView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientRecordTable;
    private javax.swing.JTextField txtSearch;
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

    private void displayAllAppointment() {
        // Define the query to retrieve Patient ID, Name, and Appointment Date
        String query = "SELECT ID, NAME, APPOINTMENT_DATE FROM PATIENT";

        // Create a table model to hold the data
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the table model
        model.addColumn("Patient ID");
        model.addColumn("Name");
        model.addColumn("Appointment Date");

        // Establish database connection
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Get the database connection
            connection = DBConnection.getDBConnection();
            statement = connection.createStatement();

            // Execute the query to get the patient records (ID, Name, Appointment Date)
            resultSet = statement.executeQuery(query);

            // Iterate through the result set and add rows to the model
            while (resultSet.next()) {
                // Retrieve the Patient ID, Name, and Appointment Date from the result set
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                Date appointmentDate = resultSet.getDate("APPOINTMENT_DATE");

                // Convert the appointment date to a string (optional formatting)
                String appointmentDateStr = (appointmentDate != null) ? appointmentDate.toString() : "";

                // Add the data to the table model
                model.addRow(new Object[]{id, name, appointmentDateStr});
            }

            // Set the model to the JTable to display the data
            patientRecordTable.setModel(model);

            // Create a TableRowSorter to enable sorting by columns
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            patientRecordTable.setRowSorter(sorter);  // Set the sorter on the JTable

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
