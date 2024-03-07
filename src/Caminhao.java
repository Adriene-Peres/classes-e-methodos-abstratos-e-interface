public class Caminhao extends Veiculo implements Tributavel {
    private int numEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao, int numEixos) {
        super(marca, modelo, anoFabricacao);
        this.numEixos = numEixos;
    }

    public int getNumEixos() {
        return numEixos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de eixos: " + getNumEixos() + "\nIPVA: " + calcularIPVA();
    }

    @Override
    public double calcularIPVA() {
        return 200.0 * numEixos / (2023 - getAnoFabricacao());
    }
}