package aula_6.mariokart;

enum Cilindradas{
CC_50,
CC_100,
CC_150;
};

public class Motor {
    Cilindradas cilindradas;
    float velocidadeMaxima;

    void mostraInfo(){
        System.out.println("cilindradas: " + cilindradas + "\nvelocidade maxima: " + velocidadeMaxima);
    }
}
