package com.basic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManager {
	public static void main(String[] args) {
		
	}
    private List<Product> products;
    private List<Category> categories;
    private List<InventoryItem> inventory;

    public InventoryManager() {
        this.products = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updateInventory(Product product, int quantity) {
        InventoryItem inventoryItem = findInventoryItemByProduct(product);
        if (inventoryItem != null) {
            inventoryItem.setQuantity(quantity);
        } else {
            inventoryItem = new InventoryItem(product, quantity);
            inventory.add(inventoryItem);
        }
    }

    public void displayInventory() {
        for (InventoryItem item : inventory) {
            Product product = item.getProduct();
            System.out.println("Product: " + product.getName() + ", Category: " +
                    product.getCategory().getName() + ", Stock Level: " + item.getQuantity());
        }
    }

    public void displayTotalValue() {
        double totalValue = 0.0;
        for (InventoryItem item : inventory) {
            Product product = item.getProduct();
            totalValue += product.getPrice() * item.getQuantity();
        }
        System.out.println("Total Value of Inventory: $" + totalValue);
    }

    public List<Product> searchByName(String name) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    public List<Product> searchByCategory(Category category) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    private InventoryItem findInventoryItemByProduct(Product product) {
        for (InventoryItem item : inventory) {
            if (item.getProduct().equals(product)) {
                return item;
            }
        }
        return null;
    }
}

class Product {
    private int id;
    private String name;
    private Category category;
    private double price;

    public Product(int id, String name, Category category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Category {
    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class InventoryItem {
    private Product product;
    private int quantity;

    public InventoryItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
