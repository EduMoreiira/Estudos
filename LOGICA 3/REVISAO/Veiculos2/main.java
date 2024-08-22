package REVISAO.Veiculos2;

public class main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("4A5E4VF", 2004, 4);
        Onibus onibus = new Onibus("4E6F5C", 1998, 2);

        onibus.exibirDados();
        caminhao.exibirDados();
    }
}
