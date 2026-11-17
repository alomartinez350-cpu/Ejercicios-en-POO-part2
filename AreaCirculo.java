public class AreaCirculo {

    private double radio;

    public AreaCirculo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {

        AreaCirculo circulo = new AreaCirculo(5);

        System.out.println("Radio: " + 5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}