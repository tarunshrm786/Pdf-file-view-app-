package com.example.aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class time extends AppCompatActivity {

    PDFView booktime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        booktime = (PDFView)findViewById(R.id.timepdf);

        booktime.fromAsset("timework.pdf").load();
    }
}
