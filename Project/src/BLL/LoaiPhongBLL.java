/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiPhongDAL;
import Entity.LoaiPhong;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class LoaiPhongBLL {
    
    LoaiPhongDAL DAL = new LoaiPhongDAL();
    
    //lấy tất cả loại phòng
    public ArrayList<LoaiPhong> getAllLoaiPhong(){
        return DAL.getAllLoaiPhong();
    }
    
    
    //lấy mã theo tên
     public String getIdByName(String ten){
         return DAL.getIdByName(ten);
     }
     
     //sửa thông tin
     public boolean suaLoaiPhong(String ma, String ten,String giaQuaDem, String giaGioDau){
         return DAL.suaLoaiPhong(ma, ten, giaQuaDem, giaGioDau);
     }
     
     //xóa loại phòng
     public boolean xoaLoaiPhong(String ma){
         return DAL.xoaLoaiPhong(ma);
     }
     
     //thêm loại phòng
    public boolean themLoaiPhong(String ma, String ten, String giaquadem, String giagiodau){
        return DAL.themLoaiPhong(ma, ten, giaquadem, giagiodau);
    }
}
