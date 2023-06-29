public class Automotor extends Veiculo{
    protected String combustivel;
    public Automotor(String codigo, String cor, String marca, String modelo, float valor) {
        super(codigo, cor, marca, modelo, valor);
        this.combustivel = getCombustivel();
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
