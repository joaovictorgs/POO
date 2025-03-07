package aula_7;

public class Autor {
    String nome;
    String nacionalidade;
    Livro livro;

    public Livro escreverLivro(String titulo){
        Livro livro = new Livro();
        livro.titulo = titulo;
        livro.autor = this;
        livro.biblioteca.nome = "generico";
        return livro;
    }
    public String obterBiografia(){
        return "O autor "+nome+" eh de nacionalidade "+nacionalidade;
    }
}
