// Genera el reporte en formato Excel
public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("[Excel] Generando reporte con datos: " + datos);
    }
}