public class Main {
    public static void main(String[] args) {
        // If
        System.out.println("PRIMER PUNTO DEL ENUNCIADO: ");
        int numeroIf = -4; // dependiendo del numero colocado aqui se mostraran los valores
        if (numeroIf > 0 ) {
            System.out.println("El numero es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es negativo");
        }

        // bucle While
        System.out.println("SEGUNDO PUNTO DEL ENUNCIADO: ");
        int numeroWhile = 0; // si se colocara el numero 3 aqui, entonces este bucle no se ejecutaria
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        // bucle Do While
        System.out.println("TERCER PUNTO DEL ENUNCIADO: ");
        int numeroDoWhile = 3; // se ejecutara una sola vez, para cualquier numero mayor a 3.
        do {
            System.out.println(numeroDoWhile);
            numeroWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);

        // bucle For
        System.out.println("CUARTO PUNTO DEL ENUNCIADO: ");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        // Switch case
        System.out.println("QUINTO PUNTO DEL ENUNCIADO: ");
        var estacion = "PRIMAVERAOTO";
        switch (estacion) {
            case "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("PRIMAVERA");
                break;
            default:
                System.out.println("Ingresa una estacion correcta");
        }
    }
}
