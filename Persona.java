public class Persona implements Comparable<Persona> {

    private String nombre;
    private int age;
    private String gender;

    public Persona(String nombre, int age, String gender) {
        this.nombre = nombre;
        this.age = age;
        this.gender = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Persona p) {

        int c = this.nombre.compareTo(p.nombre);

        int c2 = Integer.compare(this.age, p.age);

        if (c == 0) {
            return c2;
        }

        return c;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", age=" + age + ", gender=" + gender + "]";
    }
}