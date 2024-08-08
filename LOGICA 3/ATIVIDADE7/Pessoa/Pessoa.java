package ATIVIDADE7.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
