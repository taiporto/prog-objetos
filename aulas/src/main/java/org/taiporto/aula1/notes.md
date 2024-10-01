# Organização de programas em Java

## Tipos de dados

### Dados numéricos

- float (notação com f e casa decimal)
- double (notação com casa decimal)
- int
- byte
- short
- long

### Dados não numéricos

- char
- String (classe)
- boolean

## Declaração de variáveis

O padrão é camelCase, começando com letra e pode incluir números.

Constantes são delaradas com o modificador _final_ antes do tipo. Os nomes são emaiúscula e as palavras separadas por `_`.

## Atribuição de valores

```java
int idade = 15;
final float ACELERACAO_GRAVIDADE = 9.80665f;
String olaMundo = "Olá, mundo!";
String nome, endereco, telefone;
int ano, mes, dia;
```

## Entrada de dados

Usamos a classe `java.util.Scanner`, que importamos no início do código e chamamos pelo nome `Scanner`, dessa forma:

```java
Scanner teclado = new Scanner(System.in);
```

A partir desse ponto, a variável _teclado_ pode ser usada para ler o que foi digitado.

A classe `Scanner` possui métodos para ler todo tipo de dado, geralmente denominados `next` + o nome do dado (em camel case).

## Saída de dados

A saída de dados é feita pela classe `java.lang.System`, que não precisa ser explicitamente importada pois já é visível automaticamente a todos os programas.

A partir da classe System é possível escrever qualquer tipo de dado:

```java
System.out.print(x)
System.out.println(x)
```

## Exercícios

### 1. Qual a saída do programa abaixo?

```java
class Atribuicoes {
	public static void main(String[] args) {
		float x = 1.0f;
		float y = 2.0f;
		float z = 3.0f;
		x = -x;
		y = y - 1;
		z = z + x;
		z = z + x - y;
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}
}
```

### 2. Faça um programa para, a partir de um valor informado em centavos, indicar a menor quantidade de moedas que representa esse valor.

- Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
- Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas de 1 real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10 centavos e 1 moeda de 5 centavos
