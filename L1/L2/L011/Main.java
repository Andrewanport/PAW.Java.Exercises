package L2.L011;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Produto
        Produto produto = new Produto("Camiseta", 50.0);

        // Exibindo os detalhes do produto antes de alterar o preço
        System.out.println("Detalhes do produto antes de alterar o preço:");
        produto.mostrarDetalhes();

        // Aplicando aumentos e reduções de preço
        produto.aumentarPreco(10); // Aumenta o preço em 10%
        produto.diminuirPreco(5); // Diminui o preço em 5%

        // Exibindo os detalhes do produto após alterar o preço
        System.out.println("\nDetalhes do produto após alterar o preço:");
        produto.mostrarDetalhes();
    }
}
