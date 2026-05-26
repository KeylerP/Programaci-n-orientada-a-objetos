class Mainempleado {
    public static void main(String[] args) {
        Empleado e = new Empleado("Ana",2500);
        System.out.println(e.nombre);       // acceso directo (public)
        System.out.println(e.getSalario()); // acceso por método (private)
        e.setSalario(-100);                 // ignorado por la validación
    }
}