/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.LoaiPhongBLL;
import BLL.PhongBLL;
import Entity.LoaiPhong;
import Utilities.ControlFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author RumIT
 */
public class jpanel_QLPhong extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_QLPhong
     */
    public jpanel_QLPhong() {
        initComponents();
        //set combobox
        cbb_LoaiPhong.removeAllItems();
        //cbb_LoaiPhong.addItem("Phòng đơn thường");
        //cbb_LoaiPhong.addItem("Phòng đơn VIP");
        //cbb_LoaiPhong.addItem("Phòng đôi thường");
        //cbb_LoaiPhong.addItem("Phòng đôi VIP");
        
        for(LoaiPhong loai : loaiPhongBLL.getAllLoaiPhong()){
            cbb_LoaiPhong.addItem(loai.getTenLoaiP());
        }
        cbb_TrangThai.removeAllItems();
        cbb_TrangThai.addItem("Trống");
        //cbb_TrangThai.addItem("ĐANG SỬ DỤNG");
        cbb_TrangThai.addItem("Tạm ngưng");
        cbb_LoaiPhong.setVisible(false);
        cbb_TrangThai.setVisible(false);

        
        //load dữ liệu phòng lên bảng 
        control.bindingPhong(table_DSPhong, phongBLL.getAllPhong());
        
        //ẩn các button  sửa và xác nhận
        btn_Sua.setVisible(true);
        btn_Sua.setEnabled(false);
        btn_XacNhan.setVisible(false);
        
        table_DSPhong.getTableHeader().setReorderingAllowed(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DSPhong = new javax.swing.JTable();
        panel_ThongTin = new javax.swing.JPanel();
        btn_Sua = new javax.swing.JButton();
        btn_XacNhan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_TinhTrang = new javax.swing.JLabel();
        lb_Phong = new javax.swing.JLabel();
        lb_Loai = new javax.swing.JLabel();
        lb_LoaiPhong = new javax.swing.JLabel();
        lb_TrangThai = new javax.swing.JLabel();
        cbb_TrangThai = new javax.swing.JComboBox<>();
        cbb_LoaiPhong = new javax.swing.JComboBox<>();
        lb_Ten = new javax.swing.JLabel();
        lb_GhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_GhiChu = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        table_DSPhong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table_DSPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PHÒNG", "LOẠI PHÒNG", "TRẠNG THÁI", "GHI CHÚ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_DSPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DSPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_DSPhong);

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_ThongTin.setBackground(new java.awt.Color(255, 255, 255));
        panel_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN PHÒNG"));

        btn_Sua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/pencil.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_XacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_XacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/checked.png"))); // NOI18N
        btn_XacNhan.setText("Xác nhận");
        btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lb_TinhTrang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_Phong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_Phong.setText("Phòng");

        lb_Loai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_LoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_LoaiPhong.setText("Loại phòng");

        lb_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_TrangThai.setText("Trạng thái");

        cbb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_TrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_TrangThaiActionPerformed(evt);
            }
        });

        cbb_LoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_LoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_LoaiPhongActionPerformed(evt);
            }
        });

        lb_Ten.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_GhiChu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_GhiChu.setText("Ghi chú");

        txtA_GhiChu.setColumns(20);
        txtA_GhiChu.setRows(3);
        txtA_GhiChu.setTabSize(3);
        txtA_GhiChu.setAutoscrolls(false);
        txtA_GhiChu.setBorder(null);
        jScrollPane2.setViewportView(txtA_GhiChu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_LoaiPhong)
                    .addComponent(lb_TrangThai)
                    .addComponent(lb_GhiChu)
                    .addComponent(lb_Phong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_Ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_TinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_Loai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbb_LoaiPhong, 0, 217, Short.MAX_VALUE)
                                    .addComponent(cbb_TrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Phong)
                    .addComponent(lb_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_LoaiPhong)
                    .addComponent(cbb_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Loai))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TrangThai)
                    .addComponent(cbb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_TinhTrang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_GhiChu)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_ThongTinLayout = new javax.swing.GroupLayout(panel_ThongTin);
        panel_ThongTin.setLayout(panel_ThongTinLayout);
        panel_ThongTinLayout.setHorizontalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_XacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ThongTinLayout.setVerticalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_XacNhan)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //--bắt đầu--khởi tạo các đối tượng cần thiết
    
    ControlFormat control = new ControlFormat();
    LoaiPhongBLL loaiPhongBLL = new LoaiPhongBLL();
    PhongBLL phongBLL = new PhongBLL();
    
   
    
    //// --end-- các đối tượng cần thiêt
    private void cbb_LoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_LoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_LoaiPhongActionPerformed

    private void cbb_TrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_TrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_TrangThaiActionPerformed

    private void table_DSPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DSPhongMouseClicked
        //ẩn cbb
        cbb_LoaiPhong.setVisible(false);
        cbb_TrangThai.setVisible(false);
        //ẩn button xác nhận
        btn_XacNhan.setVisible(false);
        btn_Sua.setVisible(true);
        
        int row = table_DSPhong.getSelectedRow();
        //đổ dữ liệu vào mục thông tin phòng
        lb_TinhTrang.setVisible(true);
        lb_Loai.setVisible(true);
        
        lb_Ten.setText(table_DSPhong.getValueAt(row, 0).toString());
        lb_Loai.setText(table_DSPhong.getValueAt(row, 1).toString());
        lb_TinhTrang.setText(table_DSPhong.getValueAt(row, 2).toString());
        txtA_GhiChu.setText(table_DSPhong.getValueAt(row, 3).toString());
        
        //kiểm tra nếu phòng đang không trong trạng thái sử dụng thì cho nút Sửa hoạt động
        if(!table_DSPhong.getValueAt(row, 2).toString().equals("Đã cho thuê")){
            btn_Sua.setEnabled(true);
        }else{
            btn_Sua.setEnabled(false);
        }
            
    }//GEN-LAST:event_table_DSPhongMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        //ẩn lable thông tin phòng
        lb_TinhTrang.setVisible(false);
        lb_Loai.setVisible(false);
        //hiện cbb
        cbb_TrangThai.setVisible(true);
        if(lb_TinhTrang.getText().equals("Trống"))
            cbb_TrangThai.setSelectedItem("Trống");
        //if(lb_TinhTrang.getText().equals("ĐANG SỬ DỤNG"))
        //    cbb_TrangThai.setSelectedIndex(1);
        if(lb_TinhTrang.getText().equals("Tạm ngưng"))
            cbb_TrangThai.setSelectedItem("Tạm ngưng");
        
        cbb_LoaiPhong.setVisible(true);
        //select đúng vị trí
        cbb_LoaiPhong.setSelectedItem(lb_Loai.getText());
        
        //ẩn nút Sửa
        btn_Sua.setVisible(false);
        //hiện nút xác nhận
        btn_XacNhan.setVisible(true);
    }//GEN-LAST:event_btn_SuaActionPerformed

    //Xác nhận sửa thông tin phòng
    private void btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanActionPerformed
        //update thông tin và thông báo
        //lấy thông tin 
        String tenphong = lb_Ten.getText();
        String tinhtrang = cbb_TrangThai.getSelectedItem().toString();
        String tenloaiphong = cbb_LoaiPhong.getSelectedItem().toString();
        String ghichu = txtA_GhiChu.getText();
        //từ tên lấy mã
        String maloai = loaiPhongBLL.getIdByName(tenloaiphong);
        //ten
        phongBLL.updatePhong(tenphong, tinhtrang, maloai,ghichu);
        
        //LOAD LẠI DỮ LIÊU
        control.bindingPhong(table_DSPhong,phongBLL.getAllPhong());
        //ẩn và hiện các component cần thiết
        cbb_TrangThai.setVisible(false);
        cbb_LoaiPhong.setVisible(false);
        btn_XacNhan.setVisible(false);
        lb_Ten.setText("");
        txtA_GhiChu.setText("");
        
        //hiện thông báo
        JOptionPane.showMessageDialog(this, "ĐÃ SỬA THÀNH CÔNG");
    }//GEN-LAST:event_btn_XacNhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JComboBox<String> cbb_LoaiPhong;
    private javax.swing.JComboBox<String> cbb_TrangThai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_GhiChu;
    private javax.swing.JLabel lb_Loai;
    private javax.swing.JLabel lb_LoaiPhong;
    private javax.swing.JLabel lb_Phong;
    private javax.swing.JLabel lb_Ten;
    private javax.swing.JLabel lb_TinhTrang;
    private javax.swing.JLabel lb_TrangThai;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JTable table_DSPhong;
    private javax.swing.JTextArea txtA_GhiChu;
    // End of variables declaration//GEN-END:variables
}
