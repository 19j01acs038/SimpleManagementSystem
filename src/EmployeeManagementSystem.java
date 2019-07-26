
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmployeeManagementSystem extends javax.swing.JFrame {

    DBConnection conn=new DBConnection();
    public EmployeeManagementSystem() {     
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        EmpfName = new javax.swing.JLabel();
        EmplName = new javax.swing.JLabel();
        EmpMarital = new javax.swing.JLabel();
        Empg = new javax.swing.JLabel();
        EmpCount = new javax.swing.JLabel();
        EmpID = new javax.swing.JLabel();
        jEmployeeID = new javax.swing.JTextField();
        jFirstName = new javax.swing.JTextField();
        jLastName = new javax.swing.JTextField();
        jMaritalStatus = new javax.swing.JComboBox();
        jGender = new javax.swing.JComboBox();
        jCountry = new javax.swing.JComboBox();
        jRegister = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jRetrieve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EmpSelect = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSelect = new javax.swing.JComboBox<>();
        EmpSalary = new javax.swing.JLabel();
        jSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 0));

        EmpfName.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpfName.setText("FistName");

        EmplName.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmplName.setText("LastName");

        EmpMarital.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpMarital.setText("MaritalStatus");

        Empg.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        Empg.setText("Gender");

        EmpCount.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpCount.setText("Country");

        EmpID.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpID.setText("EmployeeID");

        jEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmployeeIDActionPerformed(evt);
            }
        });

        jMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Maried", "Other" }));

        jGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });

        jCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kenya", "Zimbamwe", "Zambia", "Liberia", "Burundi", "Uganda", "Australia" }));

        jRegister.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jRegister.setForeground(new java.awt.Color(51, 51, 255));
        jRegister.setText("Register");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        jDelete.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 0, 51));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jUpdate.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(0, 153, 153));
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jRetrieve.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jRetrieve.setForeground(new java.awt.Color(102, 0, 102));
        jRetrieve.setText("Retrieve");
        jRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRetrieveActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "FistName", "LastName", "MaritalStatus", "Gender", "Country", "SelectTypeOfEmployee", "MonthlySalary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        EmpSelect.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpSelect.setText("SelectTypeOfEmployee");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Pyment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Manager", "Deputy Manager", "Finance Manager", "Clerk", "Ordinary Worker", "Watchaman" }));

        EmpSalary.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        EmpSalary.setText("MonthlySalary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpMarital)
                            .addComponent(jRegister))
                        .addGap(115, 115, 115)
                        .addComponent(jDelete)
                        .addGap(112, 112, 112)
                        .addComponent(jUpdate)
                        .addGap(130, 130, 130)
                        .addComponent(jRetrieve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpSelect)
                            .addComponent(EmpSalary))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jEmployeeID)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSalary))
                        .addGap(590, 590, 590))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Empg)
                            .addComponent(EmpCount)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmpID)
                                    .addComponent(EmpfName)
                                    .addComponent(EmplName))
                                .addGap(353, 353, 353)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpID)
                            .addComponent(jEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpfName)
                            .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmplName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpMarital)
                            .addComponent(jMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Empg)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpCount)
                            .addComponent(jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpSelect))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpSalary)
                    .addComponent(jSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRegister)
                    .addComponent(jDelete)
                    .addComponent(jUpdate)
                    .addComponent(jRetrieve)
                    .addComponent(jButton1)))
        );

        jTabbedPane3.addTab("Registration of employees", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetrieveActionPerformed
        ResultSet newrs=conn.getEmployees();
        try{
            DefaultTableModel newmode1=(DefaultTableModel)jTable1.getModel();
            while(newrs.next())
            {
                Vector<String>employeeitems=new Vector<String>();
                employeeitems.add(newrs.getString("EmpIoyeeid"));
                employeeitems.add(newrs.getString("EmployeeFirstName"));
                employeeitems.add(newrs.getString("EmployeeLastname"));
                employeeitems.add(newrs.getString("Gender"));
                employeeitems.add(newrs.getString("EmployeeMarital"));
                employeeitems.add(newrs.getString("EmployeeCountry"));
                 employeeitems.add(newrs.getString("SelectTypeOfEmployee"));
                employeeitems.add(newrs.getString("MonthlySalary"));
                newmode1.addRow(employeeitems);
                new SimpleReport(newmode1);
                JOptionPane.showMessageDialog(null,"Employee Records Retrieved Successfully");
            }
        }

        catch(SQLException x)
        {
            
        }
    }//GEN-LAST:event_jRetrieveActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        String Empid=jEmployeeID.getText();
        String EmpfName=jFirstName.getText();
        String EmplName=jLastName.getText();
        String Empg=jGender.getSelectedItem().toString();
        String EmpMarital=jMaritalStatus.getSelectedItem().toString();
        String EmpCount=jCountry.getSelectedItem().toString();
        String EmpSelect=jSelect.getSelectedItem().toString();
        String EmpSalary=jSalary.getText().toString();
        conn.updateEmployee(Empid,EmpfName,EmplName,Empg,EmpMarital,EmpCount,EmpSelect,EmpSalary);
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        String EmpID=jEmployeeID.getText();
        conn.deleteemployee(EmpID);
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        String empid=jEmployeeID.getText();
        String empfname=jFirstName.getText();
        String emplname=jLastName.getText();
        String empg=jGender.getSelectedItem().toString();
        String empmarital=jMaritalStatus.getSelectedItem().toString();
        String EmpSelect=jSelect.getSelectedItem().toString();
        String empcount=jCountry.getSelectedItem().toString();
       String empSalary=jSalary.getText();
        conn.insertEmployee(empid,empfname,emplname,empg,empmarital,empcount,EmpSelect,empSalary);
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmployeeIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Payment t= new Payment();
        t.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmpCount;
    private javax.swing.JLabel EmpID;
    private javax.swing.JLabel EmpMarital;
    private javax.swing.JLabel EmpSalary;
    private javax.swing.JLabel EmpSelect;
    private javax.swing.JLabel EmpfName;
    private javax.swing.JLabel Empg;
    private javax.swing.JLabel EmplName;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCountry;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jEmployeeID;
    private javax.swing.JTextField jFirstName;
    private javax.swing.JComboBox jGender;
    private javax.swing.JTextField jLastName;
    private javax.swing.JComboBox jMaritalStatus;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRegister;
    private javax.swing.JButton jRetrieve;
    private javax.swing.JTextField jSalary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jSelect;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
