public class Cioccolatino extends Cioccolato{

    private String forma;
    private String ripieno;
    private int quantitaCioccolato;

    public Cioccolatino(String tipoDiCioccolato, double percentuale, String forma, String ripieno) {
        super(tipoDiCioccolato, percentuale);
        this.forma = forma;
        this.ripieno = ripieno;
        quantitaCioccolato = 2;
    }

    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public String getRipieno() {
        return ripieno;
    }
    public void setRipieno(String ripieno) {
        this.ripieno = ripieno;
    }

    public int getQuantitaCioccolato() {
        return quantitaCioccolato;
    }

    public void setQuantitaCioccolato(int quantitaCioccolato) {
        this.quantitaCioccolato = quantitaCioccolato;
    }
        
    @Override
    public void produce(){
        super.produce();
        System.out.println("");

    }
}
