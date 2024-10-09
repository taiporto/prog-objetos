package org.taiporto.lista1;

import java.util.Scanner;

// Determine as raízes de uma equação de 2o grau: ax^2 + bx + c = 0 (recordar que o
// discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).

public class ex1 {
  public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
          System.out.print("Entre com o valor de a: ");
          float a = teclado.nextFloat();
          System.out.print("Entre com o valor de b: ");
          float b = teclado.nextFloat();
          System.out.print("Entre com o valor de c: ");
          float c = teclado.nextFloat();
          
          final float DOIS_A = 2*a;
          
          double delta = Math.pow(b, 2) - (4*a*c);
          double raizQuadradaDelta = Math.sqrt(delta);
          double raizUm = (-b + raizQuadradaDelta)/DOIS_A;
          double raizDois = (-b - raizQuadradaDelta)/DOIS_A;
          
          System.out.println("1a raiz: " + raizUm);
          System.out.println("2a raiz: " + raizDois);
      }
  }
}
