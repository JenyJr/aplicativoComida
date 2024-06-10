package Estruturas;

import Nos.nota;
//FILA

public class avaliacao{
    public nota primeiro;
    public nota ultimo;

    public cadastroUsuario cadastroUsuario = new cadastroUsuario();

    public avaliacao(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void incluir (int valor){
        nota inserir = new nota(valor);
        if(this.primeiro == null){
            this.primeiro = inserir;
            this.ultimo = inserir;
        } else {
            this.ultimo.proximo = inserir;
            this.ultimo = this.ultimo.proximo;
        }
    }

    //debug
    public void imprimir(){
        if(this.primeiro!=null){
            nota atual = this.primeiro;
            while(atual!= null){
                System.out.println("Avaliação: " + atual.valor );
                atual = atual.proximo;
            }


        }
    }
}
