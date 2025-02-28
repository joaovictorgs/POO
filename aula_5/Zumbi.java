package aula_5;

enum Sexo{
    MASCULINO,
    FEMININO;
};

public class Zumbi {
    String nome;
    double altura;
    double velocidade;
    Sexo sexo;
    int vida;
    int armadura;
    boolean vivo = true;
    int danoMordida;

    void correr(){
        System.out.println("zumbi correndo à uma velocidade "+velocidade+ "km/h \n");
    }
    void morder(Zumbi inimigo){
        inimigo.tomar_dano(danoMordida);
    }
    void tomar_dano(int dano){
        vida = vida - (dano - armadura);
        if(vida<=0){
            morrer();
        }
    }
    void morrer(){
        vivo=false;
    }

    void get_vida(){
        System.out.println(vida+"\n");
    }
}
