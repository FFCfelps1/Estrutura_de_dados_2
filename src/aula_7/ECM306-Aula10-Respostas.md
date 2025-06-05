# ECM306 – Aula 10 – Estruturas Lineares
## Resolução dos Exercícios Propostos

Autor: Felipe Fazio da Costa  
Data: 04 de Junho de 2025

---

## Exercício 1

### Objetivo:
Implementar uma **lista ligada** usando **três vetores paralelos** (`chave`, `proximo`, `anterior`) conforme o modelo apresentado na aula e no livro do Cormen (Cap. 10.3).

---

### Estrutura

A lista será representada por três vetores:
- `chave[]`: armazena os valores.
- `proximo[]`: armazena o índice do próximo elemento.
- `anterior[]`: armazena o índice do elemento anterior.

---

### Código Java

```java
public class ListaLigada {
    private static final int MAX = 100;
    private int[] chave = new int[MAX];
    private int[] proximo = new int[MAX];
    private int[] anterior = new int[MAX];
    private int livre = 0;
    private int inicio = -1;

    public ListaLigada() {
        for (int i = 0; i < MAX; i++) {
            proximo[i] = -1;
            anterior[i] = -1;
        }
    }

    private int novoNo(int valor) {
        if (livre >= MAX) throw new RuntimeException("Lista cheia");
        chave[livre] = valor;
        return livre++;
    }

    public void inserir(int valor) {
        int novo = novoNo(valor);
        if (inicio == -1) {
            inicio = novo;
        } else {
            int atual = inicio;
            while (proximo[atual] != -1) {
                atual = proximo[atual];
            }
            proximo[atual] = novo;
            anterior[novo] = atual;
        }
    }

    public void deletar(int valor) {
        int atual = inicio;
        while (atual != -1 && chave[atual] != valor) {
            atual = proximo[atual];
        }
        if (atual == -1) return; // não encontrado

        int ant = anterior[atual];
        int prox = proximo[atual];

        if (ant != -1) {
            proximo[ant] = prox;
        } else {
            inicio = prox; // início era o nó atual
        }

        if (prox != -1) {
            anterior[prox] = ant;
        }
    }

    public void imprimir() {
        int atual = inicio;
        while (atual != -1) {
            System.out.print(chave[atual] + " ");
            atual = proximo[atual];
        }
        System.out.println();
    }
}
```

---

### Demonstração

```java
public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.imprimir(); // 10 20 30

        lista.deletar(20);
        lista.imprimir(); // 10 30
    }
}
```

---

### Observações

- Essa estrutura simula ponteiros usando índices de vetores.
- É útil para ambientes com restrições a ponteiros explícitos (ex: hardware embarcado ou linguagens mais simples).

---

### Referência:
- CORMEN, T. H. et al. "Algoritmos: Teoria e Prática", 2ª Edição, Cap. 10.3.
