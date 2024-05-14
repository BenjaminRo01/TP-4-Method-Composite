package actividad2;

public class Spike implements Item{
    private int tiempo;
    public Spike(int tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public int calcularTiempo() {
        return tiempo;
    }
}
