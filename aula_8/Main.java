public class Main {
    public static void main(String[] args) {
      Salgado salgado1= new Salgado("salgado1");
      Salgado salgado2= new Salgado("salgado2");
      Cantina cantina = new Cantina();

      cantina.mostraInfo();
      cantina.addSalgado(salgado1);
      cantina.mostraInfo();
      cantina.addSalgado(salgado2);
      cantina.mostraInfo();
    }
}
