package Estruturas;
import Nos.usuario;

import java.util.Objects;
//LISTA DUPLAMENTE ENCADEADA

public class cadastroUsuario {
    usuario inicio;

    public cadastroUsuario(){
        this.inicio = null;
    }

    public void cadastrar(String tipo, String nome, String email, String cpf, String telefone, String senha){
        usuario novoCliente = new usuario(tipo, nome, email, cpf, telefone, senha);
        if (this.inicio == null){
            this.inicio = novoCliente;
        } else if(this.inicio.cpf.equals(cpf)){
           this.inicio = this.inicio.proximo;
           this.inicio.proximo = novoCliente;
        } else {
            usuario atual = this.inicio;
            usuario anterior = this.inicio;

            while(atual.proximo != null){
                anterior = atual;
                atual = atual.proximo;
            }
            atual.anterior = anterior;
            atual.proximo = novoCliente;
      }
    }


    public String retornarCPF(String cpf){
        usuario atual = this.inicio;
        usuario anterior = this.inicio;

        while(!atual.cpf.equals(cpf)){
            anterior = atual;
            atual = atual.proximo;
        }
        return cpf;
    }

    //debug
    public void imprimirLista(){
        usuario atual = this.inicio;
        usuario anterior = this.inicio;

        long CPF = Long.parseLong(atual.cpf);
        long TEL = Long.parseLong(atual.telefone);

        while(atual != null){
            System.out.println("Tipo: " + atual.tipo);
            System.out.println("Nome: " + atual.nome);
            System.out.println("Email: "  + atual.email);
            System.out.println("Cpf :" + CPF);
            System.out.println("Telefone :" + TEL);

            anterior = atual;
            atual = atual.proximo;
        }
    }



}




