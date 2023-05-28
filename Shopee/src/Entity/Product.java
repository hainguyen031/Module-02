package Entity;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private long price;
    private int quantity;
    private ArrayList<Product> products;
    public Product() {
        products = new ArrayList<Product>();
        this.id = 0;
        this.name = "name";
        this.price = 0;
        this.quantity = 0;
    }

    public Product(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 0;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getAll() {
        int count = 1;
        String text;
        while (count <= products.size()) {
            text = String.format("%d. %s. %d", count, products.get(count - 1).getName(), products.get(count - 1).getPrice());
            System.out.println(text);
            count++;
        }
    }

    public void getProducetId(Product product) {
        this.id = product.getId();
    }
}