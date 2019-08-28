package polymorphism;

public class Student extends Person{
    private String grade;
    private  Teacher educator;

    public Student(String grade, Teacher educator) {
        this.grade = grade;
        this.educator = educator;
    }

    public Student(String first_name, String last_name, double weight, double height, String grade, Teacher educator) {
        super(first_name, last_name, weight, height);
        this.grade = grade;
        this.educator = educator;
    }

    @Override
    void displayNameAndSurname() {
        System.out.println("This student's name: "+getFirst_name()+" and surname: "+getLast_name());

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

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", educator=" + educator +
                '}';
    }
}
