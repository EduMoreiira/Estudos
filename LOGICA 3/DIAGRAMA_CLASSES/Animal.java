package DIAGRAMA_CLASSES;

public abstract class Animal implements AcoesAnimal {

    private String nome;
    private int idade;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }


    @Override
    public void comer() {
        System.out.println("O animal está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void fazerSom(){
        System.out.println("O animal está fazendo barulho: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
