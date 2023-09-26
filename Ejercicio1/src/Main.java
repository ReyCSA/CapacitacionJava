/**
 * Crear una clase que tenga un metodo main
 * y crear un objeto de cada clase y llamar a los metodos de cada clase donde se impriman los valores
 */
public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela("Escuelas", 30, 7, 5, "México");
        Primaria primaria = new Primaria("Primaria Patito", 20, 2, 2, "Ciudad de México");
        Secundaria secundaria = new Secundaria("Secundaria Pato", 10, 5, 3, "Estado de México");

        // Llamando a métodos imprimir información
        escuela.imprimirInformacion();
        secundaria.imprimirInformacion();
        primaria.imprimirInformacion();
    }
}