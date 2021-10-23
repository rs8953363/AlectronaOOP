package OOP.EncapsulationPassByValueReference3;

import java.util.Scanner;

public class PeopleDemo {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            People people1 = new People("Fatma", 34);
            System.out.println(people1);

            People people2 = new People();
            System.out.print("Enter your name: ");
            String name = scanner.next();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            people2.setName(name);
            people2.setAge(age);

            System.out.println("name: "+people2.getName());
            System.out.println("age: "+people2.getAge());

            //People people2 = new People(name, age);
//        people2.setName(name);
//        people2.setAge(age);

        }
    }

