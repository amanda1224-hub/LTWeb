/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class MucLuc {
    private int idMucLuc;
    private String tenMucLuc;

    public MucLuc() {
    }

    public MucLuc(int idMucLuc, String tenMucLuc) {
        this.idMucLuc = idMucLuc;
        this.tenMucLuc = tenMucLuc;
    }

    public int getIdMucLuc() {
        return idMucLuc;
    }

    public void setIdMucLuc(int idMucLuc) {
        this.idMucLuc = idMucLuc;
    }

    public String getTenMucLuc() {
        return tenMucLuc;
    }

    public void setTenMucLuc(String tenMucLuc) {
        this.tenMucLuc = tenMucLuc;
    }

    @Override
    public String toString() {
        return "MucLuc{" + "idMucLuc=" + idMucLuc + ", tenMucLuc=" + tenMucLuc + '}';
    }
    
}
