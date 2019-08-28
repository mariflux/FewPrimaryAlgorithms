package polymorphism;

public class Student extends Person{
    private String grade;
    private  Teacher educator;

    public Student(String grade) {
        this.grade = grade;
    }

    public Student(String first_name, String last_name, double weight, double height, String grade) {
        super(first_name, last_name, weight, height);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Teacher getEducator() {
        return educator;
    }

    public void setEducator(Teacher educator) {
        this.educator = educator;
    }
}
