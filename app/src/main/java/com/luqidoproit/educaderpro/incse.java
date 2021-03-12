package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class incse<customAdapter> extends AppCompatActivity {
    String[] item = {"google", "Yahoo", "Hewlett-Packard", "International Business Machines Corporation", "Toshiba Corporation", "NEC Corporation", "Canon Inc", "Apple Inc", "ASUSTEK Computer Inc", "Lenovo Group Limited", "Sun Microsystem", " TCS", "Infosys", "HCL", "Wipro", "Techmahindra",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incse);


    }


    public void oncseclick(View view) {
        switch (view.getId()) {
            case R.id.first_cse:
                Intent i = new Intent(getApplicationContext(), first_cse.class);
                i.putExtra("key", "1");
                i.putExtra("key1", "CS");
                startActivity(i);

                break;
            case R.id.second_cse:
                Intent i1 = new Intent(getApplicationContext(), first_cse.class);
                i1.putExtra("key", "2");
                i1.putExtra("key1", "CS");
                startActivity(i1);

                break;
            case R.id.third_cse:
                Intent i2 = new Intent(getApplicationContext(), first_cse.class);
                i2.putExtra("key", "3");
                i2.putExtra("key1", "CS");
                startActivity(i2);

                break;
            case R.id.fourth_cse:
                startActivity(new Intent(getApplicationContext(), incse.class));
                Toast.makeText(this, "Fourth year will be updated soon", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
