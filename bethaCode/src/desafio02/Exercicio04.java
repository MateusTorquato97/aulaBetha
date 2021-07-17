package desafio02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor a ser invertido: ");
        Integer numero = entrada.nextInt();

        if(numero.toString().length() <= 4) {
            System.out.println("Numero invertido: " + inverte(numero));
        } else {
            System.out.println("Por favor, digitar no máximo 4 números!");
        }
    }

    public static String inverte(int numero) {
        Integer a = numero;
        String b = a.toString();
        String c = "";

        for (int i=b.length(); i > 0; i--) {
            c += b.substring(i - 1, i);
        }

        return c;
    }
}