public class LibroReporteService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo()
            + " - Autor: " + libro.getAutor());
    }
}