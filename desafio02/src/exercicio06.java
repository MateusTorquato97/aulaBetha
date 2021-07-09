public class exercicio06 {
    public static void main(String[] args) {
        int x = 15;

        while (x <= 35) {
            if (x % 2 == 0) {
                x++;
                continue;
            }
            System.out.println("Número: " + x + " elevado ao quadrado: " + (x*x));
            x++;
        }
    }
}
