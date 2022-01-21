package restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private String category;
    private String description;
    private double price;
    private Date dateAdded;
    private boolean isNew;


    public MenuItem(String itemName, String category, String description, double price, Date date) {
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateAdded = date;
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

    public Date getDate() {
        return dateAdded;
    }

    public void setDate(Date date) {
        this.dateAdded = date;
    }
}



