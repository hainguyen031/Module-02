package Entity;

import java.util.ArrayList;

public class CategoryList {
    private ArrayList<Category> categoryList;
    public CategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }
    public CategoryList() {
        categoryList = new ArrayList<Category>();
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }
    public Category get(int index) {
        return categoryList.get(index);
    }

    public void addCategory(Category category) {
        categoryList.add(category);
    }
    public void getAll() {
        int count = 1;
        String text;
        while (count <= categoryList.size()) {
            text = String.format("%d. %s", count, categoryList.get(count - 1).getName());
            System.out.println(text);
            count++;
        }
    }

}
