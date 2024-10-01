# Qual a saída do programa abaixo?

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

## Resolução

```
x = -1.0f;
y = 1.0f;
z = 0.0f;
```

A saída é `x = -1.0f, y = 1.0f, z = 0.0f`