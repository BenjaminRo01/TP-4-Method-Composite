import actividad1.EmpleadoNoRegular;
import actividad1.EmpleadoRegular;
import actividad1.EmpresaCliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestEmpresa {
    @Test
    public void testEmpleadosRegulares(){
        var empresa = new EmpresaCliente();
        empresa.agregarEmpleado(new EmpleadoRegular(2000));
        empresa.agregarEmpleado(new EmpleadoRegular(3000));
        empresa.agregarEmpleado(new EmpleadoRegular(4500));
        empresa.agregarEmpleado(new EmpleadoRegular(2300));

        var resultado = empresa.montoTotalSalarialEmpresa();

        Assert.assertEquals(11800, resultado);
    }

    @Test
    public void testEmpleados(){
        var empresa = new EmpresaCliente();
        var empleadoRegular1 = new EmpleadoRegular(2000);
        var empleadoRegular2 = new EmpleadoRegular(3000);
        var liderDeProyecto1 = new EmpleadoNoRegular(5000, List.of(empleadoRegular1));
        var liderDeProyecto2 = new EmpleadoNoRegular(5000, List.of(empleadoRegular2));
        var mandoMedio = new EmpleadoNoRegular(7000, List.of(liderDeProyecto1, liderDeProyecto2));
        var gerente = new EmpleadoNoRegular(8000, List.of(mandoMedio));
        var director = new EmpleadoNoRegular(9000, List.of(gerente));
        empresa.agregarEmpleado(director);

        var resultado = empresa.montoTotalSalarialEmpresa();

        Assert.assertEquals(39000, resultado);
    }
}
