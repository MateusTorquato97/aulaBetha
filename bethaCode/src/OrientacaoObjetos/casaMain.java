package OrientacaoObjetos;

public class casaMain {
    public static void main(String[] args) {
        InfoCasa novaCasa = new InfoCasa(190, 2, 3,2,150.1,"Minha rua");

        novaCasa.setNumCasa(200);

        System.out.println("Informações da minha casa: " + novaCasa.getEndereco());
    }

    static class InfoCasa{
        private Integer numCasa;
        private Integer numSala;
        private Integer numQuartos;
        private Integer numBanheiros;
        private Double metragemCasa;
        private String endereco;

        public InfoCasa(Integer numCasa, Integer numSala, Integer numQuartos, Integer numBanheiros, Double metragemCasa, String endereco) {
            this.numCasa = numCasa;
            this.numSala = numSala;
            this.numQuartos = numQuartos;
            this.numBanheiros = numBanheiros;
            this.metragemCasa = metragemCasa;
            this.endereco = endereco;
        }

        public Integer getNumCasa() {
            return numCasa;
        }

        public Integer getNumSala() {
            return numSala;
        }

        public Integer getNumQuartos() {
            return numQuartos;
        }

        public Integer getNumBanheiros() {
            return numBanheiros;
        }

        public Double getMetragemCasa() {
            return metragemCasa;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setNumCasa(Integer numCasa) {
            this.numCasa = numCasa;
        }

        public void setNumSala(Integer numSala) {
            this.numSala = numSala;
        }

        public void setNumQuartos(Integer numQuartos) {
            this.numQuartos = numQuartos;
        }

        public void setNumBanheiros(Integer numBanheiros) {
            this.numBanheiros = numBanheiros;
        }

        public void setMetragemCasa(Double metragemCasa) {
            this.metragemCasa = metragemCasa;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        @Override
        public String toString() {
            return "InfoCasa{" +
                    "numCasa=" + numCasa +
                    ", numSala=" + numSala +
                    ", numQuartos=" + numQuartos +
                    ", numBanheiros=" + numBanheiros +
                    ", metragemCasa=" + metragemCasa +
                    ", endereco='" + endereco + '\'' +
                    '}';
        }
    }
}
