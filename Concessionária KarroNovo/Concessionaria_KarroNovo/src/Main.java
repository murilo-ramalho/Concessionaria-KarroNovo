import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    //      Menu
    public static void menu(Veiculo veiculo) {
        System.out.println("O que você deseja fazer?");
        System.out.println("1 – Cadastrar novo veículo");
        System.out.println("2 – Editar veículo");
        System.out.println("3 – Ver informações de um veículo específico");
        System.out.println("4 – Excluir um veículo");
        System.out.println("5 – Ver todos os veículos");
        System.out.println("6 - Sai");

        Scanner opcaoSelecionada = new Scanner(System.in);
        Integer opcao = opcaoSelecionada.nextInt();

        switch (opcao) {
            case 1:
                Dados();
                break;
            case 2:
                veiculo.alterar();
                break;
            case 3:
                veiculo.consultar();
                break;
            case 4:
                veiculo.excluir();
                break;
            case 5:
                veiculo.consultarTodos();
                break;
            case 6:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}