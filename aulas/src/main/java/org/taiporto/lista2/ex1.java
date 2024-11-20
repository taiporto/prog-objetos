package org.taiporto.lista2;

import java.util.Scanner;

// Crie um programa para ler inicialmente o número de alunos de uma turma. Em
// seguida, leia as notas dos alunos dessa turma. Ao final, imprima a média da turma e as
// notas acima da média.

public class ex1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroAlunos;
    float media = 0;

    System.out.print("Insira o número de alunos na turma: ");
    numeroAlunos = teclado.nextInt();

    float[] notasAlunos = new float[numeroAlunos];

    for (int i = 0; i < numeroAlunos; i++) {
      System.out.print("Insira a nota do aluno " + (i+1) + ": ");
      notasAlunos[i] = teclado.nextFloat();
      teclado.nextLine();
    }

    for(int i = 0; i < numeroAlunos; i++) {
      media += notasAlunos[i];
    }

    media /= numeroAlunos;

    System.out.println("A média da turma é: " + media);

    for(int i = 0; i < numeroAlunos; i++) {
      if (notasAlunos[i] > media) {
        System.out.println(notasAlunos[i]);
      }
    }
    teclado.close();
  }
}
