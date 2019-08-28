package polymorphizm;

import java.util.List;

public class Teacher extends Person {
    private List<Student> listOfPupils;

    public Teacher(List<Student> listOfPupils) {
        this.listOfPupils = listOfPupils;
    }

    public Teacher(String first_name, String last_name, double weight, double height, List<Student> listOfPupils) {
        super(first_name, last_name, weight, height);
        this.listOfPupils = listOfPupils;
    }

    void addToListOfPupils(Student student){
        listOfPupils.add(student);
    }

    public List<Student> getListOfPupils() {
        return listOfPupils;
    }
}
