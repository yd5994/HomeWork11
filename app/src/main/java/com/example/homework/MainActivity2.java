package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tx1,tx2,tx3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent gi=getIntent();
        int blue=gi.getIntExtra("blue",1);
        int red=gi.getIntExtra("red",1);
        Toast.makeText(MainActivity2.this,String.valueOf(red),Toast.LENGTH_SHORT).show();
        tx1=findViewById(R.id.textView);
        tx2=findViewById(R.id.textView2);
        tx3=findViewById(R.id.textView3);
        btn=findViewById(R.id.button6);
        tx1.setText("Blue has: "+blue+" points");
        if(blue>red){
            tx2.setText("The blue won with "+blue+" points");
            tx2.setTextColor(Color.parseColor("#0560f2"));
        }
        else{
            tx2.setText("The red won with "+red+" points");
            tx2.setTextColor(Color.parseColor("#f20505"));
        }
        tx3.setText("Red has: "+red+" points");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si = new Intent(getApplicationContext(),MainActivity .class);
                startActivity(si);
            }
        });
    }

//    public void btn6(View view) {
//        Intent si = new Intent(getApplicationContext(),MainActivity .class);
//        startActivity(si);
//    }
}