public class Main3{
    public static void main(String[] args) {
        // Error de compilación demostrado con casting
        Animal a = new Perro();
        // a.correr(); // ❌ Error de compilación
        ((Perro) a).correr(); // ✅ Solución con casting

        // Mala práctica
        Vehiculo v = new Moto();
        v.mover(); // Llama a super.mover() sin agregar nada
    }
}