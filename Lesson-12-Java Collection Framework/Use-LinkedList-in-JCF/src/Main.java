import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();
        linkedList.add(new Product(1,"candy", 5000));
        linkedList.add(new Product(2,"flower", 15000));
        linkedList.add(new Product(3,"bear", 50000));
        linkedList.add(new Product(4,"toy", 100000));
        ProductManager link = new ProductManager();
        link.add(new Product(1,"candy", 5000));
        System.out.println(linkedList);
    }



}
