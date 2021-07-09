public class ControleFluxoWhileDWhileMain {
    public static void main(String[] args) {
        //EXEMPLO COM WHILE


        int x = 10;

        System.out.println("----- exemplo de while ------");
        while (x < 10){
            System.out.println("item: " + x);
            x++;
        }

        //EXEMPLO COM DO-WHILE
        int y = 10;

        System.out.println("----- exemplo de do while ------");
        do{
            System.out.println("item: " + y);
            y++;
        } while (y < 10);
    }
}
