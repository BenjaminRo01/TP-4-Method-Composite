package actividad1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoNoRegular implements Empleado{
    private List<Empleado> empleadosACargo;
    public EmpleadoNoRegular(List<Empleado> empleados) {
        this.empleadosACargo = empleados;
    }
    @Override
    public int calcularMontoSalarialTotal() {
        return this.empleadosACargo.stream()
                .mapToInt(empleado -> empleado.calcularMontoSalarialTotal())
                .sum();
    }
}