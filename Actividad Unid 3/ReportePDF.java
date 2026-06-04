// Genera el reporte en formato PDF
public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("[PDF] Generando reporte con datos: " + datos);
    }
}