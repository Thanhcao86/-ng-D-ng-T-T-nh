package com.example.thanhcao.apphenho;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class login extends Activity {
    Button btnlogin;
    Boolean kt = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btnlogin = (Button)findViewById(R.id.buttonlogin);
    if (kt ==true){
    }
    }
    public Boolean getKt() {
        return kt;
    }
}
