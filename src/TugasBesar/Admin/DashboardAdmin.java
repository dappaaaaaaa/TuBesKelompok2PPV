/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasBesar.Admin;

import java.sql.Blob;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DashboardAdmin extends javax.swing.JFrame {

    DefaultTableModel model;
    boolean statusSimpan = true;
    Connection con;
    Statement perintah;
    ResultSet rs;
    String path2 = null;

    public DashboardAdmin() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        con = Database.getConnection();

        // Initialize the Statement object
        try {
            perintah = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    this,
                    "Error initializing database connection",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NamaTf = new javax.swing.JTextField();
        BaruButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        HargaTf = new javax.swing.JTextField();
        UploadButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inputfoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        SimpanButton = new javax.swing.JButton();
        UbahButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        BatalButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IdTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(246, 247, 235));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 0, 36)); // NOI18N
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        jLabel2.setText("Input Menu Disini");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        NamaTf.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        getContentPane().add(NamaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, -1));

        BaruButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        BaruButton.setText("Baru");
        BaruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaruButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BaruButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel4.setText("Harga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        HargaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTfActionPerformed(evt);
            }
        });
        getContentPane().add(HargaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 370, -1));

        UploadButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 90, 30));

        jLabel5.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel5.setText("Foto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        inputfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        inputfoto.setPreferredSize(new java.awt.Dimension(142, 78));
        getContentPane().add(inputfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 142, 90));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Menu", "Nama", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 690, 180));

        SimpanButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        SimpanButton.setText("Simpan");
        SimpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SimpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        UbahButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        UbahButton.setText("Ubah");
        UbahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UbahButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        HapusButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HapusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        BatalButton.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        BatalButton.setText("Batal");
        BatalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BatalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel6.setText("ID Menu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        getContentPane().add(IdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 370, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void clear() {
        IdTf.setEnabled(false);
        NamaTf.setEnabled(false);
        HargaTf.setEnabled(false);
        BaruButton.setEnabled(true);
        BatalButton.setEnabled(false);
        SimpanButton.setEnabled(false);
        UbahButton.setEnabled(false);
        HapusButton.setEnabled(false);
        NamaTf.setText("");
        HargaTf.setText("");
        IdTf.setText("");
        inputfoto.setIcon(null);
    }

    void tampil() {
        try {
            // Step 4 Membuat Query
            String sql = "SELECT * FROM menu";
            model.setRowCount(0);  // Clear existing rows
            model.fireTableDataChanged();

            rs = perintah.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3) // Assuming the third column is "harga"
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Database tidak berhasil terkoneksi",
                    "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void update() {
        try {
            // Retrieve the existing image data
            byte[] existingImageData = null;
            String selectQuery = "SELECT foto FROM menu WHERE id_Menu = ?";
            try (PreparedStatement selectStatement = con.prepareStatement(selectQuery)) {
                selectStatement.setString(1, IdTf.getText());
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {
                        Blob existingImageBlob = resultSet.getBlob("foto");
                        if (existingImageBlob != null) {
                            existingImageData = existingImageBlob.getBytes(1, (int) existingImageBlob.length());
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error retrieving existing image data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Update the image data based on whether a new image is selected or not
            String updateQuery = "UPDATE menu SET nama_menu = ?, harga = ?, foto = ? WHERE id_Menu = ?";
            try (PreparedStatement preparedStatement = con.prepareStatement(updateQuery)) {
                // Set values for other columns
                preparedStatement.setString(1, NamaTf.getText());
                preparedStatement.setString(2, HargaTf.getText());

                // If 'foto' is a BLOB column, set the image data based on conditions
                if (path2 != null) {
                    try (InputStream inputStream = new FileInputStream(new File(path2))) {
                        byte[] newImageData = inputStream.readAllBytes();
                        preparedStatement.setBytes(3, newImageData);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else if (existingImageData != null) {
                    // If no new image is selected, and there is an existing image, set the existing image
                    preparedStatement.setBytes(3, existingImageData);
                } else {
                    // If no new image is selected and no existing image, set it to NULL
                    preparedStatement.setBinaryStream(3, null);
                }

                // Set the ID for the WHERE clause
                preparedStatement.setString(4, IdTf.getText());

                // Execute the UPDATE statement
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Update successful for ID: " + IdTf.getText());
                } else {
                    System.out.println("No rows updated for ID: " + IdTf.getText());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    this,
                    "Error updating data: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    private void BaruButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaruButtonActionPerformed
        // TODO add your handling code here:
        IdTf.setEnabled(true);
        NamaTf.setEnabled(true);
        HargaTf.setEnabled(true);
        BatalButton.setEnabled(true);
        SimpanButton.setEnabled(true);
        BaruButton.setEnabled(false);
        UploadButton.setEnabled(true);
    }//GEN-LAST:event_BaruButtonActionPerformed

    private void HargaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaTfActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        if (f != null) { // Check if the file is selected
            path2 = f.getAbsolutePath();  // Use the class-level variable

            try {
                BufferedImage bi = ImageIO.read(f);
                Image image = bi.getScaledInstance(inputfoto.getWidth(), inputfoto.getHeight(), Image.SCALE_SMOOTH);
                inputfoto.setIcon(new ImageIcon(image));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error loading image.");
            }
        } else {
            System.out.println("No file selected."); // Provide a message or handle the case where no file is selected
        }
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void SimpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanButtonActionPerformed
// Validate input fields
        if (IdTf.getText().isEmpty() || NamaTf.getText().isEmpty() || HargaTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill in all required fields.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Check if it's a new entry or an update
        if (statusSimpan) { // Data baru
            // Insert new data
            String insertQuery = "INSERT INTO menu (id_Menu, nama_menu, harga, foto) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
                // Set values for other columns
                preparedStatement.setString(1, IdTf.getText());
                preparedStatement.setString(2, NamaTf.getText());
                preparedStatement.setString(3, HargaTf.getText());

                // If 'foto' is a BLOB column, read the image data into a byte array
                if (path2 != null) {
                    try (InputStream inputStream = new FileInputStream(new File(path2))) {
                        byte[] imageData = inputStream.readAllBytes();
                        preparedStatement.setBytes(4, imageData);
                    } catch (IOException ex) {
                        Logger.getLogger(DashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    preparedStatement.setBinaryStream(4, null);
                }

                // Execute the INSERT statement
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Insert successful for ID: " + IdTf.getText());
                } else {
                    System.out.println("No rows inserted for ID: " + IdTf.getText());
                }

                // Update the table model
                model.addRow(new Object[]{
                    IdTf.getText(),
                    NamaTf.getText(),
                    HargaTf.getText()
                });

                // Reset input fields and clear image
                clear();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(
                        this,
                        "Error inserting data: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Data update
            int selectedRow = table.getSelectedRow();

            if (selectedRow != -1) {
                model.setValueAt(IdTf.getText(), selectedRow, 0);
                model.setValueAt(NamaTf.getText(), selectedRow, 1);
                model.setValueAt(HargaTf.getText(), selectedRow, 2);
                update();

                // Reset input fields and clear image
                clear();
            } else {
                // Handle the case when no row is selected
                JOptionPane.showMessageDialog(
                        this,
                        "Please select a row to update.",
                        "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_SimpanButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
        NamaTf.setEnabled(false);
        IdTf.setEnabled(false);
        HargaTf.setEnabled(false);
        BaruButton.setEnabled(true);
        BatalButton.setEnabled(false);
        SimpanButton.setEnabled(false);
        UbahButton.setEnabled(false);
        HapusButton.setEnabled(false);
        UploadButton.setEnabled(false);
        BaruButton.requestFocus();
//        setExtendedState(MAXIMIZED_BOTH);

        tampil();  // Fetch data from the database and update the table model

        // Tambahkan MouseListener ke jTable1 dalam constructor atau method initUI kelas Anda
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedIndexRow = table.getSelectedRow();

                IdTf.setText(model.getValueAt(selectedIndexRow, 0).toString());
                NamaTf.setText(model.getValueAt(selectedIndexRow, 1).toString());
                HargaTf.setText(model.getValueAt(selectedIndexRow, 2).toString());

                BaruButton.setEnabled(false);
                BatalButton.setEnabled(true);
                HapusButton.setEnabled(true);
                SimpanButton.setEnabled(false);
                UbahButton.setEnabled(true);
            }
        });


    }//GEN-LAST:event_formWindowOpened

    private void BatalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_BatalButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            try {
                // Assuming that the 'foto' column is the third column in the table
                String idMenu = model.getValueAt(selectedRow, 0).toString();
                String nama = model.getValueAt(selectedRow, 1).toString();
                String harga = model.getValueAt(selectedRow, 2).toString();

                IdTf.setText(idMenu);
                NamaTf.setText(nama);
                HargaTf.setText(harga);

                // Fetch the Blob directly from the database based on the 'idMenu'
                String sql = "SELECT foto FROM menu WHERE id_Menu = ?";
                try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                    pstmt.setString(1, idMenu);
                    try (ResultSet resultSet = pstmt.executeQuery()) {
                        if (resultSet.next()) {
                            Blob image = resultSet.getBlob("foto");

                            if (image != null) {
                                byte[] bytea = image.getBytes(1, (int) image.length());

                                ImageIcon icon = new ImageIcon(bytea);
                                inputfoto.setIcon(icon);
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace(); // Handle SQLException
                }
            } catch (Exception ex) {
                ex.printStackTrace(); // Handle other exceptions
            }

            UbahButton.setEnabled(true);
            HapusButton.setEnabled(true);
            BatalButton.setEnabled(true);
            BaruButton.setEnabled(false);
            UbahButton.requestFocus();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void UbahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahButtonActionPerformed

        IdTf.setEnabled(false);
        NamaTf.setEnabled(true);
        HargaTf.setEnabled(true);
        SimpanButton.setEnabled(true);
        UploadButton.setEnabled(true);
        HapusButton.setEnabled(false);

        // Set statusSimpan to false to indicate update mode
        statusSimpan = false;

    }//GEN-LAST:event_UbahButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();

        if (selectedRow >= 0) {
            String idMenu = model.getValueAt(selectedRow, 0).toString();

            // Confirm with the user before deleting
            int option = JOptionPane.showConfirmDialog(this, "Kamu yakin ingin menghapus menu ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                try {
                    // Delete from the database
                    String deleteQuery = "DELETE FROM menu WHERE id_Menu = ?";
                    try (PreparedStatement deleteStatement = con.prepareStatement(deleteQuery)) {
                        deleteStatement.setString(1, idMenu);
                        deleteStatement.executeUpdate();
                    }

                    // Delete from the table model
                    model.removeRow(selectedRow);

                    // Reset input fields and clear image
                    clear();

                    JOptionPane.showMessageDialog(this, "Menu Telah dihapus.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error deleting menu: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a menu to delete.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_HapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaruButton;
    private javax.swing.JButton BatalButton;
    private javax.swing.JButton HapusButton;
    private javax.swing.JTextField HargaTf;
    private javax.swing.JTextField IdTf;
    private javax.swing.JTextField NamaTf;
    private javax.swing.JButton SimpanButton;
    private javax.swing.JButton UbahButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JLabel inputfoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
