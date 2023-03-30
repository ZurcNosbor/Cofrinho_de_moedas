package atv_pra_cofrinho;

import java.util.Scanner;

public class Menu {

    //ATRIBUTO SCANNER
    private Scanner teclado;
    //ATRIBUTO DE COFRINHO
    private  Cofrinho c;

    //CONSTRUTOR CLASSE MENU
    public Menu(){
        teclado = new Scanner(System.in);
        c = new Cofrinho();
    }

    //METODO PARA EXIBIR MENU NA TELA PRINCIPAL
    public void exibirMenuPrincipal() {

        System.out.println("BEM VINDO!!");
        System.out.println("COFRINHO");
        System.out.println("1 - ADICIONAR MOEDA");
        System.out.println("2 - REMOVER MOEDA");
        System.out.println("3 - LISTAR MOEDAS");
        System.out.println("4 - CONVERTER O TOTAL PARA REAIS (R$)");
        System.out.println("0 - ENCERRAR");

        String op = teclado.next();

        //SWITCH PARA AS OPÇÕES DO MENU
        switch (op) {

            //OPÇÃO ENCERRAR
            case "0":
                System.out.println("Volte sempre! Encerrando programa...");
                System.exit(1);
                break;

            //OPÇÃO ADICIONAR MOEDA
            case "1":

                int opcaoAdiciona = -1;
                int opcaoEscolhida = -1;

                //LAÇO DE REPETIÇÃO PARA VALIDAR OPÇÃO SELECIONADA NO SUBMENU
                while (opcaoAdiciona < 0 || opcaoAdiciona > 3) {
                    System.out.println("Escolha um tipo de moeda para adicionar:");
                    System.out.println("1 - REAL (R$)");
                    System.out.println("2 - DÓLAR ($)");
                    System.out.println("3 - EURO (€)");
                    System.out.println("4 - VOLTAR AO MENU PRINCIPAL");

                    String moedaEscolhida = teclado.next();

                    //TESTE DE EXCEÇÃO PARA VERIFICAR O QUE FOI DIGITADO
                    try {
                        opcaoEscolhida = Integer.parseInt(moedaEscolhida);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite uma opção válida.");
                    }
                    if (opcaoEscolhida > 4 || opcaoEscolhida == 0) {
                        System.out.println("Digite uma opção válida.");
                    }

                    //CONDICIONAL CASO A OPÇÃO SEJA VALIDA
                    if (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3) {
                        boolean valorDigitado = false;
                        double valorMoeda = 0;
                        while (!valorDigitado ){
                            System.out.println("Digite o valor da moeda para ser adicionada no cofrinho:");

                            String valorMoedaTexto = teclado.next();

                            //TESTE DE EXCEÇÃO PARA VERIFICAR O QUE FOI DIGITADO
                            try {
                                valorMoeda = Double.parseDouble(valorMoedaTexto);
                                valorDigitado = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite um valor de moeda válido.");
                            }
                        }

                        Moeda m = null;

                        //CONDICIONAL PARA ADICIONAR MOEDA
                        if (opcaoEscolhida == 1) {
                            m = new Real(valorMoeda);
                        } else if (opcaoEscolhida == 2) {
                            m = new Dolar(valorMoeda);
                        } else if (opcaoEscolhida == 3) {
                            m = new Euro(valorMoeda);
                        }

                        //CHAMA METODO ADICIONAR MOEDA
                        c.adicionarMoeda(m);

                        System.out.println("Moeda adicionada com sucesso!!!");
                        System.out.println("Voltando ao menu principal...");
                        exibirMenuPrincipal();

                    } else if (opcaoEscolhida == 4) {
                        System.out.println("Retornando ao menu principal...");
                        exibirMenuPrincipal();
                    }
                }

            //CHAMA METODO PARA REMOVER MOEDAS
            case "2":

                int opcaoRemove = -1;
                int opcaoEscolhidaRemocao = -1;

                //LAÇO DE REPETIÇÃO PARA VALIDAR OPÇÃO SELECIONADA NO SUBMENU
                while (opcaoRemove < 0 || opcaoRemove > 3){
                    c.listagemMoedas();
                    System.out.println("------------------------------------------------------");
                    System.out.println("Escolha um tipo de moeda para remover:");
                    System.out.println("1 - REAL (R$)");
                    System.out.println("2 - DÓLAR ($)");
                    System.out.println("3 - EURO (€)");
                    System.out.println("4 - VOLTAR AO MENU PRINCIPAL");

                    String moedaEscolhidaRemocao = teclado.next();

                    //TESTE DE EXCEÇÃO PARA VERIFICAR O QUE FOI DIGITADO
                    try {
                        opcaoEscolhidaRemocao = Integer.parseInt(moedaEscolhidaRemocao);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite uma opção válida.");
                    }
                    if (opcaoEscolhidaRemocao > 4 || opcaoEscolhidaRemocao == 0) {
                        System.out.println("Digite uma opção válida.");
                    }

                    //CONDICIONAL CASO A OPÇÃO SEJA VALIDA
                    if (opcaoEscolhidaRemocao == 1 || opcaoEscolhidaRemocao == 2 || opcaoEscolhidaRemocao == 3)  {
                        boolean valorDigitadoRemocao = false;
                        double valorMoedaRemocao = 0;
                        while (!valorDigitadoRemocao) {
                            System.out.println("Digite o valor da moeda para ser removida do cofrinho:");

                            String valorMoedaTexto = teclado.next();

                            //TESTE DE EXCEÇÃO PARA VERIFICAR O QUE FOI DIGITADO
                            try {
                                valorMoedaRemocao = Double.parseDouble(valorMoedaTexto);
                                valorDigitadoRemocao = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite um valor de moeda válido.");
                            }

                        }

                            Moeda mo = null;

                            //CONDICIONAL PARA REMOVER MOEDA
                            if (opcaoEscolhidaRemocao == 1) {
                                mo = new Real(valorMoedaRemocao);
                            } else if (opcaoEscolhidaRemocao == 2) {
                                mo = new Dolar(valorMoedaRemocao);
                            } else if (opcaoEscolhidaRemocao == 3) {
                                mo = new Euro(valorMoedaRemocao);
                            }

                            //CONDICIONAL PARA VERIFICAR SE EXISTE MOEDA
                            if (c.removerMoeda(mo)) {
                                System.out.println("Moeda removida com sucesso!!!");
                                System.out.println("Retornando ao menu principal...");
                                exibirMenuPrincipal();
                                break;
                            } else {
                                System.out.println("Não existe nenhuma moeda com esse valor no cofrinho!!!");
                                System.out.println("Retornando ao menu principal...");
                                exibirMenuPrincipal();
                            }

                    } else if (opcaoEscolhidaRemocao == 4) {
                        System.out.println("Retornando ao menu principal...");
                        exibirMenuPrincipal();
                    }
                }

            case "3":

                //CHAMA METODO PARA MOSTRAR LISTA MOEDAS
                c.listagemMoedas();
                exibirMenuPrincipal();
                break;

            case "4":

                //CHAMA METODO PARA CONVERSÃO DOS VALORES
                double totalCofrinho = c.totalConvertido();

                //CONVERTER PARA STRINGA PARA ADICIONAR VIRGULA COM O REPLACE
                String totalConvertidoTexto = String.format("%.2f", totalCofrinho);
                totalConvertidoTexto = totalConvertidoTexto.replace(".", ",");
                System.out.println("Total no cofrinho em Reais: R$ " + totalConvertidoTexto);
                System.out.println();
                System.out.println("Retornando ao menu principal...");
                exibirMenuPrincipal();
                break;

            //OPÇÃO INVALIDA PARA O MENU PRINCIPAL
            default:
                System.out.println("Opção inválida! Por favor, insira uma opção do menu:");
                exibirMenuPrincipal();
                break;
        }
    }
}
