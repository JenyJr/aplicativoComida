package Programa;

import Estruturas.avaliacao;
import Estruturas.cadastroProduto;
import Estruturas.cadastroUsuario;

public class yummy {
    public cadastroUsuario cadastrarUsuario = new cadastroUsuario();
    public avaliacao avaliar = new avaliacao();
    public cadastroProduto cadastrarProduto = new cadastroProduto();
    public cadastroUsuario cadastroUsuario;

    void novoUsuario(String tipo, String nome, String email, String cpf, int ddd, int telefone){
        cadastrarUsuario.cadastrar(tipo, nome, email, cpf, ddd, telefone);
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




}
