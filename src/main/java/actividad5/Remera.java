package actividad5;

abstract class Remera {
    public double calculoPrecioRemera(){
        var precioUnitario = precioBase();
        var precioConRecargo = recargo(precioUnitario)
                + impuestoAduanero(precioUnitario)
                + costoTransporte(precioUnitario);
        precioConRecargo += + bonificacion(precioConRecargo);
        return aumentoComercio(precioConRecargo);
    }
    abstract double precioBase();
    abstract double recargo(double precioRemera);
    abstract double impuestoAduanero(double precioRemera);
    abstract double aumentoComercio(double precioConRecargo);
    abstract double costoTransporte(double precioRemera);
    abstract double bonificacion(double precioConRecargo);
}
