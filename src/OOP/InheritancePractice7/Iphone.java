package OOP.InheritancePractice7;

public class Iphone extends Phone{
    private String color;

    public Iphone(String model, String make, String color) {
        super(model, make);
        this.color = color;
    }

    public Iphone(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "color='" + color + '\'' +
                '}';
    }
    public String printInfo(){
        return super.toString()+this.color;
    }
}

