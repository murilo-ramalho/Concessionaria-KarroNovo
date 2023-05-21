import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    //      Lista
    List<Veiculo> veiculos = new ArrayList<>();


    //      Menu
    public void menu1(Veiculo veiculo) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
                this.menu2();
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
    public void menu2(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Qual tipo de veículo será cadastrado?");
        System.out.println("1 – Carro");
        System.out.println("2 – Moto");
        System.out.println("3 – Caminhão");
        System.out.println("4 – Bicicleta");
        System.out.println("5 – Voltar ao menu inicial");

        Scanner opcaoSelecionada2 = new Scanner(System.in);
        Integer opcao2 = opcaoSelecionada2.nextInt();

        switch (opcao2) {
            case 1:
               this.veiculos.add(new Carro());
                break;
            case 2:
                this.veiculos.add(new Moto());
                break;
            case 3:
                this.veiculos.add(new Caminhao());
                break;
            case 4:
                this.veiculos.add(new Bicicleta());
                break;
            case 5:
                menu1();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
