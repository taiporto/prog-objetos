package org.taiporto.lista1;

import java.util.Scanner;

// Determine o número de dígitos de um número informado.
public class ex6 {

    public static void main(String[] args) {
        long numero;
        int digitos = 0;

        System.out.print("Insira um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextLong();

        while (numero >= 1) {
            numero /= 10;
            digitos++;
        }

        System.out.println("O número inserido tem " + digitos + " dígitos.");

        teclado.close();
    }
}
