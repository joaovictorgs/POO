package aula_7;

public class Livro {
    String titulo;
    Autor autor;
    Biblioteca biblioteca;
    Pessoa pessoa;
    
    public Livro(){
        biblioteca = new Biblioteca();
    }
    public String detalhes(){
        String detalheLivro = "Titulo: "+titulo +"\nAutor: "+ autor.nome +"\nNacionalidade: "+autor.nacionalidade+"\nBiblioteca: "+biblioteca.nome; 
        return detalheLivro;
    }
    public void emprestar(){
        System.out.println("emprestou o livro");
    }
    public void devolver(){
        System.out.println("devolveu o livro");
    }
}
