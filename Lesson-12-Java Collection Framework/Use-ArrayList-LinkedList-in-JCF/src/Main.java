import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "iphone", 1500);
        Product product2 = new Product(2, "nokia", 500);
        Product product3 = new Product(3, "samsung", 1000);
        ProductManager list = new ProductManager();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.showList();
        list.remove(2);
        list.showList();
        list.update(1, "bb");
        list.showList();
        System.out.println(list.getByName("iphone"));

    }
}
