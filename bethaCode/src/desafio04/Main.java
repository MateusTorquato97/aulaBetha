package desafio04;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Flavinho do Pneu", "Na frente dos Pneu", "48998062066", "09275499993", "999999", "Masculino", 2000.0, 500.0);
        cliente.aumentaLimite(100.0);
        System.out.println("Novo limite: " + cliente.getLimiteCrediario());
        cliente.diminuiLimite(200.0);
        System.out.println("Agora vai: " + cliente.getLimiteCrediario());

        Funcionario funcionario = new Funcionario(1, "Thiago da Borracharia", "Atras da borracharia", "48 99865432", "124321456777", "43543", "Masculino", 1900.0, 1600.0);
        funcionario.aplicaDissidio(6.0);
        System.out.println("Salário novo: " + funcionario.getSalarioBruto());
    }
}
