import model.Pedido;
import util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        System.out.println(Cores.TEXT_YELLOW + "*****************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                   MERCADO LANCHES                   " + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.TEXT_YELLOW + "*****************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("               1 - Criar Pedido                      ");//Gabriel Galvão (criar pedido e listar no final o pedido)
        System.out.println("               2 - Catálogo de Produtos              ");
        System.out.println("               3 - Aterar Produtos                   ");//Possivelmente com outro menu para o CRUD
        System.out.println("               4 - Adicionar Cliente                 ");
        System.out.println("               5 - Valor do Pedido                   ");
        System.out.println("               6 - Status do Pedido                  ");
        System.out.println("               7 - SAIR                              ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Digite a opção desejada:                             ");
        System.out.println("                                                     ");
        opcao = leia.nextInt();

        if (opcao == 7) {
            System.out.println("MeLi Lanches \nAgradece a sua preferência e volte sempre!");
            leia.close();
            System.exit(0);

        }

        switch (opcao) {
            case 1:
                System.out.println("\nCriar Pedido");
                System.out.println("*** CRIAR PEDIDO ***");
                Pedido pedido = new Pedido("X_java",19.99, 1);
                pedido.VisualizarPedido();
                break;
            case 2:
                System.out.println("\n");
                System.out.println("*** MOSTRAR PEDIDO ***");
                //incluir método
                break;
            case 3:
                System.out.println("\n");
                System.out.println("*** ITENS DO PEDIDO ***");
                //incluir método
                break;
            case 4:
                System.out.println("\n");
                System.out.println("*** DATA DO PEDIDO ***");
                //incluir método
                break;
            case 5:
                System.out.println("");
                System.out.println("*** VALOR DO PEDIDO ***");
                //incluir método
                break;
            case 6:
                System.out.println("\n");
                System.out.println("*** STATUS DO PEDIDO ***");
                //incluir método
                break;
        }

    }
}
