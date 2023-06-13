package builder;

public interface InterfaceCustomerBuilder {
    InterfaceCustomerBuilder username(String username);
    InterfaceCustomerBuilder password(String password);
    InterfaceCustomerBuilder email(String email);
    CustomerBuilder phone(String phone);
    InterfaceCustomerBuilder name(String name);
    InterfaceCustomerBuilder cccd(int cccd);
    InterfaceCustomerBuilder gplx(String gplx);

}
