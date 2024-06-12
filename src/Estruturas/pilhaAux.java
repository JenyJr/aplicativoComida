package Estruturas;

import Nos.produto;
import Nos.produtoAux;

public class pilhaAux {
    public produto baseAux;
    public produto topoAux;
    public pilhaAux(){
        this.baseAux = this.topoAux = null;
    }

    public boolean Vazia(){
        return baseAux == null;
    }

    public void push(String nome){
        produto inserir = new produto(nome);
        if(Vazia()){
            this.baseAux = this.topoAux = inserir;
        }else{
            topoAux.proximo = inserir;
            topoAux = topoAux.proximo;
        }
    }

    public String popAux(){
        if(Vazia()){
            return null;
        }
        String itemAux = topoAux.nome;
        if(this.baseAux == this.topoAux) {
            this.baseAux = this.topoAux = null;
        } else {
            produto atual = baseAux;
            while (atual.proximo != topoAux){
                atual = atual.proximo;
            }
            topoAux = atual;
            atual.proximo = null;
        }
        return itemAux;
    }


}

