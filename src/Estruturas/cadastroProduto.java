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

    public void push(String nome){ //erro de acesso/lógica, estava private void push
        produto inserir = new produto(nome);
        if(Vazia()){
            this.base = this.topo = inserir;
        }else{
            topo.proximo = inserir;
            topo = topo.proximo;
        }
    }

    public String popNome(){ //erro de acesso/lógica, estava private String popNome
        String itemNome = topo.nome;
        if(Vazia()){
            return null;
        }
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
    public void imprimirPilha(){//erro de acesso/lógica, estava private void imprimirPilha
        while(!Vazia()){
            String prod = popNome();
            System.out.println("Produto: " + prod);
            pilhaAux.push(prod);
        }
        while (!pilhaAux.Vazia()) {
            push(pilhaAux.popAux());
        }
    }
}

