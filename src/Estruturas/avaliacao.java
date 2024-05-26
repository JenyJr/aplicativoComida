package Estruturas;

import Nos.nota;

public class avaliacao{
    public nota primeiro;
    public nota ultimo;

    public avaliacao(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void incluir (int valor, int idVendedor){
        nota inserir = new nota(valor, idVendedor);
        if(this.primeiro == null){
            this.primeiro = inserir;
            this.ultimo = inserir;
        } else {
            this.ultimo.proximo = inserir;
            this.ultimo = this.ultimo.proximo;
        }
    }

    public int retornarIDdoVendedor(){
        nota atual = this.primeiro;
        return atual.idVendedor;
    }

    //debug
    public void imprimir(){
        if(this.primeiro!=null){
            nota atual = this.primeiro;
            while(atual!= null){
                System.out.println("Avaliação: " + atual.valor + "Vendedor: " + atual.idVendedor);
                atual = atual.proximo;
            }


        }
    }
}
