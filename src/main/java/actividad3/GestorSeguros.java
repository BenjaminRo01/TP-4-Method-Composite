package actividad3;

import java.util.ArrayList;
import java.util.List;

public class GestorSeguros {
    private List<Seguro> seguros;
    public GestorSeguros(){
        this.seguros = new ArrayList<Seguro>();
    }
    public void agregarSeguros(Seguro seguro){
        this.seguros.add(seguro);
    }
    public double calcularCostoTotal(){
        return this.seguros.stream()
                .mapToDouble(s -> s.calcularCosto())
                .sum();
    }
}
