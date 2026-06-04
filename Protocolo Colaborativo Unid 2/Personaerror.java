class PersonaError {

    public void saludar() {
        System.out.println("Hola");
    }
}

class PruebaError {

    public void metodo() {
        super.saludar(); // ❌ ERROR
    }
}