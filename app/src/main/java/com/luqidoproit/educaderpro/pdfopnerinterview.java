package com.luqidoproit.educaderpro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfopnerinterview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopnerinterview);
        PDFView pdfView=findViewById(R.id.pdfviewerinterview);
        String getitem=getIntent().getStringExtra("pdfINTERname");
        if (getitem.equals("APTITUDE PDF")){

            pdfView.fromAsset("Apptitude.pdf").load();
        }

        if (getitem.equals("GD PDF")){

            pdfView.fromAsset("GD.pdf").load();
        }
        if (getitem.equals("RESUME PDF")){

            pdfView.fromAsset("resume.pdf").load();
        }
        if (getitem.equals("INTERVIEW PDF")){

            pdfView.fromAsset("Interview_question.pdf").load();
        }
    }
}
