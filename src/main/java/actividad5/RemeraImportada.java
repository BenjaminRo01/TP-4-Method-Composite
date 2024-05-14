package actividad5;

public class RemeraImportada extends Remera{
    public static final double RECARGO = 0.03;
    public static final double IMPUESTO_ADUANERO = 0.05;
    public static final double PORCENTAJE_AUMENTO_COMERCIO = 0.25;
    private double precio;

    public RemeraImportada(double precio) {
        this.precio = precio;
    }

    @Override
    double precioBase() {
        return this.precio;
    }

    @Override
    double recargo(double precioRemera) {
        return precioRemera * RECARGO;
    }

    @Override
    double impuestoAduanero(double precioRemera) {
        return precioRemera * IMPUESTO_ADUANERO;
    }

    @Override
    double aumentoComercio(double precioConRecargo) {
        return precioConRecargo * PORCENTAJE_AUMENTO_COMERCIO;
    }

    @Override
    double costoTransporte(double precioRemera) {
        return 0;
    }

    @Override
    double bonificacion(double precioConRecargo) {
        return 0;
    }
}
