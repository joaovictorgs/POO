package aula_2;
import java.util.Scanner;

public class Lanches {
    public static void main(String[] args) {
        int lanche1,lanche2,lanche3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro lanche");
        lanche1 = entrada.nextInt();
        System.out.println("Insira o valor do segundo lanche");
        lanche2 = entrada.nextInt();
        System.out.println("Insira o valor do terceiro lanche");
        lanche3 = entrada.nextInt();

        entrada.close();

        int total = lanche1+lanche2+lanche3;
        float media= (float)total/3;

        System.out.println("o Total é: " +total+ "\nA média é: "+media);

    }
}
