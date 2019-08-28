package polymorphism;

public class Main {

    public static void main(String[] args) {
        Teacher kowalsky = new Teacher("John","Kowalsky",68,179);
        //teacher is a person
        Person kowalskyP = new Teacher("John","Kowalsky",68,179);
        Student student1 = new Student("Adam","Newman",44,154,"First Grade", kowalsky);
        //student is a person
        Person student1P = new Student("Adam","Newman",44,154,"First Grade", kowalsky);

        //kowalskyP is not allowed to use addToListOfPupils method because class Person doesn't contain this method
        kowalsky.addToListOfPupils(student1);
        kowalsky.getListOfPupils();


        //same output because of @Override method
        kowalsky.displayNameAndSurname();
        kowalskyP.displayNameAndSurname();

        //same output because of @Override method
        student1.displayNameAndSurname();
        student1P.displayNameAndSurname();

        kowalsky.displayMyHight();
        kowalskyP.displayMyHight();

        student1.displayMyHight();
        student1P.displayMyHight();

    }
}