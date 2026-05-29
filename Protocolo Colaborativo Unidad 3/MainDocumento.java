public class MainDocumento {
    public static void main(String[] args) {
        GestorDocumentos gestor = new GestorDocumentos();

        gestor.exportarDocumento(new DocumentoPDF());
        gestor.exportarDocumento(new DocumentoWord());
        gestor.exportarDocumento(new DocumentoExcel());
    }
}