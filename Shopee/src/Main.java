import Entity.*;
import Service.UserService;
import Service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        categoryList.addCategory(category1);
        categoryList.addCategory(category2);
        categoryList.addCategory(category3);
        //register();
        //login();

        //bat dau chuong trinh
        while (true) {
            System.out.println("1. Category");
            System.out.println("2. Show Cart");
            System.out.println("3. Edit Cart");
            System.out.println("4. Buy");
            System.out.println("5. Exit");
            System.out.println("---------------------");
            int choice = choosingOption();
            switch (choice) {
                case 1:
                    showCategoryList(); //hien category
                    choiceCategory(); // chon category
                    break;
                case 2:
                    cartLine.getAll(); //hien gio hang voi tong san pham va tien
                    break;
                case 3:
                    System.out.println("sua gio hang"); //chua xong
                    editCart();
                    break;
                case 4:
                    System.out.println("thanh toan");
                    break;
                default:
                    return;

            }
        }
    }

    private static void editCart() {
        while (true) {
            System.out.println("1. Delete product");
            System.out.println("2. Exit");
            int choice = choosingOption();
            if(choice == 2) {
                break;
            } else {
                System.out.print("Enter name product delete: ");
                String choice1 = scanner.nextLine();
                cartLine.removeCartLine(choice1);
            }
        }
    }


    private static int choosingOption() {
        System.out.print("Choose your option: ");
        return scanner.nextInt();
    }

    private static void choiceCategory() {
        System.out.print("Chon danh muc: ");
        int choice = scanner.nextInt();
        System.out.println("---------------------");
        switch (choice) {
            case 1:
                category1.getProducts();
                addProductToCart1();
                break;
            case 2:
                category2.getProducts();
                addProductToCart2();
                break;
            case 3:
                category3.getProducts();
                addProductToCart3();
                break;
            default:

        }
    }

    private static void addProductToCart1() {
        System.out.print("Chon san pham muon mua:");
        int choiceProductId = scanner.nextInt();
        System.out.print("So luong: ");
        int choiceQuantity = scanner.nextInt();
        Product selectedProduct = getProductById1(choiceProductId); // Lấy sản phẩm theo ID
        if (selectedProduct != null) {
            selectedProduct.setQuantity(choiceQuantity);
            cartLine.addProduct(selectedProduct); // Thêm sản phẩm vào CartLine
            cart.getCartLines().add(cartLine); // Thêm CartLine vào Cart
            System.out.println("San pham da duoc them vao gio hang!");
            System.out.println("---------------------");
        } else {
            System.out.println("Khong tim thay san pham!");
            System.out.println("---------------------");
        }
    }

    private static Product getProductById1(int choiceProductId) {
        for (Product product : products1) {
            if(product.getId()==choiceProductId) {
                return product;
            }
        }
        return null;
    }

    private static void addProductToCart2() {
        System.out.print("Chon san pham muon mua:");
        int choiceProductId = scanner.nextInt();
        System.out.print("So luong: ");
        int choiceQuantity = scanner.nextInt();
        Product selectedProduct = getProductById2(choiceProductId); // Lấy sản phẩm theo ID
        if (selectedProduct != null) {
            selectedProduct.setQuantity(choiceQuantity);
            cartLine.addProduct(selectedProduct); // Thêm sản phẩm vào CartLine
            cart.getCartLines().add(cartLine); // Thêm CartLine vào Cart
            System.out.println("San pham da duoc them vao gio hang!");
            System.out.println("---------------------");
        } else {
            System.out.println("Khong tim thay san pham!");
            System.out.println("---------------------");
        }
    }
    private static Product getProductById2(int choiceProductId) {
        for (Product product : products2) {
            if(product.getId()==choiceProductId) {
                return product;
            }
        }
        return null;
    }
    private static void addProductToCart3() {
        System.out.print("Chon san pham muon mua:");
        int choiceProductId = scanner.nextInt();
        System.out.print("So luong: ");
        int choiceQuantity = scanner.nextInt();
        Product selectedProduct = getProductById3(choiceProductId); // Lấy sản phẩm theo ID
        if (selectedProduct != null) {
            selectedProduct.setQuantity(choiceQuantity);
            cartLine.addProduct(selectedProduct); // Thêm sản phẩm vào CartLine
            cart.getCartLines().add(cartLine); // Thêm CartLine vào Cart
            System.out.println("San pham da duoc them vao gio hang!");
            System.out.println("---------------------");
        } else {
            System.out.println("Khong tim thay san pham!");
            System.out.println("---------------------");
        }
    }
    private static Product getProductById3(int choiceProductId) {
        for (Product product : products3) {
            if(product.getId()==choiceProductId) {
                return product;
            }
        }
        return null;
    }
    public static int id = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static UserService userService = new UserServiceImpl();
    public static ArrayList<Product> products1 = productArrayList1();
    public static ArrayList<Product> products2 = productArrayList2();
    public static ArrayList<Product> products3 = productArrayList3();
    public static Category category1 = new Category(1, "Ao", products1);
    public static Category category2 = new Category(2, "Quan", products2);
    public static Category category3 = new Category(3, "Giay", products3);
    public static CategoryList categoryList = new CategoryList();
    public static CartLine cartLine = new CartLine();
    public static Cart cart = new Cart();



    public static void showCategoryList() {
        System.out.println("List category:");
        categoryList.getAll();
        System.out.println("---------------------");
    }
    public static ArrayList<Product> productArrayList1() {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Ao phong", 50000);
        Product product2 = new Product(2, "Ao somi", 200000);
        Product product3 = new Product(3, "Ao khoac", 300000);
        Product product4 = new Product(4, "Ao polo", 100000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        return products;
    }
    public static ArrayList<Product> productArrayList2() {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Quan tay", 200000);
        Product product2 = new Product(2, "Quan short", 100000);
        Product product3 = new Product(3, "Quan jeans", 150000);
        Product product4 = new Product(4, "Quan kaki", 170000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        return products;
    }
    public static ArrayList<Product> productArrayList3() {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Adidas", 2000000);
        Product product2 = new Product(2, "Nike", 1900000);
        Product product3 = new Product(3, "Thuong dinh", 150000);
        Product product4 = new Product(4, "Bitis", 300000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        return products;
    }


    private static void login() {
        System.out.println("Login");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        boolean sucess = userService.login(username, password);
        if (sucess) {
            System.out.println("Login success!");
        } else {
            System.out.println("Fail, please try login again!");
        }
        System.out.println();
    }
    private static void register() {
        System.out.println("Register");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        id += 1;
        User user = new User(id,username, password);
        boolean success = userService.register(user);
        if (success) {
            System.out.println("Register success");
        } else {
            System.out.println("Fail");
        }
        System.out.println();
    }

}