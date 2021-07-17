package desafio03;

public class Atividade03 {
    public static void main(String[] args) {
        String[] vetor_original = { "Mateus", "Emily", "José", "Maria", "Pedro", "Marcos", "Maxwel", "Thiago", "Bruno", "Joana" };
        int tamanhoVetorOriginal = vetor_original.length;
        String[] vetor_copia = new String[tamanhoVetorOriginal];
        int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal - 1;
        for(int i = 0; i < tamanhoVetorOriginal; i++) {
            vetor_copia[i] = vetor_original[tamanhoVetorOriginalZeroBased - i];
            System.out.print(vetor_copia[i] + " ");
        }
    }
}
