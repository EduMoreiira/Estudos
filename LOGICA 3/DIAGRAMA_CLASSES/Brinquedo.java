package DIAGRAMA_CLASSES;

public class Brinquedo {
    private String nome;
    private Animal animal;

    public Brinquedo(String nome, Animal animal) {
        this.nome = nome;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
