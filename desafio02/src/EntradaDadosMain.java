import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma linha: ");
        String linha = s.nextLine();
        System.out.println("digite um numero: ");
        int i = s.nextInt();
        System.out.println("digite um numero: ");
        double d = s.nextDouble();

        System.out.println("imprime: linha: " + linha + " inteiro: " + i + " double: " + d);
    }
}
