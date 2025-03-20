# Exercícios Propostos - Aula 04

## Felipe Fazio da Costa
**RA:** 23.00055-4  
**Disciplina:** ECM306 - Tópicos Avançados em Estrutura de Dados

---

## Exercício 1

### **Código Java:**

```java
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        int resultado = 1;
        
        for (int i = n; i > 0; i--) {
            resultado *= i; // Multiplicação
        }
        
        System.out.println("Fatorial: " + resultado);
        input.close();
    }
}
```

### **Análise de Complexidade:**
O laço percorre de `n` até `1`, realizando `n` multiplicações.

- Inicialização: O(1)
- Loop de `n` iterações: O(n)
- Operação de multiplicação dentro do loop: O(n)

**Equação final:** 
\[ T(n) = O(n) \]

---

## Exercício 2

### **Código Java:**
```java
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; // Soma dos elementos
        }
        
        float media = soma / vetor.length;
        System.out.println("Média: " + media);
        
        input.close();
    }
}
```
### **Análise de Complexidade:**
O laço percorre todos os `n` elementos do vetor.

- Inicialização: O(1)
- Loop de `n` iterações: O(n)
- Soma dentro do loop: O(n)
- Cálculo da média: O(1)

**Equação final:** 
\[ T(n) = O(n) \]

---

## Exercício 3

### **Código Java:**
```java
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        int fib1 = 0, fib2 = 1, fibAtual;
        
        for (int i = 2; i <= n; i++) {
            fibAtual = fib1 + fib2; // Soma
            fib1 = fib2;
            fib2 = fibAtual;
        }
        
        System.out.println("Fibonacci de " + n + " é: " + fib2);
        input.close();
    }
}
```
### **Análise de Complexidade:**
O laço percorre `n` elementos para calcular Fibonacci iterativamente.

- Inicialização: O(1)
- Loop de `n` iterações: O(n)
- Soma dentro do loop: O(n)

**Equação final:** 
\[ T(n) = O(n) \]

---

## Exercício 4

### **Código Java:**
```java
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                soma += i * j; // Multiplicação dentro de um duplo loop
            }
        }
        
        System.out.println("Soma total: " + soma);
        input.close();
    }
}
```
### **Análise de Complexidade:**
Temos dois laços aninhados, cada um percorrendo `n` elementos.

- Inicialização: O(1)
- Loop externo de `n` iterações: O(n)
- Loop interno de `n` iterações dentro do externo: O(n²)
- Operação de soma dentro do duplo loop: O(n²)

**Equação final:** 
\[ T(n) = O(n^2) \]

---

## Exercício 5

### **Código Java:**
```java
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2; // Divisão por 2
            } else {
                n = 3 * n + 1; // Regra de Collatz
            }
        }
        
        System.out.println("Sequência terminou.");
        input.close();
    }
}
```
### **Análise de Complexidade:**
Esse algoritmo segue a Conjectura de Collatz, cuja complexidade exata não é conhecida, mas experimentalmente é aproximadamente O(log n).

- Inicialização: O(1)
- Laço `while` reduz `n` a cada iteração, aproximando-se de O(log n).

**Equação final:** 
\[ T(n) = O(log n) \]

---

## Conclusão

Os exercícios abordaram a análise de complexidade utilizando o modelo de Knuth, permitindo avaliar a eficiência dos algoritmos desenvolvidos. Foi possível observar que:

- Exercícios 1, 2 e 3 possuem complexidade **O(n)**, indicando um crescimento linear.
- O Exercício 4 apresenta complexidade **O(n²)** devido ao laço aninhado.
- O Exercício 5, relacionado à Conjectura de Collatz, tem comportamento **O(log n)**.

Essa análise destaca a importância de compreender a eficiência dos algoritmos, especialmente para grandes entradas.

