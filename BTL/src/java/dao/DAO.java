/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.HopDong;
import entity.MucLuc;
import entity.Phong;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Phong> getAllPhong(){
        List<Phong> list = new ArrayList<>();
        String query = "select * from Phong";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                if(rs.getInt(6) == 0){
                    list.add(new Phong(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getInt(7)));
                }
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Phong> getAllPhongById(String id){
        List<Phong> list = new ArrayList<>();
        String query = "select * from Phong where idMucLuc = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                if(rs.getInt(6) == 0){
                    list.add(new Phong(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getInt(7)));
                }
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<MucLuc> getAllMucLuc(){
        List<MucLuc> list = new ArrayList<>();
        String query = "select * from MucLuc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MucLuc(rs.getInt(1),
                                    rs.getString(2)));
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Phong getPhongUuDai(){
        String query = "select top 1 * from Phong\n"
                + "order by donGia ASC";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Phong(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6),
                           
                            rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }
      public Account dangnhap(String user, String pass) {
        String query = "SELECT * FROM Account WHERE username = ? AND password = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = new DBContext().getConnection(); // Mở kết nối với SQL
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return new Account(rs.getString("username"), rs.getString("password"), rs.getInt("role"), rs.getInt("status"));
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ghi lại ngoại lệ
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace(); // Ghi lại ngoại lệ khi đóng kết nối
            }
        }
        
        return null;
    }
    public Account checkAccount(String user){
        String query ="select* from Account where [username] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        } catch (Exception e) {
        }
        
        return null;
    }
    public void dangki(String user, String pass){
        String query ="insert into account values(?, ?, 0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public void themPhong(String tenPhong, String image, String loaiPhong, String donGia, String MucLucid){
        String query ="INSERT [dbo].[Phong] ([tenPhong],[image],[loaiPhong],[donGia],[trangThai],[idMucLuc])\n" +
"VAlUES (?,?,?,?,0,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tenPhong);
            ps.setString(2, image);
            ps.setString(3, loaiPhong);
            ps.setString(4, donGia);
           
            ps.setString(5, MucLucid);
           
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public Phong getPhongByID(String id) {
        
        String query = " select* from Phong where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new Phong(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void ChinhSuaPhong(String tenphong, String image, String loaiphong, String dongia, String muclucid, String id){
        String query ="UPDATE phong \n" +
                        "set [tenPhong] = ?,\n" +
                        "[image] = ?,\n" +
                        "[loaiPhong] = ?,\n" +
                        "[donGia] = ?,\n" +
                        "[idMucLuc] = ?\n" +
                        "where [id] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tenphong);
            ps.setString(2, image);
            ps.setString(3, loaiphong);
            ps.setString(4, dongia);
            ps.setString(5, muclucid);
            ps.setString(6, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public void XoaPhongByID(String id){
        String query ="delete from phong where [id] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public void DatPhong(int idKH, String idphong, String tenKH, String sdtKH, String emailKH, String citizenKH, String checkin, String checkout){
        String query ="INSERT [dbo].[HopDong] ([idKH],[idphong],[tenKH],[sdtKH],[emailKH],[citizenKH],[checkin],[checkout])\n" +
"VAlUES (?,?,?,?,?,?,?,?)\n" + "UPDATE phong \n" +
                        "set [trangThai] = 1\n" +"where [id] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, idKH);
            ps.setString(2, idphong);
            ps.setString(3, tenKH);
            ps.setString(4, sdtKH);
            ps.setString(5, emailKH);
            ps.setString(6, citizenKH);
            ps.setString(7, checkin);
            ps.setString(8, checkout);
            ps.setString(9, idphong);
            ps.executeUpdate();
            
        } catch (Exception e) {    
        }
    }
    public List<HopDong> getAllHopDong(){
        List<HopDong> list = new ArrayList<>();
        String query = "select * from HopDong";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               
                list.add(new HopDong(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4), 
                        rs.getString(5), 
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getDate(9)));
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public void XoaHopDongByID(String id){
        
        String query ="delete from HopDong where [id] = ?\n" + "UPDATE phong \n" +
                        "set [trangThai] = 0\n" +"where [id] = ?";
        try {
            String idphong ="";
            DAO dao = new DAO();
            List<HopDong> listHD = dao.getAllHopDong();
            for(HopDong x : listHD){
                if(x.getIdHD() == Integer.parseInt(id)){
                    idphong = idphong + x.getIdphong();
                    break;
                }
            }
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, idphong);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
 } 

