package aula_2;

import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {
        int NPA;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a nota do aluno na NPA");
        NPA = teclado.nextInt();

        if(NPA>=60){
            System.out.println("Passou direto com média: "+NPA);
        }else{
            System.out.println("aluno ficou de NP3, insira a nota da NP3:");
            int NP3 = teclado.nextInt();
            int total = NP3+NPA;
            float NFA = (float)total/2;
            if(NFA>=50)
                System.out.println("Passou pela NP3 com média: " +NFA);
            else
                System.out.println("Reprovou com média: "+NFA);
        }
        teclado.close();
    }
}
