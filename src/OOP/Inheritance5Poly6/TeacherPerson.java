package OOP.Inheritance5Poly6;

//Teacher is a Person
//Teacher is a Teacher
public class TeacherPerson extends Person {
    private int salary;

    public TeacherPerson(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public TeacherPerson(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return super.toString()+ "\n\t" +
                "salary " +this.salary + "euro/month";
    }
}

