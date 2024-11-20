package org.taiporto.lista1;

import java.util.Scanner;

// Calcule a raiz quadrada aproximada de um número inteiro informado pelo usuário, respeitando o erro máximo também informado pelo usuário. Não utilize funções predefinidas.
public class ex11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número para calcular a raiz: ");
        int numero = teclado.nextInt();
        double raizAproximada = (double) numero / 2;
        double raizAnterior;

        System.out.println("Insira um erro máximo: ");
        double erroMaximo = teclado.nextDouble();

        do { 
            System.out.println(raizAproximada);
            if (raizAproximada % 1 == 0) {
                break;
            }
            raizAnterior = raizAproximada;
            raizAproximada = ((numero + raizAproximada) / raizAproximada) / 2;
        } while (Math.abs(raizAproximada - raizAnterior) > erroMaximo);

        System.out.print("A raiz aproximada de " + numero + " é: " + raizAproximada);
        teclado.close();
    }
}
