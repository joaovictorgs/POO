package aula_3;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Random rand = new Random();
        int numAleatorio = rand.nextInt(10) + 1;
        System.out.println(numAleatorio);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor de 0 a 10 pra tentar adivinhar o numero sorteado");
        int numEscolhido = teclado.nextInt();
        while (numEscolhido!=numAleatorio) {
            if(numEscolhido<numAleatorio){
                System.out.println("o numero escolhido é menor que o numero sorteado");
            }else{
                System.out.println("O número escolhido é maior que o numero sorteado");
            }
            System.out.println("Por favor insira outro número pra tentar adivinhar o número sorteado");
            numEscolhido = teclado.nextInt();
        }
        System.out.println("Você acertou! o numero sorteado era: " + numAleatorio);
        teclado.close();
    }
}
