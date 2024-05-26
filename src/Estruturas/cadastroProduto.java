package Estruturas;
import Nos.produto;

public class cadastroProduto {
    public produto base;
    public produto topo;
    public cadastroProduto(){
        this.base = this.topo = null;
    }

    public boolean Vazia(){
        return base == null;
    }

    public void push(int id, String nome){
        produto inserir = new produto(id,nome);
        if(Vazia()){
            this.base = this.topo = inserir;
        }else{
            topo.proximo = inserir;
            topo = topo.proximo;
        }
    }
    public String pop(){
        String itemNome = topo.nome;
        if(Vazia()){
            return null;
        } else if(this.base == this.topo) {
            this.base = this.topo = null;
        } else {
            produto atual = base;
            while (atual.proximo != topo){
                atual = atual.proximo;
            }
            atual = base;
            atual.proximo = null;
        }
        return itemNome;
    }

    //debug
    public void imprimirPilha(){
        if(Vazia()){
            System.err.println("SEM PRODUTOS");
        }else {
            produto atual = base;

            do {
                System.out.println("ID: " + atual.id + " Produto: " + atual.nome);
                atual = atual.proximo;
            }while (atual.proximo != topo);
        }
    }


}
