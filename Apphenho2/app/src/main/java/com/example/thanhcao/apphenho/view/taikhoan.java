package com.example.thanhcao.apphenho.view;

import java.util.ArrayList;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class taikhoan {
    private String Taikhoan;
    private String Passwords;
    public user  id_user;

    public void setId_user(user id_user) {
        this.id_user = id_user;
    }

    public user getId_user() {
        return id_user;
    }

    public String getPasswords() {
        return Passwords;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setPasswords(String passwords) {
        Passwords = passwords;
    }

    public void setTaikhoan(String taikhoan) {
        Taikhoan = taikhoan;
    }
}
