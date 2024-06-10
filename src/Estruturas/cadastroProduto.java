package Estruturas;
import Nos.produto;
//PILHA

public class cadastroProduto {
    public produto base;
    public produto topo;

    pilhaAux pilhaAux = new pilhaAux();
    public cadastroProduto(){
        this.base = this.topo = null;
    }

    public boolean Vazia(){
        return base == null;
    }

    public void push(String nome){
        if(Vazia()){
            this.base = this.topo = new produto(nome);
        }else{
            topo.proximo = new produto(nome);
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
    public void imprimirPilha(){
        while(!Vazia()){
            String prod = popNome();
            System.out.println("Produto: " + prod);
            pilhaAux.push(prod);
        }
        while (!pilhaAux.Vazia()) {
            push(pilhaAux.popNome());
        }
    }
}

