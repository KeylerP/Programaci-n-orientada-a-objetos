public class MainMantenimiento {
    public static void main(String[] args) {
        Reparador tecnico  = new TecnicoReparador();
        Limpiador personal = new PersonalLimpieza();

        tecnico.reparar();
        personal.limpiar();
    }
}