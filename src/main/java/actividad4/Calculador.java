package actividad4;

abstract class Calculador {
    //private LogTransaction log;
    public double calcularPrecio(double precioProducto){
        //log.log(CalculadorJubilado.class.getName());
        return precioProducto + descuento(precioProducto);
    }
    abstract double descuento(double precioProducto);
}
