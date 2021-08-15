/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import Entity.KhachHang;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author RumIT
 */
public class KhachHangBLL {
    KhachHangDAL DAL = new KhachHangDAL();
    public DefaultComboBoxModel getCMNDbyKey(String key){
        return DAL.getCMNDbyKey(key);
    }
    
    //lấy thông tin khách hàng theo cmnd
    public KhachHang getKHbyCMND(String cmnd){
        return DAL.getKHbyCMND(cmnd);
    }
    
    //kiểm tra xem đã là khách hàng hay chưa
    public boolean checkKH(String CMND){
        return DAL.checkKH(CMND);
    }
    
    //thêm khách hàng mới
    public boolean themKH(String cm, String ten, String gioitinh, String diachi){
        return DAL.themKH(cm, ten, gioitinh, diachi);
    }
    
    //lấy mã khách hàng dựa vào CMND
    public String layMaKH(String cmnd){
        return DAL.layMaKH(cmnd);
    }
    
    //lấy thông tin khách hàng bằng mã khách hàng
    public KhachHang layThongTin(String makh){
        return DAL.layThongTin(makh);
    }
    
    //Lấy tên khách hàng dựa vào mã khách hàng
    public String layTen(String makh){
        return DAL.layTen(makh);
    }
    
    
    //Lấy CMDMD dựa vào mã khách hàng
    public String layCMND(String makh){
        return DAL.layCMND(makh);
    }
    
    //Lấy danh sách khách hàng
    public ArrayList<KhachHang> layDanhSach(){
        return DAL.layDanhSach();
    }
    
    //Tìm kiếm khách hàng
    public ArrayList<KhachHang> timkiem(String key){
        return DAL.timkiem(key);
    }
    
    //sửa khách hàng
    public boolean suaKhachHang(String ten, String cmndMoi, String gioitinh, String DiaChi, String cmndCu){
        return DAL.suaKhachHang(ten, cmndMoi, gioitinh, DiaChi, cmndCu);
    }
    
    //Lấy mã khách hàng dựa vào cmnd
    public String layMaTuCMND(String cmnd){
        return DAL.layMaTuCMND(cmnd);
    }
    
    //xóa khách hàng
    public boolean xoaKhachHang(String cmnd){
        return DAL.xoaKhachHang(cmnd);
    }
}
