package actividad1;

import java.util.List;

public class EmpleadoNoRegular implements Empleado{
    private int salario;
    private List<Empleado> empleadosACargo;
    public EmpleadoNoRegular(int salario, List<Empleado> empleados) {
        this.salario = salario;
        this.empleadosACargo = empleados;
    }
    @Override
    public int montoSalarial() {
        return this.salario + this.empleadosACargo.stream()
                .mapToInt(empleado -> empleado.montoSalarial())
                .sum();
    }
}
