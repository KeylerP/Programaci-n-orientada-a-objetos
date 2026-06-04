public class MainReportes {
    public static void main(String[] args) {

        String datos = "Ventas Q1: $500,000";

        System.out.println("=== Reporte en PDF ===");
        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.producirReporte(datos);

        System.out.println();

        System.out.println("=== Reporte en Excel ===");
        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.producirReporte(datos);

        // GestorReportes nunca se modificó — solo cambiamos el generador inyectado
    }
}