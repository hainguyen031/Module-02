package Entity;

import java.util.ArrayList;

public class Category {
    private int id;
    private String name;
    private ArrayList<Product> products;

    public Category() {
        this.id = 0;
        this.name = "name";
        this.products = new ArrayList<>();
    }

    public Category(int id, String name, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        for (Product product : products) {
            System.out.println(product.getId() +". "+ product.getName() +" - "+ product.getPrice());
        }
        System.out.println("---------------------");
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}