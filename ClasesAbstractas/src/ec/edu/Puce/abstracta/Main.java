package ec.edu.Puce.abstracta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola PUCE");

        Rectangulo rectangulo = new Rectangulo("Rectángulo", 26, 75);
        System.out.println(rectangulo);

        Circulo circulo = new Circulo("Círculo", 10);
        System.out.println(circulo);

        Triangulo triangulo = new Triangulo("Triángulo", 10, 15);
        System.out.println(triangulo);

        System.out.println("¿El área del rectángulo es mayor que la del círculo? " + rectangulo.mayorQue(circulo));
        System.out.println("¿El área del triángulo es mayor que la del rectángulo? " + triangulo.mayorQue(rectangulo));
    }
}
