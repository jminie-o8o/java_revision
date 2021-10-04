package JavaOOP_Workbook;

import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        /* 1. 메뉴 객체를 생성하세요.  */
        Menu kimbab = new Menu("김밥", 2000,57);
        Menu swings = new Menu("돈까스", 6000,29);
        Menu coldnoodle = new Menu("냉면", 5000,34);
        /* 2. 스토어 객체에 메뉴를 추가하세요.  */
        ArrayList<Menu> menu = new ArrayList<>();
        Store store = new Store(menu);
        store.add(kimbab);
        store.add(swings);
        store.add(coldnoodle);

        /* 3. 하루 총 매출을 계산하세요. */
        System.out.printf("총 매출: %d원", store.totalSales(kimbab) + store.totalSales(swings) + store.totalSales(coldnoodle));
    }
}

class Store {
    private ArrayList<Menu> list;

    public Store(ArrayList<Menu> list) {
        this.list = list;
    }

    public void add(Menu menu) {
        this.list.add(menu);
    }

    /* 4. 총 매출액 계산 메소드를 만드세요. */
    public int totalSales(Menu menu) {
        int sum = 0;
        sum += menu.getPrice() * menu.getCount();
        return sum;
    }
}

class Menu {
    private String name; // 메뉴명
    private int price;   // 가격
    private int count;   // 하루 판매량

    public Menu(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /* 5. price의 게터를 만드세요. */

    public int getPrice() {
        return price;
    }
    /* 6. count의 게터를 만드세요. */

    public int getCount() {
        return count;
    }
}
