package ProjetoCadillac_01;

import java.util.Scanner;

public class Projeto_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [][] dadosCliente = new String [10][8];

        seletorMenu(input,dadosCliente);



    }

    public static int menuPrincipal(Scanner input) {

        int opcao;


        String[] menuPrincipal = new String[4];
        menuPrincipal[0] = "1 - Gerenciar Clientes";
        menuPrincipal[1] = "2 - Gerenciar Contatos";
        menuPrincipal[2] = "3 - Relatórios";
        menuPrincipal[3] = "0 - Sair";

        System.out.println("\tMENU PRINCIPAL");

        for (int i = 0; i < menuPrincipal.length; i++) {


            System.out.println(menuPrincipal[i]);


        }

        System.out.println("Escolha uma opcao: ");
        opcao = input.nextInt();

        return opcao;

    }

    public static void menuClientes(Scanner input, String [][] dadosCliente) {

        int opcao;

        String[] menuClientes = new String[7];
        menuClientes[0] = "1 - Incluir cliente";
        menuClientes[1] = "2 - Listar clientes";
        menuClientes[2] = "3 - Consultar cliente por código";
        menuClientes[3] = "4 - Alterar cliente";
        menuClientes[4] = "5 - Apagar cliente";
        menuClientes[5] = "6 - Ordenar por nome";
        menuClientes[6] = "0 - Voltar";


        do {
            System.out.println("\tMENU CLIENTES");

            for (int i = 0; i < menuClientes.length; i++) {

                System.out.println(menuClientes[i]);

            }


            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    incluirCliente(input, dadosCliente);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:

            }
        } while (opcao != 0);
    }

    public static void menuContatos(Scanner input) {

        int opcao;

        String[] menuContatos = new String[6];
        menuContatos[0] = "1 - Incluir Contato";
        menuContatos[1] = "2 - Listar Contatos";
        menuContatos[2] = "3 - Listar Contatos de um cliente";
        menuContatos[3] = "4 - Alterar Contato";
        menuContatos[4] = "5 - Apagar Contato";
        menuContatos[5] = "0  - Voltar";


        do {

            for (int i = 0; i < menuContatos.length; i++) {

                System.out.println(menuContatos[i]);

            }

            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
            }


        } while (opcao != 0);

    }

    public static void seletorMenu(Scanner input, String [][] dadosCliente) {

        int opcao;

        do {

            opcao = menuPrincipal(input);

            switch (opcao) {

                case 1:
                    menuClientes(input,dadosCliente);
                    break;
                case 2:
                    menuContatos(input);
                    break;
                case 3:
                    //criar relatorios
                    break;
                case 0:
                    break;

                default:

                    do {
                        System.out.println("Digite uma opcao valida: ");
                        opcao = input.nextInt();
                    } while (opcao < 0 || opcao > 3);
            }

        } while (opcao != 0);
    }

    public static void incluirCliente(Scanner input, String [][] dadosCliente) {

        int verificarLinha = 0;
        int id_cliente = 0;

        for (int i = 0; i < dadosCliente.length ; i++) {

            if(dadosCliente[i][0] != null) {

                verificarLinha++;

                if (Integer.parseInt(dadosCliente[i][0]) > id_cliente) {

                    id_cliente = Integer.parseInt(dadosCliente[i][0]);

                }
            }
        }

        id_cliente = id_cliente + 1;
        dadosCliente[verificarLinha][0] = String.valueOf(id_cliente);

        dadosCliente[verificarLinha][7] = "ATIVO";




        String[] perguntasCadastro = new String[7];
        perguntasCadastro[1] = " seu nome:";
        perguntasCadastro[2] = " seu CPF ou CNPJ:";
        perguntasCadastro[3] = " sua Data de Nascimento:";
        perguntasCadastro[4] = " o seu Sexo [M] ou [F]:";
        perguntasCadastro[5] = " sua Cidade:";
        perguntasCadastro[6] = " seu Estado:";



        for (int i = 1; i < perguntasCadastro.length ; i++) {

            System.out.println("Digite" + perguntasCadastro[i]);
            dadosCliente[verificarLinha][i] = input.nextLine();



        }


        //PARA TESTAR CADASTRO, TIRAR O COMENTARIO:


        System.out.println(dadosCliente[verificarLinha][0]);
        System.out.println(dadosCliente[verificarLinha][1]);
        System.out.println(dadosCliente[verificarLinha][2]);
        System.out.println(dadosCliente[verificarLinha][3]);
        System.out.println(dadosCliente[verificarLinha][4]);
        System.out.println(dadosCliente[verificarLinha][5]);
        System.out.println(dadosCliente[verificarLinha][6]);





    }
}


