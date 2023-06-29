public class Carro extends Automotor{
    private int portas;
    public Carro(String codigo, String cor, String marca, String modelo, float valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
