package com.example.thanhcao.apphenho.view;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class comment {
    private int id_comment;
    private String NoiDung;
    public user id_user;

public comment(){
    this.id_comment=0;
    this.NoiDung = null;
    this.id_user = null;
}
public comment(int id, String nd, user idu){
    this.id_comment=id;
    this.NoiDung=nd;
    this.id_user=idu;
}

    public int getId_comment() {
        return id_comment;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public user getId_user() {
        return id_user;
    }

    public void setId_comment(int id_comment) {
        this.id_comment = id_comment;
    }

    public void setId_user(user id_user) {
        this.id_user = id_user;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }
}