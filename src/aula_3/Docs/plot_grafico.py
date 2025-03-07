import matplotlib.pyplot as plt

# Dados fornecidos para os exercícios
N = [10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000]

Ex1 = [140, 700, 1400, 7000, 14000, 70000, 140000, 700000, 1400000, 7000000]
Ex2 = [170, 850, 1700, 8500, 17000, 85000, 170000, 850000, 1700000, 8500000]
Ex4 = [3300, 82500, 330000, 8250000, 33000000, 825000000, 3.3E9, 8.25E10, 3.3E11, 8.25E12]

NxM_labels = ["10x10", "50x75", "100x300", "500x200", "1000x1000", "5000x7000", "10000x1", "50000x25000", "100000x100000", "500000x1000"]
NxM_values = [10*10, 50*75, 100*300, 500*200, 1000*1000, 5000*7000, 10000*1, 50000*25000, 100000*100000, 500000*1000]
Ex3 = [2400, 90000, 720000, 2400000, 2.4E7, 8.4E8, 240000, 3E10, 2.4E11, 1.2E10]

# Criando o gráfico
plt.figure(figsize=(10, 6))
plt.plot(N, Ex1, marker='o', label="Ex1: Inicialização do Vetor")
plt.plot(N, Ex2, marker='s', label="Ex2: Cópia de Vetor")
plt.plot(N, Ex4, marker='^', label="Ex4: Verificação de Simetria")
plt.plot(NxM_values, Ex3, marker='d', label="Ex3: Limpeza de Matrizes")

# Configurações do gráfico
plt.xscale('log')
plt.yscale('log')
plt.xlabel("Tamanho da Entrada (N ou NxM)")
plt.ylabel("Contagem de Operações")
plt.title("Complexidade dos Algoritmos para Diferentes Tamanhos de Entrada")
plt.legend()
plt.grid(True, which="both", linestyle="--", linewidth=0.5)

# Exibir o gráfico
plt.show()
