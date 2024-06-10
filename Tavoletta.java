public class Tavoletta extends Cioccolato {
    private int peso;
    private String topping;
    public Tavoletta(String tipoDiCioccolato, double percentuale, int peso, String topping) {
        super(tipoDiCioccolato, percentuale);
        this.peso = peso;
        this.topping = topping;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public void produce(){
        super.produce();
        System.out.println("La tavoletta é composta da: "+ peso);
    }

    
}
