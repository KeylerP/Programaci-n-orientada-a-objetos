// ---------- CLASE PADRE ----------
class Persona {
    public void presentarse() {
        System.out.println("Soy una persona.");
    }
}

// ---------- CLASE HIJA 1 ----------
class Estudiante extends Persona {

    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante de Ingeniería.");
    }
}

// ---------- CLASE HIJA 2 ----------
class Profesor extends Persona {

    @Override
    public void presentarse() {
        System.out.println("Soy un profesor de Matemáticas.");
    }
}

// ---------- CLASE PRINCIPAL ----------
public class Ejercicio_Polimorfismo {

    public static void main(String[] args) {

        // Polimorfismo: misma referencia, distintos objetos
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}