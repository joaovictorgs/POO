package aula_6.mariokart;

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;
    public Kart(){
        motor = new Motor();
    }
    void pular(){
        System.out.println("pulou");
    }
    void soltarTurbo(){
        System.out.println("soltou turbo");
    }
    void fazerDrift(){
        System.out.println("fez drift");
    }
}
