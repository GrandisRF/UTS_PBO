
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkomm
 */
public class Peminjaman extends javax.swing.JFrame {
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";

    /**
     * Creates new form Peminjaman
     */
    public Peminjaman() {
        initComponents();
        selectData();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAnggota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        novel = new javax.swing.JRadioButton();
        pengetahuan = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        pelajaran = new javax.swing.JRadioButton();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kembali = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pinjam = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rdkembali = new javax.swing.JRadioButton();
        rdblm = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(28, 28, 43));
        jPanel5.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 102, 102));
        jLabel8.setFont(new java.awt.Font("Rod", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("PERPUSTAKAAN BIBLIOPHILE");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(290, 0, 400, 90);

        labeljam.setBackground(new java.awt.Color(255, 102, 102));
        labeljam.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        labeljam.setForeground(new java.awt.Color(255, 102, 102));
        labeljam.setText("Waktu");
        jPanel5.add(labeljam);
        labeljam.setBounds(900, 50, 80, 30);

        labeltanggal.setBackground(new java.awt.Color(255, 102, 102));
        labeltanggal.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        labeltanggal.setForeground(new java.awt.Color(255, 102, 102));
        labeltanggal.setText("Tanggal");
        jPanel5.add(labeltanggal);
        labeltanggal.setBounds(900, 10, 80, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1150, 90);

        jPanel1.setBackground(new java.awt.Color(28, 28, 43));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ISIAN DATA PEMINJAM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 200, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 250, 60);

        jPanel6.setBackground(new java.awt.Color(28, 28, 43));
        jPanel6.setForeground(new java.awt.Color(51, 204, 255));
        jPanel6.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Tanggal Kembali");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(10, 510, 130, 30);

        txtDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDendaActionPerformed(evt);
            }
        });
        jPanel6.add(txtDenda);
        txtDenda.setBounds(10, 600, 210, 30);

        jLabel3.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("No Anggota");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(10, 10, 130, 30);

        txtAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnggotaActionPerformed(evt);
            }
        });
        jPanel6.add(txtAnggota);
        txtAnggota.setBounds(10, 40, 210, 30);

        jLabel4.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Jenis Buku");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(10, 260, 130, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 210, 96);

        buttonGroup1.add(novel);
        novel.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        novel.setForeground(new java.awt.Color(44, 37, 153));
        novel.setText("Novel");
        novel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novelActionPerformed(evt);
            }
        });
        jPanel6.add(novel);
        novel.setBounds(10, 360, 200, 25);

        buttonGroup1.add(pengetahuan);
        pengetahuan.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        pengetahuan.setForeground(new java.awt.Color(44, 37, 153));
        pengetahuan.setText("Pengetahuan Umum");
        pengetahuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengetahuanActionPerformed(evt);
            }
        });
        jPanel6.add(pengetahuan);
        pengetahuan.setBounds(10, 330, 200, 25);

        jLabel5.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Nama Peminjam");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 70, 130, 30);

        buttonGroup1.add(pelajaran);
        pelajaran.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        pelajaran.setForeground(new java.awt.Color(44, 37, 153));
        pelajaran.setText("Pelajaran");
        pelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelajaranActionPerformed(evt);
            }
        });
        jPanel6.add(pelajaran);
        pelajaran.setBounds(10, 300, 200, 25);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel6.add(txtNama);
        txtNama.setBounds(10, 100, 210, 30);

        jLabel6.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Alamat Peminjam");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(10, 130, 130, 30);
        jPanel6.add(kembali);
        kembali.setBounds(10, 540, 210, 30);

        jLabel7.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Judul Buku");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(10, 390, 130, 30);

        jLabel9.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Status");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(10, 630, 130, 30);
        jPanel6.add(pinjam);
        pinjam.setBounds(10, 480, 210, 30);

        jLabel10.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Tanggal Pinjam");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(10, 450, 130, 30);

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });
        jPanel6.add(txtJudul);
        txtJudul.setBounds(10, 420, 210, 30);

        jLabel11.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Denda");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(10, 570, 130, 30);

        rdkembali.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        rdkembali.setForeground(new java.awt.Color(52, 32, 113));
        rdkembali.setText("Kembali");
        rdkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdkembaliActionPerformed(evt);
            }
        });
        jPanel6.add(rdkembali);
        rdkembali.setBounds(10, 660, 100, 30);

        rdblm.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        rdblm.setForeground(new java.awt.Color(52, 32, 113));
        rdblm.setText("Single");
        rdblm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdblmActionPerformed(evt);
            }
        });
        jPanel6.add(rdblm);
        rdblm.setBounds(120, 660, 120, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 170, 250, 720);

        jPanel3.setBackground(new java.awt.Color(28, 28, 43));
        jPanel3.setForeground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);

        btnSave.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(25, 14, 88));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(170, 20, 100, 25);

        btnDelete.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(25, 14, 88));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(300, 20, 100, 25);

        Reset.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(25, 14, 88));
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset);
        Reset.setBounds(430, 20, 100, 25);

        Print.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(25, 14, 88));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel3.add(Print);
        Print.setBounds(560, 20, 100, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(260, 100, 890, 60);

        jPanel4.setBackground(new java.awt.Color(28, 28, 43));
        jPanel4.setForeground(new java.awt.Color(51, 204, 255));
        jPanel4.setLayout(null);

        tblData.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Anggota", "Nama Peminjam", "Alamat Peminjam", "Jenis Buku", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali", "Denda", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 880, 90);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 170, 890, 720);

        setBounds(0, 0, 1163, 934);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       String Pinjam = dateFormat.format(pinjam.getDate());
       String Kembali = dateFormat.format(kembali.getDate());
       String JNS = "";
            if (pelajaran.isSelected())
            {
                JNS = "Pelajaran";
            } else {
                JNS = "Pengetahuan Umum";
            } 
            if (novel.isSelected())
            {
                JNS = "Novel";
            }
        String ST = "";
            if (rdkembali.isSelected())
            { 
                     ST = "Kembali";
                     
            } if (rdblm.isSelected())
                ST = "Belum Kembali";
            
             if (txtAnggota.getText().equals("") ||txtNama.getText().equals("") ||txtAlamat.getText().equals("")
                || JNS.equals("") || txtJudul.getText().equals("")
                || pinjam.equals("") || kembali.equals("") 
                || txtDenda.getText().equals("") || ST.equals("")){
        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", 
        JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            String SQL = "INSERT INTO tb_peminjam (No Anggota, Nama Peminjam, Alamat Peminjam, Jenis Buku, Judul Buku"
                    + ",Tanggal Pinjam, Tanggal Kembali, Denda, Status)"
            + "VALUES ('"+txtAnggota.getText()+"','"+txtNama.getText()+"','"+txtAlamat.getText()+"','"+JNS+"',"
            + "'"+txtJudul.getText()+"','"+pinjam+"','"+kembali+"','"+txtDenda.getText()+"','"+ST+"',)";
            int status = KoneksiDB.execute(SQL);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String Nama = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_peminjam WHERE Nama='"+Nama+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", 
            JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtAnggota.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        buttonGroup1.clearSelection();
        txtJudul.setText("");
        ((JTextField)pinjam.getDateEditor().getUiComponent()).setText("");
        ((JTextField)kembali.getDateEditor().getUiComponent()).setText("");
        txtDenda.setText("");
        buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}      ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
            
        } catch (java.awt.print.PrinterException ex) {
           System.err.format("Cannot print %s%n", e.getMessage());
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            txtAnggota.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText(tblData.getValueAt(baris,1).toString());
            txtAlamat.setText(tblData.getValueAt(baris,2).toString());
            if ("Pelajaran".equals(tblData.getValueAt(baris, 3).toString())) {
                pelajaran.setSelected(true);
            }
            else {
                pengetahuan.setSelected(true);
            }
            if ("Novel".equals(tblData.getValueAt(baris,4).toString())){
                novel.setSelected(true);
            }     
            txtJudul.setText(tblData.getValueAt(baris, 5).toString());
            txtDenda.setText(tblData.getValueAt(baris, 6).toString());
            if ("Kembali".equals(tblData.getValueAt(baris, 7).toString())) {
                rdkembali.setSelected(true);
            }
            else {
                rdblm.setSelected(true);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDendaActionPerformed

    private void txtAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnggotaActionPerformed

    private void novelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novelActionPerformed

    private void pengetahuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengetahuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pengetahuanActionPerformed

    private void pelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelajaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelajaranActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void rdkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdkembaliActionPerformed

    private void rdblmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdblmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdblmActionPerformed

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
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton Reset;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser kembali;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton novel;
    private javax.swing.JRadioButton pelajaran;
    private javax.swing.JRadioButton pengetahuan;
    private com.toedter.calendar.JDateChooser pinjam;
    private javax.swing.JRadioButton rdblm;
    private javax.swing.JRadioButton rdkembali;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtAnggota;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

  
    private void setTanggal() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyyy");
        labeltanggal.setText(kal.format(skrg));
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setJam() {
    //To change body of generated methods, choose Tools | Templates.
        ActionListener taskPerformed = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getHours();        
                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                labeljam.setText("Jam" +jam + ":" + menit + ":" + detik);
            }
        } ;
        new Timer(10, taskPerformed).start();
    }

    private void selectData() {
        
            String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat","Umur","Status","Hobi"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM t_siswa";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try {
                while(rs.next()) {
                    String NIS = rs.getString(1);
                    String NamaSiswa = rs.getString(2);
                    String JenisKelamin = "";
                    if("L".equals(rs.getString(3))){
                        JenisKelamin = "Laki-Laki";
                    } else {
                        JenisKelamin = "Perempuan";
                    }
                    String Kelas = rs.getString(4);
                    String Email = rs.getString(5);
                    String Alamat = rs.getString(6);
                    String Umur = rs.getString(7);
                    String Status = "";
                    if("Single".equals(rs.getString(8))){
                        Status = "Single";
                    } else {
                        Status = "Jomblo";
                    }
                    String Hobi = rs.getString(9);
                    
                    String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,Umur,Status,Hobi};
                    dtm.addRow(data);
                }
                       
                } catch (SQLException ex){
                    Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
                }
             tblData.setModel(dtm);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}