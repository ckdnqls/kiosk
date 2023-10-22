package kiosk;

public class goods extends menu {
    private double price;

    public goods(String name, String info, double price) {
        super(name, info);
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public String getinfo() {
        return info;
    }

    public Double getprice() {
        return price;
    }


}