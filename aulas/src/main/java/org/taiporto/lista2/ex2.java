package org.taiporto.lista2;

// Crie um programa para ler um número n e depois ler um vetor v com n números
// inteiros. Ao final, ler mais um número k e informar e que posições do vetor v aparece o
// número k. Caso k não exista no vetor v apresente a mensagem "Número não
// encontrado".

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Insira um número n: ");
      int n = teclado.nextInt();
      int[] v = new int[n];
      int[] posicoes = new int[n];

      for(int i = 0; i < v.length; i++) {
        System.out.print("Informe o número " + i+1 + ": ");
        v[i] = teclado.nextInt();
        posicoes[i] = -1;
      }
      
      System.out.print("Insira um número para ser procurado: ");
      int k = teclado.nextInt();

      for(int i = 0; i < v.length; i++) {
        if(v[i] == k) {
          posicoes[i] = i;
        }
      }

      if(posicoes[0] == -1) {
        
      }

      teclado.close();
  }
}
