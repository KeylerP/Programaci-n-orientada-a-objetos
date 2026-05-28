public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante de " + carrera + ".");
    }
}