package entity;

public class Customer extends User {
    private String name;
    private int cccd;
    private String gplx;

    public Customer() {
    }

    public Customer(String name, int cccd, String gplx) {
        this.name = name;
        this.cccd = cccd;
        this.gplx = gplx;
    }

    public Customer(int id, String username, String password, String name, int cccd, String gplx) {
        super(id, username, password);
        this.name = name;
        this.cccd = cccd;
        this.gplx = gplx;
    }

    public Customer(String username, String password, String name, int cccd, String gplx) {
        super(username, password);
        this.name = name;
        this.cccd = cccd;
        this.gplx = gplx;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public String getGplx() {
        return gplx;
    }

    public void setGplx(String gplx) {
        this.gplx = gplx;
    }
}
