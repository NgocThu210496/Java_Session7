package exercise_4;

public class Student {
    private String name="John";
    private String classs="C02";

    public Student() {
    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public String getClasss() {
        return classs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }


}
