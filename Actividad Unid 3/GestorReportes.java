public class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void producirReporte(String datos) {
        System.out.println("Iniciando generacion de reporte...");
        generador.generarReporte(datos);
        System.out.println("Reporte generado exitosamente.");
    }
}