public class MainLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Mil años de soledad", "Gabriel Garcia Marquéz");

        LibroReporteService reporte = new LibroReporteService();
        reporte.generarReporte(libro);

        LibroPersistenciaService persistencia = new LibroPersistenciaService();
        persistencia.guardar(libro);
    }
}