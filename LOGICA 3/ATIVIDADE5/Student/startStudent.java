package ATIVIDADE5.Student;

public class startStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Lucas");
        Student st2 = new Student();

        System.out.println(Student.getTotalStudents());
        System.out.println(st1.getStudent());
    }
}
