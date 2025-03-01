package aula_6;

public class Zumbi {
double vida;
String nome;

double mostraVida(){
return vida;
}
    
boolean tranfereVida(Zumbi zumbiAlvo, double quantia){
if(vida>=quantia)
    return false;
vida-=quantia;
zumbiAlvo.vida+=quantia;
return true;
}
}