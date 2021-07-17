package heranca;

public class ConstrucaoMain {
    String numQuartos;
    String numSalas;
    String metragem;

    public ConstrucaoMain(String numQuartos, String numSalas, String metragem) {
        this.numQuartos = numQuartos;
        this.numSalas = numSalas;
        this.metragem = metragem;
    }

    public String getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(String numQuartos) {
        this.numQuartos = numQuartos;
    }

    public String getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(String numSalas) {
        this.numSalas = numSalas;
    }

    public String getMetragem() {
        return metragem;
    }

    public void setMetragem(String metragem) {
        this.metragem = metragem;
    }
}
