/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Phong {
    private int id;
    private String tenPhong;
    private String image;
    private String loaiPhong;
    private int donGia;
    private int trangThai;
    private int idMucLuc;

    public Phong() {
    }

    public Phong(int id, String tenPhong, String image, String loaiPhong, int donGia, int trangThai, int idMucLuc) {
        this.id = id;
        this.tenPhong = tenPhong;
        this.image = image;
        this.loaiPhong = loaiPhong;
        this.donGia = donGia;
        this.trangThai = trangThai;

        this.idMucLuc = idMucLuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }



    public int getIdMucLuc() {
        return idMucLuc;
    }

    public void setIdMucLuc(int idMucLuc) {
        this.idMucLuc = idMucLuc;
    }

   
    
    
}
