import java.util.List;
import java.util.Scanner;

public class Frutas {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    // Cadastro dos clientes
    List<Cliente> clientes = Cliente.cadcliente();

    System.out.println("=== CLIENTES CADASTRADOS ===");

    for (int i = 0; i < clientes.size(); i++) {
        System.out.println(i + " - " + clientes.get(i).getNome());
    }

    System.out.print("Escolha o cliente pelo numero: ");
    int opcaoCliente = entrada.nextInt();

    if (opcaoCliente < 0 || opcaoCliente >= clientes.size()) {
        System.out.println("Cliente invalido!");
        entrada.close();
        return;
    }

    Cliente clienteEscolhido = clientes.get(opcaoCliente);

    // Lista de frutas
    Fruta frutas = new Fruta();
    List<Banana> bananas = frutas.getBananas();

    System.out.println("\n=== BANANAS DISPONIVEIS ===");

    for (int i = 0; i < bananas.size(); i++) {
        System.out.println(i + " - " + bananas.get(i));
    }

    System.out.print("Escolha a banana pelo numero: ");
    int opcaoBanana = entrada.nextInt();

    if (opcaoBanana < 0 || opcaoBanana >= bananas.size()) {
        System.out.println("Banana invalida!");
        entrada.close();
        return;
    }

    Banana bananaEscolhida = bananas.get(opcaoBanana);

    // Resultado
    System.out.println("\n=== RESULTADO ===");
    System.out.println("Cliente: " + clienteEscolhido.getNome());
    System.out.println("Banana escolhida: " + bananaEscolhida.getNome());
    System.out.println("Quantidade disponivel: "
            + bananaEscolhida.getQuantidade());

    entrada.close();
}

}