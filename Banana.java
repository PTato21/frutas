public class Banana {

private String nome;
private int quantidade;

public Banana(String nome, int quantidade) {
    this.nome = nome;
    this.quantidade = quantidade;
}

public String getNome() {
    return nome;
}

public int getQuantidade() {
    return quantidade;
}

@Override
public String toString() {
    return nome + " - Quantidade: " + quantidade;
}

}