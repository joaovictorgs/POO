package aula_7;

public class Main {
    public static void main(String[] args) {
        Livro livro2;
        Autor autor = new Autor();
        autor.nome = "matheus";
        autor.nacionalidade = "Brasileiro";
        Livro livro = new Livro();
        livro.titulo = "teste";
        livro.autor = autor;
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "joao";
        pessoa.idade = 21;
        livro.biblioteca.nome = "alexandria";
        livro.biblioteca.endereco = "Egito";
        System.out.println(livro.detalhes());
        livro.emprestar();
        livro.devolver();
        livro.biblioteca.listarLivro();
        livro.biblioteca.adicionarLivro(livro);
        livro.biblioteca.removerLivro(livro);
        pessoa.emprestarLivro(livro);
        pessoa.devolverLivro(livro);
        pessoa.listarLivroEmprestado(livro);
        livro2 = autor.escreverLivro("whatzap e suas complexidades 2");
        System.out.println(livro2.autor.obterBiografia());
        autor.obterBiografia();
        System.out.println(livro2.detalhes()); 

    }
}
