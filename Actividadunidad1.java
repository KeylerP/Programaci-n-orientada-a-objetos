// ============================================================
//  TALLER 5 – MODIFICADOR DE ACCESO default (paquete)
// ============================================================

// ── Ejercicio 1: Clase ProductoDefault ──────────────────────
// Todos los miembros son de paquete (sin modificador explícito)
class ProductoDefault {
    String nombre;   // acceso default
    double precio;   // acceso default
    int    stock;    // acceso default

    // Constructor de paquete (default)
    ProductoDefault(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock  = stock;
    }

    // Método de paquete
    void mostrarInfo() {
        System.out.println("Producto -> Nombre: " + nombre
                + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}

// ── Ejercicio 3: Comparación private vs default ──────────────
// nombre es private (solo accesible dentro de la clase)
// edad   es default (accesible desde cualquier clase del mismo paquete)
class PersonaComparacion {
    private String nombre;   // solo accesible dentro de esta clase
    int edad;                // acceso default – visible en todo el paquete

    PersonaComparacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }

    // Getter obligatorio para nombre porque es private
    public String getNombre() { return nombre; }
    public void   setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) this.nombre = nombre;
    }

    void mostrarDetalles() {
        System.out.println("PersonaComparacion -> Nombre: " + nombre + " | Edad: " + edad);
    }
}

// ── Demostración de error de compilación con default ─────────
// Si ProductoDefault estuviera en paqueteA y el siguiente código
// en paqueteB, daría error de compilación:
//
// package paqueteB;
// import paqueteA.ProductoDefault;   // ERROR: ProductoDefault no es visible
// public class Main {
//     public static void main(String[] args) {
//         ProductoDefault p = new ProductoDefault("Laptop", 2500, 10);
//         // ERROR: ProductoDefault is not public in paqueteA;
//         //        cannot be accessed from outside package
//     }
// }
//
// RAZÓN: La clase y su constructor no tienen public, por lo que
// su visibilidad queda restringida al paquete donde se declaran.

// ── Demostración de mala práctica sin error de compilación ───
// Exponer atributos default sin getters/setters permite modificarlos
// sin ningún control desde cualquier clase del mismo paquete:
//
// ProductoDefault p = new ProductoDefault("Camisa", 50.0, 100);
// p.precio = -999.0;  // COMPILA pero es una pésima práctica:
//                     // el precio queda en un estado incoherente


// ============================================================
//  TALLER 6 – MODIFICADOR DE ACCESO protected
// ============================================================

// ── Ejercicio 1: Empleado (clase base) y Gerente (subclase) ──

class Empleado {
    protected String nombre;    // accesible desde subclases y mismo paquete
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre  = nombre;
        this.salario = salario;
    }

    // Método protegido – las subclases pueden sobreescribirlo
    protected void mostrarInformacion() {
        System.out.println("Empleado -> Nombre: " + nombre
                + " | Salario: $" + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);          // llama al constructor de Empleado
        this.departamento = departamento;
    }

    // Sobreescritura del método protegido
    @Override
    protected void mostrarInformacion() {
        // Accede directamente a los atributos protected de la clase padre
        System.out.println("Gerente -> Nombre: " + nombre
                + " | Salario: $" + salario
                + " | Departamento: " + departamento);
    }
}

// ── Ejercicio 2: Vehiculo (base) y Moto (subclase) ───────────

class VehiculoProtected {
    protected String tipo;
    protected String marca;

    public VehiculoProtected(String tipo, String marca) {
        this.tipo  = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Vehículo -> Tipo: " + tipo + " | Marca: " + marca);
    }
}

class Moto extends VehiculoProtected {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }

    @Override
    protected void mostrarDetalles() {
        System.out.println("Moto -> Marca: " + marca
                + " | Cilindrada: " + cilindrada + " cc");
    }
}

// ── Ejercicio 3: Banco con saldo protected → análisis y corrección ──

// VERSIÓN INSEGURA (mala práctica – compila pero no es segura):
class BancoInseguro {
    protected double saldo; // MAL: cualquier subclase puede modificarlo sin control

    public BancoInseguro(double saldo) {
        this.saldo = saldo;
    }
    // Análisis: una subclase maliciosa podría hacer this.saldo = 999999
    // sin ninguna validación, comprometiendo la integridad del sistema.
}

// VERSIÓN CORREGIDA (encapsulamiento adecuado):
class BancoSeguro {
    private double saldo;  // private: solo accesible dentro de esta clase

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) this.saldo = saldoInicial;
        else { System.out.println("Saldo inicial inválido. Se asigna 0."); this.saldo = 0; }
    }

    public double getSaldo() { return saldo; }

    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
        else System.out.println("El monto debe ser positivo.");
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) saldo -= monto;
        else System.out.println("Retiro inválido. Monto: " + monto + " | Saldo: " + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("BancoSeguro -> Saldo: $" + saldo);
    }
}

// ── Demostración de error de compilación con protected ───────
// Si Persona estuviera en paquete1 y Main en paquete2 SIN heredar:
//
// package paquete2;
// import paquete1.Persona;
// public class Main {
//     public static void main(String[] args) {
//         Persona p = new Persona("Juan");
//         System.out.println(p.nombre); // ERROR: nombre has protected access
//     }
// }
//
// RAZÓN: protected solo es accesible desde subclases o mismo paquete.
// Una clase no relacionada en otro paquete NO puede acceder.

// ── Animal y Perro: sobreescritura de método protected ───────

class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    protected void emitirSonido() {
        System.out.println("El animal (" + especie + ") hace un sonido genérico.");
    }
}

class Perro extends Animal {
    public Perro() {
        super("Canis lupus familiaris");
    }

    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato() {
        super("Felis catus");
    }

    @Override
    protected void emitirSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}


// ============================================================
//  CLASE PRINCIPAL – main
// ============================================================

public class Actividadunidad1 {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  TALLERES 5 Y 6 – UNIDAD 2 – POO");
        System.out.println("  Universidad de Cartagena");
        System.out.println("==============================================\n");

        // ── TALLER 5: MODIFICADOR default ──────────────────────────
        System.out.println("--- TALLER 5: MODIFICADOR default (paquete) ---\n");

        // Ejercicio 1 – ProductoDefault
        ProductoDefault p1 = new ProductoDefault("Laptop",  2500000.0, 15);
        ProductoDefault p2 = new ProductoDefault("Teclado",   80000.0, 50);
        p1.mostrarInfo();
        p2.mostrarInfo();

        // Acceso directo a atributos default (mismo paquete – compila)
        System.out.println("Acceso directo a p1.nombre (default): " + p1.nombre);
        // Mala práctica: modificar sin validación
        p1.precio = -999.0;
        System.out.println("Tras asignar precio=-999 (sin validación): $" + p1.precio);
        p1.precio = 2500000.0; // restaurar

        // Ejercicio 3 – Comparación private vs default
        PersonaComparacion pc = new PersonaComparacion("Laura Gómez", 25);
        pc.mostrarDetalles();
        // pc.nombre → ERROR si estuviera en otro paquete; aquí compila porque estamos en el mismo
        System.out.println("Acceso a edad (default): " + pc.edad);
        System.out.println("Acceso a nombre (private, vía getter): " + pc.getNombre());
        // No es posible: pc.nombre directamente desde otro paquete
        // Diferencia clave: nombre requiere getter siempre; edad es accesible directamente en el paquete

        // ── TALLER 6: MODIFICADOR protected ────────────────────────
        System.out.println("\n--- TALLER 6: MODIFICADOR protected ---\n");

        // Ejercicio 1 – Empleado y Gerente
        Empleado emp = new Empleado("Carlos Ruiz", 3500000.0);
        Gerente  ger = new Gerente("Ana Torres", 6000000.0, "Tecnología");
        emp.mostrarInformacion();
        ger.mostrarInformacion();

        // Ejercicio 2 – VehiculoProtected y Moto
        VehiculoProtected v  = new VehiculoProtected("Carro", "Renault");
        Moto              m  = new Moto("Honda", 250);
        v.mostrarDetalles();
        m.mostrarDetalles();

        // Ejercicio 3 – BancoInseguro vs BancoSeguro
        System.out.println("\n[BancoInseguro – mala práctica]");
        BancoInseguro bi = new BancoInseguro(1000.0);
        bi.saldo = -9999.0; // posible porque es protected y estamos en el mismo paquete
        System.out.println("Saldo tras modificación directa: $" + bi.saldo + " ← estado incoherente");

        System.out.println("\n[BancoSeguro – buena práctica]");
        BancoSeguro bs = new BancoSeguro(1000.0);
        bs.mostrarSaldo();
        bs.depositar(500.0);
        bs.mostrarSaldo();
        bs.retirar(200.0);
        bs.mostrarSaldo();
        bs.retirar(99999.0); // intento inválido
        bs.mostrarSaldo();

        // Sobreescritura de método protected – Animal / Perro / Gato
        System.out.println();
        Animal[] animales = { new Animal("Desconocido"), new Perro(), new Gato() };
        for (Animal a : animales) {
            a.emitirSonido(); // polimorfismo con método protected
        }
    }
}