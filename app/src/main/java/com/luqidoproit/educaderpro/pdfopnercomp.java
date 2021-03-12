package com.luqidoproit.educaderpro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfopnercomp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopnercomp);
        PDFView pdfView=findViewById(R.id.pdfviewercomp);
        String getitem=getIntent().getStringExtra("pdfcontentname");
        if (getitem.equals("GATE PDF")){

            pdfView.fromAsset("Gate.pdf").load();
        }

        if (getitem.equals("CAT PDF")){

            pdfView.fromAsset("CAT.pdf").load();
        }
        if (getitem.equals("UPSC PDF")){

            pdfView.fromAsset("IAS.pdf").load();
        }
        if (getitem.equals("SAT PDF")){

            pdfView.fromAsset("sat.pdf").load();
        }

    }
}
