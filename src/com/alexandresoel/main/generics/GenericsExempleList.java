package com.alexandresoel.main.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // permite adicionar qualquer tipo

        // Exemplo com Generics
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for(String elemento : listaComGenerics){
            System.out.println(elemento);
        }

        //iterando sobre a lista sem generics
        for (Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
