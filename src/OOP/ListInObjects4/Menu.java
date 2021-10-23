package OOP.ListInObjects4;

import java.util.ArrayList;

public class Menu {

        private ArrayList<String> meals;

        public Menu() {
            this.meals = new ArrayList<>();
        }
        public void addMeal(String meal) {
            if (!meals.contains(meal)) {
                meals.add(meal);
            }
            //Or we can use a for each loop
            for (String m : meals) {
                if (m.equals(meal))
                    return;
            }
            meals.add(meal);
        }
        public void printMeals(){
            for (String meal:meals) {
                System.out.println(meal);
            }
            //Or we can write it with Lambda expression. This is used to write all the items on the console.
            //meals.forEach(meal ->System.out.println(meal));
        }
        public void clearMenu(){
            meals.clear();
        }
    }


