package j027_figuraGeometrica;

class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String base, String altura) {
    	double a = Double.parseDouble(base);
    	double b = Double.parseDouble(altura);
    	
        this.base = a;
        this.altura = b;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}