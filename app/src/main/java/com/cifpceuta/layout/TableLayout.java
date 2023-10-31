package com.cifpceuta.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableLayout extends AppCompatActivity {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        boton=(Button) findViewById(R.id.botonRetrocederTableLayout);


    }

    public void botonVolverTabla(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}