package Nos;

//☆☆☆☆
//★★★★
public class nota {

    public int valor;
    public int idVendedor;
    public nota proximo;

    public nota(int valor, int idVendedor){
        this.valor = valor;
        this.idVendedor = idVendedor;
        this.proximo = null;
    }

}
