package Entity;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartLine> cartLines;
    private long total;
    private int id;
    private Cart[] carts;
    public Cart() {
        this.id = 0;
        carts = new Cart[5];
        cartLines = new ArrayList<>();
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
    public ArrayList<CartLine> getCartLines() {
        return cartLines;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart:\n");
        for (CartLine cartLine : cartLines) {
            sb.append(cartLine.toString()).append("\n");
        }
        return sb.toString();
    }

    public void showTotalCart() {
        for (CartLine cartLine : cartLines) {
            total += cartLine.getSubTotal();
        }
        System.out.println("Tong gio hang: " + total);
    }
    public void printCartDetails() {
        System.out.println("Chi tiết giỏ hàng:");
        for (CartLine cartLine : cartLines) {
            System.out.println("Sản phẩm: " + cartLine.getProduct().getName());
            System.out.println("Số lượng: " + cartLine.getQuantity());
            System.out.println("Thành tiền: " + cartLine.getSubTotal());
            System.out.println("---------------------");
        }
    }
//    public void addToCart(CartLine cartLine) {
//        for (int i = 0; i < carts.length; i++) {
//            carts[i] = cartLine;
//        }
//        cartLine.resertCartLine();
//    }
}