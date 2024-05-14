package actividad1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaCliente {
    private List<Empleado> empleados;

    public EmpresaCliente() {
        this.empleados = new ArrayList<Empleado>();
    }

    private int montoTotalSalarialEmpresa(){
        return this.empleados.stream()
                .mapToInt(empleado -> empleado.calcularMontoSalarialTotal())
                .sum();
    }
}
