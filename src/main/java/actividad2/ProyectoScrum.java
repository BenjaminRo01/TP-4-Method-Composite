package actividad2;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum {
    private List<Item> items;
    public ProyectoScrum() {
        this.items = new ArrayList<Item>();
    }
    public void agregarItem(Item item){
        this.items.add(item);
    }
    public int calcularTiempoProyecto(){
        return this.items.stream().mapToInt(i -> i.calcularTiempo()).sum();
    }
}
