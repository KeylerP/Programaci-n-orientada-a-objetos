// ============================================================
//  TALLER 1 - CONSTRUCTORES
// ============================================================

// Ejercicio 1: Clase Libro con constructores
class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo       = "Sin título";
        this.autor        = "Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo        = titulo;
        this.autor         = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Libro -> Título: " + titulo
                + " | Autor: " + autor
                + " | Páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor
                + "', páginas=" + numeroPaginas + "}";
    }
}

// Ejercicio 2: Clase CuentaBancaria con sobrecarga de constructores
class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000-000";
        this.saldo        = 0.0;
        this.tipoCuenta   = "Ahorro";
    }

    // Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta   = tipoCuenta;
        this.saldo        = 0.0;
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo        = saldo;
        this.tipoCuenta   = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{número='" + numeroCuenta
                + "', tipo='" + tipoCuenta
                + "', saldo=$" + saldo + "}";
    }
}

// Ejercicio 3: Clase Estudiante con this() entre constructores
class Estudiante {
    String nombre;
    int    edad;
    String curso;

    // Constructor por defecto
    public Estudiante() {
        this("Sin nombre", 0, "Sin curso"); // llama al constructor completo
    }

    // Constructor con nombre y edad (usa this() para delegar el curso)
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin curso");
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad   = edad;
        this.curso  = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Estudiante -> Nombre: " + nombre
                + " | Edad: " + edad
                + " | Curso: " + curso);
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad
                + ", curso='" + curso + "'}";
    }
}

// ============================================================
//  TALLER 2 - USO DE this
// ============================================================

// Ejercicio 1: Clase Producto - diferenciación atributos/parámetros
class Producto {
    private String nombre;
    private double precio;

    // this diferencia el atributo del parámetro
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return this.nombre; }
    public double getPrecio() { return this.precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }

    public void mostrarProducto() {
        System.out.println("Producto -> Nombre: " + this.nombre
                + " | Precio: $" + this.precio);
    }
}

// Ejercicio 2: Clase EstudiantePOO - this() entre constructores
class EstudiantePOO {
    private String nombre;
    private int    edad;

    // Constructor por defecto que delega en el parametrizado
    public EstudiantePOO() {
        this("Anónimo", 0); // this() siempre debe ser la primera instrucción
    }

    public EstudiantePOO(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }

    public void mostrarDetalles() {
        System.out.println("EstudiantePOO -> Nombre: " + this.nombre
                + " | Edad: " + this.edad);
    }
}

// Ejercicio 3: Demostración de error con this en contexto estático
// El siguiente código NO compila si se descomenta:
/*
class PersonaError {
    private String nombre;
    public static void mostrarNombre() {
        System.out.println(this.nombre); // ERROR: cannot use 'this' in a static context
    }
}
*/
// Versión corregida:
class PersonaCorregida {
    private String nombre;

    public PersonaCorregida(String nombre) {
        this.nombre = nombre;
    }

    // Corrección: método de instancia (sin static)
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}

// ============================================================
//  TALLER 3 - MODIFICADOR static
// ============================================================

// Ejercicio 1: Clase Coche con contador de instancias
class Coche {
    private String marca;
    private String modelo;

    // Atributo estático compartido por todas las instancias
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca  = marca;
        this.modelo = modelo;
        contadorCoches++; // se incrementa cada vez que nace un objeto
    }

    // Método estático: no necesita objeto para ser llamado
    public static void mostrarContador() {
        System.out.println("Coches creados hasta ahora: " + contadorCoches);
    }

    public String getMarca()  { return marca; }
    public String getModelo() { return modelo; }

    @Override
    public String toString() {
        return "Coche{marca='" + marca + "', modelo='" + modelo + "'}";
    }
}

// Ejercicio 2: Clase Matematicas con métodos estáticos
class Matematicas {
    // Métodos de utilidad: no dependen de ningún atributo de instancia
    public static double sumar(double a, double b)        { return a + b; }
    public static double restar(double a, double b)       { return a - b; }
    public static double multiplicar(double a, double b)  { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: división por cero.");
            return 0;
        }
        return a / b;
    }
}

// Ejercicio 3 (incorrecto con error de compilación) - DEMOSTRACIÓN
// Este código fallaría si se descomentara porque nombre NO es static:
/*
class PersonaEstatica {
    private String nombre;
    public static void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // ERROR de compilación
    }
}
*/

// ============================================================
//  TALLER 4 - MODIFICADOR private
// ============================================================

// Ejercicio 1: Clase EstudiantePrivate con encapsulamiento completo
class EstudiantePrivate {
    private String nombre;
    private int    edad;
    private double notaPromedio;

    public EstudiantePrivate(String nombre, int edad, double notaPromedio) {
        this.nombre       = nombre;
        setEdad(edad);               // usa setter con validación
        setNotaPromedio(notaPromedio);
    }

    // Getters
    public String getNombre()       { return nombre; }
    public int    getEdad()         { return edad; }
    public double getNotaPromedio() { return notaPromedio; }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Advertencia: nombre inválido, no se actualizó.");
        }
    }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Advertencia: edad inválida (" + edad + ").");
            this.edad = 0;
        }
    }
    public void setNotaPromedio(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaPromedio = nota;
        } else {
            System.out.println("Advertencia: nota inválida (" + nota + ").");
            this.notaPromedio = 0.0;
        }
    }

    public void mostrarDetalles() {
        System.out.println("EstudiantePrivate -> Nombre: " + nombre
                + " | Edad: " + edad
                + " | Nota promedio: " + notaPromedio);
    }
}

// Ejercicio 2: Clase CochePrivate con velocidad encapsulada
class CochePrivate {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public CochePrivate(String marca, String modelo, double velocidadMaxima) {
        this.marca           = marca;
        this.modelo          = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca()            { return marca; }
    public String getModelo()           { return modelo; }
    public double getVelocidadMaxima()  { return velocidadMaxima; }

    // Solo se puede acelerar con valor positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Acelerando " + incremento
                    + " km/h. Nueva velocidad máx: " + velocidadMaxima);
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("CochePrivate -> " + marca + " " + modelo
                + " | Vel. máx: " + velocidadMaxima + " km/h");
    }
}

// Ejercicio 3 (incorrecto - genera error de compilación) - DEMOSTRACIÓN
// class Main accediendo a atributo private directamente:
/*
class PersonaPrivadaError {
    private String nombre;
    public PersonaPrivadaError(String nombre) { this.nombre = nombre; }
}
class TestError {
    public static void main(String[] args) {
        PersonaPrivadaError p = new PersonaPrivadaError("Juan");
        System.out.println(p.nombre); // ERROR: nombre tiene acceso privado
    }
}
*/

// ============================================================
//  CLASE PRINCIPAL - main
// ============================================================

public class TalleresUnidad2_POO {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  TALLERES UNIDAD 2 - POO");
        System.out.println("  Universidad de Cartagena");
        System.out.println("==============================================\n");

        // --------------------------------------------------
        // TALLER 1: CONSTRUCTORES
        // --------------------------------------------------
        System.out.println("--- TALLER 1: CONSTRUCTORES ---\n");

        // Ejercicio 1 - Libro
        Libro libro1 = new Libro();                               // constructor por defecto
        Libro libro2 = new Libro("El Quijote", "Cervantes", 863); // constructor parametrizado
        libro1.mostrarDetalles();
        libro2.mostrarDetalles();

        // Ejercicio 2 - CuentaBancaria
        CuentaBancaria cb1 = new CuentaBancaria();
        CuentaBancaria cb2 = new CuentaBancaria("001-100", "Corriente");
        CuentaBancaria cb3 = new CuentaBancaria("002-200", 5000.0, "Ahorro");
        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println(cb3);

        // Ejercicio 3 - Estudiante con this()
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Ana López", 20);
        Estudiante est3 = new Estudiante("Carlos Ruiz", 22, "POO");
        est1.mostrarDetalles();
        est2.mostrarDetalles();
        est3.mostrarDetalles();

        // --------------------------------------------------
        // TALLER 2: USO DE this
        // --------------------------------------------------
        System.out.println("\n--- TALLER 2: USO DE this ---\n");

        // Ejercicio 1 - Producto
        Producto prod = new Producto("Laptop", 2500000.0);
        prod.mostrarProducto();
        prod.setNombre("Laptop Pro");
        prod.setPrecio(3200000.0);
        prod.mostrarProducto();

        // Ejercicio 2 - EstudiantePOO con this()
        EstudiantePOO epoo1 = new EstudiantePOO();
        EstudiantePOO epoo2 = new EstudiantePOO("María Torres", 21);
        epoo1.mostrarDetalles();
        epoo2.mostrarDetalles();

        // Ejercicio 3 - PersonaCorregida (sin static, correcto)
        PersonaCorregida pc = new PersonaCorregida("Luis Martínez");
        pc.mostrarNombre();

        // --------------------------------------------------
        // TALLER 3: MODIFICADOR static
        // --------------------------------------------------
        System.out.println("\n--- TALLER 3: MODIFICADOR static ---\n");

        // Ejercicio 1 - Contador de instancias Coche
        Coche.mostrarContador(); // 0 aún
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Chevrolet", "Spark");
        Coche c3 = new Coche("Renault", "Logan");
        Coche.mostrarContador(); // debe mostrar 3
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Ejercicio 2 - Métodos static de Matematicas
        double a = 10, b = 4;
        System.out.println("Suma:           " + Matematicas.sumar(a, b));
        System.out.println("Resta:          " + Matematicas.restar(a, b));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(a, b));
        System.out.println("División:       " + Matematicas.dividir(a, b));
        System.out.println("División /0:    " + Matematicas.dividir(a, 0));

        // --------------------------------------------------
        // TALLER 4: MODIFICADOR private
        // --------------------------------------------------
        System.out.println("\n--- TALLER 4: MODIFICADOR private ---\n");

        // Ejercicio 1 - EstudiantePrivate con validaciones
        EstudiantePrivate ep1 = new EstudiantePrivate("Sofía Gómez", 19, 4.2);
        ep1.mostrarDetalles();
        ep1.setEdad(-5);       // advertencia: valor inválido
        ep1.setNotaPromedio(6.0); // advertencia: fuera de rango 0-5
        ep1.mostrarDetalles(); // sigue mostrando el valor anterior válido

        // Ejercicio 2 - CochePrivate con acelerar()
        CochePrivate cp = new CochePrivate("Ford", "Mustang", 200.0);
        cp.mostrarInfo();
        cp.acelerar(30);
        cp.acelerar(-10); // valor inválido: advertencia
        cp.mostrarInfo();


    }
}