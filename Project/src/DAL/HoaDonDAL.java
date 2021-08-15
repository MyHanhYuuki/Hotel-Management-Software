/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.HoaDon;
import Entity.ThongKe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author RumIT
 */
public class HoaDonDAL extends DataAccessHelper{
    
    
    //tạo hóa đơn khi vừa tạo phiếu thuê phòng
    public boolean khoiTaoHD(String maphieuthue){
        String SQL = "Insert into HoaDon(MaPhieuThue) values("+maphieuthue+")";
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
    
    //Lấy mã hóa đơn từ mã phiếu thuê
    public String getMaHD(String maphieuthue){
        String SQL = "Select MaHD from HoaDon where MaPhieuThue="+maphieuthue;
        try{
            getConnect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null&&rs.next())
                return rs.getString("MaHD");
            getClose();
        }catch(Exception e){
            e.printStackTrace();
    }
        return "";
    }
    
    //Lấy mã phiếu thuê bằng mã hóa đơn
    public String layMaPhieuThue(String maHD){
        String SQL = "Select MaPhieuThue from HoaDon where MaHD="+maHD;
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null&&rs.next())
                return rs.getString("MaPhieuThue");
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    
    //xử lý trả phongg
    public boolean xulyTraPhong(String mahd, String tienDV, String tienThue, String trigia, String ngay, String manv){
        String SQL = "Update HoaDon set TienDichVu="+tienDV+", TienThuePhong="+tienThue+", TriGia="+trigia+", NgayHD='"+ngay+"', MaNV='"+manv+"' where MaHD="+mahd;
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
    
    //Lấy danh sách hóa đơn
    public ArrayList<HoaDon> layDanhSach(){
        ArrayList<HoaDon> temp = new ArrayList<>();
        String SQL = "Select * from HoaDon";
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next()){
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("MaHD"));
                    hd.setMaPhieuThue(rs.getString("MaPhieuThue"));
                    hd.setTienDichVu(rs.getString("TienDichVu"));
                    hd.setTienThuePhong(rs.getString("TienThuePhong"));
                    hd.setTriGiaHD(rs.getString("TriGia"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    temp.add(hd);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //lấy tất cả các năm hóa đơn trong csdl
    public ArrayList<String> layDSNam(){
        ArrayList<String> temp = new ArrayList<>();
        String SQL = "Select Distinct Year(NgayHD) as Nam from HoaDon";
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next())
                    temp.add(rs.getString("Nam"));
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    

    //Lấy danh sách hóa đơn theo năm
    public ArrayList<HoaDon> layDanhSachTheoNam(String nam){
        ArrayList<HoaDon> temp = new ArrayList<>();
        String SQL = "Select * from HoaDon where Year(NgayHD)="+nam;
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next()){
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("MaHD"));
                    hd.setMaPhieuThue(rs.getString("MaPhieuThue"));
                    hd.setTienDichVu(rs.getString("TienDichVu"));
                    hd.setTienThuePhong(rs.getString("TienThuePhong"));
                    hd.setTriGiaHD(rs.getString("TriGia"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    temp.add(hd);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    
    //Lấy danh sách hóa đơn theo tháng
    public ArrayList<HoaDon> layDanhSachTheoThang(String thang){
        ArrayList<HoaDon> temp = new ArrayList<>();
        String SQL = "Select * from HoaDon where Month(NgayHD)="+thang;
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next()){
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("MaHD"));
                    hd.setMaPhieuThue(rs.getString("MaPhieuThue"));
                    hd.setTienDichVu(rs.getString("TienDichVu"));
                    hd.setTienThuePhong(rs.getString("TienThuePhong"));
                    hd.setTriGiaHD(rs.getString("TriGia"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    temp.add(hd);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    
    //Lấy danh sách hóa đơn theo tháng và nam
    public ArrayList<HoaDon> layDanhSachTheoThangVaNam(String thang,String nam){
        ArrayList<HoaDon> temp = new ArrayList<>();
        String SQL = "Select * from HoaDon where Month(NgayHD)="+thang+" and Year(NgayHD)="+nam;
        try{
            getConnect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs!=null)
                while(rs.next()){
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("MaHD"));
                    hd.setMaPhieuThue(rs.getString("MaPhieuThue"));
                    hd.setTienDichVu(rs.getString("TienDichVu"));
                    hd.setTienThuePhong(rs.getString("TienThuePhong"));
                    hd.setTriGiaHD(rs.getString("TriGia"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    temp.add(hd);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //thống kê, tổng doanh thu theo từng loại phòng
    public ArrayList<ThongKe> thongke(){
        ArrayList<ThongKe> temp = new ArrayList<>();
        String SQL1 = "Select sum(trigia) as TongDoanhThu from hoadon as TongDoanhThu";
        String tongDoanhThu = "0";

        String SQL2 = "	select TenLoaiP,sum(trigia) as doanhthu from HOADON,PHIEUTHUEPHONG,PHONG, LOAIPHONG where hoadon.MaPhieuThue=phieuthuephong.MaPhieuThue and PHIEUTHUEPHONG.MaPhong=phong.MaPhong and PHONG.MaLoaiP=LOAIPHONG.MaLoaiP group by LOAIPHONG.TenLoaiP";
        try{
            getConnect();
            Statement st = conn.createStatement();
            //tính tổng doanh thu
            ResultSet rs = st.executeQuery(SQL1);
            if(rs!=null&&rs.next())
                tongDoanhThu = rs.getString("TongDoanhThu");
            
            //Lấy dữ liệu 
            rs = st.executeQuery(SQL2);
            if(rs!=null)
                while(rs.next()){
                    ThongKe tk = new ThongKe();
                    tk.setTenLoai(rs.getString("TenLoaiP"));
                    String doanhthu = rs.getString("DoanhThu");
                    tk.setDoanhThu(doanhthu);
                    //tỉ lệ
                    double thu = Double.parseDouble(doanhthu);
                    double tongthu = Double.parseDouble(tongDoanhThu);
                    tk.setTiLe(""+(thu/tongthu)*100);
                    temp.add(tk);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //Thống kê theo năm
    public ArrayList<ThongKe> thongkeTheoNam(String nam){
        ArrayList<ThongKe> temp = new ArrayList<>();
        String SQL1 = "Select sum(trigia) as TongDoanhThu from hoadon as TongDoanhThu where year(NgayHD)="+nam;
        String tongDoanhThu = "0";

        String SQL2 = "	select TenLoaiP,sum(trigia) as doanhthu from HOADON,PHIEUTHUEPHONG,PHONG, LOAIPHONG where hoadon.MaPhieuThue=phieuthuephong.MaPhieuThue and PHIEUTHUEPHONG.MaPhong=phong.MaPhong and PHONG.MaLoaiP=LOAIPHONG.MaLoaiP and year(NgayHD)="+nam+" group by LOAIPHONG.TenLoaiP";
        try{
            getConnect();
            Statement st = conn.createStatement();
            //tính tổng doanh thu
            ResultSet rs = st.executeQuery(SQL1);
            if(rs!=null&&rs.next())
                tongDoanhThu = rs.getString("TongDoanhThu");
            
            //Lấy dữ liệu 
            rs = st.executeQuery(SQL2);
            if(rs!=null)
                while(rs.next()){
                    ThongKe tk = new ThongKe();
                    tk.setTenLoai(rs.getString("TenLoaiP"));
                    String doanhthu = rs.getString("DoanhThu");
                    tk.setDoanhThu(doanhthu);
                    //tỉ lệ
                    double thu = Double.parseDouble(doanhthu);
                    double tongthu = Double.parseDouble(tongDoanhThu);
                    tk.setTiLe(""+(thu/tongthu)*100);
                    temp.add(tk);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    //Thống kê theo tháng
    public ArrayList<ThongKe> thongkeTheoThang(String thang){
        ArrayList<ThongKe> temp = new ArrayList<>();
        String SQL1 = "Select sum(trigia) as TongDoanhThu from hoadon as TongDoanhThu where Month(NgayHD)="+thang;
        String tongDoanhThu = "0";

        String SQL2 = "	select TenLoaiP,sum(trigia) as doanhthu from HOADON,PHIEUTHUEPHONG,PHONG, LOAIPHONG where hoadon.MaPhieuThue=phieuthuephong.MaPhieuThue and PHIEUTHUEPHONG.MaPhong=phong.MaPhong and PHONG.MaLoaiP=LOAIPHONG.MaLoaiP and Month(NgayHD)="+thang+" group by LOAIPHONG.TenLoaiP";
        try{
            getConnect();
            Statement st = conn.createStatement();
            //tính tổng doanh thu
            ResultSet rs = st.executeQuery(SQL1);
            if(rs!=null&&rs.next())
                tongDoanhThu = rs.getString("TongDoanhThu");
            
            //Lấy dữ liệu 
            rs = st.executeQuery(SQL2);
            if(rs!=null)
                while(rs.next()){
                    ThongKe tk = new ThongKe();
                    tk.setTenLoai(rs.getString("TenLoaiP"));
                    String doanhthu = rs.getString("DoanhThu");
                    tk.setDoanhThu(doanhthu);
                    //tỉ lệ
                    double thu = Double.parseDouble(doanhthu);
                    double tongthu = Double.parseDouble(tongDoanhThu);
                    tk.setTiLe(""+(thu/tongthu)*100);
                    temp.add(tk);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    
    //Thống kê theo tháng và năm
    public ArrayList<ThongKe> thongkeTheoThangVaNam(String thang, String nam){
        ArrayList<ThongKe> temp = new ArrayList<>();
        String SQL1 = "Select sum(trigia) as TongDoanhThu from hoadon as TongDoanhThu where Month(NgayHD)="+thang+" and year(NgayHD)="+nam;
        String tongDoanhThu = "0";

        String SQL2 = "	select TenLoaiP,sum(trigia) as doanhthu from HOADON,PHIEUTHUEPHONG,PHONG, LOAIPHONG where hoadon.MaPhieuThue=phieuthuephong.MaPhieuThue and PHIEUTHUEPHONG.MaPhong=phong.MaPhong and PHONG.MaLoaiP=LOAIPHONG.MaLoaiP and Month(NgayHD)="+thang+" and year(ngayHD)="+nam+" group by LOAIPHONG.TenLoaiP";
        try{
            getConnect();
            Statement st = conn.createStatement();
            //tính tổng doanh thu
            ResultSet rs = st.executeQuery(SQL1);
            if(rs!=null&&rs.next())
                tongDoanhThu = rs.getString("TongDoanhThu");
            
            //Lấy dữ liệu 
            rs = st.executeQuery(SQL2);
            if(rs!=null)
                while(rs.next()){
                    ThongKe tk = new ThongKe();
                    tk.setTenLoai(rs.getString("TenLoaiP"));
                    String doanhthu = rs.getString("DoanhThu");
                    tk.setDoanhThu(doanhthu);
                    //tỉ lệ
                    double thu = Double.parseDouble(doanhthu);
                    double tongthu = Double.parseDouble(tongDoanhThu);
                    tk.setTiLe(""+(thu/tongthu)*100);
                    temp.add(tk);
                }
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
