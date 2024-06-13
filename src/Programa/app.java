package Programa;
import Estruturas.*;
import java.util.Objects;
import java.util.Scanner;


public class app {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        yummy aplicativoYummy = new yummy();

        //MENU
        int n;
        do {
            System.out.println("\n====== Yummy App ======\n");
            System.out.println("1 - Cadastrar Comprador");
            System.out.println("2 - Cadastrar Vendedor");
            System.out.println("3 - Sair");
            System.out.println("=======================\n");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    String tipo1 = "Comprador", nomeComprador = "", senhaComprador = "", emailComprador = "", cpfComprador = "", telefoneComprador="";

                    System.out.println("====== Cadastrar Comprador ======\n");

                    System.out.println("Nome de Usuário:");
                    nomeComprador = scanner.next();

                    System.out.println("Digite o Email:");
                    emailComprador = scanner.next();

                    System.out.println("Digite o CPF:");
                    cpfComprador = scanner.next();

                    System.out.println("Digite o telefone");
                    telefoneComprador = scanner.next();

                    System.out.println("Cadastrar Senha:");
                    senhaComprador = scanner.next();

                    aplicativoYummy.cadastrarUsuario.cadastrar(tipo1, nomeComprador, emailComprador, cpfComprador, String.valueOf(telefoneComprador), senhaComprador);

                    int s;
                    do{
                        System.out.println("====== MENU DE OPÇÕES (Comprador) ======\n");
                        System.out.println("1 - Ver produtos disponíveis");
                        System.out.println("2 - Comprar produto");
                        System.out.println("3 - Visualizar histórico de compras");
                        System.out.println("4 - Sair\n");

                        s = scanner.nextInt();

                        switch (s){
                            case 1:
                                System.out.println("====== Produtos Disponíveis ======");
                                aplicativoYummy.imprimirPilha();
                                break;

                            case 2:

                                String nomeEscolhido;

                                System.out.print("Escolha o nome do produto a ser comprado: ");
                                nomeEscolhido = scanner.next();
                                aplicativoYummy.historicoCompra(nomeEscolhido);


                                String caracter = "=";
                                System.out.print("Sua compra está em processo de entrega: \n");
                                for (int i = 0; i < 30; i++) { //estava i=i+0
                                    System.out.print(caracter);
                                    Thread.sleep(400);
                                }
                                
                                    int e;
                                        System.out.println("\n");
                                        System.out.println("1 - Status da compra \n");
                                        System.out.println("2 - Sair\n");
                                        e = scanner.nextInt();
                                    switch (e){
                                        case 1:
                                            System.out.println("\n");
                                            System.out.println("*** Seu Produto chegou ao destino final! ***\n");
                                            int avaliacao;

                                            System.out.println("====== Avalie o vendedor com uma nota de 0 a 10 ======");
                                            avaliacao = scanner.nextInt();

                                            aplicativoYummy.avaliarVendedor(avaliacao);

                                            String estrelas = "★";
                                            for(int i = 0; i < avaliacao; i++){
                                                System.out.print(estrelas);
                                            }
                                            System.out.println();
                                            break;
                                            
                                        case 2:
                                            String caracteres = "|/-\\";
                                            int totalPassos = 15;
                                            int delayMilissegundos = 400;

                                            for (int i = 0; i < totalPassos; i++) {
                                                System.out.print("\rSaindo " + caracteres.charAt(i % caracteres.length()));
                                                Thread.sleep(delayMilissegundos);
                                            }
                                            System.out.println("\n");
                                            break;
                                    }

                                break;
                            case 3:
                                System.out.println("====== HISTORICO DE COMPRAS ======");
                                aplicativoYummy.historicoCompras.posOrdem();
                                break;
                            case 4:
                                String caracteres = "|/-\\";
                                int totalPassos = 15;
                                int delayMilissegundos = 400;

                                for (int i = 0; i < totalPassos; i++) {
                                    System.out.print("\rSaindo " + caracteres.charAt(i % caracteres.length()));
                                    Thread.sleep(delayMilissegundos);
                                }
                                break;
                            default:
                                System.err.println("OPÇÃO INVALIDA!");
                                break;
                        }

                    } while(s != 4);// estava s!=40
                    break;

                case 2:
                    String tipo2 = "Vendedor", nomeVendedor = "", senhaVendedor = "", emailVendedor = "", cpfVendedor = "", telefoneVendedor = "";


                    System.out.println("====== Cadastrar Vendedor ======\n");
                    System.out.println("Nome do Vendedor:");
                    nomeVendedor = scanner.next();

                    System.out.println("Digite o Email:");
                    emailVendedor = scanner.next();

                    System.out.println("Digite o CPF:");
                    cpfVendedor = scanner.next();

                    System.out.println("Digite o telefone:");
                    telefoneVendedor = scanner.next();

                    System.out.println("Cadastrar Senha:");
                    senhaVendedor = scanner.next();

                    aplicativoYummy.cadastrarUsuario.cadastrar(tipo2, nomeVendedor, emailVendedor, cpfVendedor, String.valueOf(telefoneVendedor), senhaVendedor);
                    int n1;
                    do {
                        System.out.println("====== MENU DE OPÇÕES(Vendedor) ======\n");
                        System.out.println("1 - Cadastrar Produto");
                        System.out.println("2 - Vizualizar Produtos");
                        System.out.println("3 - Sair\n");
                        n1 = scanner.nextInt();

                        switch (n1) {
                            case 1:
                                String nomeProduto;
                                String finalizar;
                                do {
                                    System.out.println("====== Cadastrar Produto ======\n");
                                    System.out.println("Nome do Produto: ");
                                    nomeProduto = scanner.next();

                                    aplicativoYummy.novoProduto(nomeProduto);
                                    System.out.println("------Produto Adicionado------\n-Nome do Produto: " + nomeProduto);

                                    System.out.println("\nC - Cadastrar mais produtos \tV - para voltar \n:");
                                    finalizar = scanner.next();
                                } while(Objects.equals(finalizar, "C") || Objects.equals(finalizar, "c"));

                                break;

                            case 2: //estava case 5
                                System.out.println("====== Lista de Produtos Cadastrados ======\n");
                                aplicativoYummy.imprimirPilha();
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
                        }

                    } while (n1!=3);

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
                    System.out.println("Opção inválida\n");
            }
        } while (n != 3);
    }
}

