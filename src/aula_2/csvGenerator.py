import pandas as pd

# Criando os dados fornecidos em um dicionário
data = {
    "Tamanho": [
        "10x10", "50x50", "100x100", "500x500", "1000x1000", "5000x5000", "10000x10000"
    ],
    "Execução 1 (ns)": [
        134000, 34900, 139200, 2810700, 3459600, 188949700, 2096538300
    ],
    "Execução 2 (ns)": [
        2600, 40500, 126100, 1148200, 5637300, 193643100, 1409266800
    ],
    "Execução 3 (ns)": [
        1900, 41000, 130000, 7693200, 4198100, 193807900, 1120604500
    ],
    "Execução 4 (ns)": [
        1800, 32700, 138000, 851300, 2853700, 198274200, 1205772700
    ],
    "Execução 5 (ns)": [
        1700, 32100, 146700, 1819500, 1855100, 194079600, 1032651700
    ],
    "Média de Tempo (ns)": [
        28400, 36240, 136000, 2864580, 3600760, 193750900, 1372966800
    ],
    "Média de Comparações": [
        45, 1225, 4950, 124750, 499500, 12497500, 49995000
    ]
}

# Criando o DataFrame
df = pd.DataFrame(data)

# Salvando em um arquivo CSV
csv_filename = "execucao_matriz.csv"
df.to_csv(csv_filename, index=False, sep="\t")

csv_filename
