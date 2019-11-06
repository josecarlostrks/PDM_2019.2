package com.example.brasileiro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TimeAdapter extends BaseAdapter {
    private final Context context;
    private final List<Time> times;

    public TimeAdapter(Context context, List<Time> times) {
        this.context = context;
        this.times = times;
    }

    @Override
    public int getCount() {
        return times != null ? times.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_time, parent, false);

        TextView tcolocacao = (TextView) view.findViewById(R.id.colocacao);
        TextView tnome = (TextView) view.findViewById(R.id.nome_time);
        TextView tpontos = (TextView) view.findViewById(R.id.pontos);
        TextView tjogos = (TextView) view.findViewById(R.id.jogos);
        /*TextView tvitorias = (TextView) view.findViewById(R.id.vitorias);
        TextView tempates = (TextView) view.findViewById(R.id.empates);
        TextView tderrotas = (TextView) view.findViewById(R.id.derrotas);*/


        Time time = times.get(position);
        tcolocacao.setText(time.colocacao);
        tnome.setText(time.nome);
        tpontos.setText(time.pontos);
        tjogos.setText(time.jogos);
        /*tvitorias.setText(time.vitorias);
        tempates.setText(time.empates);
        tderrotas.setText(time.derrotas);*/

        return view;
    }
}
