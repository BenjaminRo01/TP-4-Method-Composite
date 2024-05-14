import actividad4.CalculadorJubilado;
import actividad4.CalculadorNoJubilado;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestCalculador {
    @Test
    public void testEnPromocion(){
        int mes = LocalDate.now().getMonthValue();
        var calculadorJubilado = new CalculadorJubilado(mes);
        var calculadorNoJubilado = new CalculadorNoJubilado(mes);
        var resultadoJubilado = calculadorJubilado.calcularPrecio(200);
        var resultadoNoJubilado = calculadorNoJubilado.calcularPrecio(200);
        Assert.assertEquals(200,resultadoJubilado,200);
        Assert.assertEquals(230, resultadoNoJubilado, 230);
    }
    @Test
    public void testFueraDePromocion(){
        int mes = LocalDate.now().getMonthValue() - 1;
        var calculadorJubilado = new CalculadorJubilado(mes);
        var calculadorNoJubilado = new CalculadorNoJubilado(mes);
        var resultadoJubilado = calculadorJubilado.calcularPrecio(200);
        var resultadoNoJubilado = calculadorNoJubilado.calcularPrecio(200);
        Assert.assertEquals(220,resultadoJubilado,220);
        Assert.assertEquals(242, resultadoNoJubilado, 242);
    }
}
