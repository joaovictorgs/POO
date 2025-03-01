package aula_6.mariokart;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        piloto1.nome = "jovem";
        piloto1.vilao = true;
        piloto2.nome = "mancebo";
        piloto2.vilao = false;  
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();
        kart1.piloto = piloto1;
        kart1.motor.cilindradas = Cilindradas.CC_50;
        kart1.motor.velocidadeMaxima = 100;
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.pular();
        kart1.piloto.soltaSuperPoder();
        kart1.motor.mostraInfo();
        kart2.piloto = piloto2;
        kart2.motor.cilindradas = Cilindradas.CC_150;
        kart2.motor.velocidadeMaxima = 150;
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.pular();
        kart2.piloto.soltaSuperPoder();
        kart2.motor.mostraInfo();
    }    
    }
    
