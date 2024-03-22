package L2.L013;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Livro> livrosEmprestados;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.estaEmprestado()) {
            this.livrosEmprestados.add(livro);
            livro.emprestar();
            System.out.println(this.nome + " emprestou o livro \"" + livro.getTitulo() + "\"");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (this.livrosEmprestados.contains(livro)) {
            this.livrosEmprestados.remove(livro);
            livro.devolver();
            System.out.println(this.nome + " devolveu o livro \"" + livro.getTitulo() + "\"");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" não está emprestado para " + this.nome);
        }
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados para " + this.nome + ":");
        for (Livro livro : this.livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
