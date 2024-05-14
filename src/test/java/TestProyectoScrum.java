import actividad2.HistoriaUsuario;
import actividad2.ProyectoScrum;
import actividad2.Spike;
import actividad2.Tarea;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestProyectoScrum {
    @Test
    public void testProyectoConSoloHistorias(){
        var proyecto = new ProyectoScrum();
        var historia1 = new HistoriaUsuario(
                List.of(
                        new Tarea(20),
                        new Tarea(30),
                        new Tarea(60),
                        new Tarea(10))
        );
        var historia2 = new HistoriaUsuario(
                List.of(
                        new Tarea(45),
                        new Tarea(40),
                        new Tarea(15),
                        new Tarea(10))
        );
        proyecto.agregarItem(historia1);
        proyecto.agregarItem(historia2);

        var resultado = proyecto.calcularTiempoProyecto();

        Assert.assertEquals(230, resultado);
    }
    @Test
    public void testProyectoConTodosLosItems(){
        var proyecto = new ProyectoScrum();
        var historia1 = new HistoriaUsuario(
                List.of(
                        new Tarea(20),
                        new Tarea(30),
                        new Tarea(60),
                        new Tarea(10))
        );
        var historia2 = new HistoriaUsuario(
                List.of(
                        new Tarea(45),
                        new Tarea(40),
                        new Tarea(15),
                        new Tarea(10))
        );
        proyecto.agregarItem(historia1);
        proyecto.agregarItem(historia2);
        proyecto.agregarItem(new Spike(200));
        proyecto.agregarItem(new Spike(350));
        proyecto.agregarItem(new Tarea(35));

        var resultado = proyecto.calcularTiempoProyecto();

        Assert.assertEquals(815, resultado);
    }
}
