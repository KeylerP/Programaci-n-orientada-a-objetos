class Vehiculo {
    public void acelerar(int velocidad) {
        System.out.println("Acelerando a " + velocidad);
    }
}

class Coche extends Vehiculo {

    // ❌ No es override, es otro método distinto
    // @Override  ← si lo pones, el compilador marca error
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}