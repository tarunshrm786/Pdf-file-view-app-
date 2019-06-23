package com.example.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Book extends AppCompatActivity {

    PDFView book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        book = (PDFView)findViewById(R.id.pdfbook);

        book.fromAsset("ratio.pdf").load();
    }
}
