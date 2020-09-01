package com.example.lat2belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Melakukan Telp
    public void panggil (View view)
    {
        String nomor    = "0895325910615";
        Intent panggil  = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    //Membuka Website
    public void buka(View view)
    {
        String url = "https://babangkoding18.blogspot.com";
        Intent buka = new Intent(Intent.ACTION_VIEW);
        buka.setData(Uri. parse(url));
        startActivity(buka);
    }

    //Membuka About
    public void tentang(View view)
    {
        Intent tentang= new Intent(MainActivity.this, MeActivity.class);
        startActivity(tentang);
    }
}
