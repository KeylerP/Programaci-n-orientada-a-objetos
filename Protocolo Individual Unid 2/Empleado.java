public class Empleado {
    public String nombre;          // accesible directamente
    private double salario;        // protegido

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {        // validación
            this.salario = salario;
        }
    }
}

