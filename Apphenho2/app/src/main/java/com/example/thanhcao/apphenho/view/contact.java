package com.example.thanhcao.apphenho.view;

import android.media.Image;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class contact {
    private String Name;
    private user id_user;
    private String Sex;
    private String Relasion;
    private int color;
    private String noidung;

public contact(String Name, String Sex, String Relasion, int color, String nd){
    this.Name=Name;
    this.Sex=Sex;
    this.Relasion=Relasion;
    this.color = color;
    this.noidung=nd;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public String getName() {
        return Name;
    }

    public String getSex() {
        return Sex;
    }

    public String getRelasion() {
        return Relasion;
    }


    public void setRelasion(String relasion) {
        Relasion = relasion;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
    public void show(){

    }
}
