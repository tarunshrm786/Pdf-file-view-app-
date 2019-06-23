package com.example.aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Percentage extends AppCompatActivity {

    PDFView percentagebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);


       percentagebook = (PDFView)findViewById(R.id.percentagepdf);

        percentagebook.fromAsset("Percentage.pdf").load();
    }
}
