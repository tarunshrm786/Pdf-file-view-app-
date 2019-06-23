package com.example.aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Profit extends AppCompatActivity {

    PDFView bookprofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);

        bookprofit = (PDFView)findViewById(R.id.profitpdf);
        bookprofit.fromAsset("profitloss.pdf").load();
    }
}
