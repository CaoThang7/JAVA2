
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class QLSV extends javax.swing.JFrame {
    SinhVienList svl=new SinhVienList();
     String[]headers={"HỌ VÀ TÊN","ĐIỂM ","NGÀNH ","HỌC LỰC ","THƯỞNG "};
    DefaultTableModel model=new  DefaultTableModel(headers,0);
    
    Comparator<sinhvien> sxtt=new Comparator<sinhvien>(){
        @Override
        public int compare(sinhvien o1,sinhvien o2){
            return o1.name.compareTo(o2.name);
        }
    };
    
     Comparator<sinhvien> sxtd=new Comparator<sinhvien>(){
        @Override
        public int compare(sinhvien o1,sinhvien o2){
            Double d1=o1.marks;
            Double d2=o2.marks;
            return d1.compareTo(d2);
        }
    };
    /**
     * Creates new form QLSV
     */
    public QLSV() {
        initComponents();
        this.setLocationRelativeTo(null);
        thang.setModel(model);
        
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
        jLabel5 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        txt_diem = new javax.swing.JTextField();
        nganh = new javax.swing.JComboBox<>();
        hocluc = new javax.swing.JTextField();
        CheckBox = new javax.swing.JCheckBox();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        thang = new javax.swing.JTable();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÍ SINH VIÊN");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("QUẢN LÍ SINH VIÊN");

        jLabel2.setText("HỌ VÀ TÊN ");

        jLabel3.setText("ĐIỂM ");

        jLabel4.setText("NGÀNH");

        jLabel5.setText("HỌC LỰC");

        nganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm ", "WEB ", "Lập trình di động ", "Android " }));

        CheckBox.setText("Có phần thưởng?");

        btn_them.setText("THÊM");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("XOÁ");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_capnhat.setText("CẬP NHẬT");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        btn_moi.setText("NHẬP MỚI");
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

        thang.setModel(new javax.swing.table.DefaultTableModel(
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
        thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(thang);

        a.setText("Sắp xếp theo tên");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setText("Sắp xếp theo điểm");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckBox)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_hoten)
                                        .addComponent(txt_diem)
                                        .addComponent(hocluc, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        sinhvien sv=new sinhvien();
        sv.name= txt_hoten.getText();
        sv.marks= Double.parseDouble(txt_diem.getText());
        sv.major= nganh.getSelectedItem().toString();
        hocluc.setText(sv.getGrade());
        CheckBox.setSelected(sv.isBonus());
        add(sv);
        loadTable();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here
        int r=thang.getSelectedRow();
        svl.svl.remove(r);
        loadTable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thangMouseClicked
        // TODO add your handling code here:
          int r=thang.getSelectedRow();
        txt_hoten.setText(thang.getValueAt(r, 0).toString());
        txt_diem.setText(thang.getValueAt(r, 1).toString());
        nganh.setSelectedItem(thang.getValueAt(r, 2).toString());
         hocluc.setText(thang.getValueAt(r, 3).toString());
         String thuong=thang.getValueAt(r, 4).toString();
        if(thuong.equalsIgnoreCase("true"))
            CheckBox.setSelected(true);
        else
            CheckBox.setSelected(false);
        loadTable();
    }//GEN-LAST:event_thangMouseClicked

    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        // TODO add your handling code here:
         int n=thang.getSelectedRow();
         //sinhvien sv=new sinhvien();
         sinhvien sv=svl.svl.get(n);
         
        svl.svl.get(n).name=txt_hoten.getText().toString();
        svl.svl.get(n).marks= Double.parseDouble(txt_diem.getText());
        svl.svl.get(n).major= nganh.getSelectedItem().toString();
        hocluc.setText(sv.getGrade()); 
        
        
        CheckBox.setSelected(sv.isBonus());
        
        loadTable();
    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_moiActionPerformed
 
    
    public void reset(){
        txt_hoten.setText("");
        txt_diem.setText("");
        hocluc.setText("");
        CheckBox.setSelected(false);
        
    }
    
    
    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
        Collections.sort(svl.svl,sxtt);
        loadTable();
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        Collections.sort(svl.svl,sxtd);
        loadTable();
    }//GEN-LAST:event_bActionPerformed
    
    public void loadTable(){
        model.setRowCount(0);
        Object rowData[]=new Object[5];
        for(int i=0;i<svl.svl.size();i++){
            
            rowData[0]=svl.svl.get(i).name;
            rowData[1]=svl.svl.get(i).marks;
            rowData[2]=svl.svl.get(i).major;
            rowData[3]=svl.svl.get(i).getGrade();
            rowData[4]=svl.svl.get(i).isBonus();
            model.addRow(rowData);
        }
    }
    
    
     public void add(sinhvien us){
        svl.them(us);
    }
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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JTextField hocluc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nganh;
    private javax.swing.JTable thang;
    private javax.swing.JTextField txt_diem;
    private javax.swing.JTextField txt_hoten;
    // End of variables declaration//GEN-END:variables

   
}
