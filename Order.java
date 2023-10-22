package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<goods> basket;
    int ordernumber;

    public Order() {
        basket = new ArrayList<>();
        ordernumber = 1;
    }

    public List<goods> getBasket() {
        return basket;
    }

    public int getOrdernumber() {
        return ordernumber;
    }
    public void  setOrdernumber(int ordernumber){
        this.ordernumber = ordernumber;
    }
    public void addbasket(goods menu){
        basket.add(menu);
    }
    public void clearbaket(){
        basket.clear();
    }
    public  double totalprice(){
        double total = 0.0;
        for(goods menu : basket)
        total += menu.getprice();
        return total;
    }


    public void cancel() {
        System.out.println("주문을 취소하시겠습니까?");
    }
}