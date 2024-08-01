package ATIVIDADE5.Student;

public class Student {
    private String name;
    private String grade;
    private static int totalStudents;


    Student(){
        newStudent();
    }

    public void newStudent(){
        totalStudents++;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    String getStudent(){
        return "Nome do Estudante: " + this.name + "\nTotal de Estudantes: " + totalStudents;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    double calculateFinalGrade(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
}
