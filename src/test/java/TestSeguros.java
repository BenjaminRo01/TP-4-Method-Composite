import actividad3.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSeguros {
    @Test
    public void testSegurosIndividuales(){
        var gestor = new GestorSeguros();
        gestor.agregarSeguros(new SeguroAutomovil(500));
        gestor.agregarSeguros(new SeguroVida(300));
        gestor.agregarSeguros(new SeguroMedico(100));
        gestor.agregarSeguros(new SeguroHogar(350));

        var resultado = gestor.calcularCostoTotal();

        Assert.assertEquals(1249, resultado, 1251);
    }
    @Test
    public void testPaqueteDeSeguros(){
        var gestor = new GestorSeguros();
        var paquete = new Paquete(
                List.of(new Paquete(
                                List.of(new SeguroAutomovil(500),
                                        new SeguroVida(300))
                        ),
                        new SeguroMedico(100),
                        new SeguroHogar(350))
        );
        gestor.agregarSeguros(paquete);

        var resultado = gestor.calcularCostoTotal();

        Assert.assertEquals(1149, resultado, 1150);
    }
}
