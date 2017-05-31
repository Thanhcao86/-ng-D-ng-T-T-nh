package com.example.thanhcao.apphenho.view;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class baidang {
    private int id_baidang;
    private String Title;
    private String Noidung;
    private String ngaydang;
    public ArrayList<comment> Arr;
    public baidang(){
        id_baidang =0;
        Title = "";
        Noidung ="";
        ngaydang =null;
    }
    public baidang(int id, String td, String nd, String ngay, ArrayList<comment>listcomment){
        super();
        this.id_baidang=id;
        this.Title = td;
        this.Noidung = nd;
        this.ngaydang = ngay;
        this.Arr = listcomment;
    }
    public String getNoidung() {
        return Noidung;
    }
    public String getTitle() {
        return Title;
    }

    public void setId_baidang(int id_baidang) {
        this.id_baidang = id_baidang;
    }

    public void setArr(ArrayList<comment> arr) {
        this.Arr = arr;
    }

    public ArrayList<comment> getArr() {
        return Arr;
    }

    public void setNgaydang(String ngaydang) {
        this.ngaydang = ngaydang;
    }

    public void setNoidung(String noidung) {
        Noidung = noidung;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
