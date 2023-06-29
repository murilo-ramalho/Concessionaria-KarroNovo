public class Bicicleta extends Veiculo{
    private String freio;
    public Bicicleta(String codigo, String cor, String marca, String modelo, float valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }
}
