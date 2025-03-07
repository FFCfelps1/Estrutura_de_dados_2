# Calculando os valores do modelo
var = (2 + 3 + 4) * 2  + 6
parametros = [10, 10, 50, 75, 100, 300, 500, 200, 1000, 1000, 5000, 7000, 10000, 1, 50000, 25000, 100000, 100000, 500000, 1000]
# for deve andar a cada dois elementos
for p in range(0, len(parametros), 2):
  # printar o parametro e o resultado
  print(f"{parametros[p]}x{parametros[p+1]}: {(parametros[p+1]) * parametros[p] * var}")