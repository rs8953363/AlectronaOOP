package OOP.InheritancePractice6;

public class Employee {

        private String employeeName;
        private String employeeNumber;
        private String hireDate;

        public Employee(String employeeName, String hireDate) {
            this.employeeName = employeeName;
            this.hireDate = hireDate;
            this.employeeNumber = createNewEmployeeNumber();
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public String getEmployeeNumber() {
            return employeeNumber;
        }

        public String getHireDate() {
            return hireDate;
        }

//        @Override
//        public String toString() {
//            return "Employee{" +
//                    "employeeName='" + employeeName + '\'' +
//                    ", employeeNumber='" + employeeNumber + '\'' +
//                    ", hireDate='" + hireDate + '\'' +
//                    '}';
//        }
    @Override
    public String toString() {
        return "EmployeeName: " + this.employeeName + "\n" +
                "EmployeeNumber: " + this.employeeNumber + "\n"+
                "Employee Hire Date: " + this.hireDate + "\n";
    }

        private String createNewEmployeeNumber() {
            String abc = "ABCDEFGHIJKLM";
            //XXX-L: Let's create a 3 digit number.
            int min=100;
            int max=999;
            int number = (int)Math.floor(Math.random() * (max-min+1+min));
            String hyphen = "-";
            char letter = abc.charAt((int)(Math.random() * abc.length()));

            return number + hyphen + letter;
        }
}
