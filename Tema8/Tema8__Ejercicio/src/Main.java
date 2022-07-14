public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Persona();
        estudiante.setEdad(26);
        estudiante.setNombre("William");
        estudiante.setTelefono(999888777);
        System.out.println("Edad: ");
        System.out.println(estudiante.getEdad());
        System.out.println("Nombre: ");
        System.out.println(estudiante.getNombre());
        System.out.println("Telefono: ");
        System.out.println(estudiante.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    // SETS
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    // GETS
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
}