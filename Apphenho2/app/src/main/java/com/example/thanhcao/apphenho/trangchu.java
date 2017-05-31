package com.example.thanhcao.apphenho;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.thanhcao.apphenho.view.Adapter;
import com.example.thanhcao.apphenho.view.contact;
import com.example.thanhcao.apphenho.view.sqliteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class trangchu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        sqliteDatabase db = new sqliteDatabase(this);

        Button btn;
        private ListView lvContact;
        public ArrayList<contact> arrContact = new ArrayList<>();
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //db.ThanhCao_QueryData("CREATE IF NOT EXISTS baidang(id_baidang INTEGER PRIMARY KEY, title VARCHAR(200)");
            lvContact = (ListView) findViewById(R.id.listView2);
            contact contact1 = new contact("Trần Thanh Cao","Nam","Độc Thân",Color.BLUE,"Chào các mày, yêu nhau không mày");
            contact contact2 = new contact("Dương Thị Thúy","Nữ","1 Chồng 2 Con", Color.GREEN,"Lên Để Kiếm Bồ");
            contact contact3 = new contact("Dương Thị Quế","Nữ","1 Người Yêu, 2 Thằng Bồ", Color.GRAY,"Kiếm Chồng");
            contact contact4 = new contact("Nguyễn Thị Vân Anh","Less","Chưa Chồng Con", Color.YELLOW,"Kiếm Vợ");
            contact contact5 = new contact("Phạm Thị Thêu","Nam","1 chồng 2 con", Color.BLACK,"kiếm bồ để lê la");
            arrContact.add(contact1);
            arrContact.add(contact2);
            arrContact.add(contact3);
            arrContact.add(contact4);
            arrContact.add(contact5);
            Adapter customAdaper = new Adapter(this,R.layout.content_main,arrContact);
            lvContact.setAdapter(customAdaper);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show();
        }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        }

@Override
public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
        } else {
        super.onBackPressed();
        }
        }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        }

@Override
public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
        return true;
        }

        return super.onOptionsItemSelected(item);
        }

@SuppressWarnings("StatementWithEmptyBody")
@Override
public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
        // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            //item.setOnMenuItemClickListener();

        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(trangchu.this, "click", Toast.LENGTH_SHORT).show();
            Intent mIntent = new Intent(trangchu.this, addpost.class);
            startActivity(mIntent);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        }
}
