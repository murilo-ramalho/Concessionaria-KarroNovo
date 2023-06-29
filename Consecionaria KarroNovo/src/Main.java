import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Veiculo> veiculos = new ArrayList<>();
    public void main(String[] args) {
        boolean c = true;
        while (c) {
            menu();

            Scanner A = new Scanner(System.in);
            int opcao = A.nextInt();

            if (opcao == 1) {
                System.out.println("Qual tipo de veículo será cadastrado?");
                System.out.println("1 – Carro\n" +
                                    "2 – Moto\n" +
                                    "3 – Caminhão\n" +
                                    "4 – Bicicleta\n" +
                                    "5 - Voltar ao menu inicial");
                int novoVeiculo = A.nextInt();
                cadastro(novoVeiculo);
            } else if (opcao == 2) {
                //editar
            } else if (opcao == 3) {
                //consultar só 1
            } else if (opcao == 4) {
                //excluir
            } else if (opcao == 5) {
                System.out.println();
            } else c = false;
        }
    }

    public static void menu(){
        System.out.println("Bem vindo a Conseccionaria KarroNovo");
        System.out.println("o que deseja fazer?");
        System.out.println("1 – Cadastrar novo veículo\n" +
                            "2 – Editar veículo\n" +
                            "3 – Ver informações de um veículo específico\n" +
                            "4 – Excluir um veículo\n" +
                            "5 – Ver todos os veículos\n" +
                            "6 - Sair\n");
    }
    public void automotor(){
        Scanner A = new Scanner(System.in);
        System.out.println("digite qual o combustivel");
        System.out.println("G - Veículos a gasolina\n" +
                "A - Veículos a álcool\n" +
                "F - Veículos flex\n" +
                "E - Veículos elétricos\n" +
                "D - Veículos a diesel");
        String combustivel = A.next();

        cadastroVeiculo();
    }
    public void cadastroVeiculo(){
        Scanner A = new Scanner(System.in);

        System.out.println("digite a cor: ");
        String cor = A.next();

        System.out.println("digite a marca: ");
        String marca = A.next();

        System.out.println("digite o modelo: ");
        String modelo = A.next();

        System.out.println("digite o valor");
        float valor = A.nextInt();

        int novoVeiculo = A.nextInt();
        cadastro(novoVeiculo);
    }

    public void cadastro(int novoVeiculo){
        Scanner A = new Scanner(System.in);

        if (novoVeiculo == 1){
            automotor();
            System.out.println("digite a quantidade de portas: ");
            int portas = A.nextInt();

            //add------------------------------------------------

        } else if (novoVeiculo == 2){
            automotor();
            System.out.println("possui partida eletrica?: Y/N");
            String escolha = A.next();
            boolean e;
            if (escolha == "y") e = true;
            else e = false;

            System.out.println("cilindradas");
            int cilidradas = A.nextInt();

            //add------------------------------------------

        } else if (novoVeiculo == 3){
            automotor();
            System.out.println("digite a carga máxima: ");
            int carga = A.nextInt();

            System.out.println("digite o número de eixos: ");
            int eixos = A.nextInt();

            //add

        } else if (novoVeiculo == 4) {
            cadastroVeiculo();
            System.out.println("C – Cantiléver\n" +
                                "V – V-Brake\n" +
                                "F – Ferradura\n" +
                                "M – Disco Mecânico\n" +
                                "H – Disco Hidráulico");
            String freio = A.next();

            //add----------------------------------------------

        } else menu();
    }
}