package desafio03;

import javax.swing.*;

public class Atividade04 {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String mensagem = "Seu nome é: " + nome;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
