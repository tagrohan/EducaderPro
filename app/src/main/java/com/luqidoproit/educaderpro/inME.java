package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class inME extends AppCompatActivity {
    Button first,second,third,fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_me);
        first=findViewById(R.id.first_me);
        second=findViewById(R.id.second_me);
        third=findViewById(R.id.third_me);
        fourth=findViewById(R.id.fourth_me);
    }

    public void onmeclick(View view) {
        switch (view.getId()){
            case R.id.first_me:
                Intent i=new Intent(getApplicationContext(),first_cse.class);
                i.putExtra("key","1");
                i.putExtra("key1","me");
                startActivity(i);
                break;
            case R.id.second_me:
                Intent i1=new Intent(getApplicationContext(),first_cse.class);
                i1.putExtra("key","2");
                i1.putExtra("key1","me");
                startActivity(i1);


                break;
            case R.id.third_me:
                Intent i2=new Intent(getApplicationContext(),first_cse.class);
                i2.putExtra("key","3");
                i2.putExtra("key1","me");
                startActivity(i2);

                break;
            case R.id.fourth_me:
                startActivity(new Intent(getApplicationContext(),inME.class));
                Toast.makeText(this, "Fourth year will be updated soon", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
