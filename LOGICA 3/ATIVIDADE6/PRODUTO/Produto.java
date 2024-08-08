package ATIVIDADE6.PRODUTO;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        if(preco < 0){
            this.preco = 0;
        }else {
            this.preco = preco;
        }
    }
}
