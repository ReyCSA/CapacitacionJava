/**
 * heredar de la clase anterior y sobreescribir los metodos para que cumplan la funcionalidad adecuada
 */
public class Primaria extends Escuela{

    public Primaria(String nombre, int numEstudiantes, int numMaestros, int numSalones, String ubicacion) {
        super(nombre, numEstudiantes, numMaestros, numSalones, ubicacion);
    }

    // Sobrescribe un método de la clase base
    @Override
    void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Educación: Primaria");
    }
}
