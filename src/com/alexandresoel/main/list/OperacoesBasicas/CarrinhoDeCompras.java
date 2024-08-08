package com.alexandresoel.main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void removerItem(Item item){
        itens.remove(item);
    }
    public double calcularValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.getQuantidade() * item.getPreco();
        }
        return total;
    }
    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Item item1 = new Item("Borracha",1.2,2);
        Item item2 = new Item("Lapis",1.5,3);
        Item item3 = new Item("Grafite",5.32,1);
        Item item4 = new Item("post-it",2.0,10);
        //adicionando os itens
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);
        carrinho.adicionarItem(item3);
        carrinho.adicionarItem(item4);
        //exibindo os itens
        carrinho.exibirItens();
        //somando os itens
        System.out.println(carrinho.calcularValorTotal());
        //removendo os itens
        carrinho.removerItem(item4);
        System.out.println(carrinho.calcularValorTotal());

    }

}
