package com.example.qmuipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public abstract class MainActivity<Login> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View LGI = findViewById(R.id.logIn);
        LGI.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,nextActivity.class);
                startActivity(intent);
            }
        });
    }


}
