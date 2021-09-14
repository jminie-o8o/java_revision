package cloudstudyingFinal;

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

        String result;
        for(int i = 0; i < foods.size(); i++){
            result = foods.get(i).toString();
            System.out.println(result);
        }
    }
}

class Food {
    public String foodName;
    public int price;

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
