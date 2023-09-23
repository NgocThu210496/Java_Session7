package exercise_4;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        //Thay đổi access modifier
        student.setName("Thu");
        student.setClasss("lass Java");
        System.out.printf("Name: %s\nClasss: %s\n", student.getName(), student.getClasss());
    }
}
