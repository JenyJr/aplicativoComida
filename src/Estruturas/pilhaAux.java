package Estruturas;

import Nos.produto;
import Nos.produtoAux;

public class pilhaAux {
    public produto base;
    public produto topo;
    public pilhaAux(){
        this.base = this.topo = null;
    }

    public boolean Vazia(){
        return base == null;
    }

    public void push(String nome){
        produto inserir = new produto(nome);
        if(Vazia()){
            this.base = this.topo = inserir;
        }else{
            topo.proximo = inserir;
            topo = topo.proximo;
        }
    }

    public String popNome(){
        if(Vazia()){
            return null;
        }
        String itemNome = topo.nome;
        if(this.base == this.topo) {
            this.base = this.topo = null;
        } else {
            produto atual = base;
            while (atual.proximo != topo){
                atual = atual.proximo;
            }
            topo = atual;
            atual.proximo = null;
        }
        return itemNome;
    }

    //debug
}

