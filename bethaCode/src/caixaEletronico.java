public class caixaEletronico {
    public static void main(String[] args) {
        //Cedulas disponíveis no caixa eletronico
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        //Quantidade total de cedulas entregues ao cliente
        int quantidadeTotal = 0;
        //valor a ser sacado pelo cliente
        int valorReais = 163;
        for (int i = 0; i < cedulas.length; i++){
            //Quantidade de cedulas para o valor cedula[i]
            int quantidadeCedulas = valorReais/cedulas[i];
            System.out.println("Quantidade de cedulas de " + cedulas[i] + ": " + quantidadeCedulas);
            //Resto da divisao
            valorReais %= cedulas[i];
            //Quantidade total de cedulas entregues ao cliente
            quantidadeTotal += quantidadeCedulas;
        }
        System.out.println("Quantidade total: " + quantidadeTotal);
    }
}
