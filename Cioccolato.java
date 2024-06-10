public class Cioccolato {
    protected String tipoDiCioccolato;
    protected double percentuale;
    final protected int maxCioccolato = 100;    

    public Cioccolato(String tipoDiCioccolato, double percentuale) {
        this.tipoDiCioccolato = tipoDiCioccolato;
        this.percentuale = percentuale;
    }


    public void produce() {
        System.out.println("Tipo di cioccolato: " + tipoDiCioccolato);
        System.out.println("Percentuale di cioccolato: " + percentuale + "%");
    }


}
