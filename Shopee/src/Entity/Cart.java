package Entity;

public class Cart {

    private long total;
    private int id;
    private Cart[] carts;
    public Cart() {
        this.id = 0;
        carts = new Cart[5];
    }
    public Cart(int id) {
        this.id = id;
        carts = new Cart[5];
    }

    public long getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
