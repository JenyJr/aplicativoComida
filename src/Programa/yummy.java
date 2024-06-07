package Programa;

import Estruturas.armazenarCompra;
import Estruturas.avaliacao;
import Estruturas.cadastroProduto;
import Estruturas.cadastroUsuario;

public class yummy {
    public cadastroUsuario cadastrarUsuario = new cadastroUsuario();
    public avaliacao avaliar = new avaliacao();
    public cadastroProduto cadastrarProduto = new cadastroProduto();

    public armazenarCompra armazenarCompra = new armazenarCompra();

    void novoUsuario(String tipo, String nome, String senha, String email, String cpf, String telefone){
        cadastrarUsuario.cadastrar(tipo, nome, senha, email, cpf, telefone);
    }

    void novoProduto(int id, String nome){
        cadastrarProduto.push(id, nome);
    }
    void retirarProduto(int id, String nome){
        cadastrarProduto.pop();
    }

    void avaliarVendedor(int valor, int idVendedor){
        avaliar.incluir(valor, idVendedor);
    }

    void realizarCompra(String nomeProduto){
        armazenarCompra.inserir(nomeProduto);
    }



}
