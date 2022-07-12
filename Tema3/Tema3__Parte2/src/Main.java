public class Main {
    public static void main(String[] args){
        Coche miCoche = new Coche(); //creamos el objeto miCoche
        int n_puertas = 2;  //valor por defecto de la cantidad de puertas
        int p_agregar = 1;  //valor que representa la cantidad de puertas que se agregaran.
        miCoche.num_puertas = agregarpuerta(n_puertas, p_agregar); //aqui modificamos el valor de num_puertas
        System.out.println("El número total de puertas es: ");
        System.out.println(miCoche.num_puertas); //Mostramos la cantidad de puertas total
    }
    public static int agregarpuerta (int n_puertas, int p_agregar){
        return n_puertas + p_agregar;
    }
}
class Coche {
    public int num_puertas;  //variable que representa el numero de puertas
}
