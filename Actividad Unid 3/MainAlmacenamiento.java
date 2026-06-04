public class MainAlmacenamiento {
    public static void main(String[] args) {

        System.out.println("=== Almacenamiento Local ===");
        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.guardarArchivo("reporte.txt", "Datos del reporte");
        gestorLocal.leerArchivo("reporte.txt");

        System.out.println();

        System.out.println("=== Almacenamiento en Nube ===");
        GestorArchivos gestorNube = new GestorArchivos(new AlmacenamientoNube());
        gestorNube.guardarArchivo("reporte.txt", "Datos del reporte");
        gestorNube.leerArchivo("reporte.txt");
        // GestorArchivos no cambió nada — solo cambiamos la implementación inyectada
    }
}