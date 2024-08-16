package DIAGRAMA_CLASSES;

public class Cachorro extends Animal {
    private String raca;
    private Dono dono;

    public Cachorro(int idade, String nome, String raca, Dono dono) {
        super(idade, nome);
        this.raca = raca;
        this.dono = dono;
    }

    public void fazerSom(){

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
