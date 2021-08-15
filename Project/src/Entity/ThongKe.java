/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author RumIT
 */
public class ThongKe {
    private String TenLoai, DoanhThu, TiLe;
    
    //tên loại phòng
    public String getTenLoai(){
        return TenLoai;
    }
    public void setTenLoai(String ten){
        TenLoai = ten;
    }
    
    //Doanh thu
    public String getDoanhThu(){
        return DoanhThu;
    }
    public void setDoanhThu(String tien){
        DoanhThu = tien;
    }
    
    //Tỉ lệ
    public String getTiLe(){
        return TiLe;
    }
    public void setTiLe(String tile)
    {
        TiLe = tile;
    }
}
