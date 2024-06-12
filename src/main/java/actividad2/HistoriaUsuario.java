package actividad2;

import java.util.List;

public class HistoriaUsuario implements Item{
    private List<Item> items;
    public HistoriaUsuario(List<Item> items) {
        this.items = items;
    }
    @Override
    public int calcularTiempo() {
        return this.items.stream()
                .mapToInt(i -> i.calcularTiempo()).sum();
    }
}
