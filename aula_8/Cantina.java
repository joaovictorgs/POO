public class Cantina {
    String nome;
    Salgado salgados[] =  new Salgado[12];
    
    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i<12;i++){
            if(salgados[i]==null){
                salgados[i]=novoSalgado;
                return;
            }
        }
    } 
    public void mostraInfo(){
        for (Salgado salgado : salgados){
            if(salgado!=null){
                System.out.println(salgado.nome);
            }else{
                return;
            }
        }
    } 
}
