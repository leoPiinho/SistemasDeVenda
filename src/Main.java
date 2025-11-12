import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vendas> listaVendas = new ArrayList<>();

        String option;
        double total = 0;

        System.out.println("login:");
        String waiter = scanner.nextLine();
        System.out.println("Mesa:");
        Integer table = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("Qual o produto:");
            String product = scanner.nextLine();
            System.out.println("Qual o preco:");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Venda realizada com sucesso!!");
            listaVendas.add(new Vendas(waiter,table,product,price));
            System.out.println("Adicionar mais itens?\n SIM/NAO");
            option = scanner.nextLine();

        } while (option.equalsIgnoreCase("sim"));

        Vendas.resume(listaVendas);

    }
}
