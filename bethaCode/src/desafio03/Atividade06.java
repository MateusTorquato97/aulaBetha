package desafio03;

import javax.swing.*;

public class Atividade06 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altuta: "));

        double resultado = peso / (altura * altura);

        System.out.println("Seu IMC é de: " + resultado);
    }
}
