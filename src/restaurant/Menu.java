package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    //ADD ITEM TO MENU
    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    //REMOVE ITEM FROM MENU
    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for(int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was ;ast ipdated on" + this.lastUpdated);
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getItemName() + ": " + item.getDescription() + ", " + item.getPrice());
    }

    public void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getItemName() + ": " + items.get(i).getDescription() + ", " + items.get(i).getPrice());
        }
    }

        //CHECK IF MENU ITEMS ARE EQUAL

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            MenuItem item = (MenuItem) o;
//            return itemName == item.itemName && category == item.category && Double.compare(item.price, price) == 0 && itemName.equals(item.itemName);
//        }


    }


