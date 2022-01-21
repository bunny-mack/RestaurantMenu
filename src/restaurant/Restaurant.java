package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        Date today = Calendar.getInstance().getTime();

        MenuItem newItem1 = new MenuItem("Pesto Pasta", "Main", "Tasty pasta with sauce", 14.99, today);
        MenuItem newItem2 = new MenuItem("Burger", "Main", "With all the fixins", 12.99, today);
        MenuItem newItem3 = new MenuItem("Chicken Dish", "Main", "Chicken and mashed potatoes", 19.99, today);

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();

        ourMenu.removeItem(newItem1);

        ourMenu.printMenu();

        ourMenu.printItem(newItem3);

    }

}
