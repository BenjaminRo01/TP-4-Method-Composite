package actividad3;

public class SeguroHogar implements Seguro{
    private double precio;

    public SeguroHogar(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCosto() {
        return this.precio;
    }
}
