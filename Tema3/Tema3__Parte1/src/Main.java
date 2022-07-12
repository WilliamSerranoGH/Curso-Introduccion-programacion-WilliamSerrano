import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int n2 = leer.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int n3 = leer.nextInt();
        var resultado = suma(n1, n2, n3);
        System.out.println("El resultado de la suma es");
        System.out.println(resultado);
    }
    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}
