

nums = []
for i in range(5):
    nums.append(input("Insira um número inteiro"))
    
nums = [int(x) for x in nums]

for num in nums:
    if num % 2 == 0:
        print(f'{num} é par')
    else:
        print(num)

# Crie um vetor que leia 
# valores inteiros , e mostre os 
# valores armazenados , e 
# mostre quais são pares