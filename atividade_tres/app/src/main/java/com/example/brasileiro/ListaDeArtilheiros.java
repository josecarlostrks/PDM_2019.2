package com.example.brasileiro;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ListaDeArtilheiros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        List<Jogador> jogadores;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_artilheiros);
        listView = (ListView) findViewById(R.id.lista);
        jogadores = Jogador.getJogadores();

        listView.setAdapter(new JogadorAdapter(this, jogadores));
    }
}
