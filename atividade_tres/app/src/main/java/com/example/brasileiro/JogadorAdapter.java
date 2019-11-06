package com.example.brasileiro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class JogadorAdapter extends BaseAdapter {
    private final Context context;
    private final List<Jogador> jogadores;

    public JogadorAdapter(Context context, List<Jogador> jogadores) {
        this.context = context;
        this.jogadores = jogadores;
    }

    @Override
    public int getCount() {

        return jogadores != null ? jogadores.size() : 0;
    }

    @Override
    public Object getItem(int position) {

        return jogadores.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflar a view

        View view = LayoutInflater.from(context).inflate(R.layout.adapter_jogador, parent, false);
        // faz findViewById das views que precisa atualizar
        TextView t = (TextView) view.findViewById(R.id.nome_jogador);
        TextView tgols = (TextView) view.findViewById(R.id.gols_jogador);
        ImageView imageView = (ImageView) view.findViewById(R.id.foto_jogador);
        // atulaliza os valores das views
        Jogador jogador = jogadores.get(position);
        tgols.setText(jogador.gols);
        t.setText(jogador.nome);
        imageView.setImageResource(jogador.img);
        // retorna a view
        return view;
    }
}
