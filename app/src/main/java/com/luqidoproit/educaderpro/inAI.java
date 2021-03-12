package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class inAI extends AppCompatActivity {
    Button first,second,third,fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_ai);
        first=findViewById(R.id.first_ai);
        second=findViewById(R.id.second_ai);
        third=findViewById(R.id.third_ai);
        fourth=findViewById(R.id.fourth_ai);
    }

    public void onaiclick(View view) {
        switch (view.getId()){
            case R.id.first_ai:
                startActivity(new Intent(getApplicationContext(),first_cse.class));
                break;
            case R.id.second_ai:
                startActivity(new Intent(getApplicationContext(),first_cse.class));
                break;
            case R.id.third_ai:
                startActivity(new Intent(getApplicationContext(),first_cse.class));
                break;
            case R.id.fourth_ai:
                startActivity(new Intent(getApplicationContext(),first_cse.class));
                break;
        }
    }
}
