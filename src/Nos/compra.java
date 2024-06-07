package Nos;

public class compra{
    public String nomeProduto;
    public compra esquerda, direita;

    public compra(String nomeProduto){
        this.nomeProduto = nomeProduto;
        this.esquerda = this.direita = null;
    }
}