import java.util.Scanner;

//      Classe generica Veiculo
public abstract class Veiculo {
    public String Codigo;
    public String Cor;
    public String Marca;
    public String Modelo;
    public String Valor;

    //      Construtor
    public Veiculo(){
        Scanner obterDados = new Scanner(System.in);

        System.out.println("Digite o Código: ");
        this.Codigo = obterDados.nextLine();

        System.out.println("Digite a Cor: ");
        this.Cor = obterDados.nextLine();

        System.out.println("Digite a Marca: ");
        this.Marca = obterDados.nextLine();

        System.out.println("Digite o Modelo: ");
        this.Modelo = obterDados.nextLine();

        System.out.println("Digite o Valor: ");
        this.Valor = obterDados.nextLine();
    }

    //      Métodos
    public abstract void cadastrar();
    public abstract void alterar();
    public abstract void consultar();
    public abstract void excluir();
    public abstract void consultarTodos();
}
