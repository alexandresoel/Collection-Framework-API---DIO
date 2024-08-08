package com.alexandresoel.main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> listaTarefa;

    public ListaDeTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        listaTarefa.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(tarefa)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotalDeTarefas(){
        return listaTarefa.size();
    }

    public void ObterDescricoesTarefa(){
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefa = new ListaDeTarefas();
        System.out.println(listaDeTarefa.ObterNumeroTotalDeTarefas());
        listaDeTarefa.adicionarTarefa("Tarefa 01");
        listaDeTarefa.adicionarTarefa("Tarefa 01");
        listaDeTarefa.adicionarTarefa("Tarefa 01");
        listaDeTarefa.adicionarTarefa("Tarefa 02");
        listaDeTarefa.adicionarTarefa("Tarefa 03");
        listaDeTarefa.adicionarTarefa("Tarefa 04");
        System.out.println(listaDeTarefa.ObterNumeroTotalDeTarefas());
        listaDeTarefa.removerTarefa("Tarefa 01");
        System.out.println(listaDeTarefa.ObterNumeroTotalDeTarefas());
        listaDeTarefa.ObterDescricoesTarefa();
    }
}
