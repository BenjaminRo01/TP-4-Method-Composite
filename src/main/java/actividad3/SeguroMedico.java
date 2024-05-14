package actividad3;

public class SeguroMedico implements Seguro{
    private double precio;

    public SeguroMedico(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCosto() {
        return this.precio;
    }
}
