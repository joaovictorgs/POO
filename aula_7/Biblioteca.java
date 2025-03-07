package aula_7;

public class Biblioteca {
String nome;
String endereco;

public void adicionarLivro(Livro livro){
System.out.println("O livro "+livro.titulo+" do autor "+livro.autor.nome+" foi adicionado ao acervo");
}
public void removerLivro(Livro livro){
    System.out.println("O livro "+livro.titulo+" do autor "+livro.autor.nome+" foi removido do acervo");
}
public void listarLivro(){
System.out.println("livros listados");
}
}