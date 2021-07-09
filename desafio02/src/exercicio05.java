import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor para a altura: ");
        double h = entrada.nextInt();
        System.out.println("Digite o valor para a base menor: ");
        double b = entrada.nextInt();
        System.out.println("Digite o valor para a base maior: ");
        double B = entrada.nextInt();

        System.out.println("Área do trapézio: " + calcula(h,b,B));
    }

    public static double calcula(double h, double b, double B) {
        double area = (h*(b+B))/2;

        return area;
    }
}
