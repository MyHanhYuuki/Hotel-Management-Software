/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.PhongDAL;
import Entity.Phong;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class PhongBLL {
    
    //tạo đối tượng PhongDAL
    PhongDAL DAL = new PhongDAL();
    
    //lấy danh sách phòng
    public ArrayList<Phong> getAllPhong(){
        return DAL.getAllPhong();
    }
    
    //sửa thông tin phòng
    public boolean updatePhong(String tenphong,String tinhtrang,String loai,String ghichu){
        return DAL.updatePhong(tenphong, tinhtrang, loai, ghichu);
    }
    
    //sửa mã loại phòng trong trường hợp muốn xóa 1 loại phòng nào đó
    public boolean suMaLoaiP(String ma){
        return DAL.suaMaLoaiP(ma);
    }
    
    //lấy phòng theo tầng
     public ArrayList<Phong> layPhongTheoTang(int tang){
         return DAL.layPhongTheoTang(tang);
     }
     
    //Lấy Mã phòng theo tên phòng
     public String getIDbyName(String ten){
         return DAL.getIDbyName(ten);
     }

     //cho thuê -  cập nhập trạng thái
     public boolean updateTrangThai(String maphong, String trangthai){
         return DAL.updateTrangThai(maphong, trangthai);
     }
     
     
     //lấy tên phòng theo mã phòng
    public String layTenPhong(String maPhong){
        return DAL.layTenPhong(maPhong);
    }
    
    //Lấy giá phòng theo mã phòng
    public String[] layGiaTheoMaPhong(String maPhong){
        return DAL.layGiaTheoMaPhong(maPhong);
    }
    
    
    //Xử lí trả phòng
    public boolean xulyTraPhong(String maPhong){
        return DAL.xulyTraPhong(maPhong);
    }
}
