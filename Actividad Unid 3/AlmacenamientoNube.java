// Guarda y recupera archivos en la nube (S3, Drive, etc.)
public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("[Nube] Subiendo '" + nombreArchivo + "': " + contenido);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        System.out.println("[Nube] Descargando: " + nombreArchivo);
        return "Contenido en nube de " + nombreArchivo;
    }
}