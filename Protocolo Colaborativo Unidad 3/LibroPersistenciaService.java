public class LibroPersistenciaService {
    public void guardar(Libro libro) {
        System.out.println("Guardando libro: " + libro.getTitulo()
            + " en la base de datos...");
    }
}