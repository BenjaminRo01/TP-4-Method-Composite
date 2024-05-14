
import actividad5.RemeraImportada;
import actividad5.RemeraNacional;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestNegocioRemeras {
    @Test
    public void testRemerasImportadas(){
        var remeraImportada1 = new RemeraImportada(200);
        var remeraImportada2 = new RemeraImportada(180);
        var remeraImportada3 = new RemeraImportada(130);
        List<RemeraImportada> stockRemerasImp = List.of(remeraImportada1,remeraImportada2,remeraImportada3);

        var resultado = stockRemerasImp.stream().mapToDouble(r -> r.calculoPrecioRemera()).sum();

        //270 + 243 + 175.5 = 688.5
        Assert.assertEquals(688, resultado, 689);
    }
    @Test
    public void testRemerasImportadasYNacionales(){
        var remeraImportada1 = new RemeraImportada(200);
        var remeraImportada2 = new RemeraImportada(180);
        var remeraImportada3 = new RemeraImportada(130);
        List<RemeraImportada> stockRemerasImp = List.of(remeraImportada1,remeraImportada2,remeraImportada3);
        var remeraNacional1 = new RemeraNacional(150);
        var remeraNacional2 = new RemeraNacional(100);
        List<RemeraNacional> stockRemerasNac = List.of(remeraNacional1, remeraNacional2);

        var resultado = stockRemerasImp.stream().mapToDouble(r -> r.calculoPrecioRemera()).sum();
        resultado = stockRemerasNac.stream().mapToDouble(r -> r.calculoPrecioRemera()).sum();

        //688.5 + 140.07 + 93.38 = 921.95
        Assert.assertEquals(921, resultado, 922);
    }
}
