package Estruturas;

import Nos.compra;

//ARVORE BINARIA

public class armazenarCompra{
    compra raiz;

    public armazenarCompra(){
        this.raiz = null;
    }

    public void inserir(String nomeProduto){
        raiz = inserirRec(raiz, nomeProduto);
    }

    public compra inserirRec(compra raiz, String nomeProduto){
        if(raiz == null){
            raiz = new compra(nomeProduto);
            return raiz;
        }

        if (nomeProduto.compareTo(raiz.nomeProduto) < 0){
            raiz.esquerda = inserirRec(raiz.esquerda, nomeProduto);
        }

        else if (nomeProduto.compareTo(raiz.nomeProduto) >0){
            raiz.direita = inserirRec(raiz.direita, nomeProduto);
        }

        return raiz;
    }


    //debug
    public void posOrdem(){
        imprimirArvoreRecPosOrdem(raiz);
    }

    public void imprimirArvoreRecPosOrdem(compra raiz){
        if(raiz != null){
            imprimirArvoreRecPosOrdem(raiz.esquerda);
            imprimirArvoreRecPosOrdem(raiz.direita);
            System.out.println(raiz.nomeProduto);
        }
    }

}