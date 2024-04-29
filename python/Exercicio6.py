notas = {
    "Carlinhos": [7,6,8],
    "Zezinho": [5,4,8],
    "Toninho": [3,5,3]
}
peso = [1,2,3]

for x, y in notas.items():
    notaPesos = 0

    for i, n in enumerate(y):
        notaPesos += n*peso[i]

    somaPesos = sum(peso)
    notaFinal = notaPesos / somaPesos

    print(f"{x}: {notaFinal}")
