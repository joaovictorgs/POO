package aula_6;

public interface Main {
    public static void main(String[] args) {
        Zumbi zombie = new Zumbi();
        Zumbi zombie2 = new Zumbi();
        zombie.vida = 100;
        zombie2.vida = 120;
        zombie = zombie2;
        zombie.vida = 55;
        System.out.println(zombie.mostraVida());
        System.out.println(zombie2.mostraVida());
        zombie2.vida = 22;
        System.out.println(zombie.mostraVida());
        System.out.println(zombie2.mostraVida());

        Personagem personagem = new Personagem();
        personagem.nome = "matheus";
        personagem.pontos = 20;
        Arma arma = new Arma();
        arma.descricao = "automática";
        arma.nome = "ak47";
        arma.poder = 20;
        arma.resistencia = 10;
        personagem.arma = arma;
        System.out.println("vida: " +personagem.pontos);
        arma.mostarArma();
        personagem.tomarDano();
        personagem.usarArma();
        arma.mostarArma();
        System.out.println("vida: " +personagem.pontos);
    }
}
