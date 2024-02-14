package j029_animal;

class perro extends animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre.");
    }
}
