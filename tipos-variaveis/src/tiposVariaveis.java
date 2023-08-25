public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.50;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        int numeroCurto2 = numeroNormal;

        int numero = 5;
        final double VALOR_DE_PI = 3.14;

        System.out.println(numero);
        System.out.println(VALOR_DE_PI);
        
        numero = 10;

        System.out.println(numero);
        System.out.println(VALOR_DE_PI);
        System.out.println(salarioMinimo);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto);
        System.out.println(numeroCurto2);
    }
}
