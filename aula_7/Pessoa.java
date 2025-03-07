package aula_7;

public class Pessoa {
    String nome;
    int idade;
    public void emprestarLivro(Livro livro){
        System.out.println("emprestou o livro "+livro.titulo);
    }
    public void devolverLivro(Livro livro){
        System.out.println("devolveu o livro "+livro.titulo);
    }
    public void listarLivroEmprestado(Livro livro){
        System.out.println("emprestou o livro "+livro.titulo);
    }
}
