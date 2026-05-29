public class Main1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Estudiante("Ingeniería");
        Persona p3 = new Profesor("Matemáticas");

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}