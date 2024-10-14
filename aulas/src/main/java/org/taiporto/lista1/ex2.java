package org.taiporto.lista1;

import java.util.Scanner;

// Calcule a distância entre dois pontos num espaço de 3 dimensões.

// Distância entre dois pontos é dada pela raiz quadrada de
// (x_B - x_A)^2 + (y_B - y_A)^2 + (z_B - z_A)^2

public class ex2 {
  public static void main(String[] args) {
      String[] pontoA, pontoB;
      double distanciaX, distanciaY, distanciaZ,distanciaFinal;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Insira, separado por vírgulas (x,y,z) as coordenadas do ponto A: ");
      pontoA = teclado.nextLine().trim().split(",");
      System.out.print("Insira, separado por vírgulas (x,y,z) as coordenadas do ponto B: ");
      pontoB = teclado.nextLine().trim().split(",");

      distanciaX = Double.parseDouble(pontoB[0]) - Double.parseDouble(pontoA[0]);
      distanciaY = Double.parseDouble(pontoB[1]) - Double.parseDouble(pontoA[1]);
      distanciaZ = Double.parseDouble(pontoB[2]) - Double.parseDouble(pontoA[2]);
      distanciaFinal = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2) + Math.pow(distanciaZ, 2));

      System.out.println("A distância entre os pontos inseridos é: " + distanciaFinal);

      teclado.close();
  }

}
