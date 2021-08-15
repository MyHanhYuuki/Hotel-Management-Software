/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HoaDonBLL;
import BLL.KhachHangBLL;
import BLL.LoaiPhongBLL;
import BLL.NhanVienBLL;
import BLL.PhieuDichVuBLL;
import BLL.PhieuThuePhongBLL;
import BLL.PhongBLL;
import Entity.KhachHang;
import Entity.PhieuThuePhong;
import Utilities.ControlFormat;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author RumIT
 */
public class jpanel_Thue_Tang2 extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_Thue_Tang2
     */
    public jpanel_Thue_Tang2() {
        
    }

    public jpanel_Thue_Tang2(String tenNhanVien) {
        initComponents();
        //load dữ liệu lên bảng
        //tầng 1
        control.bindingPhongTheoTang(table_Tang2, phongBLL.layPhongTheoTang(2));
        
        table_Tang2.getTableHeader().setReorderingAllowed(false);

        
        
        //ẩn các button
        btn_DichVu.setEnabled(false);
        btn_TraPhong.setEnabled(false);
        btn_ChoThue.setEnabled(false);
        
        //tạo button group cho 2 radio button
        ButtonGroup btnG = new ButtonGroup();
        btnG.add(rbtn_Co);
        btnG.add(rbtn_Khong);
        rbtn_Khong.setSelected(true);
        //lưu tên nhân viên vào biến toàn cục tenNV;
        tenNV = tenNhanVien;
        
        
        ///chỉnh combobox
        cbb_GioiTinh.removeAllItems();
        cbb_GioiTinh.addItem("");
        cbb_GioiTinh.addItem("Nam");
        cbb_GioiTinh.addItem("Nữ");
        cbb_GioiTinh.addItem("Không rõ");
        cbb_GioiTinh.setSelectedItem("");
        //cbb_CMND
        String cmnd = txt_CMND.getText();
        if(cmnd.equals("")){
            cbb_CMND.setVisible(false);
        }
        
        
        disableTextField();
        cbb_GioiTinh.setEnabled(false);
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
        table_Tang2 = new javax.swing.JTable();
        panel_ThongTin = new javax.swing.JPanel();
        panel_ThongTin1 = new javax.swing.JPanel();
        label_TenPhong = new javax.swing.JLabel();
        lb_TenPhong = new javax.swing.JLabel();
        lb_GioiTinh = new javax.swing.JPanel();
        lb_TenKH = new javax.swing.JLabel();
        lb_CMND = new javax.swing.JLabel();
        lb_KHNgoaiQuoc = new javax.swing.JLabel();
        rbtn_Co = new javax.swing.JRadioButton();
        rbtn_Khong = new javax.swing.JRadioButton();
        lb_SoLuongKH = new javax.swing.JLabel();
        lb_NgayKTThue = new javax.swing.JLabel();
        lb_NgayBDThue = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        txt_CMND = new javax.swing.JTextField();
        txt_SoLuongKH = new javax.swing.JTextField();
        txt_NgayBDThue = new javax.swing.JTextField();
        txt_NgayKTThue = new javax.swing.JTextField();
        btn_DichVu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbb_GioiTinh = new javax.swing.JComboBox<>();
        lb_DiaChi = new javax.swing.JLabel();
        txt_DiaChi = new javax.swing.JTextField();
        cbb_CMND = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_ChoThue = new javax.swing.JButton();
        btn_TraPhong = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        songay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));
        panel_bg.setMaximumSize(new java.awt.Dimension(914, 491));
        panel_bg.setMinimumSize(new java.awt.Dimension(914, 491));
        panel_bg.setPreferredSize(new java.awt.Dimension(914, 491));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table_Tang2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_Tang2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        table_Tang2.setRowHeight(41);
        table_Tang2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_Tang2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Tang2);

        panel_ThongTin.setBackground(new java.awt.Color(255, 255, 255));

        panel_ThongTin1.setBackground(new java.awt.Color(255, 255, 255));

        label_TenPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_TenPhong.setText("Phòng");

        lb_TenPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_TenPhong.setForeground(new java.awt.Color(0, 0, 153));

        lb_GioiTinh.setBackground(new java.awt.Color(255, 255, 255));

        lb_TenKH.setText("Tên khách hàng");

        lb_CMND.setText("CMND");

        lb_KHNgoaiQuoc.setText("Khách ngoại quốc");

        rbtn_Co.setText("Có");

        rbtn_Khong.setText("Không");

        lb_SoLuongKH.setText("Số lượng khách");

        lb_NgayKTThue.setText("Ngày kết thúc");

        lb_NgayBDThue.setText("Ngày bắt đầu");

        txt_CMND.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txt_CMNDMouseMoved(evt);
            }
        });
        txt_CMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CMNDKeyReleased(evt);
            }
        });

        txt_NgayBDThue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_NgayBDThue.setForeground(new java.awt.Color(255, 51, 51));
        txt_NgayBDThue.setEnabled(false);

        txt_NgayKTThue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_NgayKTThue.setForeground(new java.awt.Color(255, 51, 51));
        txt_NgayKTThue.setEnabled(false);

        btn_DichVu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_DichVu.setText("DỊCH VỤ");
        btn_DichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DichVuActionPerformed(evt);
            }
        });

        jLabel1.setText("Giới tính");

        cbb_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_GioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_GioiTinhActionPerformed(evt);
            }
        });

        lb_DiaChi.setText("Địa chỉ");

        cbb_CMND.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_CMNDItemStateChanged(evt);
            }
        });
        cbb_CMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbb_CMNDMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_ChoThue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ChoThue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/house.png"))); // NOI18N
        btn_ChoThue.setText("CHO THUÊ");
        btn_ChoThue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ChoThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChoThueActionPerformed(evt);
            }
        });

        btn_TraPhong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_TraPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/check-mark-in-a-circle.png"))); // NOI18N
        btn_TraPhong.setText("TRẢ PHÒNG");
        btn_TraPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_TraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TraPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ChoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_TraPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_TraPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ChoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setText("Số ngày thuê");

        javax.swing.GroupLayout lb_GioiTinhLayout = new javax.swing.GroupLayout(lb_GioiTinh);
        lb_GioiTinh.setLayout(lb_GioiTinhLayout);
        lb_GioiTinhLayout.setHorizontalGroup(
            lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                        .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                                    .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_NgayBDThue)
                                        .addComponent(lb_CMND)
                                        .addComponent(lb_NgayKTThue)
                                        .addComponent(lb_SoLuongKH)
                                        .addComponent(lb_DiaChi)
                                        .addComponent(jLabel1)
                                        .addComponent(lb_TenKH))
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lb_GioiTinhLayout.createSequentialGroup()
                                    .addComponent(lb_KHNgoaiQuoc)
                                    .addGap(18, 18, 18)))
                            .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)))
                        .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                                .addComponent(rbtn_Co)
                                .addGap(27, 27, 27)
                                .addComponent(rbtn_Khong))
                            .addComponent(txt_TenKH)
                            .addComponent(txt_CMND)
                            .addComponent(cbb_GioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_DiaChi)
                            .addComponent(txt_SoLuongKH)
                            .addComponent(txt_NgayBDThue)
                            .addComponent(txt_NgayKTThue)
                            .addComponent(btn_DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(cbb_CMND, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(songay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lb_GioiTinhLayout.setVerticalGroup(
            lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lb_GioiTinhLayout.createSequentialGroup()
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_CMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbb_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_TenKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_DiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SoLuongKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_SoLuongKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_Khong)
                    .addComponent(rbtn_Co)
                    .addComponent(lb_KHNgoaiQuoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NgayBDThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_NgayBDThue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(songay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(lb_GioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_NgayKTThue)
                    .addComponent(txt_NgayKTThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btn_DichVu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_ThongTin1Layout = new javax.swing.GroupLayout(panel_ThongTin1);
        panel_ThongTin1.setLayout(panel_ThongTin1Layout);
        panel_ThongTin1Layout.setHorizontalGroup(
            panel_ThongTin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lb_GioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ThongTin1Layout.setVerticalGroup(
            panel_ThongTin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTin1Layout.createSequentialGroup()
                .addGroup(panel_ThongTin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_ThongTinLayout = new javax.swing.GroupLayout(panel_ThongTin);
        panel_ThongTin.setLayout(panel_ThongTinLayout);
        panel_ThongTinLayout.setHorizontalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinLayout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(panel_ThongTin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panel_ThongTinLayout.setVerticalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_ThongTinLayout.createSequentialGroup()
                    .addComponent(panel_ThongTin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 93, 88));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHO THUÊ - TẦNG 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 483, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //--bắt đầu--khởi tạo các đối tượng cần thiết
    
    ControlFormat control = new ControlFormat();
    LoaiPhongBLL loaiPhongBLL = new LoaiPhongBLL();
    PhongBLL phongBLL = new PhongBLL();
    NhanVienBLL nhanvienBLL = new NhanVienBLL();
    PhieuThuePhongBLL phieuthuephongBLL = new PhieuThuePhongBLL();
    HoaDonBLL hoadonBLL = new HoaDonBLL();
    PhieuDichVuBLL  phieudichvuBLL = new PhieuDichVuBLL();
    KhachHangBLL khachhangBLL = new KhachHangBLL();
    private String tenNV;
    //// --end-- các đối tượng cần thiêt
    
    
    //Xóa trắng các textfield
    public void cleanTextField(){
        txt_TenKH.setText("");
        txt_CMND.setText("");
        txt_SoLuongKH.setText("");
        txt_NgayBDThue.setText("");
        txt_DiaChi.setText("");  
        txt_NgayKTThue.setText("");
        cbb_GioiTinh.setSelectedItem("");
    }
    //cho phép chỉnh sửa các trường nhập liệu
    public void enableTextField(){
        txt_TenKH.setEnabled(true);
        txt_CMND.setEnabled(true);
        txt_SoLuongKH.setEnabled(true);
        txt_DiaChi.setEnabled(true);
    }
    
    //không cho phép chỉnh sửa các trường nhập liệu
    public void disableTextField(){
        txt_TenKH.setEnabled(false);
        txt_CMND.setEnabled(false);
        txt_SoLuongKH.setEnabled(false);
        txt_DiaChi.setEnabled(false);
    }
    
    
    private void table_Tang2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Tang2MouseClicked
        //đổ thông tin qua các field text
        int row =  table_Tang2.getSelectedRow();
        lb_TenPhong.setText(table_Tang2.getValueAt(row, 0).toString());
        String maPhong = phongBLL.getIDbyName(lb_TenPhong.getText());
        //xóa trắng các text field
        cleanTextField();
        rbtn_Khong.setSelected(true);
        String trangthai = table_Tang2.getValueAt(row, 2).toString();
        if(trangthai.equals("Trống")){
            //cho phép nhập dữ liệu vào các text field
            enableTextField();
            //chỉnh các nút
            btn_DichVu.setEnabled(false);
            btn_TraPhong.setEnabled(false);
            btn_ChoThue.setEnabled(true);
            //gán ngày bắt đầu vào text
            txt_NgayBDThue.setText(control.getToDay());
            long n;
            String str = songay.getText(); 
            n = Long.parseLong(str);
            txt_NgayKTThue.setText(control.getDayNext(n));
        }else{
            //chỉnh các nút
            btn_DichVu.setEnabled(true);
            btn_TraPhong.setEnabled(true);
            btn_ChoThue.setEnabled(false);
            //không cho phép nhập dữ liệu vào các text
            disableTextField();
            cbb_GioiTinh.setEnabled(false);
            //load dữ liệu phiếu thuê phòng lên các trường
            //Lấy phiếu thuê đang dùng của phòng
            PhieuThuePhong phieuthue = phieuthuephongBLL.getInfo(maPhong, "1");
            String makh = phieuthue.getMaKH();
            //dùng mã khách hàng để lấy thông tin khách hàng
            KhachHang khachhang = khachhangBLL.layThongTin(makh);

            txt_TenKH.setText(khachhang.getTenKH());
            txt_CMND.setText(khachhang.getCMND());
            txt_DiaChi.setText(khachhang.getDiaChi());
            cbb_GioiTinh.setSelectedItem(khachhang.getGioiTinh());
            txt_SoLuongKH.setText(phieuthue.getSoLuongKH());
            if(phieuthue.getKHNgoaiQuoc().equals("1"))
            rbtn_Co.setSelected(true);
            else
            rbtn_Khong.setSelected(true);
            txt_NgayBDThue.setText(phieuthue.getNgayBD());
            txt_NgayKTThue.setText(phieuthue.getNgayKTThue());
        }
    }//GEN-LAST:event_table_Tang2MouseClicked

    private void btn_TraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TraPhongActionPerformed
        String maPhong = phongBLL.getIDbyName(lb_TenPhong.getText());
        String MaPhieuThue = phieuthuephongBLL.getMaPhieuMoi(maPhong);
        String mahd = hoadonBLL.getMaHD(MaPhieuThue);
        String maPhieuDV = phieudichvuBLL.layMaPhieuDV(mahd);
        JFrame main = (JFrame)SwingUtilities.getWindowAncestor(this);
        TraPhongDialog traphong = new TraPhongDialog(main, true, MaPhieuThue, maPhieuDV, tenNV);
        traphong.setVisible(true);
        boolean kiemtra = traphong.reload();
        if(kiemtra == true){
            control.bindingPhongTheoTang(table_Tang2, phongBLL.layPhongTheoTang(2));
            cleanTextField();
            btn_DichVu.setEnabled(false);
        }
    }//GEN-LAST:event_btn_TraPhongActionPerformed

    private void btn_ChoThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChoThueActionPerformed
        //tạo 1 biến kiểm tra
        boolean kiemtra = true;
        //kiểm tra xem Khách hàng cũ hay mới. nếu mới thì thêm khách hàng
        String cmnd= "";
        cmnd = txt_CMND.getText();

        if(!khachhangBLL.checkKH(cmnd)){
            //Lấy các thông tin vừa nhập
            String ten = txt_TenKH.getText();
            String gioitinh = cbb_GioiTinh.getSelectedItem().toString();
            String diachi = txt_DiaChi.getText();
            //thêm khách hàng
            if(ten.equals("")||diachi.equals("")||cmnd.equals("")||gioitinh.equals("")){

                JOptionPane.showMessageDialog(this, "Bạn nhập thiếu thông tin");
                kiemtra = false;
            }
            else{
                khachhangBLL.themKH(cmnd, ten, gioitinh, diachi);
            }
        }
        if(kiemtra == true){
            //Lấy mã khách hàng theo CMND
            String makh = khachhangBLL.layMaKH(cmnd);
            if(!makh.equals("")){
                //lấy các thôn tin mã phòng, số lượng khách, kiểm tra có khách nước ngoài k, và ngày bắt đầu
                //mã phòng
                String maphong = phongBLL.getIDbyName(lb_TenPhong.getText());
                //Số lượng khách hàng
                String soluong = txt_SoLuongKH.getText();
                //Kiểm tra khách nước ngoài 0 - không có / 1 - có khách nước ngoài
                String khachnuocngoai;
                if(rbtn_Co.isSelected()){
                    khachnuocngoai = "1";
                }else{
                    khachnuocngoai = "0";
                }
                //Ngày bắt đầu
                String ngaybd = txt_NgayBDThue.getText();
                String ngaykt = txt_NgayKTThue.getText();
                //Mã nhân viên
                String manv = nhanvienBLL.getIDbyName(tenNV);
                if(!soluong.equals("")){
                    //Tạo phiếu thuê phòng
                    if(phieuthuephongBLL.themPhieuMoi(maphong, makh, soluong, khachnuocngoai, manv, ngaybd,ngaykt)){
                        //thông báo
                        JOptionPane.showMessageDialog(this, "ĐÃ CHO THUÊ");
                        //đặt lại các trường
                        cleanTextField();
                        cbb_GioiTinh.setSelectedItem("");
                        //lấy mã phiếu thuê vừa tạo
                        String maphieu = phieuthuephongBLL.getMaPhieuMoi(maphong);
                        //tạo một hóa đơn rỗng
                        hoadonBLL.khoiTaoHD(maphieu);
                        //Lấy mã hóa đơn ứng với mã phiếu
                        String maHD = hoadonBLL.getMaHD(maphieu);
                        //tạo phiêu dịch vụ với mã hóa đơn
                        phieudichvuBLL.taoPhieuDichVu(maHD,ngaybd);
                        phieudichvuBLL.taoPhieuDichVu(maHD,ngaykt);

                        //cập nhập trạng thái phòng xuống cơ sở dữ liệu và load lại danh sách
                        phongBLL.updateTrangThai(maphong, "Đã cho thuê");
                        control.bindingPhongTheoTang(table_Tang2, phongBLL.layPhongTheoTang(2));
                        btn_ChoThue.setEnabled(false);
                        lb_TenPhong.setText("");
                        disableTextField();
                    }else{
                        JOptionPane.showMessageDialog(this, "CÓ LỖI XẢY RA");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng");
            }
        }
    }//GEN-LAST:event_btn_ChoThueActionPerformed

    private void cbb_GioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_GioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_GioiTinhActionPerformed

    private void btn_DichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DichVuActionPerformed
        String maPhong = phongBLL.getIDbyName(lb_TenPhong.getText());
        String MaPhieuThue = phieuthuephongBLL.getMaPhieuMoi(maPhong);
        String mahd = hoadonBLL.getMaHD(MaPhieuThue);
        String maPhieuDV = phieudichvuBLL.layMaPhieuDV(mahd);
        DichVuForm dv = new DichVuForm(maPhieuDV,tenNV);
        dv.setVisible(true);
    }//GEN-LAST:event_btn_DichVuActionPerformed

    private void txt_CMNDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CMNDKeyReleased
        String cmnd = txt_CMND.getText();
        if(cmnd.equals("")){
            cbb_CMND.removeAllItems();
            cbb_CMND.setVisible(false);
            txt_TenKH.setText("");
            txt_DiaChi.setText("");
        }
        if(evt.getKeyCode()>=48 && evt.getKeyCode()<=57){
            cbb_CMND.setVisible(true);
            cbb_CMND.setModel(khachhangBLL.getCMNDbyKey(cmnd));
            if(cbb_CMND.getItemCount()>1){
                cbb_CMND.showPopup();
            }else{
                cbb_CMND.setVisible(false);

            }
        }
    }//GEN-LAST:event_txt_CMNDKeyReleased

    private void txt_CMNDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CMNDMouseMoved
        //
    }//GEN-LAST:event_txt_CMNDMouseMoved

    private void cbb_CMNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_CMNDMouseClicked
        //lấy số cmnd vừa chọn cho vào txt_CMND
        //txt_CMND.setText(cbb_CMND.getSelectedItem().toString());
    }//GEN-LAST:event_cbb_CMNDMouseClicked

    private void cbb_CMNDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_CMNDItemStateChanged
        if(!evt.getItem().toString().equals("")){

            //lấy số cmnd vừa chọn cho vào txt_CMND
            String cmnd = evt.getItem().toString();
            if(!cmnd.equals(""))
            txt_CMND.setText(cmnd);
            //ẩn cbb đi
            cbb_CMND.setVisible(false);
            //lấy các dữ liệu ứng với CMND vừa chọn cho vào các trường
            KhachHang khachhang = khachhangBLL.getKHbyCMND(txt_CMND.getText());
            if(!khachhang.getTenKH().equals("")){
                txt_DiaChi.setText(khachhang.getDiaChi());
                cbb_GioiTinh.setSelectedItem(khachhang.getGioiTinh());
                txt_TenKH.setText(khachhang.getTenKH());
            }
            cbb_CMND.removeAllItems();
        }
    }//GEN-LAST:event_cbb_CMNDItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChoThue;
    private javax.swing.JButton btn_DichVu;
    private javax.swing.JButton btn_TraPhong;
    private javax.swing.JComboBox<String> cbb_CMND;
    private javax.swing.JComboBox<String> cbb_GioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_TenPhong;
    private javax.swing.JLabel lb_CMND;
    private javax.swing.JLabel lb_DiaChi;
    private javax.swing.JPanel lb_GioiTinh;
    private javax.swing.JLabel lb_KHNgoaiQuoc;
    private javax.swing.JLabel lb_NgayBDThue;
    private javax.swing.JLabel lb_NgayKTThue;
    private javax.swing.JLabel lb_SoLuongKH;
    private javax.swing.JLabel lb_TenKH;
    private javax.swing.JLabel lb_TenPhong;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JPanel panel_ThongTin1;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JRadioButton rbtn_Co;
    private javax.swing.JRadioButton rbtn_Khong;
    private javax.swing.JTextField songay;
    private javax.swing.JTable table_Tang2;
    private javax.swing.JTextField txt_CMND;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_NgayBDThue;
    private javax.swing.JTextField txt_NgayKTThue;
    private javax.swing.JTextField txt_SoLuongKH;
    private javax.swing.JTextField txt_TenKH;
    // End of variables declaration//GEN-END:variables
}
