// Guarda y recupera archivos en el disco local
public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("[Local] Guardando '" + nombreArchivo + "': " + contenido);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        System.out.println("[Local] Recuperando: " + nombreArchivo);
        return "Contenido local de " + nombreArchivo;
    }
}