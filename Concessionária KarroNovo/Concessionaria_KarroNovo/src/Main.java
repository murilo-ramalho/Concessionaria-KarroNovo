import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lista de veículos
    List<Veiculo> veiculos = new ArrayList<>();

    // Menu principal
    public void menu1() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("O que você deseja fazer?");
        System.out.println("1 – Cadastrar novo veículo");
        System.out.println("2 – Editar veículo");
        System.out.println("3 – Ver informações de um veículo específico");
        System.out.println("4 – Excluir um veículo");
        System.out.println("5 – Ver todos os veículos");
        System.out.println("6 - Sair");

        Scanner opcaoSelecionada = new Scanner(System.in);
        int opcao = opcaoSelecionada.nextInt();

        switch (opcao) {
            case 1:
                menu2();
                break;
            case 2:
                if (!veiculos.isEmpty()) {
                    Veiculo veiculoEditar = selecionarVeiculo();
                    if (veiculoEditar != null) {
                        veiculoEditar.alterar();
                    }
                } else {
                    System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro.");
                }
                break;
            case 3:
                if (!veiculos.isEmpty()) {
                    Veiculo veiculoConsultar = selecionarVeiculo();
                    if (veiculoConsultar != null) {
                        veiculoConsultar.consultar();
                    }
                } else {
                    System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro.");
                }
                break;
            case 4:
                if (!veiculos.isEmpty()) {
                    Veiculo veiculoExcluir = selecionarVeiculo();
                    if (veiculoExcluir != null) {
                        veiculoExcluir.excluir();
                        veiculos.remove(veiculoExcluir);
                    }
                } else {
                    System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro.");
                }
                break;
            case 5:
                if (!veiculos.isEmpty()) {
                    consultarTodosVeiculos();
                } else {
                    System.out.println("Nenhum veículo cadastrado.");
                }
                break;
            case 6:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void consultarTodosVeiculos() {
    }
    private Veiculo selecionarVeiculo() {
        return null;
    }

    // Menu para selecionar o tipo de veículo a ser cadastrado
    public void menu2() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Qual tipo de veículo será cadastrado?");
        System.out.println("1 – Carro");
        System.out.println("2 – Moto");
        System.out.println("3 – Caminhão");
        System.out.println("4 – Bicicleta");
        System.out.println("5 – Voltar ao menu inicial");

        Scanner opcaoSelecionada2 = new Scanner(System.in);
        int opcao2 = opcaoSelecionada2.nextInt();

        switch (opcao2) {
            case 1:
                veiculos.add(new Carro());
                break;
            case 2:
                veiculos.add(new Moto());
                break;
            case 3:
                veiculos.add(new Caminhao());
                break;
            case 4:
                veiculos.add(new Bicicleta());
                break;
            case 5:
                menu1();
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}


// Método para selecionar um veículo
