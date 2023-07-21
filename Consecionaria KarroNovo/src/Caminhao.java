public class Caminhao extends Automotor{
    private int carga;
    private int exios;
    public Caminhao(String codigo, String cor, String marca, String modelo, float valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getExios() {
        return exios;
    }

    public void setExios(int exios) {
        this.exios = exios;
    }
}
