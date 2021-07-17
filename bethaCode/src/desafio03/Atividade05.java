package desafio03;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] vetor_original = new String[10];

        for (int x = 0; x < 10; x++){
            System.out.println("Digite um valor/caracter para a posição " + x +":");
            String posicao = s.nextLine();

            vetor_original[x] = posicao;
        }

        int tamanhoVetorOriginal = vetor_original.length;
        String[] vetor_copia = new String[tamanhoVetorOriginal];
        int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal - 1;
        for(int i = 0; i < tamanhoVetorOriginal; i++) {
            vetor_copia[i] = vetor_original[tamanhoVetorOriginalZeroBased - i];
            System.out.print(vetor_copia[i] + " ");
        }
    }
}
