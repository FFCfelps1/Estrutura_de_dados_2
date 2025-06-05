# Calculando os valores do modelo
var = 33
parametros = [10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000]
# for deve andar a cada dois elementos
for p in range(0, len(parametros), 1):
  # printar o parametro e o resultado
  print(f"{parametros[p]}x{parametros[p]}: {(parametros[p]) * parametros[p] * var}")