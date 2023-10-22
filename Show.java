package kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Show {
    List<goods> gimbapMenu = new ArrayList<>();
    List<goods> porcutletMenu = new ArrayList<>();
    List<goods> DrinkMenu = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Order od = new Order();

    public Show() {
        gimbapMenu.add(new goods("origin gimbap", "장인이 만든 원조 김밥", 3.0));
        gimbapMenu.add(new goods("pork cutlet", "장인이 만든 돈까스 김밥", 4.0));
        gimbapMenu.add(new goods("tuna gimbap", "장인이 만든 참치 김밥", 3.5));

        porcutletMenu.add(new goods("pork cutlet", "장인이 만든 맛있는 돈까스", 5.0));
        porcutletMenu.add(new goods("big pork cutlet", "장인이 만든 왕 돈까스", 6.0));
        porcutletMenu.add(new goods("cheese pork cutlet", "장인이 만든 치즈 돈까스", 6.0));

        DrinkMenu.add(new goods("coke", "달고 시원한 콜라", 2.0));
        DrinkMenu.add(new goods("orange juice", "새콤달콤 오렌지 주스", 2.0));
        DrinkMenu.add(new goods("apple juice", "달달한 사과 주스", 2.0));


    }

    public void menushow() {
        System.out.println("gimbap heaven에 오신걸 환영합니다");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("[ main menu ]" + "\n");
        System.out.println("1. gimbap        |  속이 꽉 찬 장인이 만든 김밥");
        System.out.println("2. pork cutlet   |  장인이 맏는 맛있는 돈까스");
        System.out.println("3. Drinks        |  콜라와 직접 착즙한 음료들\n");
        System.out.println("[ order menu ]" + "\n");
        System.out.println("4. order         |  장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel        |  진행중인 주문을 취소합니다.");
        int ordermenu = sc.nextInt();
        switch (ordermenu){
            case 1 :
                showgimbapmenu();
                break;
            case 2 :
                showporkcutletmenu();
                break;
            case 3 :
                showdrinksmenu();
                break;
            case 4 :
                showordermenu();
                break;
            case 5 :
                Ordercancel();
                break;
            default:
                System.out.println("입력이 잘못되었습니다. 다시 입력해 주세요");
                menushow();
                break;
        }

    }

    public void showgimbapmenu() {
        for (int i = 0; i < 3; i++) {
            goods menus = gimbapMenu.get(i);
            System.out.println((i + 1) + "." + menus.getname() + " | w  " + menus.getprice() + " | " + menus.getinfo());
        }
        int ordergimbap = sc.nextInt();
        int gimbapnumber = ordergimbap-1;
        goods menusgim = gimbapMenu.get(gimbapnumber);
        switch (ordergimbap){
            case 1 :
                System.out.println(menusgim.getname() +" | w "+ menusgim.getprice() + "  | " +menusgim.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 2 :
                System.out.println(menusgim.getname() +" | w "+ menusgim.getprice() + " | " +menusgim.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 3 :
                System.out.println(menusgim.getname() +" | w "+ menusgim.getprice() + "   | " +menusgim.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
        }
        int check = sc.nextInt();
        switch (check){
            case 1 :
                od.addbasket(menusgim);
                System.out.println(menusgim.getname() + "가 장바구니에 추가되었습니다. \n");
                break;
            case 2 :
                System.out.println("장바구니 추가가 취소되었습니다.");
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                break;
        }
        menushow();
    }
    public void showporkcutletmenu() {
        for (int i = 0; i < 3; i++) {
            goods menus = porcutletMenu.get(i);
            System.out.println((i + 1) + "." + menus.getname() + " | w  " + menus.getprice() + " | " + menus.getinfo());
        }
        int orderculet = sc.nextInt();
        int culetnumber = orderculet-1;
        goods menuspork = porcutletMenu.get(culetnumber);
        switch (orderculet){
            case 1 :
                System.out.println(menuspork.getname() +" | w "+ menuspork.getprice() + "  | " +menuspork.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 2 :
                System.out.println(menuspork.getname() +" | w "+ menuspork.getprice() + " | " +menuspork.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 3 :
                System.out.println(menuspork.getname() +" | w "+ menuspork.getprice() + "   | " +menuspork.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
        }
        int check = sc.nextInt();
        switch (check){
            case 1 :
                od.addbasket(menuspork);
                System.out.println(menuspork.getname() + "가 장바구니에 추가되었습니다. \n");
                break;
            case 2 :
                System.out.println("장바구니 추가가 취소되었습니다.");
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                break;
        }
        menushow();
    }
    public void showdrinksmenu() {
        for (int i = 0; i < 3; i++) {
            goods menus = DrinkMenu.get(i);
            System.out.println((i + 1) + "." + menus.getname() + " | w  " + menus.getprice() + " | " + menus.getinfo());
        }
        int orderdrink = sc.nextInt();
        int drinknumber = orderdrink-1;
        goods menusdrink = DrinkMenu.get(drinknumber);
        switch (orderdrink){
            case 1 :
                System.out.println(menusdrink.getname() +" | w "+ menusdrink.getprice() + "  | " +menusdrink.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 2 :
                System.out.println(menusdrink.getname() +" | w "+ menusdrink.getprice() + " | " +menusdrink.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
            case 3 :
                System.out.println(menusdrink.getname() +" | w "+ menusdrink.getprice() + "   | " +menusdrink.getinfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인          2. 취소");
                break;
        }
        int check = sc.nextInt();
        switch (check){
            case 1 :
                od.addbasket(menusdrink);
                System.out.println(menusdrink.getname() + "가 장바구니에 추가되었습니다. \n");
                break;
            case 2 :
                System.out.println("장바구니 추가가 취소되었습니다.");
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                break;
        }
        menushow();
    }

    public void  showordermenu(){
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        List<goods> basket = od.getBasket();

        for (int i = 0; i< basket.size(); i++){
            goods menus = basket.get(i);
            System.out.println(menus.getname()+ "  | " + menus.getprice()+ " |  "+ menus.getinfo());
        }
        System.out.println("[ Total Price ]");
        System.out.println("W "+ od.totalprice());

        System.out.println("1. 주문                  2. 메뉴판");
        int checklastNum = sc.nextInt();

        switch (checklastNum){
            case 1 :
                Ordercimplete();
                break;
            case 2 :
                System.out.println("메뉴로 돌아갑니다.");
                menushow();
                break;
        }

    }

    public void Ordercancel(){
        System.out.println();
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인          2.취소");
        int cancelnum = sc.nextInt();
        switch (cancelnum){
            case 1:
                od.clearbaket();
                System.out.println("진행하던 주문이 취소되었습니다.(장바구니를 비웠습니다.)");
                break;
            case 2:
                System.out.println("메뉴화면으로 돌아갑니다.");
                break;
        }
        menushow();
    }
    public void  Ordercimplete(){
        int ordernum = od.getOrdernumber();
        System.out.println("주문이 완료되었습니다.\n");
        System.out.println("대기번호는 [" + ordernum + "] 번 입니다.");
        System.out.println("3초 후 메인메뉴판으로 돌아갑니다.");

        od.clearbaket();
        od.setOrdernumber( ordernum + 1);
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        menushow();
    }
}
