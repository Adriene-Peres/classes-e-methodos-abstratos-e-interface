public class Carro extends Veiculo implements Tributavel {
    private String categoria;

    public Carro(String marca, String modelo, int anoFabricacao, String categoria) {
        super(marca, modelo, anoFabricacao);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + getCategoria() + "\nIPVA: " + calcularIPVA();
    }

    @Override
    public double calcularIPVA() {
        if (getCategoria().equals("passeio")) {
            return 1500.0 / (2023 - getAnoFabricacao());
        } else if (getCategoria().equals("utilitario")) {
            return 1000.0 / (2023 - getAnoFabricacao());
        }
        return 0;
    }

}