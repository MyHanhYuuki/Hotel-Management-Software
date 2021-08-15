/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.DichVu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class DichVuDAL extends DataAccessHelper{
    
    //lấy tất cả dịch vụ
    public ArrayList<DichVu> getAll(){
        ArrayList<DichVu> temp = new ArrayList<DichVu>();
        String SQl = "Select * From DichVu";
        try{
            getConnect();
            PreparedStatement ps = conn.prepareStatement(SQl);
            ResultSet rs = ps.executeQuery();
            if(rs!=null)
                while(rs.next()){
                    DichVu dv = new DichVu();
                    dv.setMaDV(rs.getString("MaDV"));
                    dv.setTenDV(rs.getString("TenDV"));
                    dv.setGiaDV(rs.getString("DonGia"));
                    dv.setTinhTrang(rs.getString("TinhTrang"));
                    temp.add(dv);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //sủa dịch vụ
    public boolean suaDichVu(String ma, String ten, String gia, String tinhtrang, String macu){
        String SQL = "Update DichVu set MaDV='"+ma+"',TenDV=N'"+ten+"',DonGia='"+gia+"',TinhTrang=N'"+tinhtrang+"' where MaDV='"+macu+"'";
        try{
            getConnect();
            Statement st = conn.createStatement();
            int rs = st.executeUpdate(SQL);
            if(rs > 0)
                return true;
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    
    //thêm dịch vụ
    public boolean themDichVu(String ma, String ten, String gia, String tinhtrang){
        String SQL = "Insert into DichVu values('"+ma+"',N'"+ten+"','"+gia+"',N'"+tinhtrang+"')";
        try{
            getConnect();
            Statement st = conn.createStatement();
            int rs = st.executeUpdate(SQL);
            if(rs>0)
                return true;
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    //Lấy danh sách dịch đang trong trạng thái sẵn sàng
    public ArrayList<DichVu> layDichVuSanSang(){
        ArrayList<DichVu> temp = new ArrayList<DichVu>();
        String SQl = "Select * From DichVu where TinhTrang=N'Còn hàng'";
        try{
            getConnect();
            PreparedStatement ps = conn.prepareStatement(SQl);
            ResultSet rs = ps.executeQuery();
            if(rs!=null)
                while(rs.next()){
                    DichVu dv = new DichVu();
                    
                    dv.setTenDV(rs.getString("TenDV"));
                    dv.setGiaDV(rs.getString("DonGia"));

                    temp.add(dv);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //Lấy mã dịch vụ bằng tên dịch vụ
    public String layMaDV(String tenDV){
        String SQL = "Select MaDV from DichVu where TenDV=N'"+tenDV+"'";
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null&&rs.next())
                return rs.getString("MaDV");
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    //tìm kiếm dịch vụ theo tên
    public ArrayList<DichVu> timkiem(String key){
        ArrayList<DichVu> temp = new ArrayList<>();
        String SQL = "Select * from DichVu where TenDV like N'%"+key+"%'";
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next()){
                    DichVu dv = new DichVu();
                    dv.setTenDV(rs.getString("TenDV"));
                    dv.setMaDV(rs.getString("MaDV"));
                    dv.setGiaDV(rs.getString("DonGia"));
                    dv.setTinhTrang(rs.getString("TinhTrang"));
                    temp.add(dv);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    
}
