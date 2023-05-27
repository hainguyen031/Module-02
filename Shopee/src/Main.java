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

            System.out.println("1. Danh muc san pham");
            System.out.println("2. Xem gio hang");
            System.out.println("3. Thanh toan");
            System.out.println("4. Thoat");
            int choice = choosingOption();
            switch (choice) {
                case 1:
                    showCategoryList();
                    choiceCategory();
                    break;
                case 2:
                    showCart();
                    cartLine.getAll(); //hien gio hang voi tong san pham va tien
                    editCart();
                    break;
                case 3:
                    System.out.println("chua xong");
                    //buy();
                    break;
                default:
                    return;

            }
        }
    }

    private static void showCart() {
        cart.setId(1);
        cartLine.getAll();
        totalCart();
    }

    private static void totalCart() {
        long sum = 0;
        for (CartLine cartLine1: cartLine) {

        }
    }

    private static void editCart() {
        while (true) {
            System.out.println("1. Sua don hang");
            System.out.println("2. Tro lai");
            int choice = choosingOption();
            if(choice == 2) {
                break;
            } else {
                System.out.println("1. Xoa san pham: ");
                System.out.println("2. Sua so luong san pham: ");
                int choice1 = scanner.nextInt();
                switch (choice1) {
                    case 1:
                        removeFromCart();
                        break;
                    case 2:
                        System.out.println("chua xong");
                        //editQuantityFromCart();
                        break;
                }
            }
        }
    }

    private static void removeFromCart() {
        while (true) {
            cartLine.getAll();
            System.out.println("Chon san ten san pham muon xoa:");
            System.out.println("Press 0 to exit");
            int choice = choosingOption();
            if (choice == 0) {
                break;
            } else {
                cartLine.removeCartLine(choice - 1);
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
        cartLine.addProductById(choiceProductId, products1);
        cartLine.setQuantity(choiceQuantity);
        cartLine.getAll();
    }
    private static void addProductToCart2() {
        System.out.print("Chon san pham muon mua:");
        int choiceProductId = scanner.nextInt();
        System.out.print("So luong: ");
        int choiceQuantity = scanner.nextInt();
        cartLine.addProductById(choiceProductId, products2);
        cartLine.setQuantity(choiceQuantity);
        cartLine.getAll();
    }
    private static void addProductToCart3() {
        System.out.print("Chon san pham muon mua:");
        int choiceProductId = scanner.nextInt();
        System.out.print("So luong: ");
        int choiceQuantity = scanner.nextInt();
        cartLine.addProductById(choiceProductId, products3);
        cartLine.setQuantity(choiceQuantity);
        cartLine.getAll();
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
        System.out.println("Danh muc san pham:");
        categoryList.getAll();
        System.out.println();
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
