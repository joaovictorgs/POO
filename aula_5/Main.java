package aula_5;

public class Main {
    public static void main(String[] args) {
        Zumbi zombie = new Zumbi();
        zombie.nome = "matheus";
        zombie.altura = 1.7;
        zombie.velocidade = 20;
        zombie.sexo = Sexo.MASCULINO;
        zombie.vida = 100;
        zombie.armadura = 2;
        zombie.danoMordida=25;
        Zumbi zombie2 = new Zumbi();
        zombie2.nome = "Sérgia";
        zombie2.altura = 1.85;
        zombie2.velocidade = 25;
        zombie2.sexo = Sexo.FEMININO;
        zombie2.vida = 100;
        zombie2.armadura = 2;
        zombie2.danoMordida=25;
        zombie.correr();
        zombie.get_vida();
        zombie2.morder(zombie);
        zombie.get_vida();
    }
}
