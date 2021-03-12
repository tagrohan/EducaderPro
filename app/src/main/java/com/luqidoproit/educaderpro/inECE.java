package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class inECE extends AppCompatActivity {
Button first, second,third,fourth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_ece);
        first=findViewById(R.id.first_ece);
        second=findViewById(R.id.second_ece);
        third=findViewById(R.id.third_ece);
        fourth=findViewById(R.id.fourth_ece);

    }

    public void onececlick(View view) {
        switch (view.getId()){
            case R.id.first_ece:
                Intent i=new Intent(getApplicationContext(),first_cse.class);
                i.putExtra("key","FIRST_YEAR");
                startActivity(i);
                break;
            case R.id.second_ece:
                Intent i1=new Intent(getApplicationContext(),first_cse.class);
                i1.putExtra("key","SECOND_YEAR_ECE");
                startActivity(i1);
                break;
            case R.id.third_ece:
                Intent i2=new Intent(getApplicationContext(),first_cse.class);
                i2.putExtra("key","THIRD_YEAR_ECE");
                startActivity(i2);
                break;
            case R.id.fourth_ece:
                startActivity(new Intent(getApplicationContext(),first_cse.class));
                Toast.makeText(this, "Fourth year will be updated soon", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
