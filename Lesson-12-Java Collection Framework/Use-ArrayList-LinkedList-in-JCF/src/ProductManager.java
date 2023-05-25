import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements Comparator<Product> {

    private List<Product> lists;

    public ProductManager() {
        lists = new ArrayList<>();
    }

    public List<Product> getLists() {
        return lists;
    }
    public void setLists(List<Product> lists) {
        this.lists = lists;
    }
    public void add(Product product) {
        lists.add(product);
    }
    public void update(int id,String name) {
        for (int i = 0; i <= lists.size() ; i++) {
            if (lists.get(i).getId()==id) {
                lists.get(i).setName(name);
                break;
            }
        }
    }
    public Product remove(int id) {
        if (lists.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i <= lists.size() ; i++) {
                if (lists.get(i).getId()==id) {
                    return lists.remove(i);
                }
            }
        }
        return null;
    }
    public void showList() {
        System.out.printf("%s-%s\n","Id","Name");
        for (Product list : lists) {
            System.out.printf("%d-%s\n", list.getId(), list.getName());
        }
    }
    public Product getByName(String name) {
        for (Product product: lists
        ) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}


