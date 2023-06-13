package data;

import view.CustomerView;

public class CustomerInfo {
    private String username;
    private String password;
    private String phone;
    private String email;
    private static final CustomerInfo customerInfo = new CustomerInfo();
    public CustomerInfo() {}
    public static CustomerInfo getInstance() {
        return customerInfo;
    }
}
