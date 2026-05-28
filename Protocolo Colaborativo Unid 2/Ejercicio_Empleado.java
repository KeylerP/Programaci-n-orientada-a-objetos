// ---------- CLASE PADRE ----------
class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// ---------- CLASE HIJA ----------
class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

// ---------- CLASE PRINCIPAL (ÚNICA PUBLIC) ----------
public class Ejercicio_Empleado {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana", 30, "Sistemas");
        emp.mostrarDetalles();
    }
}