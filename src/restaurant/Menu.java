package restaurant;

//It should be possible to display whether a menu item is new or not
//The app should know when the menu was last updated, so visitors can see the restaurant changing/adding items

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    public static void main(String[] args) {

        ArrayList<MenuItem> fullMenu = new ArrayList();

        MenuItem burger = new MenuItem("burger", "Main", "burger", 9.99, LocalDate.of(2021, 10, 10));
        MenuItem salad = new MenuItem("salad", "Appetizer", "salad", 5.99, LocalDate.of(2022, 1, 10));
        MenuItem chicken = new MenuItem("chicken", "Main", "chicken", 9.99, LocalDate.of(2021, 12, 10));
        MenuItem cake = new MenuItem("cake", "Dessert", "cake", 4.99, LocalDate.of(2021, 11, 10));

        //create auto-add feature
        fullMenu.add(burger);
        fullMenu.add(salad);
        fullMenu.add(chicken);
        fullMenu.add(cake);

        System.out.println("\nMenu Options: \n");

        for (MenuItem i : fullMenu) {
            //if (i.getDate().compareTo(ChronoLocalDate()))
            System.out.println("Item: "+i.getItemName());
            System.out.println("Category: "+i.getCategory());
            System.out.println("Description: "+i.getDescription());
            System.out.println("Price: $"+i.getPrice());
            System.out.println("Date added: "+i.getDate());
            System.out.println("\n");
        }

    }
}


