package cws.staff;

import cws.DBC.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudhir Kushwaha
 */
public class ChangeAppointment extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public ChangeAppointment() {
        initComponents();
        showPatientIDs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        appointmentDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combopatientid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cancel");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Change Appointment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 577, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 382, 200, 41));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 383, 219, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(appointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 392, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Set Appointment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 170, 41));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 392, 37));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Patient Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 128, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Patient ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 128, 41));

        combopatientid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        combopatientid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combopatientidItemStateChanged(evt);
            }
        });
        jPanel1.add(combopatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 392, 37));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Staff().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void combopatientidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopatientidItemStateChanged

        if (combopatientid.getSelectedIndex() == 0) {
            txtname.setText("");
            appointmentDate.setDate(null);
        }
        // Ensure that the user has selected an actual item (not the default prompt)
        String selectedItem = (String) combopatientid.getSelectedItem();

        if (selectedItem != null && !selectedItem.equals("Select Patient ID")) {
            try {
                // Establish connection to the database
                connection = DBConnection.getDBConnection();

                // SQL query to get the patient's name and appointment date based on the selected ID
                String query = "SELECT NAME, APPOINTMENT_DATE FROM PATIENT WHERE ID = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, selectedItem); // Set the patient ID parameter

                // Execute the query and get the result set
                resultSet = preparedStatement.executeQuery();

                // Check if the result set contains any data
                if (resultSet.next()) {
                    String name = resultSet.getString("NAME");
                    Date date = resultSet.getDate("APPOINTMENT_DATE");

                    // Set the name in txtname
                    txtname.setText(name);
                    appointmentDate.setDate(date);
                }

            } catch (SQLException e) {
                // Handle SQL exceptions
                JOptionPane.showMessageDialog(null, "Error fetching patient details", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            } finally {
                // Close the resources to avoid memory leaks
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error closing database resources", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_combopatientidItemStateChanged

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtname.setText("");
        combopatientid.setSelectedIndex(0);
        appointmentDate.setDate(null);


    }//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // Retrieve the selected patient ID from the combo box
        String selectedPatientID = (String) combopatientid.getSelectedItem();

        // Check if the user has selected a valid patient ID
        if (selectedPatientID == null || selectedPatientID.equals("Select Patient ID")) {
            JOptionPane.showMessageDialog(null, "Please select a valid patient ID", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if no patient ID is selected
        }

        // Check if the user has selected a valid appointment date
        if (appointmentDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select an appointment date", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if no appointment date is selected
        }

        // Confirm the update with the user
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the appointment date?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.NO_OPTION) {
            return; // Exit if the user chooses not to update
        }

        // SQL query to update the appointment date in the database based on the selected patient ID
        String updateQuery = "UPDATE PATIENT SET APPOINTMENT_DATE = ? WHERE ID = ?";

        // Update the database
        try (Connection connection = DBConnection.getDBConnection(); PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            // Set the appointment date and patient ID parameters
            preparedStatement.setDate(1, new java.sql.Date(appointmentDate.getDate().getTime())); // Convert Java Date to SQL Date
            preparedStatement.setString(2, selectedPatientID);

            // Execute the update query
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Appointment date updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No patient found with the selected ID. Update failed.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating the appointment date: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentDate;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> combopatientid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    private void showPatientIDs() {

        try {
            // Establish connection to the database (change your database connection details)
            connection = DBConnection.getDBConnection();
            String query = "SELECT ID FROM PATIENT";  // Query to select ID and Name
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Clear existing items in the combo box to avoid duplicates
            combopatientid.removeAllItems();

            // Add a default prompt item
            combopatientid.addItem("Select Patient ID");

            // Iterate over the result set and add the items to the combo box
            while (resultSet.next()) {
                combopatientid.addItem(resultSet.getString("ID"));  // Add to the combo box
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching patient IDs", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close the resources
            try {
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error fetching patient IDs", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
