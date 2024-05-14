package actividad3;

import java.util.List;

public class Paquete implements Seguro{
    private static final double DESCUENTO_POR_SEGURO = 0.05;
    private List<Seguro> seguros;
    public Paquete(List<Seguro> seguros) {
        this.seguros = seguros;
    }
    @Override
    public double calcularCosto() {
        return this.seguros.stream()
                .mapToDouble(s -> {
                    var costo = s.calcularCosto();
                    return costo - (costo * DESCUENTO_POR_SEGURO);
                })
                .sum();
    }
}
