package Nos;

public class usuario {

    public String tipo, nome, senha, email, cpf, telefone;

    public usuario proximo;
    public usuario anterior;

    public usuario(String tipo, String nome, String senha, String email, String cpf, String telefone){
        this.proximo  = this.anterior = null;
        this.tipo = tipo;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;

    }
}

