package JavaOOP_Workbook;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨",18000);
        Food pizza = new Food("피자",28000);
        Food sushi = new Food("초밥세트",22000);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(chicken);
        foods.add(pizza);
        foods.add(sushi);

        for(int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i).toString());
        }
    }
}

class Food {
    protected String foodName;
    protected int price;

    public Food(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food {" +
                " name: " + foodName +
                ", price: " + price +
                "원 }";
    }
}
