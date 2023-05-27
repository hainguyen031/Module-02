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

    public void setSubTotal(Product product, int quantity) {
        this.subTotal = product.getPrice() * quantity;
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
                "product_id=" + product_id +
                ", cart_id=" + cart_id +
                ", subTotal=" + subTotal +
                ", quantity=" + quantity +
                '}';
    }
    public void getAll() {
        System.out.println("Gio hang:");
        int count = 1;
        String text;
        while (count <= products.size()) {
            text = "Stt: "+count+ ", " +
                    "san pham: " +products.get(count - 1).getName()+ ", " +
                    "gia: " + products.get(count - 1).getPrice() * this.quantity+ ", " +
                    "so luong: " +this.quantity;
            System.out.println(text);
            count++;
        }
    }

    public void removeCartLine(int index) {

    }
}
