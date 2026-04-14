
// Ejercicio 1: Clase Estudiante
class Estudiante {
    String nombre;   
    String codigo;
    int semestre;

    void mostrarInfo() {  
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }
}

// Ejercicio 2: Clase Vehiculo
class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Velocidad: " + velocidadActual + " km/h");
    }
}


// ================================================================
// BLOQUE B - Construcción de objetos (Ejercicios 6 y 7)
// ================================================================

class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    void consignar(double valor) {
        saldo += valor;
        System.out.println("  >> Consignación exitosa. Saldo actual: $" + saldo);
    }

    void retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("  >> Retiro exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("  >> Saldo insuficiente para retirar $" + valor);
        }
    }
}


// ================================================================
// BLOQUE D - Clase vs Objeto (Ejercicio 19 y 22)
// ================================================================

class Libro {
    String titulo;
    String autor;
    int paginas;

    // Constructor vacío
    Libro() {}

    // Constructor con parámetros
    Libro(String titulo, String autor, int paginas) {
        this.titulo  = titulo;
        this.autor   = autor;
        this.paginas = paginas;
    }

    // Constructor copia
    Libro(Libro otro) {
        this.titulo  = otro.titulo;
        this.autor   = otro.autor;
        this.paginas = otro.paginas;
    }

    void mostrarInfo() {
        System.out.println("  Libro: \"" + titulo + "\" - " + autor + " (" + paginas + " págs.)");
    }

    // Método fábrica estático (Bloque F)
    static Libro crearLibroBasico(String titulo, String autor) {
        return new Libro(titulo, autor, 0);
    }
}


// ================================================================
// BLOQUE G - Modelado de situaciones (Ejercicios 35 y 37)
// ================================================================

class Lampara {
    String marca;
    boolean encendida;

    void encender() {
        encendida = true;
        System.out.println("  >> Lámpara " + marca + " encendida.");
    }

    void apagar() {
        encendida = false;
        System.out.println("  >> Lámpara " + marca + " apagada.");
    }

    void mostrarEstado() {
        System.out.println("  Lámpara " + marca + " | Estado: " + (encendida ? "ENCENDIDA" : "APAGADA"));
    }
}

class Celular {
    String marca;
    int bateria;
    boolean prendido;

    void encender() {
        if (bateria > 0) { prendido = true;  System.out.println("  >> " + marca + " encendido. Batería: " + bateria + "%"); }
        else             { System.out.println("  >> Sin batería, no puede encenderse."); }
    }

    void apagar() {
        prendido = false;
        System.out.println("  >> " + marca + " apagado.");
    }

    void cargarBateria() {
        bateria = 100;
        System.out.println("  >> Batería cargada al 100%.");
    }

    void mostrarEstado() {
        System.out.println("  " + marca + " | Batería: " + bateria + "% | " + (prendido ? "PRENDIDO" : "APAGADO"));
    }
}


// ================================================================
// BLOQUE J - Mini retos integradores (Ejercicios 51 y 56)
// ================================================================

class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base   = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    void mostrarResultados() {
        System.out.println("  Rectángulo " + base + " x " + altura);
        System.out.println("  Área:       " + calcularArea());
        System.out.println("  Perímetro:  " + calcularPerimetro());
    }
}

class Temperatura {
    double celsius;

    Temperatura(double celsius) {
        this.celsius = celsius;
    }

    double aFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    void mostrarConversion() {
        System.out.println("  " + celsius + " °C = " + aFahrenheit() + " °F");
    }
}


// ================================================================
// MAIN - Punto de entrada del programa
// ================================================================

public class Ejercicios{

    public static void main(String[] args) {

        // --------------------------------------------------------
        // BLOQUE A: definimos clases — aquí solo probamos que existen
        // --------------------------------------------------------
        System.out.println("========================================");
        System.out.println("BLOQUE A - Reconocimiento de clases");
        System.out.println("========================================");
        System.out.println("Las clases Estudiante y Vehiculo están definidas.");
        System.out.println("Son plantillas; en el Bloque B crearemos objetos.");

        // --------------------------------------------------------
        // BLOQUE B: creamos objetos concretos con "new"
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE B - Construcción de objetos");
        System.out.println("========================================");

        // Ejercicio 6: un objeto Estudiante creado y llenado manualmente
        Estudiante est1 = new Estudiante();
        est1.nombre   = "Laura Martínez";
        est1.codigo   = "2024-001";
        est1.semestre = 2;
        est1.mostrarInfo();

        // Ejercicio 7: dos objetos Vehiculo — mismo molde, estados distintos
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Mazda"; v1.modelo = "CX-5"; v1.velocidadActual = 80;

        Vehiculo v2 = new Vehiculo();
        v2.marca = "Yamaha"; v2.modelo = "MT-07"; v2.velocidadActual = 40;

        v1.mostrarEstado();
        v2.mostrarEstado();

        // --------------------------------------------------------
        // BLOQUE C: métodos que modifican el estado del objeto
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE C - Métodos sencillos");
        System.out.println("========================================");

        // Ejercicio 13-14: CuentaBancaria con consignar y retirar
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numero = "101-555"; cuenta.titular = "Ana Torres"; cuenta.saldo = 100000;
        cuenta.mostrarCuenta();
        cuenta.consignar(50000);
        cuenta.retirar(30000);
        cuenta.retirar(200000); // falla: saldo insuficiente

        // --------------------------------------------------------
        // BLOQUE D: clase vs objeto — misma plantilla, datos distintos
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE D - Clase vs Objeto");
        System.out.println("========================================");

        // Ejercicio 19: comentario conceptual + demostración
        // "Estudiante" es la CLASE (plantilla).
        // "est1", "est2", "est3" son OBJETOS (instancias concretas).
        Estudiante est2 = new Estudiante();
        est2.nombre = "Luis Pérez"; est2.codigo = "2024-002"; est2.semestre = 3;

        Estudiante est3 = new Estudiante();
        est3.nombre = "Marta Ruiz"; est3.codigo = "2024-003"; est3.semestre = 1;

        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();
        System.out.println("  >> Los tres son instancias de la misma clase Estudiante.");

        // Ejercicio 22: cuatro Libros — misma clase, cuatro objetos distintos
        Libro lb1 = new Libro("Cien años de soledad", "García Márquez", 496);
        Libro lb2 = new Libro("El Principito",         "Saint-Exupéry",  96);
        Libro lb3 = new Libro("Don Quijote",            "Cervantes",     1023);
        Libro lb4 = new Libro("Clean Code",             "Robert Martin",  464);
        lb1.mostrarInfo(); lb2.mostrarInfo(); lb3.mostrarInfo(); lb4.mostrarInfo();

        // --------------------------------------------------------
        // BLOQUE E: constructores
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE E - Constructores");
        System.out.println("========================================");

        // Ejercicio 23-24: constructor vacío vs constructor con parámetros
        Libro libroVacio = new Libro();          // constructor vacío
        libroVacio.titulo = "Aún sin título";
        libroVacio.autor  = "Desconocido";
        libroVacio.paginas = 0;
        libroVacio.mostrarInfo();

        Libro libroCompleto = new Libro("Rayuela", "Julio Cortázar", 600); // con parámetros
        libroCompleto.mostrarInfo();

        // --------------------------------------------------------
        // BLOQUE F: formas avanzadas de construir objetos
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE F - Varias formas de construir objetos");
        System.out.println("========================================");

        // Ejercicio 31-32: método fábrica estático
        Libro fabrica1 = Libro.crearLibroBasico("Fundamentos Java", "Deitel");
        Libro fabrica2 = Libro.crearLibroBasico("POO con Java",     "Eckel");
        fabrica1.mostrarInfo();
        fabrica2.mostrarInfo();

        // Ejercicio 33-34: constructor copia
        Libro original = new Libro("Crónica de una muerte anunciada", "García Márquez", 120);
        Libro copia    = new Libro(original); // copia exacta del original
        System.out.println("  Original:"); original.mostrarInfo();
        System.out.println("  Copia:   "); copia.mostrarInfo();

        // --------------------------------------------------------
        // BLOQUE G: modelado de entidades del mundo real
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE G - Modelado básico de situaciones");
        System.out.println("========================================");

        // Ejercicio 35: Lámpara
        Lampara lamp = new Lampara();
        lamp.marca = "Philips";
        lamp.mostrarEstado();
        lamp.encender();
        lamp.mostrarEstado();
        lamp.apagar();
        lamp.mostrarEstado();

        // Ejercicio 37: Celular
        Celular cel = new Celular();
        cel.marca = "Samsung"; cel.bateria = 0; cel.prendido = false;
        cel.encender();       // no puede, sin batería
        cel.cargarBateria();
        cel.encender();
        cel.mostrarEstado();
        cel.apagar();

        // --------------------------------------------------------
        // BLOQUE H: ejercicios argumentativos (con comentarios)
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE H - Argumentación POO vs procedural");
        System.out.println("========================================");

        // Ejercicio 41: Clase Empleado — mejor con POO que con variables sueltas
        // Con variables sueltas tendríamos: String nombreEmp1, String cargoEmp1...
        // Con clase Empleado agrupamos todo y podemos crear muchos empleados fácil.
        System.out.println("  Con POO, cada empleado es un objeto autocontenido.");
        System.out.println("  Con programación procedural, tendríamos variables dispersas y difíciles de escalar.");

        // --------------------------------------------------------
        // BLOQUE I: corrección de errores comunes
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE I - Corrección de errores");
        System.out.println("========================================");

        // Ejercicio 50: Error común — crear la clase pero nunca el objeto
        // INCORRECTO (comentado para que compile):
        //   Libro miLibro;           // solo se declara, no se crea
        //   miLibro.mostrarInfo();   // NullPointerException!
        //
        // CORRECTO:
        Libro miLibro = new Libro("Java para principiantes", "Schildt", 800);
        miLibro.mostrarInfo();
        System.out.println("  >> Siempre usar 'new' antes de usar el objeto.");

        // --------------------------------------------------------
        // BLOQUE J: mini retos integradores
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE J - Mini retos integradores");
        System.out.println("========================================");

        // Ejercicio 51: Rectangulo con área y perímetro
        Rectangulo rect = new Rectangulo(5.0, 3.0);
        rect.mostrarResultados();

        // Ejercicio 56: Temperatura Celsius a Fahrenheit
        Temperatura temp1 = new Temperatura(100);
        Temperatura temp2 = new Temperatura(0);
        Temperatura temp3 = new Temperatura(37);
        temp1.mostrarConversion();
        temp2.mostrarConversion();
        temp3.mostrarConversion();

        // --------------------------------------------------------
        // BLOQUE K: diseño antes del código
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE K - Diseño antes del código");
        System.out.println("========================================");
        System.out.println("  Clase Docente:");
        System.out.println("    Atributos: nombre, asignatura, añosExperiencia");
        System.out.println("    Métodos:   dictar(), mostrarPerfil()");
        System.out.println("    Objetos posibles: profe1 (Juan, POO, 5 años), profe2 (Ana, Cálculo, 8 años)");

        System.out.println("\n  Clase Hospital:");
        System.out.println("    Atributos: nombre, ciudad, capacidadCamas");
        System.out.println("    Métodos:   admitirPaciente(), mostrarInfo()");
        System.out.println("    Objetos posibles: hospital1 (Bocagrande, Cartagena, 200 camas)");

        // --------------------------------------------------------
        // BLOQUE L: consolidación final
        // --------------------------------------------------------
        System.out.println("\n========================================");
        System.out.println("BLOQUE L - Consolidación final");
        System.out.println("========================================");

        // Ejercicio 66: clase libre — contexto académico
        System.out.println("  Clase libre (contexto académico): AsignaturaUniversitaria");
        System.out.println("  Atributos: nombre, creditos, profesor, aprobada");
        System.out.println("  Métodos:   inscribir(), registrarNota(), mostrarEstado()");

        // Ejercicio 74: conclusión sobre formas de construcción
        System.out.println("\n  CONCLUSIÓN sobre formas de construcción de objetos:");
        System.out.println("  1. new + asignación manual: más clara para principiantes, se ve el proceso paso a paso.");
        System.out.println("  2. Constructor con parámetros: más seguro, el objeto nace coherente.");
        System.out.println("  3. Método fábrica: más expresivo, da nombre al tipo de creación.");
        System.out.println("  4. Constructor copia: útil para duplicar objetos existentes.");
        System.out.println("  Para aprender: la forma 1 o 2 son las más recomendadas al inicio.");

        System.out.println("\n========================================");
        System.out.println("FIN DEL TALLER 0 - POO");
        System.out.println("========================================");
    }
}