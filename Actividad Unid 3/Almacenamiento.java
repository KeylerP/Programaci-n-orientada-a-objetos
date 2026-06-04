public interface Almacenamiento {
    void guardar(String nombreArchivo, String contenido);
    String recuperar(String nombreArchivo);
}