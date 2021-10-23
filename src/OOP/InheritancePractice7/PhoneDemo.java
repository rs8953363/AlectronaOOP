package OOP.InheritancePractice7;

import java.util.ArrayList;
import java.util.List;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone 13", "Purple");
        System.out.println(phone);//Although there is not toString method in Phone class, this class take that method
        // from Object class.

        Iphone iphone = new Iphone("Iphone 13", "Apple", "Purple");
        System.out.println(iphone);

        //Iphone is an iphone and also iphone is a phone. So, we can use polymorphism here and define it as below.
        // How the code work if you create an object like this?
        Phone iphone1 = new Iphone("Iphone 14", "Apple", "Blue");
        System.out.println(iphone1);//Hierarchy is beginning from the youngest child class. The code works from the
        // bottom class to the top one.

        Phone phone1 = new Phone("Samsung", "S21");
        System.out.println(iphone);
        System.out.println(phone1);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Iphone("Apple", "Iphone 13", "purple"));
        phoneList.add(new Samsung("Samsung", "S21", "red"));

        for (Phone phone2 : phoneList) {
            System.out.println(phone.toString());//With this code we can call String methods of both Iphone and Samsung
        }//The reason of override is to be able to use polymorphic array. Parent uzerinden child'in
        // implementasyonlarini cagirmak.Regardless of the type of the variable, the method that is executed is always
        // chosen based on the actual type of the object. Objects are polymorphic, which means that they can be used via
        // many different variable types.The executed method always relates to the actual type of the object. This
        // phenomenon is called polymorphism.

    }
}
