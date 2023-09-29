import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws IOException {

        int numero1=0, numero2=0, opcion;

        //Scanner scanner = new Scanner(System.in);

        BufferedReader ingresa = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce el primer numero: ");
        numero1 = Integer.parseInt(ingresa.readLine());
        System.out.print("Introduce el segundo numero: ");
        numero2 = Integer.parseInt(ingresa.readLine());

        System.out.println("Por favor elige la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        opcion = Integer.parseInt(ingresa.readLine());
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No es posible dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        //scanner.close();
    }
}