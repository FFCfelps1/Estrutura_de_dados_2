import matplotlib.pyplot as plt
import numpy as np

# Definindo a função f(n)
def f(n):
    return 14 + 11 * n

# Criando um array de valores para n (número de ciclos)
n_values = np.arange(0, 20, 1)  # Vamos plotar de 0 a 19 ciclos

# Calculando os valores de y (número de operações) para cada n
y_values = f(n_values)

# Plotando a função
plt.plot(n_values, y_values, marker='o', linestyle='-', color='b')

# Adicionando rótulos e título
plt.xlabel('Número de Ciclos (n)')
plt.ylabel('Número de Operações (y)')
plt.title('Gráfico de f(n) = 14 + 11n')

# Mostrando a grade para melhor visualização
plt.grid(True)

# Exibindo o gráfico
plt.show()