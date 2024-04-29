class Aluno{
    private String nome;
    private String matricula;
    private int idade;

    public int getIdade() {
        return idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Exercicio10{
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.setIdade(12);
        aluno1.setMatricula("a1561e1");
        aluno1.setNome("Marcos Porte");
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());

        Aluno aluno2 = new Aluno();
        aluno2.setIdade(15);
        aluno2.setMatricula("asd1e1");
        aluno2.setNome("Carla Maria");
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matricula: " + aluno2.getMatricula());
        System.out.println("Nome: " + aluno2.getNome());
    }
}
// 10 -  Criar uma classe Aluno com os seguintes atributo: nome, matricula, idade. 
// Em seguida, encapsualr os atributos e criar os métodos gettters e setters de cada atributo. Na classe Teste,
//  criar dois objetos do tipo Aluno e adicionar e mostrar as informações dos alunos. 
