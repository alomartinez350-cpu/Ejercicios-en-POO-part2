public class Validarnumero {

    private int numero;

    public Validarnumero(int numero) {
        this.numero = numero;
    }

    public boolean esPositivo() {
        return numero > 0;
    }

    public boolean esNegativo() {
        return numero < 0;
    }

    public boolean esCero() {
        return numero == 0;
    }

    public static void main(String[] args) {

        Validarnumero num = new Validarnumero(10);

        System.out.println("Número: 10");
        System.out.println("¿Es positivo? " + num.esPositivo());
        System.out.println("¿Es negativo? " + num.esNegativo());
        System.out.println("¿Es cero? " + num.esCero());
    }
}