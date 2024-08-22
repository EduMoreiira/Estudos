package REVISAO.SistemaVeiculos;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro(200);
        carro.setModelo("Ferrari");
        carro.setCor("Vermelho");

        Moto moto = new Moto(150);
        moto.setModelo("Honda");
        moto.setCor("Azul");

        carro.acelerar(50);
        moto.acelerar(30);
        carro.desacelerar(20);
        moto.desacelerar(10);

        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}
