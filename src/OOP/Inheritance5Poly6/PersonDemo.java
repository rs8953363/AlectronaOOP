package OOP.Inheritance5Poly6;

import java.util.ArrayList;

public class PersonDemo {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        Teacher ada1 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Teacher esko1 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits" + ollie.credits());
        ollie.study();

        Student ollie1 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie1);//aslinda bu ollie1.toString()`
        ollie.study();
        System.out.println(ollie1);

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
        System.out.println(ollie1);

        //When we put <Person> in the ArrayList, we can use both Teacher and Student in the ArrayList.
        //Polymorphism = many form

        //polymorphic array
        ArrayList<Person> persons = new ArrayList<Person>();//1st use of polymorphism is polymorphic array.
        persons.add(new TeacherPerson("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons){//In polymorphism, we also use a class as a parameter in
        // ArrayList.We used "Person" clss in this cse so we can use all the subclasses.
        for (Person person: persons) {
            System.out.println(person);
        }

    }
}


