package OOP.InheritancePractice7;

public class Samsung extends Phone {
    private String color;

    public Samsung(String model, String make, String color) {
        super(model, make);
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
        return "Samsung{" +
                "color='" + color + '\'' +
                '}';
    }
    public String printInfo(){
        return super.toString()+this.color;
    }
}
