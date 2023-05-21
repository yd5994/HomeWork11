package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    int blue=0,red=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue++;
                Toast.makeText(MainActivity.this,String.valueOf(blue),Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                red+=2;
                Toast.makeText(MainActivity.this,String.valueOf(red),Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si = new Intent(getApplicationContext(),MainActivity2.class);
                si.putExtra("blue",blue);
                si.putExtra("red",red);
                startActivity(si);
            }
        });
    }

//    public void btn2(View view) {
//        Intent si = new Intent(getApplicationContext(),MainActivity2.class);
//        si.putExtra("blue",blue);
//        si.putExtra("red",red);
//        startActivity(si);
//    }
}
