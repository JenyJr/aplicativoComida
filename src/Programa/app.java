package Programa;
import Estruturas.cadastroProduto;
import Estruturas.cadastroUsuario;
import Estruturas.avaliacao;
import Nos.produto;
import Programa.yummy;

public class app {
    public static void main(String[] args){

        cadastroUsuario cadastrarCliente = new cadastroUsuario();
        avaliacao avaliar = new avaliacao();
        cadastroProduto cadastrarProduto = new cadastroProduto();

        yummy aplicativoYummy = new yummy();

        aplicativoYummy.novoProduto(10, "notebook");

        //FALTA:
        // FAZER A ARVORE DE COMPRAS!
        // FAZER INTERFACE DO APLICATIVO!
        // FAZER INTEGRAÇÃO E TESTES DE QUALIDADE!



        /*
        //Teste
            cadastrarCliente.cadastrar(
                    "Cliente",
                    "Hugo Rios Brito",
                    "hugo.rios.brito@hotmail.com",
                    "02535245698",
                    71,
                    992550982);

            cadastrarCliente.imprimirLista();

            cadastrarProduto.push(15, "Notebook");
            cadastrarProduto.push(333, "Bicicleta");
            cadastrarProduto.push(412, "Televisão");
            cadastrarProduto.push(528, "Micro-ondas");
            cadastrarProduto.push(613, "Geladeira");
            cadastrarProduto.push(731, "Fogão");
            cadastrarProduto.push(842, "Celular");
            cadastrarProduto.push(953, "Tablet");
            cadastrarProduto.push(1064, "Impressora");
            cadastrarProduto.push(1175, "Câmera");
            cadastrarProduto.push(1286, "Ventilador");

            avaliar.incluir(5, 342);

            avaliar.imprimir();
            cadastrarProduto.imprimirPilha();
        */



    }
}
