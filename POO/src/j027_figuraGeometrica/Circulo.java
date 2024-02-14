package j027_figuraGeometrica;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String radio) {
    	
    	double a = Double.parseDouble(radio);
        this.radio = a;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
