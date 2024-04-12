prices = []
inp = 1
while(inp != 0):
    inp = float(input("Insira 0 para encerrar a conta\nInsira o valor do produto:\n"))
    if inp != 0: 
        prices.append(inp)

payment = float(input("Insira o valor do pagamento em dinheiro: "))
total = 0
for index, price in enumerate(prices):
    print(f"Produto[{index + 1}]: R${price}")
    total += price
print(f"Valor total dos produtos: R${"%.2f" % total}")
print(f"Valor do pagamento: R${"%.2f" % payment}")
print(f"Troco: R${"%.2f" % (payment - total)}")

#  O Sr. Luiz possui uma loja de conveniências. Faça um programa 
# que deverá receber um número desconhecido de valores 
# referentes aos preços das mercadorias. Um valor zero deve ser 
# informado pelo operador para indicar o final da compra. O 
# programa deve então mostrar o total da compra e perguntar o 
# valor em dinheiro que o cliente forneceu, para então calcular e 
# mostrar o valor do troco. 
# (UTILIZE WHILE FOR IF)
