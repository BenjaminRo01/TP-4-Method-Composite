import actividad1.EmpleadoNoRegular;
import actividad1.EmpleadoRegular;
import actividad1.EmpresaCliente;
import org.junit.Assert;
import org.junit.Test;

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

    }
}
