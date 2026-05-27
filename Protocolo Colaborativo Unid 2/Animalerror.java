class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Gato extends Animal {

    // ⚠️ Funciona, pero sin protección
    public void hacerSonido() {
        System.out.println("Miau");
    }
}