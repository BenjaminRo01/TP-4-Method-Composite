package actividad2;

import java.util.List;

public class HistoriaUsuario implements Item{
    private List<Tarea> tareas;
    public HistoriaUsuario(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    @Override
    public int calcularTiempo() {
        return this.tareas.stream()
                .mapToInt(t -> t.calcularTiempo()).sum();
    }
}
