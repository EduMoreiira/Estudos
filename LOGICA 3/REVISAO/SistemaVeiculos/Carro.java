package REVISAO.SistemaVeiculos;

public class Carro extends VeiculoBase{




    public Carro(int velocidadeMaxima){
        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public void acelerar(int incremento) {
        if(incremento < 0){
            System.out.println("Incremento deve ser um número positivo.");
            return;
        }

        int velocidade = incremento * 3;


        int velocidadeIncrementada = getVelocidadeAtual() + velocidade;

        if(velocidadeIncrementada < super.getVelocidadeMaxima()) {
            super.setVelocidadeAtual(velocidadeIncrementada);
        } else {
            super.setVelocidadeAtual(getVelocidadeMaxima());
        }

    }

    @Override
    public void desacelerar(int decremento) {
        if(decremento < 0){
            System.out.println("Decremento deve ser um número positivo.");
            return;
        }

        int velocidade = decremento * 2;


        int velocidadeDecrementada = getVelocidadeAtual() - velocidade;

        if(velocidadeDecrementada > 0) {
            super.setVelocidadeAtual(velocidadeDecrementada);
        } else {
            super.setVelocidadeAtual(0);
        }
    }


}
