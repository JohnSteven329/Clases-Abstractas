package ec.edu.Puce.abstracta;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombreFigura, double radio) {
        super(nombreFigura);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
