package aula_3;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int numeroDeAlunos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o numero de alunos matriculados na disciplina C206_02");
        numeroDeAlunos = teclado.nextInt();
        switch (numeroDeAlunos) {
            case 10,20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");;
                break;
            default:
                System.out.println("numero inválido");
                break;
        }
        teclado.close();
    }
}
