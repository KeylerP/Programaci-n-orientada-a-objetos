public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " | Salario: $" + calcularSalario());
    }
}