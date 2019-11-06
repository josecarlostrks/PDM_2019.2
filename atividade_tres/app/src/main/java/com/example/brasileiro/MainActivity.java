package com.example.brasileiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOther = findViewById(R.id.button);
        btnOther.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Classificacao.class);
               // intent.putExtra("PARAM_MAIN_0", "Ari Garcia");
                MainActivity.this.startActivity(intent);
            }
        });


        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaDeArtilheiros.class);
                // intent.putExtra("PARAM_MAIN_0", "Ari Garcia");
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
