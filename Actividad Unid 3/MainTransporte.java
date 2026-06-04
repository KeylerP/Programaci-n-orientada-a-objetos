public class MainTransporte {
    public static void main(String[] args) {
        // LSP: todas sustituyen a Transporte sin romper nada
        Transporte t1 = new Transporte();
        Transporte t2 = new Bicicleta();
        Transporte t3 = new Coche();

        t1.mover();
        t2.mover();
        t3.mover();
    }
}