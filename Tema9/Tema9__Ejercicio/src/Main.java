public class Main {
    public static void  main(String[] args) {
        // Objeto cliente
        Cliente cliente = new Cliente();
        cliente.edad = 26;
        cliente.nombre = "William Serrano";
        cliente.telefono = 999888777;
        cliente.credito = 5600.84;
        System.out.println("Datos cliente: ");
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
        // Objeto trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 35;
        trabajador.nombre = "Eduardo Arias";
        trabajador.telefono = 666555444;
        trabajador.salario = 1450.68;
        System.out.println("Datos trabajador: ");
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito; //podria ser tipo float
}

class Trabajador extends Persona {
    double salario; //podria ser tipo float
}