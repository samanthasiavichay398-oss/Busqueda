import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );

        // busqueda binaria
        BusquedaBinaria bB = new BusquedaBinaria(personas);

        int resultado = bB.findByName("Ana");

        if (resultado >= 0) {
            System.out.println("se encontro en la pos = " + resultado);
        } else {
            System.out.println("no se encontro");
        }

        // busqueda lineal
        BusquedaLineal busqueda = new BusquedaLineal(personas);

        int resultado2 = busqueda.findPosByName("Ana");

        if (resultado2 >= 0) {
            System.out.println("se encontro en la pos = " + resultado2);
        } else {
            System.out.println("no se encontro");
        }

        // buscar persona de 25 años
        int resultado3 = busqueda.findPosByName("Juan");

        if (resultado3 >= 0) {
            System.out.println("se encontro a alguien de edad 25 en la pos = " + (resultado3 + 1));
        } else {
            System.out.println("no se encontro");
        }
    }
}