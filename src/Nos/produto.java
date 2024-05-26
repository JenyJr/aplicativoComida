package Nos;

public class produto {
    public produto base;
    public produto topo;
    public produto proximo;
    public int id;
    public String nome;

    public produto(int id, String nome){
        this.base = this.topo = this.proximo = null;
        this.nome = nome;
        this.id = id;
    }
}
