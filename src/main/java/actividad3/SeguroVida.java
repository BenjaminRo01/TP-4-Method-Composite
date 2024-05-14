package actividad3;

public class SeguroVida implements Seguro{
    private double precio;

    public SeguroVida(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCosto() {
        return this.precio;
    }
}
