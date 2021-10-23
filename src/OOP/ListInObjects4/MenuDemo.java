package OOP.ListInObjects4;

public class MenuDemo {

        public static void main(String[] args) {
            Menu menu = new Menu();
            menu.addMeal("Tofu ratatoulle");
            menu.addMeal("Chilli coconut chicken");
            menu.addMeal("Chilli coconut chicken");
            menu.addMeal("Meatballs with mustard sauce");

            menu.printMeals();
            menu.clearMenu();

            System.out.println();
            menu.addMeal("Tomato and mozzarella salad");
            menu.printMeals();

            //menu.meals.add("Pasta"); This code does not work as meals is private in Menu class

        }
    }

