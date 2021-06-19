public class Mechanic extends Person {
    private String profesion;

    public Mechanic(String name, String surname, int salary, String profesion) {
        super(name, surname, salary);
        this.profesion = profesion;
    }
}
