package OOP.InheritancePractice6;

public class ProductionWorker extends Employee {
    int shift;
    double hourlyPayRate;

    public ProductionWorker(String employeeName, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    @Override
    public String toString() {
         return "ProductionWorker Name: " + super.getEmployeeName() + "\n" +
                "ProductionWorker Number: " + super.getEmployeeNumber() + "\n" +
                "ProductionWorker Name Hire Date: " + super.getHireDate() + "\n" +
                 "Shift: " +this.shift+ "\n"+
                "Hourly Rate: "+this.hourlyPayRate;
        //We know that in ToString Method the following part is same as the ToString method in Parent class. So we can
        // replace it with the super keyword. Super keyword symbolizes parent in Inheritance.

    }
    }
