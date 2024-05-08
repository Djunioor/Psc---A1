import java.util.Scanner;

public class Lucro2 {
    private int numeroClientes;

    public void calcularMediaPorCliente() {
        Scanner input = new Scanner(System.in);
        double totalGastoPorCliente = 0;

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println("Gasto com bebidas: ");
            double gastoBebidas = input.nextDouble(); 

            System.out.println("Gasto com comida: ");
            double gastoComidas = input.nextDouble();

            double gastoTotalCliente = gastoBebidas + gastoComidas;
            totalGastoPorCliente += gastoTotalCliente;
        }

        double mediaGastoPorCliente = totalGastoPorCliente / numeroClientes;

        System.out.println("A média gasta por cliente é: " + mediaGastoPorCliente);
    }

    public void calcularMediaGeral() {
        Scanner input = new Scanner(System.in);
        double gastoBebidas = 0, gastoComidas = 0, soma = 0;

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println("Gasto com bebidas: ");
            gastoBebidas = input.nextDouble(); 
            System.out.println("Gasto com comida: ");
            gastoComidas = input.nextDouble();

            soma += gastoBebidas + gastoComidas;
        }

        double mediaGeral = soma / numeroClientes;
        System.out.println("A média gasta por cliente é: " + mediaGeral);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Informe o número total de clientes: ");
        int numeroClientes = input.nextInt();

        Lucro2 lucro = new Lucro2();
        lucro.calcularMediaPorCliente();
        lucro.calcularMediaGeral();
        input.close(); 
    }
}