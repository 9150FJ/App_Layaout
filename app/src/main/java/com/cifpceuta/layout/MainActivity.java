package com.cifpceuta.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void botonVolver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void botonLinear(View view){
        Intent i = new Intent(this,ActivityLinea.class);
        startActivity(i);
    }


    public void botonFrameLayout(View view){
        //Intent i = new Intent(this,MainActivity.class);
        //startActivity(i);
    }
    public void botonRelativeLayout(View view){
        Intent i = new Intent(this, RelativeLayout.class);
        startActivity(i);
    }

    
}