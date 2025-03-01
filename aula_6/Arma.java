package aula_6;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostarArma(){
        System.out.println("arma: " + nome + "\npoder: " + poder + "\nresistencia: " + resistencia + "\ndescricao: " + descricao);
    }
}
