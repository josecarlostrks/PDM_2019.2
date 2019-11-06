package com.example.brasileiro;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    public String nome;
    public int img;
    public String gols;

    public Jogador(String nome, int img, String gols) {
        this.nome = nome;
        this.img = img;
        this.gols = gols;
    }

    public static List<Jogador> getJogadores(){
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Gabigol", R.drawable.gabigol, "20"));
        jogadores.add(new Jogador("Bruno Henrique", R.drawable.bruno, "15"));
        jogadores.add(new Jogador("Gilberto", R.drawable.gilberto, "11"));
        jogadores.add(new Jogador("Arrascaeta", R.drawable.arrascaeta, "11"));
        jogadores.add(new Jogador("Sasha", R.drawable.sasha, "11"));
        jogadores.add(new Jogador("tiago", R.drawable.tiago, "9"));
        return jogadores;
    }
}
