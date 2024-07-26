package HERANCA.animais;

class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }

    void barulho() {
        super.barulho();
        System.out.println("Au, au!");
    }
}
