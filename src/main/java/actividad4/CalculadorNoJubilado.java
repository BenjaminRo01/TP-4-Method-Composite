package actividad4;
import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador{
    public static final double DESCUENTO_MES_PROMOCION = 0.15;
    public static final double DESCUENTO_MES_NORMAL = 0.21;
    private int mesEnPromocion;

    public CalculadorNoJubilado(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    @Override
    double descuento(double precioProducto) {
        if (of(this.mesEnPromocion).equals(now().getMonth())) {
            return precioProducto * DESCUENTO_MES_PROMOCION;
        }
        return precioProducto * DESCUENTO_MES_NORMAL;
    }
}
