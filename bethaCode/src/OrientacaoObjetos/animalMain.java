package OrientacaoObjetos;

public class animalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nome = "Renan";
        animal.peso = 70.0;
        animal.altura = 1.85;
        animal.som = "Au au";

        animal.emitirSom();
        animal.pular(animal.altura);
    }

    public static class Animal{
        String nome;
        Double peso;
        Double altura;
        String som;

        public void emitirSom(){
            System.out.println("O animal faz: " + som);
        }

        public void pular(Double alturaPulo){
            System.out.println("O animal pulou: " + alturaPulo);
        }
    }
}
