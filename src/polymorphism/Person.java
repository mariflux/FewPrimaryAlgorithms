package polymorphism;

public class Person {
    private String first_name;
    private String last_name;
    private double weight;
    private double height;

    public Person() {
    }

    public Person(String first_name, String last_name, double weight, double height) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.weight = weight;
        this.height = height;
    }

    void positiveWeight(double number){
        if(number<0){
            throw new IllegalArgumentException("It can't be negative");
        }else {
            this.weight = number;
        }
    }

    void positiveHeight(double number){
        if(number<0){
            throw new IllegalArgumentException("It can't be negative");
        }else {
            this.height = number;
        }
    }
    void displayNameAndSurname(){
        System.out.println("This person's name: "+first_name+" and surname: "+last_name);
    }

    void displayMyHight(){
        System.out.println("My height: "+height);
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
