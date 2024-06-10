public class CioccolatoCaldo extends Cioccolato {
    
    private double temperatura;
    private double densita;

    public CioccolatoCaldo(String tipo, int percentualeCacao, int temperatura, int densita) {
        super(tipo, percentualeCacao);
        this.temperatura = temperatura;
        this.densita = densita;
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Densità: " + densita);
    }
}
