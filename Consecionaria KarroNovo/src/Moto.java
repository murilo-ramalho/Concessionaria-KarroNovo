public class Moto extends Automotor{
    private boolean partidaEletrica;
    private int cilidradas;

    public Moto(String codigo, String cor, String marca, String modelo, float valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getCilidradas() {
        return cilidradas;
    }

    public void setCilidradas(int cilidradas) {
        this.cilidradas = cilidradas;
    }
}
