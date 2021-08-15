/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.LoaiPhong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RumIT
 */
public class LoaiPhongDAL extends DataAccessHelper{
    
    //lấy tất cả loại phòng
    public ArrayList<LoaiPhong> getAllLoaiPhong(){
        String SQL = "SELECT * FROM LOAIPHONG";
        ArrayList<LoaiPhong> temp = new ArrayList<LoaiPhong>();
        try{
            getConnect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null)
                while(rs.next()){
                    LoaiPhong loai = new LoaiPhong();
                    loai.setMaLoaiP(rs.getString("MaLoaiP"));
                    loai.setTenLoaiP(rs.getString("TenLoaiP"));
                    loai.setGiaQuaDem(rs.getString("GiaQuaDem"));
                    loai.setGiaGioDau(rs.getString("GiaGioDau"));
                    temp.add(loai);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    
    // lấy mã loại phòng bằng tên loại phòng
    public String getIdByName(String ten){
        String SQL = "SELECT MaLoaiP FROM LOAIPHONG WHERE TenLoaiP=N'"+ten+"'";
        
        try{
            getConnect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null&&rs.next())
                return rs.getString("MaLoaiP");
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    
    public boolean suaLoaiPhong(String ma, String ten,String giaQuaDem, String giaGioDau){
        String SQl = "UPDATE LOAIPHONG SET MaLoaiP='"+ma+"', TenLoaiP=N'"+ten+"', GiaQuaDem='"+giaQuaDem+"', GiaGioDau='"+giaGioDau+"' WHERE MaLoaiP='"+ma+"'";
        
        try{
            getConnect();
            Statement st = conn.createStatement();
            int rs = st.executeUpdate(SQl);
            if(rs>0)
                return true;
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    } 
    
    
    //xóa một loại phòng nào đó
    public boolean xoaLoaiPhong(String ma){
        String SQL = "delete from loaiphong where maloaip='"+ma+"'";
        
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
    
    public boolean themLoaiPhong(String ma, String ten, String giaquadem, String giagiodau){
        String SQL = "insert into LoaiPhong values('"+ma+"',N'"+ten+"','"+giaquadem+"','"+giagiodau+"')";
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
}
