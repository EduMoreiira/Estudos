


matrix = []
# matrix.append(["lalo", "lelo"])
# matrix.append(["lalo2"])
# print(matrix)
# # print(matrix[1])
line = 0

for i in range(2):
    matrix.append([])

    for j in range(5):
        matrix[i].append(int(input(f"Insira um número inteiro para a posição [{i} - {j}]: ")))


for i in range(len(matrix)):
    print(matrix[i])

# Crie uma matriz[5,2] leia 
# 10 posições de números 
# inteiros ,armazene os 
# valores e mostre.