package OOP.InheritancePractice7;
//In JAVA, everything is extended from objects. Everything is an object in Java. So the following class is
// public class Phone extends Object, actually. Even if you don't write it like this, Java assumees that you extend it
// from Object class. Every class has OBJECT as a superclass.
public class Phone {//Even if it's not see there is a structure like this; public class Phone extends Object
    private String model;
    private String make;

    public Phone(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override //If there is an override, there is an inheritance
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
