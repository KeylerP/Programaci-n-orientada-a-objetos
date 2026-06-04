public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void leerArchivo(String nombre) {
        String contenido = almacenamiento.recuperar(nombre);
        System.out.println("Contenido obtenido: " + contenido);
    }
}