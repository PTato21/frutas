    import java.util.ArrayList;
    import java.util.List;

public class Cliente {

    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static List<Cliente> cadcliente() {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Bruno"));
        clientes.add(new Cliente("Amanda"));
        clientes.add(new Cliente("Rosiane"));

        return clientes;
    }

    @Override
    public String toString() {
        return nome;
    }
}