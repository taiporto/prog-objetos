# Ex. 7

Considere os programas a seguir, que leem um código repetidamente e imprimem o
código lido até que o código lido seja igual a -1. O código -1 não deve ser impresso.

1. Qual das duas soluções é a correta?
2. Como a solução incorreta poderia ser corrigida?


## Programa A
```java
import java.util.Scanner;
public class Codigo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo;
    System.out.println("Informe o código: ");
    codigo = teclado.nextInt();
    while (codigo != -1) {
      System.out.println("Código: " + codigo);
      System.out.println("Informe o código: ");
      codigo = teclado.nextInt();
    }
  }
}
```

## Programa B

```java
import java.util.Scanner;

public class Codigo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo;
    do {
      System.out.print("Informe o código: ");
      codigo = teclado.nextInt();
      System.out.println("Código: " + codigo);
    } while (codigo != -1);
  }
}
```


## Resposta
1. A solução `A` é a correta, pois não imprime `-1` caso o primeiro código inserido já seja inválido.
2. A solução incorreta pode ser corrigida se criarmos um `if` após a inserção do código verificando se é diferente a `-1`, assim impedindo a impressão caso ele seja igual a `-1`.