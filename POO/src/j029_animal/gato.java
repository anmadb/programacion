package j029_animal;

class gato extends animal {

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }

    @Override
    public void moverse() {
        System.out.println("El gato camina.");
    }
}
