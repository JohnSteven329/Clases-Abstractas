package ec.edu.Puce.abstracta;

public abstract class FiguraGeometrica {
    private String nombreFigura;

    public FiguraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public abstract double calcularArea();

    public boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    public String toString() {
        return "Figura: " + nombreFigura + ", Área: " + calcularArea();
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
}
