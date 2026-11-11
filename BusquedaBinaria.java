import java.util.ArrayList;
import java.util.List;

public class BusquedaBinaria {

    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas) {
        this.personas = new ArrayList<>(personas);
        this.personas.sort(null);
    }

    public Integer findByName(String name) {

        int lo = 0;
        int hi = personas.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int comparacion = personas.get(mid).getNombre().compareTo(name);

            if (comparacion == 0) {
                return mid;
            } else if (comparacion < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}