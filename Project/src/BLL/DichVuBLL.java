/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DichVuDAL;
import Entity.DichVu;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class DichVuBLL {
    DichVuDAL DAL = new DichVuDAL();
    //lấy tất cả dịch vụ
    public ArrayList<DichVu> getAll(){
        return DAL.getAll();
    }
    
    //sửa dịch vụ
    public boolean suaDichVu(String ma, String ten, String gia, String tinhtrang, String macu){
        return DAL.suaDichVu(ma, ten, gia, tinhtrang, macu);
    }
    
    //thêm dịch vụ
    public boolean themDichVu(String ma, String ten, String gia, String tinhtrang){
        return DAL.themDichVu(ma, ten, gia, tinhtrang);
    }

    //lấy dịch vụ trong trạng thái sẵn sàng
    public ArrayList<DichVu> layDichVuSanSang(){
        return DAL.layDichVuSanSang();
    }
    
    
    
    //Lấy mã dịch vụ bằng tên dịch vụ
    public String layMaDV(String tenDV){
        return DAL.layMaDV(tenDV);
    }
    
    
     //tìm kiếm dịch vụ theo tên
    public ArrayList<DichVu> timkiem(String key){
        return DAL.timkiem(key);
    }
    
    
}
