/**
 * Clase que sea un Objeto de la vida real con al menos 5 atributos y 5 metodos, cada metodo debe de regresar un tipo de dato
 * de los 5 metodos 3 deben ser solo accesibles desde el mismo paquete y 1 desde la misma clase
 */

public class Escuela {
    // Atributos
    private String nombre;
    private int numEstudiantes;
    protected int numMaestros;
    int numSalones;
    public String ubicacion;

    // Constructor
    public Escuela(String nombre, int numEstudiantes, int numMaestros, int numSalones, String ubicacion) {
        this.nombre = nombre;
        this.numEstudiantes = numEstudiantes;
        this.numMaestros = numMaestros;
        this.numSalones = numSalones;
        this.ubicacion = ubicacion;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    int getNumSalones() {
        return numSalones;
    }

    protected int getNumMaestros() {
        return numMaestros;
    }

    void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Estudiantes: " + numEstudiantes);
        System.out.println("Maestros: " + numMaestros);
        System.out.println("Salones: " + numSalones);
        System.out.println("Ubicación: " + ubicacion);
    }

    // Método accesible solo desde la misma clase
    private void metodoPrivado() {
        System.out.println("Método privado de Escuela");
    }
}
