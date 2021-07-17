package desafio02;

import java.util.Scanner;

public class Exercicio01 {
    //Foi realizado a criação de um método, pois o mesmo pode ser reaproveitado em outros exercicios
    public static String buscaDiaSemana(int i) {
        String diaSemana;

        switch (i) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-Feira";
                break;
            case 3:
                diaSemana = "Terça-Feira";
                break;
            case 4:
                diaSemana = "Quarta-Feira";
                break;
            case 5:
                diaSemana = "Quinta-Feira";
                break;
            case 6:
                diaSemana = "Sexta-Feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Por favor, digitar um número entre 1 a 7";
        }

        return diaSemana;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int i = s.nextInt();

        System.out.println(buscaDiaSemana(i));
    }
}
