package com.example.thanhcao.apphenho;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thanhcao.apphenho.R;
import com.example.thanhcao.apphenho.view.baidang;
import com.example.thanhcao.apphenho.view.contact;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class addpost extends Activity{
    public baidang baidang;
    Button btndangbai;
    EditText title;
    EditText noidung;
    trangchu arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addpost);
        setclick();
        btndangbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = "";
                String f = "";
                d = title.getText().toString().trim();
                f = noidung.getText().toString().trim();
                if (d.equals(null)||f.equals(null)){
                    Toast.makeText(addpost.this,"the title and text can't null", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(addpost.this,"the succes", Toast.LENGTH_SHORT).show();
                    contact contact6 = new contact("Trần Thanh Cao","Nam","Phức Tạp", Color.YELLOW,d);
//                    arr.arrContact.add(contact6);
                }
            }
        });
    }
    public void setclick(){
        btndangbai = (Button)findViewById(R.id.button2);
        title = (EditText)findViewById(R.id.editText3);
        noidung = (EditText)findViewById(R.id.listView);
    }
}
