package Programa;
import Estruturas.cadastroProduto;
import Estruturas.cadastroUsuario;
import Estruturas.avaliacao;
import Estruturas.armazenarCompra;
import Nos.produto;
import Programa.yummy;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        cadastroUsuario cadastrarCliente = new cadastroUsuario();
        avaliacao avaliar = new avaliacao();
        cadastroProduto cadastrarProduto = new cadastroProduto();
        armazenarCompra compra = new armazenarCompra();
        yummy aplicativoYummy = new yummy();

        /*compra.inserir("Pão");
        compra.inserir("Pão2");
        compra.inserir("Pão3");
        compra.inserir("Pão4");
        compra.inserir("Mortadela");
        compra.inserir("queijo");


        System.out.println("Pos Ordem\n");
        compra.posOrdem();
        System.out.println("Em Ordem\n");
        compra.emOrdem();
        System.out.println("Pre Ordem\n");
        compra.preOrdem();*/

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

        //MENU


        int n;
        do {
            System.out.println("====== MENU DE OPÇÕES ======\n");
            System.out.println("1 - Cadastrar Comprador.");
            System.out.println("2 - Cadastrar Vendedor");
            System.out.println("3 - Sair");
            System.out.println("============================\n");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    String tipo1 = "comprador", nomeComprador = "", senhaComprador = "", emailComprador = "", cpfComprador = "", telefoneComprador = "";

                    System.out.println("====== Cadastrar Comprador ======\n");

                    System.out.println("Cadastrar Nome de Usuário:");
                    nomeComprador = scanner.next();

                    System.out.println("Digite o eMail:");
                    emailComprador = scanner.next();

                    System.out.println("Digite o CPF:");
                    cpfComprador = scanner.next();

                    System.out.println("Digite o telefone");
                    telefoneComprador = scanner.next();

                    System.out.println("Cadastrar Senha:");
                    senhaComprador = scanner.next();

                    cadastrarCliente.cadastrar(tipo1, nomeComprador, senhaComprador, emailComprador, cpfComprador, telefoneComprador);
                    cadastrarProduto.imprimirPilha();
                    break;
                case 2:
                    String tipo2 = "vendedor", nomeVendedor = "", senhaVendedor = "", emailVendedor = "", cpfVendedor = "", telefoneVendedor = "";
                    System.out.println("====== Cadastrar Vendedor ======\n");
                    System.out.println("Cadastrar Nome de Usuário:");
                    nomeComprador = scanner.next();

                    System.out.println("Digite o eMail:");
                    emailComprador = scanner.next();

                    System.out.println("Digite o CPF:");
                    cpfComprador = scanner.next();

                    System.out.println("Digite o telefone");
                    telefoneComprador = scanner.next();

                    System.out.println("Cadastrar Senha:");
                    senhaComprador = scanner.next();

                    cadastrarCliente.cadastrar(tipo2, nomeVendedor, senhaVendedor, emailVendedor, cpfVendedor, telefoneVendedor);
                    cadastrarProduto.push();


                    break;
                case 3:
                    String caracteres = "|/-\\";
                    int totalPassos = 15;
                    int delayMilissegundos = 400;

                    for (int i = 0; i < totalPassos; i++) {
                        System.out.print("\rSaindo " + caracteres.charAt(i % caracteres.length()));
                        Thread.sleep(delayMilissegundos);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (n != 3);
    }
}

