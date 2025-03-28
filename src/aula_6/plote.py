import numpy as np
import matplotlib.pyplot as plt

# Definição do intervalo de n
n_values = np.arange(1, 40, 1)

# Definição das funções
f_n = 128 * n_values**2
g_n = 4 * n_values**3

# Plot do gráfico
plt.figure(figsize=(10, 6))
plt.plot(n_values, f_n, label=r'$128n^2$', color='blue')
plt.plot(n_values, g_n, label=r'$4n^3$', color='red')
plt.axvline(x=31, linestyle='--', color='gray', label='n = 31')

# Configuração do gráfico
plt.xlabel("n")
plt.ylabel("Número de operações")
plt.title("Comparação entre $128n^2$ e $4n^3$")
plt.legend()
plt.grid(True)

# Exibição do gráfico
plt.show()
