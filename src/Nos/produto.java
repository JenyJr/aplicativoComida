package Nos;

public class produto {
    public produto base;
    public produto topo;
    public produto proximo;
    public String nome;

    public produto(String nome){
        this.base = this.topo = this.proximo = null;
        this.nome = nome;
    }
}
