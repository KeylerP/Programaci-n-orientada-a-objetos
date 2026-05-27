// ---------- CLASE PADRE ----------
class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

// ---------- CLASE HIJA ----------
class Pez extends Animal {

    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // inicializa el atributo del padre
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // reutiliza lo del padre
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

// ---------- CLASE PRINCIPAL ----------
 class Ejercicio_Animal_Pez {

    public static void main(String[] args) {

        Pez pez = new Pez("Salmon", "Dulce");

        pez.mostrarEspecie();
    }
}