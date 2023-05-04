/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giaodien;
import entity.entityCTHD;
import entity.entityKHO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HungNguyen
 */
public class formCTHD1 extends javax.swing.JFrame {

    /**
     * Creates new form formCTHD1
     */
    public formCTHD1() throws ClassNotFoundException, SQLException 
    {
        initComponents();
        LoadData3TableSP();
        LoadData3TableHD();
    }

    private void LoadData3TableSP() throws ClassNotFoundException, SQLException
    {
        List<entityKHO> lstHH = dao.daoKHO.getAllHH();
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.addColumn("IDSP");
        tblModel.addColumn("TenSP");
        tblModel.addColumn("Gia");
        tblModel.addColumn("TenNV");
        for (entityKHO ID : lstHH)
        {
            Vector<String> row = new Vector<String>();
                row.addElement(String.valueOf(ID.getIDSP()));
                row.addElement(ID.getTenSP());
                row.addElement(String.valueOf(ID.getGia()));
                row.addElement(ID.getTenNV());
            tblModel.addRow(row);
        }
        tblSP.setModel(tblModel);
    }
    
    private void LoadData3ControlSP() throws SQLException, ClassNotFoundException, ParseException
    {
        if (tblSP.getSelectedRow() != -1) {
            int r = tblSP.getSelectedRow();
            List<entityKHO> lstHH = dao.daoKHO.getAllHH();
            entityKHO sp = lstHH.get(r);
            txtIDSP.setText(String.valueOf(sp.getIDSP()));
            txtTenSP.setText(sp.getTenSP());
            txtGia.setText(String.valueOf(sp.getGia()));
            
        }
    }
    
    private void LoadData3TableHD() throws ClassNotFoundException, SQLException
    {
        List<entityCTHD> lstHD = dao.daoCTHD.getAllHD();
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.addColumn("IDHD");
        tblModel.addColumn("TenSP");
        tblModel.addColumn("Gia");
        tblModel.addColumn("SL");
        tblModel.addColumn("TenKH");
        tblModel.addColumn("SDT");
        tblModel.addColumn("IDSP");
        for (entityCTHD ID : lstHD)
        {
            Vector<String> row = new Vector<String>();
                row.addElement(String.valueOf(ID.getIDHD()));
                row.addElement(ID.getTenSP());
                row.addElement(String.valueOf(ID.getGia()));
                row.addElement(String.valueOf(ID.getSL()));
                row.addElement(ID.getTenKH());
                row.addElement(String.valueOf(ID.getSDT()));
                row.addElement(String.valueOf(ID.getIDSP()));
            tblModel.addRow(row);
        }
        tblCTHD.setModel(tblModel);
    }
    
    private void LoadData3ControlHD() throws SQLException, ClassNotFoundException, ParseException
    {
        if (tblCTHD.getSelectedRow() != -1) {
            int r = tblCTHD.getSelectedRow();
            List<entityCTHD> lstHD = dao.daoCTHD.getAllHD();
            entityCTHD hd = lstHD.get(r);
            txtIDHD.setText(String.valueOf(hd.getIDHD()));
            txtTenSP.setText(hd.getTenSP());
            txtGia.setText(String.valueOf(hd.getGia()));
            txtSL.setText(String.valueOf(hd.getSL()));
            txtTenKH.setText(hd.getTenKH());
            txtSDT.setText(String.valueOf(hd.getSDT()));
            txtIDSP.setText(String.valueOf(hd.getIDSP()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDHD = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDSP = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IDHD");

        jLabel2.setText("TenSP");

        jLabel3.setText("Gia");

        jLabel4.setText("So Luong");

        jLabel5.setText("IDSP");

        jLabel6.setText("Ten KH");

        jLabel7.setText("SDT");

        btnThem.setText("Them");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel8.setText("Bang san pham");

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCTHD);

        jButton5.setText("Thoat");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel9.setText("Bang hoa don");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDHD)
                            .addComponent(txtTenSP)
                            .addComponent(txtGia)
                            .addComponent(txtSL)
                            .addComponent(txtIDSP, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKH)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnXoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnThem)
                                    .addGap(114, 114, 114)
                                    .addComponent(btnSua)))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnClear))))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        entityCTHD hd1 = new entityCTHD();
        hd1.setIDHD(Integer.valueOf(txtIDHD.getText()));
        hd1.setTenSP(txtTenSP.getText());
        hd1.setGia(Float.valueOf(txtGia.getText()));
        hd1.setSL(Integer.valueOf(txtSL.getText()));
        hd1.setTenKH(txtTenKH.getText());
        hd1.setSDT(Integer.valueOf(txtSDT.getText()));
        hd1.setIDSP(Integer.valueOf(txtIDSP.getText()));
        try 
        {
            dao.daoCTHD.InsertHD(hd1);
            LoadData3TableHD();
            JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        entityCTHD hd1 = new entityCTHD();
        hd1.setIDHD(Integer.valueOf(txtIDHD.getText()));
        hd1.setTenSP(txtTenSP.getText());
        hd1.setGia(Float.valueOf(txtGia.getText()));
        hd1.setSL(Integer.valueOf(txtSL.getText()));
        hd1.setTenKH(txtTenKH.getText());
        hd1.setSDT(Integer.valueOf(txtSDT.getText()));
        hd1.setIDSP(Integer.valueOf(txtIDSP.getText()));        
        try {
            dao.daoCTHD.UpdateHD(hd1);
            LoadData3TableHD();
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_btnSuaMouseClicked
    }
        
    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
        try {
            LoadData3ControlSP();
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblSPMouseClicked

    private void tblCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHDMouseClicked
        // TODO add your handling code here:
        try {
            LoadData3ControlHD();
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblCTHDMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        try {
            dao.daoCTHD.DeleteHD(txtIDSP.getText());
            LoadData3TableHD();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        txtIDHD.setText("");
        txtTenSP.setText("");
        txtGia.setText("");
        txtSL.setText("");
        txtIDSP.setText("");
        txtTenKH.setText("");
        txtSDT.setText("");
        try {
            LoadData3TableHD();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            LoadData3TableSP();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnClearMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        formMain main = new formMain();
                main.show();
                this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(formCTHD1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCTHD1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCTHD1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCTHD1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                try 
                {
                    new formCTHD1().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(formCTHD1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtIDHD;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
