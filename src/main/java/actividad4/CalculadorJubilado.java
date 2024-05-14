package actividad4;
import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorJubilado extends Calculador{
    public static final double DESCUENTO_MES_NORMAL = 0.1;
    private int mesEnPromocion;

    public CalculadorJubilado(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    @Override
    double descuento(double precioProducto) {
        if (!of(this.mesEnPromocion).equals(now().getMonth())) {
            return precioProducto * DESCUENTO_MES_NORMAL;
        }
        return 0;
    }
}
