package actividad5;

public class RemeraNacional extends Remera{
    public static final double RECARGO = 0.015;
    public static final double BONIFICACION = 0.2;
    public static final double PORCENTAJE_AUMENTO_COMERCIO = 0.15;
    private double precio;

    public RemeraNacional(double precio) {
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
        return 0;
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
        return precioConRecargo * BONIFICACION;
    }
}
