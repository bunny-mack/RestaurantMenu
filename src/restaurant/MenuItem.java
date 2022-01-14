package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class MenuItem {

    // Add ArrayList of categories to prevent faulty user input
    // ArrayList<String> categories = new ArrayList<>();

    private String itemName;
    private String category;
    private String description;
    private double price;
    private LocalDate date;


    public MenuItem(String itemName, String category, String description, double price, LocalDate date) {
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}



