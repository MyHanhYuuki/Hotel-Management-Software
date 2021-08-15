/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.CT_PhieuDichVuBLL;
import BLL.DichVuBLL;
import BLL.HoaDonBLL;
import BLL.PhieuDichVuBLL;
import Utilities.ControlFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RumIT
 */
public class DichVuForm extends javax.swing.JFrame {

    /**
     * Creates new form DichVuForm
     */
    public DichVuForm(){
        
    }
    String tenNV;
    String maPhieuDV;
    String maPhieuThue;
    public DichVuForm(String ma,String tennv) {
        initComponents();
        this.setLocationRelativeTo(null);
        maPhieuDV = ma;
        tenNV = tennv;
        this.setTitle("Phiếu dịch vụ");
        //load dữ liệu vào menu
        control.bindingMenu(table_Menu,dichvuBLL.layDichVuSanSang());
        //vô hiệu nút thêm và bớt
        btn_Them.setEnabled(false);
        btn_Bot.setEnabled(false);
        
        //load dữ liệu vào order
        control.bindingOrder(table_Order, ctdichvuBLL.layDichVuTheoPhieu(maPhieuDV));
        
        table_Menu.getTableHeader().setReorderingAllowed(false);
        table_Order.getTableHeader().setReorderingAllowed(false);
        
        //cập nhập lại tổng tiên ở lable tổng tiền
        capnhapTongTien();       
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
        panel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Contain = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Order = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Menu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lb_TenDV = new javax.swing.JLabel();
        txt_SoLuong = new javax.swing.JTextField();
        btn_Bot = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        lb_SoLuong = new javax.swing.JLabel();
        panel_TimKiem = new javax.swing.JPanel();
        lb_TimKiem = new javax.swing.JLabel();
        txt_TimKiem = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        lb_Tien = new javax.swing.JLabel();
        lb_TongTien = new javax.swing.JLabel();
        panel_Buttons = new javax.swing.JPanel();
        btn_Xong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));
        panel_bg.setMaximumSize(new java.awt.Dimension(920, 524));
        panel_bg.setMinimumSize(new java.awt.Dimension(920, 524));

        panel_Title.setBackground(new java.awt.Color(23, 93, 88));
        panel_Title.setPreferredSize(new java.awt.Dimension(633, 58));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU DỊCH VỤ");

        javax.swing.GroupLayout panel_TitleLayout = new javax.swing.GroupLayout(panel_Title);
        panel_Title.setLayout(panel_TitleLayout);
        panel_TitleLayout.setHorizontalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_TitleLayout.setVerticalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        panel_Contain.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DỊCH VỤ ĐANG DÙNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        table_Order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_OrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_Order);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        table_Menu.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_MenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Menu);

        lb_TenDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_TenDV.setForeground(new java.awt.Color(0, 0, 204));
        lb_TenDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_SoLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btn_Bot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Bot.setText("Bớt");
        btn_Bot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BotActionPerformed(evt);
            }
        });

        btn_Them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        lb_SoLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_SoLuong.setForeground(new java.awt.Color(255, 0, 51));
        lb_SoLuong.setText("Số lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SoLuong)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Bot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_TenDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_TenDV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_SoLuong)
                .addGap(1, 1, 1)
                .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Bot)
                .addContainerGap())
        );

        panel_TimKiem.setBackground(new java.awt.Color(255, 255, 255));

        lb_TimKiem.setText("TÌM KIẾM");

        btn_TimKiem.setText("TÌM KIẾM");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TimKiemLayout = new javax.swing.GroupLayout(panel_TimKiem);
        panel_TimKiem.setLayout(panel_TimKiemLayout);
        panel_TimKiemLayout.setHorizontalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_TimKiem)
                .addGap(18, 18, 18)
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem)
                .addContainerGap())
        );
        panel_TimKiemLayout.setVerticalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TimKiem)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_ContainLayout = new javax.swing.GroupLayout(panel_Contain);
        panel_Contain.setLayout(panel_ContainLayout);
        panel_ContainLayout.setHorizontalGroup(
            panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContainLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_ContainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_ContainLayout.setVerticalGroup(
            panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContainLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ContainLayout.createSequentialGroup()
                .addGroup(panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ContainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        lb_Tien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Tien.setForeground(new java.awt.Color(204, 0, 51));
        lb_Tien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Tien.setText("Tổng tiền");

        lb_TongTien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_TongTien.setForeground(new java.awt.Color(0, 0, 204));
        lb_TongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        panel_Buttons.setBackground(new java.awt.Color(23, 93, 88));

        javax.swing.GroupLayout panel_ButtonsLayout = new javax.swing.GroupLayout(panel_Buttons);
        panel_Buttons.setLayout(panel_ButtonsLayout);
        panel_ButtonsLayout.setHorizontalGroup(
            panel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        panel_ButtonsLayout.setVerticalGroup(
            panel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        btn_Xong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Xong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/checked.png"))); // NOI18N
        btn_Xong.setText("XONG");
        btn_Xong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
            .addComponent(panel_Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Tien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Xong, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(panel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Contain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addComponent(lb_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Xong)
                                .addComponent(lb_Tien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    ///
     //Khởi tạo các đối tượng cần thiết
    ControlFormat control = new ControlFormat();
    DichVuBLL dichvuBLL = new DichVuBLL();
    PhieuDichVuBLL phieudichvuBLL = new PhieuDichVuBLL();
    CT_PhieuDichVuBLL ctdichvuBLL = new CT_PhieuDichVuBLL();
    HoaDonBLL hoadonBLL = new HoaDonBLL();
    //hàm cập nhập lại tông tiền ở label tổng tiền
    public void capnhapTongTien(){
        //cập nhập lại tổng tiên ở lable tổng tiền
        int rows = table_Order.getRowCount();
        Double tongtien = 0.0;
        for(int i = 0; i < rows; i++){
        tongtien += Double.parseDouble(table_Order.getValueAt(i,3).toString());
        }
        lb_TongTien.setText(""+tongtien);
    }
    //
    //
    //
    private void table_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_MenuMouseClicked
        int row = table_Menu.getSelectedRow();
        lb_TenDV.setText(table_Menu.getValueAt(row, 0).toString());
        btn_Bot.setEnabled(false);
        btn_Them.setEnabled(true);
        table_Order.clearSelection();
    }//GEN-LAST:event_table_MenuMouseClicked

    private void table_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_OrderMouseClicked
        int row = table_Order.getSelectedRow();
        lb_TenDV.setText(table_Order.getValueAt(row, 0).toString());
        btn_Bot.setEnabled(true);
        btn_Them.setEnabled(false);
        table_Menu.clearSelection();
    }//GEN-LAST:event_table_OrderMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed

        //Lấy số lượng
        String soluong = txt_SoLuong.getText();
        int kiemtraSL = Integer.parseInt(soluong);
        if(soluong.equals("")||kiemtraSL>=100){
            JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ");
        }else{
            //Lấy giá 
            int row = table_Menu.getSelectedRow();
            String gia = table_Menu.getValueAt(row, 1).toString();
            //lấy tên dịch vụ
            String tenDV = lb_TenDV.getText();
            //lấy mã dịch vụ
            String maDV = dichvuBLL.layMaDV(tenDV);
            //tính thành tiền
            int iSoLuong = Integer.parseInt(soluong);
            Double fDonGia = Double.parseDouble(gia);
            String thanhtien = "" + iSoLuong*fDonGia;
        
            //Kiểm tra dịch vụ này đã order chưa -- kiểm tra trên bảng order
            int count = table_Order.getRowCount();
            Boolean KiemTra = true; //nếu kiểm tra = true thì thêm mới, ngược lại ta update số lượng và thành tiền
            if(count>0){
                for(int i =0; i < count; i++){
                    if(tenDV.equals(table_Order.getValueAt(i, 0).toString())){
                        KiemTra = false;
                        break;
                    }
                }
            }
            if(KiemTra==true){
                //thêm mới
                ctdichvuBLL.themChiTietDV(maPhieuDV, maDV, soluong, thanhtien);
                //cập nhập lại trị giá phiếu dịch vụ
                phieudichvuBLL.themCTDV(maPhieuDV, thanhtien);  
                //load lại bảng order
                control.bindingOrder(table_Order, ctdichvuBLL.layDichVuTheoPhieu(maPhieuDV));
                //cập nhập lại tổng tiên ở lable tổng tiền
                capnhapTongTien();
                
            }else{
                //cập nhập lại số lượng và thành tiền
                ctdichvuBLL.themSoLuong(maPhieuDV, maDV, soluong, thanhtien);
                //cập nhập lại trị giá phiếu dịch vụ
                phieudichvuBLL.themCTDV(maPhieuDV, thanhtien);
                //load lại bảng order
                control.bindingOrder(table_Order, ctdichvuBLL.layDichVuTheoPhieu(maPhieuDV));   
                //cập nhập lại tổng tiên ở lable tổng tiền
                capnhapTongTien();
            }
        }
        //đặt lại các trường
        table_Menu.clearSelection();
        btn_Them.setEnabled(false);
        btn_Bot.setEnabled(false);
        lb_TenDV.setText("");
        txt_SoLuong.setText("");
        
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_XongActionPerformed

    private void btn_BotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BotActionPerformed
        //lấy số lượng
        String soluong = txt_SoLuong.getText();
        if(soluong.equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng");
        }else{
            //Lấy tên dịch vụ
            int row = table_Order.getSelectedRow(); //lấy dòng đang chọn
            lb_TenDV.setText(table_Order.getValueAt(row, 0).toString()); // gán tên dịch vụ cho label tương ứng
            //Lấy mã dịch vụ từ tên dịch vụ
            String maDV = dichvuBLL.layMaDV(lb_TenDV.getText());
            //lấy số lượng dịch vụ đang dùng (trong Order)
            String soluongOrder = table_Order.getValueAt(row, 2).toString();
            
            //so sánh 2 số lương (Số lượng bớt và số lượng order) - 
            int iSoLuongBot = Integer.parseInt(soluong);
            int iSoLuongOrder = Integer.parseInt(soluongOrder);
            //Nếu Số lượng bớt lơn hơn số lượng order => Báo lỗi
            //Nếu bằng nhau -  ta xóa dịch vụ ra khỏi chi tiết phiếu dịch vụ và cập nhập là phiếu dịch vụ
            //Nếu nhỏ hơn ta thực hiện bớt số lượng trong ctiet phiếu dịch vụ và cập nhập lại phiếu dịch vụ
            if(iSoLuongBot > iSoLuongOrder){
                JOptionPane.showMessageDialog(this, "Số lượng bớt không được vượt quá số lượng Order");
            }else{
                if(iSoLuongBot == iSoLuongOrder){
                    //xóa dịch vụ ra khỏi CT_PhieuDichVu
                    ctdichvuBLL.xoaCTDV(maPhieuDV, maDV);
                    //load lại bảng order
                    control.bindingOrder(table_Order, ctdichvuBLL.layDichVuTheoPhieu(maPhieuDV));
                    //Lấy thành tiền của dịch vụ này để cập nhập lại thành tiền của phiếu dịch vụ
                    capnhapTongTien();
                    String tongtien = lb_TongTien.getText();
                    phieudichvuBLL.capnhapTriGia(maPhieuDV, tongtien);
                    
                }else{
                    //bớt lại số lượng dịch vụ
                    ctdichvuBLL.botSoLuong(maPhieuDV, maDV, soluong);
                    //load lại bảng order
                    control.bindingOrder(table_Order, ctdichvuBLL.layDichVuTheoPhieu(maPhieuDV));
                    //Lấy thành tiền và cập nhập tiền của phiếu dịch vụ
                    capnhapTongTien();
                    String tongtien = lb_TongTien.getText();
                    phieudichvuBLL.capnhapTriGia(maPhieuDV, tongtien);
                }
            }
        }
        //đặt lại các trường
        table_Order.clearSelection();
        btn_Them.setEnabled(false);
        btn_Bot.setEnabled(false);
        lb_TenDV.setText("");
        txt_SoLuong.setText("");
    }//GEN-LAST:event_btn_BotActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String key = txt_TimKiem.getText();
        control.bindingMenu(table_Menu, dichvuBLL.timkiem(key));
        txt_TimKiem.setText("");
    }//GEN-LAST:event_btn_TimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(DichVuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DichVuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DichVuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DichVuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DichVuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bot;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_SoLuong;
    private javax.swing.JLabel lb_TenDV;
    private javax.swing.JLabel lb_Tien;
    private javax.swing.JLabel lb_TimKiem;
    private javax.swing.JLabel lb_TongTien;
    private javax.swing.JPanel panel_Buttons;
    private javax.swing.JPanel panel_Contain;
    private javax.swing.JPanel panel_TimKiem;
    private javax.swing.JPanel panel_Title;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JTable table_Menu;
    private javax.swing.JTable table_Order;
    private javax.swing.JTextField txt_SoLuong;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
