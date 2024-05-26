package Nos;

public class usuario {

    public String tipo, nome, email, cpf;
    public int ddd;
    public int telefone;
    public usuario proximo;
    public usuario anterior;

    public usuario(String tipo, String nome, String email, String cpf, int ddd, int telefone){
        this.proximo  = null;
        this.anterior = null;
        this.tipo = tipo;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.ddd = ddd;
        this.telefone = telefone;
    }
}

