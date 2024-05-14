package actividad1;

public class EmpleadoRegular implements Empleado{
    private int salario;

    public EmpleadoRegular(int salario) {
        this.salario = salario;
    }


    @Override
    public int calcularMontoSalarialTotal() {
        return this.salario;
    }
}
