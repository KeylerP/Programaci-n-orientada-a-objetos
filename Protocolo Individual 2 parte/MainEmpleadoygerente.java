public class MainEmpleadoygerente {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana", 2500);
        emp.mostrarDetalles();

        System.out.println("---");

        Gerente ger = new Gerente("Luis", 5000, "Tecnología");
        ger.mostrarDetalles();
    }
}