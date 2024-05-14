package actividad3;

public class SeguroAutomovil implements Seguro{
    private double precio;

    public SeguroAutomovil(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCosto() {
        return this.precio;
    }
}
