/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class HopDong {
    private int id;
    private int idKH;
    private int idphong;
    private String tenKH, sdtKH, emailKH, citizenKH, checkin, checkout;

    public HopDong() {
    }

    public HopDong(int idHD, int idKH, int idphong, String tenKH, String sdtKH, String emailKH, String citizenKH, Date checkin, Date checkout) {
        this.id = idHD;
        this.idKH = idKH;
        this.idphong = idphong;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.emailKH = emailKH;
        this.citizenKH = citizenKH;
        this.checkin = new SimpleDateFormat("dd-MM-YYYY").format(checkin);
        this.checkout = new SimpleDateFormat("dd-MM-YYYY").format(checkout);
    }

    public int getIdHD() {
        return id;
    }

    public void setIdHD(int idHD) {
        this.id = idHD;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getIdphong() {
        return idphong;
    }

    public void setIdphong(int idphong) {
        this.idphong = idphong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }

    public String getCitizenKH() {
        return citizenKH;
    }

    public void setCitizenKH(String citizenKH) {
        this.citizenKH = citizenKH;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

   
    
}
