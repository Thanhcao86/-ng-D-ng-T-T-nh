package com.example.thanhcao.apphenho;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
    Button btnlogin;
    EditText username;
    EditText passwords;
    TextView create;
    Boolean kt = true;
    int inl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getid();
        setonclick();
    }
    public void setonclick(){
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getKt();
                if(kt==true){
                    Toast.makeText(MainActivity.this,"the success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,trangchu.class);
                    startActivity(intent);
                }
                else{
                    showtheerr();
                }
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,create.class);
                startActivity(intent);
            }
        });
    }

    public Boolean getKt(){
        String c ="";
        c = username.getText().toString().trim();
        String d = passwords.getText().toString().trim();
        if(c.equals(null)||d.equals(""))
        {
            kt=false;
            inl =1;
        }
        else {
            inl =2;
            kt=true;
        }
        return kt;
    }
    public void showtheerr(){
        switch (inl){
            case 1:{
                Toast.makeText(this,"you have input the username and passwords", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void getid(){
        btnlogin = (Button)findViewById(R.id.buttonlogin);
        username = (EditText)findViewById(R.id.editText);
        passwords =(EditText)findViewById(R.id.editText2);
        create = (TextView)findViewById(R.id.createaccount);
    }

}
