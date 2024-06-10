package Programa;
import Estruturas.*;
import Nos.*;

public class yummy {
    public cadastroUsuario cadastrarUsuario = new cadastroUsuario();
    public avaliacao avaliar = new avaliacao();
    public cadastroProduto produto = new cadastroProduto();

    public pilhaAux pilhaAux = new pilhaAux();
    public cadastroUsuario cadastroUsuario;

    public armazenarCompra historicoCompras = new armazenarCompra();

    public void historicoCompra(String nome){
        historicoCompras.inserir(nome);
    }

    void imprimirPilha(){
       produto.imprimirPilha();
    }

    void novoUsuario(String tipo, String nome, String email, String cpf, String telefone, String senha){
        cadastrarUsuario.cadastrar(tipo, nome, email, cpf, telefone, String.valueOf(senha));
    }

    void novoProduto(String nome){
        produto.push(nome);
    }
    void retirarProduto(String nome){
        produto.popNome();
    }
    void avaliarVendedor(int valor){
        avaliar.incluir(valor);
    }

}
