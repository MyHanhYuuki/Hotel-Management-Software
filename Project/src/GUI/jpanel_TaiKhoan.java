/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.NhanVienBLL;
import javax.swing.JOptionPane;

/**
 *
 * @author RumIT
 */
public class jpanel_TaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_TaiKhoan
     */
    public jpanel_TaiKhoan() {
    }
    String MaNV;
    public jpanel_TaiKhoan(String maNV) {
        initComponents();
        MaNV = maNV;
        //JOptionPane.showMessageDialog(this, maNV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pwd_Cu = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pwd_NhapLai = new javax.swing.JPasswordField();
        btn_XacNhan = new javax.swing.JButton();
        pwd_Moi = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1054, 491));
        setMinimumSize(new java.awt.Dimension(1054, 491));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        panel_Content.setBackground(new java.awt.Color(0, 153, 153));
        panel_Content.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ĐỔI MẬT KHẨU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MẬT KHẨU CŨ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MẬT KHẨU MỚI");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NHẬP LẠI MẬT KHẨU MỚI");

        btn_XacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_XacNhan.setText("XÁC NHÂN ĐỔI");
        btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ContentLayout = new javax.swing.GroupLayout(panel_Content);
        panel_Content.setLayout(panel_ContentLayout);
        panel_ContentLayout.setHorizontalGroup(
            panel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContentLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addGroup(panel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_XacNhan)
                    .addGroup(panel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pwd_NhapLai)
                        .addComponent(jLabel2)
                        .addComponent(pwd_Cu)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(pwd_Moi, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        panel_ContentLayout.setVerticalGroup(
            panel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_Cu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(pwd_Moi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_XacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    ///Khởi tạo các đối tượng cần thiết
    NhanVienBLL  nhanvienBLL = new NhanVienBLL();
    private void btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanActionPerformed
        String passCu = new String(pwd_Cu.getPassword());
        String passMoi = new String(pwd_Moi.getPassword());
        String NhapLai = new String(pwd_NhapLai.getPassword());
        
        if(!nhanvienBLL.checkLogin(MaNV, passCu)){
            JOptionPane.showMessageDialog(this, "bạn nhập sai mật khẩu cũ");
        }else{
            if(!passMoi.equals(NhapLai)){
                JOptionPane.showMessageDialog(this, "Mật khẩu mới và việc nhập lại không khớp");
            }else{
                //Sửa mật khẩu
                if(nhanvienBLL.suaMatKhau(MaNV, passMoi)){
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                }else{
                    JOptionPane.showMessageDialog(this, "Không sửa được");
                }

                //xóa dữ liệu nhập
                pwd_Cu.setText("");
                pwd_Moi.setText("");
                pwd_NhapLai.setText("");
            }
        }
        
    }//GEN-LAST:event_btn_XacNhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_Content;
    private javax.swing.JPasswordField pwd_Cu;
    private javax.swing.JPasswordField pwd_Moi;
    private javax.swing.JPasswordField pwd_NhapLai;
    // End of variables declaration//GEN-END:variables
}
