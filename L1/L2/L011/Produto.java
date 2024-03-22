package L2.L011;

public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para aumentar o preço em uma determinada porcentagem
    public void aumentarPreco(double aumento) {
        double percentual = aumento / 100.0;
        this.preco *= (1 + percentual);
    }

    // Método para diminuir o preço em uma determinada porcentagem
    public void diminuirPreco(double reducao) {
        double percentual = reducao / 100.0;
        this.preco *= (1 - percentual);
    }

    // Método para obter o preço atual do produto
    public double getPreco() {
        return this.preco;
    }

    // Método para exibir os detalhes do produto
    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
    }
}
