package com.example.brasileiro;

import java.util.ArrayList;
import java.util.List;

public class Time {

    public String colocacao;
    public String nome;
    public String pontos;
    public String jogos;
    public String vitorias;
    public String empates;
    public String derrotas;

    public Time(String colocacao, String nome, String pontos, String jogos) {
        this.colocacao = colocacao;
        this.nome = nome;
        this.pontos = pontos;
        this.jogos = jogos;
    }

  /*public Time(String nome, String pontos, String jogos, String vitorias, String empates, String derrotas) {
        this.nome = nome;
        this.pontos = pontos;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }*/

    public static List<Time> getTimes(){
        List<Time> times = new ArrayList<>();
        times.add(new Time("1","Flamengo","71","30"));
        times.add(new Time("2","Palmeiras","63","30"));
        times.add(new Time("3","Santos","58","30"));
        times.add(new Time("4","São Paulo","52","30"));
        times.add(new Time("5","Grêmio","50","30"));
        times.add(new Time("6","Atlético-PR","46","30"));
        times.add(new Time("7","Internacional","46","30"));
        times.add(new Time("8","Corinthians","45","30"));
        times.add(new Time("9","Goiás","42","30"));
        times.add(new Time("10","Bahia","42","30"));
        times.add(new Time("11","Vasco","39","30"));


        /*times.add(new Time("Flamengo","71","30","22","5","3"));
        times.add(new Time("Palmeiras","63","30","22","5","3"));
        times.add(new Time("Santos","58","30","22","5","3"));
        times.add(new Time("São paulo","52","30","22","5","3"));
        times.add(new Time("Grêmio","50","30","22","5","3"));
        times.add(new Time("Atlético-PR","46","30","22","5","3"));
        times.add(new Time("Internacional","46","30","22","5","3"));
        times.add(new Time("Corinthians","45","30","22","5","3"));
        times.add(new Time("Goiás","42","30","22","5","3"));
        times.add(new Time("Bahia","42","30","22","5","3"));
        times.add(new Time("Vasco","39","30","22","5","3"));
        times.add(new Time("Fortaleza","36","30","22","5","3"));
        times.add(new Time("Atlético-MG","36","30","22","5","3"));
        times.add(new Time("Botafogo","33","30","22","5","3"));
        times.add(new Time("Ceará","33","30","22","5","3"));
        times.add(new Time("Cruzeiro","33","30","22","5","3"));
        times.add(new Time("Fluminense","31","30","22","5","3"));
        times.add(new Time("CSA","29","30","22","5","3"));
        times.add(new Time("Chapecoense","21","30","22","5","3"));
        times.add(new Time("Avaí","17","30","22","5","3"));*/

        return times;

    }
}
