package org.taiporto.lista1;

import java.util.Scanner;
// Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário.
// A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior
// equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usuário
// informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

public class ex8 {

    public static void main(String[] args) {
        int menosDois = 0;
        int menosUm = 1;
        String fibonacci = "";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número inteiro não negativo para que a sequência de Fibonacci seja calculada: ");
        int quantidade = teclado.nextInt();

        for (int i = 0; i <= quantidade; i++) {

            if (i == 0) {
                fibonacci = "0, ";
                continue;
            }

            if (i == 1) {
                fibonacci += "1, ";
                continue;
            }

            int atual = menosDois + menosUm;
            fibonacci += atual;

            menosDois = menosUm;
            menosUm = atual;

            if (i != quantidade) {
                fibonacci += ", ";
            }
        }

        System.out.print(fibonacci);

        teclado.close();
    }
}
