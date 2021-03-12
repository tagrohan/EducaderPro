package com.luqidoproit.educaderpro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfopner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopner);
        PDFView pdfView=findViewById(R.id.pdfviewer);
        String getitem=getIntent().getStringExtra("pdffilename");
        if (getitem.equals("PRESENTATION SKILL PDF")){

         pdfView.fromAsset("presentation_skills.pdf");
        }
        if (getitem.equals("PRESENTATION SKILL PDF")){

            pdfView.fromAsset("presentation_skills.pdf").load();
        }
        if (getitem.equals("ENTREPRENEURSHIP PDF")){

            pdfView.fromAsset("Entrepreneurship.pdf").load();
        }
        if (getitem.equals("ENGLISH COMMUNICATION PDF")){

            pdfView.fromAsset("English Comunication skills.pdf").load();
        }
        if (getitem.equals("PUBLIC SPEAKING PDF")){

            pdfView.fromAsset("Public_speaking.pdf").load();
        }
        if (getitem.equals("TEAM WORK PDF")){

            pdfView.fromAsset("teamwork.pdf").load();
        }
        if (getitem.equals("LEADERSHIP SKILL PDF")){

            pdfView.fromAsset("leadership-skills.pdf").load();
        }
    }
}
