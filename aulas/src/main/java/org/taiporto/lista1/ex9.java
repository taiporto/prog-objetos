package org.taiporto.lista1;

public class ex9 {

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }
}
