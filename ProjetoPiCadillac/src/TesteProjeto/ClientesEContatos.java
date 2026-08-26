package TesteProjeto;

import java.util.Scanner;

public class ClientesEContatos {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        iniciar();

    }

    public static void iniciar() {

        int opcao;

        do {

            telaMenuPrincipal();

            opcao = mostrarMenu();

        } while (opcao != 0);

    }

    public static void telaMenuPrincipal() {

        String[] menu = new String[4];

        menu[0] = "0 - Sair";
        menu[1] = "1 - Gerenciar Clientes";
        menu[2] = "2 - Gerenciar Contatos";
        menu[3] = "3 - Relatórios";


        System.out.println("____________________________");
        System.out.println("|      MENU PRINCIPAL      |");
        System.out.println("----------------------------");

        for (int i = 0; i < menu.length; i++) {

            System.out.println("|   " + menu[i]);

        }

        System.out.println("----------------------------");
        System.out.print("Digite a opção desejada: ");

    }

    public static int entradaDados() {

        return input.nextInt();

    }

    public static int mostrarMenu() {

        int seletor = entradaDados();

        if (seletor == 1) {

            telaMenuGerenciarCliente();
            int opcao = entradaDados();
            menuGerenciarCliente(opcao);


        } else if (seletor == 2) {

            telaMenuGerenciarContatos();
            int opcao = entradaDados();


        } else if (seletor == 3) {

            relatorios();

        }

        return seletor;

    }

    public static void telaMenuGerenciarCliente() {

        String[] menu = new String[7];

        menu[0] = "0 - Sair";
        menu[1] = "1 - Incluir cliente";
        menu[2] = "2 - Listar clientes";
        menu[3] = "3 - Consultar cliente por código";
        menu[4] = "4 - Alterar cliente";
        menu[5] = "5 - Apagar cliente";
        menu[6] = "6 - Ordenar por nome";


        System.out.println("____________________________");
        System.out.println("|      MENU CLIENTES       |");
        System.out.println("----------------------------");

        for (int i = 0; i < menu.length; i++) {

            System.out.println("|   " + menu[i]);

        }

        System.out.println("----------------------------");
        System.out.print("Digite a opção desejada: ");

    }

    public static void telaMenuGerenciarContatos() {

        String[] menu = new String[6];

        menu[0] = "0 - Sair";
        menu[1] = "1 - Incluir contato";
        menu[2] = "2 - Listar contatos";
        menu[3] = "3 - Listar contato de um cliente";
        menu[4] = "4 - Alterar contato";
        menu[5] = "5 - Apagar contato";


        System.out.println("____________________________");
        System.out.println("|      MENU CONTATOS       |");
        System.out.println("----------------------------");

        for (int i = 0; i < menu.length; i++) {

            System.out.println("|   " + menu[i]);

        }

        System.out.println("----------------------------");
        System.out.print("Digite a opção desejada: ");

    }

    public static void relatorios() {

    }

    public static void menuGerenciarCliente(int opcao) {

        switch (opcao) {
            case 1:
                System.out.println("incluir cliente");

                break;
            case 2:
                System.out.println("Listar clientes");

                break;
            case 3:
                System.out.println("consultar Clientes por codigo");

                break;
            case 4:
                System.out.println("Alterar Cliente");

                break;
            case 5:
                System.out.println("Apagar Cliente");

                break;
            case 6:
                System.out.println("Ordernar por nome");

                break;
        }

    }

    public static void menuGerenciarContatos(int opcao) {

        switch (opcao) {
            case 1:
                System.out.println("incluir contato");

                break;
            case 2:
                System.out.println("Listar contatos");

                break;
            case 3:
                System.out.println("consultar Clientes por codigo");

                break;
            case 4:
                System.out.println("Alterar Cliente");

                break;
            case 5:
                System.out.println("Apagar Cliente");

                break;
            case 6:
                System.out.println("Ordernar por nome");

                break;
        }

    }

}