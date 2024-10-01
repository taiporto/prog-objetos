package org.taiporto.aula1;

import java.util.Scanner;

/* Faça um programa para, a partir de um valor informado em centavos, indicar a menor quantidade de moedas que representa esse valor.

- Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
- Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas de 1 real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10 centavos e 1 moeda de 5 centavos */
class ex2 {
    public static void main(String[] args) {
        final float UM_REAL = 1.0f * 100;
        final float CINCO_CENTAVOS = 0.05f * 100;
        final float DEZ_CENTAVOS = 0.10f * 100;
        final float VINTE_CINCO_CENTAVOS = 0.25f * 100;
        final float CINQUENTA_CENTAVOS = 0.50f * 100;

        int quantidadeUmReal, quantidadeUmCentavo, quantidadeCincoCentavos, quantidadeDezCentavos, quantidadeVinteCincoCentavos, quantidadeCinquentaCentavos;
        float resto;
        float centavos;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Insira uma quantidade de centavos: ");
            centavos = teclado.nextFloat();
        }

        quantidadeUmReal = (int)Math.floor(centavos / UM_REAL);
        resto = centavos % UM_REAL;
        quantidadeCinquentaCentavos = (int)Math.floor(resto / CINQUENTA_CENTAVOS);
        resto = resto % CINQUENTA_CENTAVOS;
        quantidadeVinteCincoCentavos = (int)Math.floor(resto / VINTE_CINCO_CENTAVOS);
        resto = resto % VINTE_CINCO_CENTAVOS;
        quantidadeDezCentavos = (int)Math.floor(resto / DEZ_CENTAVOS);
        resto = resto % DEZ_CENTAVOS;
        quantidadeCincoCentavos = (int)Math.floor(resto / CINCO_CENTAVOS);
        resto = resto % CINCO_CENTAVOS;
        quantidadeUmCentavo = (int)Math.floor(resto);


        System.out.println("1 real: "+quantidadeUmReal);
        System.out.println("50 centavos: "+quantidadeCinquentaCentavos);
        System.out.println("25 centavos: "+quantidadeVinteCincoCentavos);
        System.out.println("10 centavos: "+quantidadeDezCentavos);
        System.out.println("5 centavos: "+quantidadeCincoCentavos);
        System.out.println("1 centavo: "+quantidadeUmCentavo);
    }
}
