import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    public void add(Product product) {

    }

    static class Node{
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
    private List<Product> lists;
    public ProductManager() {
        lists = new LinkedList<>();
    }

}
