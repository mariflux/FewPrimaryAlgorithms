package polymorphism;

import java.util.*;

public class Teacher extends Person {
    private List<Student> listOfPupils;

    public Teacher() {
    }

    public Teacher(String first_name, String last_name, double weight, double height) {
        super(first_name, last_name, weight, height);
        listOfPupils = new ArrayList<>();

    }

    public Teacher(List<Student> listOfPupils) {
        this.listOfPupils = listOfPupils;
    }

    public Teacher(String first_name, String last_name, double weight, double height, List<Student> listOfPupils) {
        super(first_name, last_name, weight, height);
        this.listOfPupils = listOfPupils;
    }

    @Override
    void displayNameAndSurname() {
        System.out.println("This teacher's name: "+getFirst_name()+" and surname: "+getLast_name());

    }

    void addToListOfPupils(Student student){
        listOfPupils.add(student);
    }

    public List<Student> getListOfPupils() {
        return listOfPupils;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "listOfPupils=" + listOfPupils +
                '}';
    }

}
