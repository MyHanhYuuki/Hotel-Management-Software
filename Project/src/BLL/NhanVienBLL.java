/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import Entity.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class NhanVienBLL {
    NhanVienDAL DAL  = new NhanVienDAL();
    
    //lấy tất cả nhân viên
    public ArrayList<NhanVien> getAll(){
        return DAL.getAll();
    }
    
    //sửa nhân viên
    public boolean suaNhanVien(String ma, String ten, String nam, String gioitinh, String chuc, String sdt, String diachi, String ghichu, String macu){
        return DAL.suaNhanVien(ma, ten, nam, gioitinh, chuc, sdt, diachi, ghichu, macu);
    }
    
    //thêm nhân viên
    public boolean themNhanVien(String ma, String ten, String nam, String gioitinh, String chuc, String sdt, String diachi, String ghichu, String matkhau){
        return DAL.themNhanVien(ma, ten, nam, gioitinh, chuc, sdt, diachi, ghichu, matkhau);
    }
    
    
    //Lấy mã nhân viên theo tên
    public String getIDbyName(String ten){
        return DAL.getIDbyName(ten);
    }
    
    //Lấy tên nhân viên theo mã
    public String getNamebyID(String ma){
        return DAL.getNamebyID(ma);
    }
    
    //kiểm tra đăng nhập
    public boolean checkLogin(String ten, String pass){
        return DAL.checkLogin(ten, pass);
    }

     //Tìm kiếm nhân viên
    public ArrayList<NhanVien> timkiem(String key){
        return DAL.timkiem(key);
    }
    
    ////sửa mật khâu
    public boolean  suaMatKhau(String manv, String matkhau){
        return DAL.suaMatKhau(manv, matkhau);
    }
    
    //Lấy chức vụ bởi mã nhân viên
    public String layChucVu(String manv){
        return DAL.layChucVu(manv);
    }
}