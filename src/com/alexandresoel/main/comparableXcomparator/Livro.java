package com.alexandresoel.main.comparableXcomparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;

    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Usado para ordenar livros por titulo
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }
}
//classe para comparar livro por autor
class CompararAutor implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
//classe para comparar livro por ano
class CompararAno implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        if (l1.getAno() < l2.getAno()) return -1;
        else if (l1.getAno() > l2.getAno()) return 1;
        else return 0;
    }
}
class CompararAnoAutorTitulo implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0) return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
