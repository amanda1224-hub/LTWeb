/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Account {
    private String username;
    private String password;
    private int isAdmin;
    private int id;

    public Account() {
    }

    public Account(String username, String password, int isAdmin, int id) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static boolean check(String s){
        //05-05-2002
        if(s.length() != 10) return false;
        if(s.charAt(2)!='-' || s.charAt(5) !='-') return false;
        String[] arr = s.split("-");
        for(String x : arr){
            for(int i = 0; i < x.length(); i++){
                if(!Character.isDigit(x.charAt(i))) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="05-05-2002";
        System.out.println(check(s));

    }
}
