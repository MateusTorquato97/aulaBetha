package desafio03;

public class Atividade02 {
    public static void main(String[] args) {
        int[] arraysInteiros = {23, 12, 55, 02, 07, 19};
        int soma = 0;

        for (int i = 0; i < arraysInteiros.length; i++){
            soma += arraysInteiros[i];
        }

        double media = (soma/arraysInteiros.length);
        System.out.println("Média dos valores: " + media);
    }
}
