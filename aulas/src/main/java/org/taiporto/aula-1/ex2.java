
import java.util.Scanner;

/* Faça um programa para, a partir de um valor informado em centavos, indicar a menor quantidade de moedas que representa esse valor.

- Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
- Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas de 1 real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10 centavos e 1 moeda de 5 centavos */
class Moedas {

    public static void main(String[] args) {
        final float UM_REAL = 1.0f;
        final float UM_CENTAVO = 0.01f;
        final float CINCO_CENTAVOS = 0.05f;
        final float DEZ_CENTAVOS = 0.10f;
        final float VINTE_CINCO_CENTAVOS = 0.25f;
        final float CINQUENTA_CENTAVOS = 0.50f;

        int quantidadeUmReal, quantidadeUmCentavo, quantidadeCincoCentavos, quantidadeDezCentavos, quantidadeVinteCincoCentavos, quantidadeCinquentaCentavos;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira uma quantidade de centavos: ");
        float centavos = teclado.nextFloat();

        quantidadeUmReal = centavos % 100;

    }
}
