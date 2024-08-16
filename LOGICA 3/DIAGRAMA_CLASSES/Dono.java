package DIAGRAMA_CLASSES;

import java.util.ArrayList;

public class Dono {
    private String nome;
    private ArrayList<Cachorro> cachorros;
    private ArrayList<Gato> gatos;

    public Dono(String nome){
        this.nome = nome;
    }

    public void addCachorro(String nome, int idade, Dono dono, String raca) {
        var cachorro = new Cachorro(idade, nome, raca, dono);
        cachorros.add(cachorro);
    }

    public void removeCachorro(Cachorro cachorro) {
        cachorros.remove(cachorro);
    }

    public void adicionarGato(Gato gato){
        gatos.add(gato);
    }

    public void removerGato(Gato gato) {
        gatos.remove(gato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
