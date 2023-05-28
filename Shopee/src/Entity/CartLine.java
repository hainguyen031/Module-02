package Entity;

import java.util.ArrayList;
import java.util.List;

public class CartLine {
    private int product_id;
    private int cart_id;
    private long subTotal;
    private int quantity;
    private Product product;
    private Cart cart;
    private static ArrayList<Product> products;

    public CartLine() {
        this.product_id = 0;
        this.cart_id = 0;
        this.quantity = 0;
        this.subTotal = 0;
        product = new Product();
        products = new ArrayList<>();
    }

    public CartLine(Product product, int quantity, Cart cart) {
        this.product_id = product.getId();
        this.cart_id = cart.getId();
        this.quantity = quantity;
        this.subTotal = product.getPrice() * quantity;
    }
    public static void addProductById(int choiceProductId, ArrayList<Product> productList) {
        for(Product product : productList) {
            if(product.getId() == choiceProductId) {
                products.add(product);

                return;
            }
        }
    }
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product) {
        this.product_id = product.getId();
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(Cart cart) {
        this.cart_id = cart.getId();
    }

    public long getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Product product) {
        this.subTotal = product.getPrice() * product.getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartLine{" +
                "product_id=" + this.product_id +
                ", cart_id=" + this.cart_id +
                ", subTotal=" + this.subTotal +
                ", quantity=" + this.quantity +
                '}';
    }
    public void getAll() {
        System.out.println("Gio hang:");
        int count = 1;
        String text;
        long total = 0;
        while (count <= products.size()) {
            text = "Stt: "+count+ ", " +
                    "san pham: " +products.get(count - 1).getName()+ ", " +
                    "gia: " + products.get(count - 1).getPrice() * products.get(count - 1).getQuantity()+ " VND, " +
                    "so luong: " + products.get(count - 1).getQuantity();
            total += products.get(count - 1).getPrice() * products.get(count - 1).getQuantity();
            System.out.println(text);
            count++;
        }
        System.out.println("Tong tien gio hang: " + total +" VND");
        System.out.println("---------------------");
    }
    public void updateCartLine(int quantityChange) {
        this.quantity = quantityChange;
        this.subTotal = this.product.getPrice() * quantityChange;
    }
    public void resertCartLine() {
        this.product_id = 0;
        this.product = new Product(0, "name", 0);
        this.quantity = 0;
        this.subTotal = 0;
    }
    public void removeCartLine(String name) {

    }

    public void addProduct(Product selectedProduct) {
        products.add(selectedProduct);

    }
}