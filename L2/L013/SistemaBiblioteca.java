package L2.L013;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("Java for Beginners", "John Smith", 2010);
        Livro livro2 = new Livro("Python Programming", "Alice Johnson", 2015);
        Livro livro3 = new Livro("Introduction to Algorithms", "Thomas Cormen", 2009);

        // Criando algumas pessoas
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);

        // Realizando empréstimos
        pessoa1.emprestarLivro(livro1);
        pessoa1.emprestarLivro(livro2);
        pessoa2.emprestarLivro(livro2);
        pessoa2.emprestarLivro(livro3);

        // Exibindo informações sobre os livros emprestados
        pessoa1.listarLivrosEmprestados();
        pessoa2.listarLivrosEmprestados();

        // Realizando devoluções
        pessoa1.devolverLivro(livro1);
        pessoa2.devolverLivro(livro2);

        // Exibindo informações atualizadas
        pessoa1.listarLivrosEmprestados();
        pessoa2.listarLivrosEmprestados();
    }
}
