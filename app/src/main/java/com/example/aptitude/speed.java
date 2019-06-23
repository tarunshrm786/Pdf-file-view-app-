package com.example.aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class speed extends AppCompatActivity {

    PDFView bookspeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        bookspeed = (PDFView)findViewById(R.id.speedpdf);

        bookspeed.fromAsset("speed.pdf").load();
    }
}
