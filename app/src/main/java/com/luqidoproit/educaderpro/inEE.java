package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class inEE extends AppCompatActivity {
    Button first,second,third,fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_ee);
        first=findViewById(R.id.first_ee);
        second=findViewById(R.id.second_ee);
        third=findViewById(R.id.third_ee);
        fourth=findViewById(R.id.fourth_ee);
    }

    public void oneeclick(View view) {
        switch (view.getId()){
            case R.id.first_ee:
                Intent i=new Intent(getApplicationContext(),first_cse.class);
                i.putExtra("key","FIRST_YEAR");
                startActivity(i);
                break;
            case R.id.second_ee:
                Intent i1=new Intent(getApplicationContext(),first_cse.class);
                i1.putExtra("key","SECOND_YEAR_EE");
                startActivity(i1);
                break;
            case R.id.third_ee:
                Intent i2=new Intent(getApplicationContext(),first_cse.class);
                i2.putExtra("key","THIRD_YEAR_EE");
                startActivity(i2);
                break;
            case R.id.fourth_ee:
                Toast.makeText(this, "Fourth year will be updated soon", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
