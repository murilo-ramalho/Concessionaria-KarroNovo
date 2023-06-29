public abstract class Veiculo {
    protected String codigo;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected float valor;

    //construtor

    public Veiculo(String codigo, String cor, String marca, String modelo, float valor) {
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    //get e set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
