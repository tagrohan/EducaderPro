package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class incivil extends AppCompatActivity {
    Button first,second,third,fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incivil);
        first=findViewById(R.id.first_civil);
        second=findViewById(R.id.second_civil);
        third=findViewById(R.id.third_civil);
        fourth=findViewById(R.id.fourth_civil);
    }

    public void oncivilclick(View view) {
        switch (view.getId()){
            case R.id.first_civil:
                Intent i=new Intent(getApplicationContext(),first_cse.class);
                i.putExtra("key","FIRST_YEAR");
                startActivity(i);
                break;

            case R.id.second_civil:
                Intent i1=new Intent(getApplicationContext(),first_cse.class);
                i1.putExtra("key","SECOND_YEAR_CIVIL");
                startActivity(i1);
                break;

            case R.id.third_civil:
                Intent i2=new Intent(getApplicationContext(),first_cse.class);
                i2.putExtra("key","THIRD_YEAR_CIVIL");
                startActivity(i2);
            case R.id.fourth_civil:
                Toast.makeText(this, "Fourth year will be updated soon", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
