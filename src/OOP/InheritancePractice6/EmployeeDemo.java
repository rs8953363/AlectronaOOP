package OOP.InheritancePractice6;

public class EmployeeDemo {

        public static void main(String[] args) {
            Employee employee1 = new Employee("Ahmet", "06072021");
            System.out.println(employee1);

            ProductionWorker productionWorker1 = new ProductionWorker("Mehmet","06072021", 1,
                    50.00);
            System.out.println(productionWorker1);
        }
    }

